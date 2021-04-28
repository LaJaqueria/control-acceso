package com.jaqueria.inventario.data

import org.springframework.data.jpa.repository.JpaRepository
import com.jaqueria.inventario.data.Tablas.*

interface DispositivosRepository : JpaRepository<Dispositivos, Int> {

    fun listDispositivos():List<Dispositivos>
    fun loadDispositivos(id:Int):Dispositivos
    fun saveDispositivos(dispositivos: Dispositivos):Dispositivos
    fun removeDispositivos(id: Int)

}