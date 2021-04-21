package com.jaqueria.inventario.controller

import com.jaqueria.inventario.data.DispositivosRepository
import com.jaqueria.inventario.data.RegistrosRepository
import com.jaqueria.inventario.data.Tablas
import org.springframework.web.bind.annotation.*

@RestController
class TablasController(
    private val dispositivosRepository: DispositivosRepository,
    val registrosRepository: RegistrosRepository
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
    }
}