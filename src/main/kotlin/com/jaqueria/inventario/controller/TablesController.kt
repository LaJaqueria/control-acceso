package com.jaqueria.inventario.controller

import com.jaqueria.inventario.data.DispositivosRepository
import com.jaqueria.inventario.data.RegistrosRepository
import com.jaqueria.inventario.data.Tablas
import com.jaqueria.inventario.data.Tablas.*
import com.jaqueria.inventario.exception.TablesException
import com.jaqueria.inventario.service.TablaService
import org.springframework.web.bind.annotation.*
import kotlin.jvm.Throws


/**
 * Tablas controller
 *
 * @property tablaService
 * @constructor Create empty Tablas controller
 */
@RestController
class TablasController(
    private val tablaService: TablaService
) {

    /*private val dispositivosRepository: DispositivosRepository,
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

    /*
     * List dispositivos
     *
     * @param type
     * @return

    @Throws(TablesException::class)
    @GetMapping("/dispositivos")
    fun listDispositivos(@RequestParam type: String?): List<Tablas.Dispositivos> {
    try {
    return tablaService.getAllDevicesDispositivos();
    } catch (e: Exception) {
    throw TablesException(e.message)
    }
    }
     */
    /**
     * List dispositivo
     *
     * @param num_serie
     * @return
     * @throws
     */
    @Throws(TablesException::class)
    @GetMapping("/dispositivo")
    fun listDispositivo(@RequestParam num_serie: Int?): List<Tablas.Dispositivos> {
        //if (num_serie == null)
        //    return tablaService.getAllDevicesDispositivos()
        try {
            return tablaService.getAllDevicesDispositivos().filter { it.id.equals(num_serie) }
        } catch (e: Exception) {
            return tablaService.getAllDevicesDispositivos()
            throw TablesException(e.message)
        }
    }
}



