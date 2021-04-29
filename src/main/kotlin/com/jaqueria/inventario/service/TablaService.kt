package com.jaqueria.inventario.service

import com.jaqueria.inventario.data.DispositivosRepository
import com.jaqueria.inventario.data.RegistrosRepository
import com.jaqueria.inventario.data.Tablas
import org.springframework.stereotype.Service

/**
 * Tabla service
 *
 * @property dispositivosRepository
 * @property registrosRepository
 * @constructor Create empty Tabla service
 */
@Service
class TablaService(
    private val dispositivosRepository: DispositivosRepository,
    private val registrosRepository: RegistrosRepository
) {
    /**
     * Get all devices dispositivos
     *
     * @return
     *//*public fun getDevices(id: Int):Tablas.Dispositivos{
        return dispositivosRepository.findById(id).get()
    }*/
    public fun getAllDevicesDispositivos(): List<Tablas.Dispositivos> {
        return dispositivosRepository.findAll()
    }

    /**
     * Get
     *
     * @return
     */
    public fun get(): List<Tablas.Registros> {
        return registrosRepository.findAll()
    }
}