package com.jaqueria.inventario.controller

import com.jaqueria.inventario.data.DispositivosRepository
import com.jaqueria.inventario.data.RegistrosRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.server.ResponseStatusException

/**
 * Web controller llama a Repositorios para obtener los registros y dispositivos
 *
 * @property dispositivosRepository donde buscar dispositivos
 * @property registrosRepository donde buscar registros
 * @constructor Create empty Web controller
 * controlador web que busca una vista
 */
@Controller
@RequestMapping("/web")
class WebController(
    private val dispositivosRepository: DispositivosRepository,
    private val registrosRepository: RegistrosRepository
) {

    /*
     * Listar dispositivos
     *
     * @param model
     * @return
     *///pasa toda la información para visualizar devolviendo el nombre de la vista
//    @GetMapping("/dispositivos")
//    fun listarDispositivos(model: Model): String {
//        model["title"] = "dispositivos";
//        model["dispositivos"] = dispositivosRepository.findAll();
//        return "dispositivoslista"
//    }

    /**
     * Detalle dispositivos
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/dispositivos/{id}")
    fun detalleDispositivos(@PathVariable id: Int, model: Model): String {
        model["title"] = "Detalle Tabla Dispositivos";
        val dispositivos =
            dispositivosRepository.findByIdOrNull(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)
        model["dispositivos"] = dispositivos
        // model["ataques"] = tables.attacks
        return "dispositivos"
    }

    /*
     * Listar registros
     *
     * @param model
     * @return
     *///pasa toda la información para visualizar devolviendo el nombre de la vista
//    @GetMapping("/registros")
//    fun listarRegistros(model: Model): String {
//        model["title"] = "registros";
//        model["registros"] = registrosRepository.findAll();
//        return "registroslista"
//    }

    /**
     * Detalle registros
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/registros/{id}")
    fun detalleRegistros(@PathVariable id: Int, model: Model): String {
        model["title"] = "Detalle Tabla Dispositivos";
        val registros = registrosRepository.findByIdOrNull(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)
        model["registros"] = registros
        // model["ataques"] = tables.attacks
        return "registros"
    }
}