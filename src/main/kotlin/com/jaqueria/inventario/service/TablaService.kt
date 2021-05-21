package com.jaqueria.inventario.service

import com.jaqueria.inventario.data.DispositivosDto
import com.jaqueria.inventario.data.DispositivosRepository
import com.jaqueria.inventario.data.RegistrosRepository
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
    }*/
    public fun getAllDevicesDispositivos(numSerie: String): DispositivosDto {
        var dispositivos = dispositivosRepository.findAllByNumSerie(numSerie)
        var dispositivoDto = DispositivosDto()
        dispositivoDto.id = dispositivos[0].id
        dispositivoDto.numSerie = dispositivos[0].numSerie
        dispositivoDto.activo = dispositivos[0].activo
        dispositivoDto.uidSocio = dispositivos[0].uidSocio

        return dispositivoDto

    }


}