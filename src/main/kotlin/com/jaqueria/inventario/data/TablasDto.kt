package com.jaqueria.inventario.data

/**
 * Tablas dto
 *
 * @property id
 * @property numSerie
 * @property uidSocio
 * @property activo
 * @constructor Create empty Tablas dto
 */
data class DispositivosDto(
    var id: Int=0,
    var numSerie: String = "",
    var uidSocio: String = "",
    var activo: Boolean = false
)
