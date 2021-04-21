package com.jaqueria.inventario.data

import com.jaqueria.inventario.data.Tablas.*
import org.springframework.data.jpa.repository.JpaRepository

interface RegistrosRepository : JpaRepository<Registros, Int> {

}