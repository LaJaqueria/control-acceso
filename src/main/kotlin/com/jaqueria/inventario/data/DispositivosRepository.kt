package com.jaqueria.inventario.data

import org.springframework.data.jpa.repository.JpaRepository
import com.jaqueria.inventario.data.Tablas.*

/**
 * Dispositivos repository
 *
 * @constructor Create empty Dispositivos repository
 */
interface DispositivosRepository : JpaRepository<Dispositivos, Int> {

    /**
     * Find all by num serie
     *
     * @param numserie
     * @return
     */
    fun findAllByNumSerie(numserie: String): MutableList<Dispositivos>

}