package com.jaqueria.inventario

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Inventario application
 *
 * @constructor Create empty Inventario application
 */
@SpringBootApplication
class InventarioApplication

/**
 * Main
 *
 * @param args
 */
fun main(args: Array<String>) {
    runApplication<InventarioApplication>(*args)
}
