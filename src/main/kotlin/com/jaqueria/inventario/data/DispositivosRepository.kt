package com.jaqueria.inventario.data

import org.springframework.data.jpa.repository.JpaRepository
import com.jaqueria.inventario.data.Tablas.*

/**
 * Dispositivos repository repositorio de dispositivos
 *
 * @constructor Create empty Dispositivos repository constructor vacío
 */
interface DispositivosRepository : JpaRepository<Dispositivos, Int> {

    /**
     * Find all by num serie
     *
     * @param numserie
     * @return
     */
    fun findAllByNumSerie(numserie: String): List<Dispositivos>

}