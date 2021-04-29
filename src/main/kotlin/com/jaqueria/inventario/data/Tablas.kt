package com.jaqueria.inventario.data

import javax.persistence.*

/**
 * Tablas
 *
 * @constructor Create empty Tablas
 */
class Tablas {
    /**
     * Dispositivos
     *
     * @property id
     * @property numSerie
     * @property uidSocio
     * @property activo
     * @property registros
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
        var numSerie: Int = 0,
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
