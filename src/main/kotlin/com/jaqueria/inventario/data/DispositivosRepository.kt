package com.jaqueria.inventario.data

import org.springframework.data.jpa.repository.JpaRepository
import com.jaqueria.inventario.data.Tablas.*

interface DispositivosRepository : JpaRepository<Dispositivos, Int> {

    fun findAllByNumSerie(numserie:String): MutableList<Dispositivos>

}