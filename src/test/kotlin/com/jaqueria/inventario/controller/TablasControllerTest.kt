package com.jaqueria.inventario.controller

import com.jaqueria.inventario.service.TablaService
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

/**
 * Tablas controller test
 *
 * @constructor Create empty Tablas controller test
 *///Test Unitario sobre Tablas Controller Test
internal class TablasControllerTest {
    //Propiedad mockeada.
    @MockK
    lateinit var tablaService: TablaService

    //Objeto de la clase a probar
    var tablasController:TablasController?=null

    /**
     * Set up
     *
     */
    @BeforeEach
    fun setUp() {
    }

    /**
     * Tear down
     *
     */
    @AfterEach
    fun tearDown() {
    }

    /**
     * List dispositivo
     *
     */
    @Test
    fun listDispositivo() {
    }

    /**
     * Load elemento
     *
     */
    @Test
    fun loadElemento() {
    }
}