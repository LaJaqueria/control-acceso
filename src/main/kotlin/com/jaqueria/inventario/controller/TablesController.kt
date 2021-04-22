package com.jaqueria.inventario.controller

import com.jaqueria.inventario.data.DispositivosRepository
import com.jaqueria.inventario.data.RegistrosRepository
import com.jaqueria.inventario.data.Tablas
import com.jaqueria.inventario.service.TablaService
import org.springframework.web.bind.annotation.*

@RestController
class TablasController(
    private val tablaService: TablaService
) {
    @GetMapping("/dispositivos")
    fun listDispositivos(@RequestParam type: String?): List<Tablas.Dispositivos> {
        return tablaService.getAllDevices()
    }

    @GetMapping("/devices")
    fun getDevice(id:Int): Tablas.Dispositivos{
        return tablaService.getDevices(id)
    }


}