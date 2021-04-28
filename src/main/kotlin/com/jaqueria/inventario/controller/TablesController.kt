package com.jaqueria.inventario.controller

import com.jaqueria.inventario.data.DispositivosRepository
import com.jaqueria.inventario.data.RegistrosRepository
import com.jaqueria.inventario.data.Tablas
import com.jaqueria.inventario.data.Tablas.*
import com.jaqueria.inventario.exception.TablesException
import com.jaqueria.inventario.service.TablaService
import org.springframework.web.bind.annotation.*
import kotlin.jvm.Throws

@RestController
class TablasController(
    private val tablaService: TablaService
) {

    /**private val dispositivosRepository: DispositivosRepository,
    private val registrosRepository: RegistrosRepository
    ) {
    @GetMapping("/dispositivos")
    fun listDispositivos(@RequestParam type: String?): List<Tablas.Dispositivos> {
    return dispositivosRepository.findAll();
    }

    @PostMapping("/dispositivos")
    fun createDispositivos(@RequestBody dispositivos: Tablas.Dispositivos) {
    dispositivosRepository.save(dispositivos);
    }

    @GetMapping("/registros")
    fun listRegistros(@RequestParam type: String?): List<Tablas.Registros> {
    return registrosRepository.findAll();
    }

    @PostMapping("/registros")
    fun createRegistros(@RequestBody registros: Tablas.Registros) {
    registrosRepository.save(registros);
    }*/
    @Throws(TablesException::class)
    @GetMapping("/dispositivos")
    fun listDispositivos(@RequestParam type: String?): List<Tablas.Dispositivos> {
        try {
            return tablaService.getAllDevicesDispositivos();
        } catch (e:Exception){
            throw TablesException(e.message)
        }
    }
    @GetMapping("/dispositivo/")
    fun listDispositivo(@RequestParam type: Int?): List<Tablas.Dispositivos> {
        if (type == null)
            return tablaService.getAllDevicesDispositivos()
        return tablaService.getAllDevicesDispositivos().filter { it.id.equals(type) }
    }
}



