package com.jaqueria.inventario

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Inventario application
 * Aplicación que recibe una solicitud con un número de serie de una tarjeta Rfid y este es consultado con la bbdd
 *
 * @constructor Create empty Inventario application Constructor vacío
 */
@SpringBootApplication
class InventarioApplication

/**
 * Main arranca el programa desde aquí
 *
 * @param args
 */
fun main(args: Array<String>) {
    runApplication<InventarioApplication>(*args)
}
