package com.jaqueria.inventario.data

import com.jaqueria.inventario.data.Tablas.*
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Registros repository repositorio de registros
 *
 * @constructor Create empty Registros repository constructor vacío
 */
interface RegistrosRepository : JpaRepository<Registros, Int> {

}