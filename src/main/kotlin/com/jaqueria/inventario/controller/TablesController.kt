package com.jaqueria.inventario.controller

import com.jaqueria.inventario.data.DispositivosDto
import com.jaqueria.inventario.exception.TablesException
import com.jaqueria.inventario.service.TablaService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


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


    /**
     * List dispositivo a buscar por número de serie de tarjeta
     *
     * @param num_serie que se pasa para ser buscado
     * @return registro/s con datos encontrados o todos los registros existentes
     */
    @Throws(TablesException::class)
    @GetMapping("/dispositivo")
    fun listDispositivo(@RequestParam numSerie: String): List<DispositivosDto> {
        try {
            return listOf(tablaService.getAllDevicesDispositivos(numSerie))
        } catch (e: Exception) {
            throw TablesException(e.message)
        }
    }
}



