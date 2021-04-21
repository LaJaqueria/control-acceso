package com.jaqueria.inventario.service

import com.jaqueria.inventario.data.DispositivosRepository
import com.jaqueria.inventario.data.RegistrosRepository
import com.jaqueria.inventario.data.Tablas

class TablaService(private val dispositivosRepository: DispositivosRepository, private val registrosRepository: RegistrosRepository) {
    public fun getDevices(id: Int):Tablas.Dispositivos{
        return dispositivosRepository.findById(id).get()
    }
}