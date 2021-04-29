package com.jaqueria.inventario.data

import com.jaqueria.inventario.data.Tablas.*
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Registros repository
 *
 * @constructor Create empty Registros repository
 */
interface RegistrosRepository : JpaRepository<Registros, Int> {

}