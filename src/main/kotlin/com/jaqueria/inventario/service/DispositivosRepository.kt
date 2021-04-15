package com.jaqueria.inventario.service

import org.springframework.data.jpa.repository.JpaRepository
import com.jaqueria.inventario.data.Tablas.*

interface DispositivosRepository : JpaRepository<Dispositivos, Int> {

}