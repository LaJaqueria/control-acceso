package com.jaqueria.inventario.service

import com.jaqueria.inventario.data.DispositivosRepository
import com.jaqueria.inventario.data.RegistrosRepository
import com.jaqueria.inventario.data.Tablas
import org.springframework.stereotype.Service

@Service
class TablaService(
    private val dispositivosRepository: DispositivosRepository,
    private val registrosRepository: RegistrosRepository
) {
    /*public fun getDevices(id: Int):Tablas.Dispositivos{
        return dispositivosRepository.findById(id).get()
    }*/
    public fun getAllDevicesDispositivos(): List<Tablas.Dispositivos> {
        return dispositivosRepository.findAll()
    }

    public fun get(): List<Tablas.Registros> {
        return registrosRepository.findAll()
    }
}