package com.jaqueria.inventario.controller

import com.jaqueria.inventario.data.DispositivosDto
import com.jaqueria.inventario.data.DispositivosRepository
import com.jaqueria.inventario.data.RegistrosRepository
import com.jaqueria.inventario.data.Tablas
import com.jaqueria.inventario.data.Tablas.*
import com.jaqueria.inventario.exception.TablesException
import com.jaqueria.inventario.service.TablaService
import org.springframework.web.bind.annotation.*
import java.util.*
import kotlin.jvm.Throws


/**
 * Tablas controller llama a Tabla Service para obtener los registros
 *
 * @property tablaService usado para obtener registros
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
     * List dispositivo a buscar por número de serie de tarjeta
     *
     * @param num_serie que se pasa para ser buscado
     * @return registro/s con datos encontrados o todos los registros existentes
     */
    @Throws(TablesException::class)
    @GetMapping("/dispositivo")
    fun listDispositivo(@RequestParam num_serie: String): List<DispositivosDto> {
        try {
            return listOf(tablaService.getAllDevicesDispositivos(num_serie))
        } catch (e: Exception) {
            throw TablesException(e.message)
        }
    }


    /*
     * LoadElemento lo uso para prueba
     *
     * @param num_serie a buscar
     * @return registro de num_serie
     */
//    @Throws(TablesException::class)
//    @GetMapping("/dispositivos")
//    fun loadElemento(@RequestParam num_serie: Int?): List<Dispositivos> {
//        //val op: Optional<Dispositivos>
//        try {
//            println("Encontrado el número de serie "+num_serie)
//            return listDispositivo(num_serie)
//        } catch (e: Exception) {
//            return listDispositivo(num_serie)
//        }
//
//    }

}



