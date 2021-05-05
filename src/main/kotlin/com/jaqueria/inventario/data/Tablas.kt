package com.jaqueria.inventario.data

import javax.persistence.*

/**
 * Tablas clase con los campos de Dispositivos
 *
 * @constructor Create empty Tablas
 */
class Tablas {
    /**
     * Dispositivos
     *
     * @property id del dispositivo
     * @property numSerie del dispositivo Rfid
     * @property uidSocio vinculado al dispositivo
     * @property activo true si está al día, false si no está al día
     * @property registros conecta on registros
     * @constructor Create empty Dispositivos
     *///Dispositivos
    @Entity
    @Table(name = "dispositivos")
    class Dispositivos(
        @Id
        @GeneratedValue
        var id: Int = 0,
        //clave única
        @Column(name = "num_serie", unique = true)
        var numSerie: String = "",
        @Column(name = "uid_socio")
        var uidSocio: String = "",
        var activo: Boolean = false,
        //lista mutable
        @OneToMany
        var registros: MutableList<Registros> = ArrayList()
    )

    /**
     * Registros
     *
     * @property id
     * @property id_tarjeta
     * @property fecha_hora
     * @property descripcion
     * @constructor Create empty Registros
     *///Registros
    @Entity
    @Table(name = "registros")
    class Registros(
        @Id
        @GeneratedValue
        var id: Int = 0,
        //clave foránea
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "id_tarjeta")
        var id_tarjeta: Dispositivos,
        var fecha_hora: String = "",
        var descripcion: String = ""
    )
}
