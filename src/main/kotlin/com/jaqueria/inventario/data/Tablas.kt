package com.jaqueria.inventario.data

import javax.persistence.*

class Tablas {
    @Entity
    @Table(name = "dispositivos")
         class Dispositivos(
             @Id
             @GeneratedValue
             var id: Int = 0,
             @Column(unique = true)
             var num_serie: Int = 0,
             var uid_socio: Int = 0,
             var activo: Boolean = false,
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
             @JoinColumn(name = "id")
             var id_tarjeta: Tablas.Dispositivos,
             var fecha_hora: String = "",
             var descripcion: String = ""
            )

}
