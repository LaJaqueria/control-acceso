package com.jaqueria.inventario.data

import javax.persistence.*

class Tablas {
    @Entity
    @Table(name = "dispositivos")
         class Dispositivos(
             @Id
             @GeneratedValue
             var id: Int = 0,
             //clave única
             @Column(name="num_serie",unique = true)
             var numSerie: Int = 0,
             @Column(name="uid_socio")
             var uidSocio: String = "",
             var activo: Boolean = false,
             //lista mutable
             @OneToMany
             var registros: MutableList<Registros> = ArrayList()
            )

         //Registros
         @Entity
         @Table(name = "registros")
         class Registros (
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
