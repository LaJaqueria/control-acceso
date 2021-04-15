package com.jaqueria.inventario.data

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

class Tablas {
    @Entity
    @Table(name = "dispositivos")
    class Dispositivos {
        @Id
        var id: Int = 0
        var num_serie: Int = 0 //KEY ÚNICA
        var uid_socio: Int = 0
        var activo: Boolean = false

        //var uid: String = ""
        constructor(id: Int, num_serie: Int, uid_socio: Int, activo: Boolean) {
            this.id = id
            this.num_serie = num_serie
            this.uid_socio = uid_socio
            this.activo = activo
        }
    }

    @Entity
    @Table(name = "registros")
    class Registros {
        @Id
        var id: Int = 0
        var id_tarjeta: Int = 0 //FOREIGN KEY
        var fecha_hora: String = ""
        var descripcion: String = ""

        constructor(id: Int, id_tarjeta: Int, fecha_hora: String, descripcion: String) {
            this.id = id
            this.id_tarjeta = id_tarjeta
            this.fecha_hora = fecha_hora
            this.descripcion = descripcion
        }
    }
}
