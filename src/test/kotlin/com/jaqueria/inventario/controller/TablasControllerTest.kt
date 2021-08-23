package com.jaqueria.inventario.controller

import com.jaqueria.inventario.data.DispositivosDto
import com.jaqueria.inventario.service.TablaService
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * Tablas controller test
 *
 * @constructor Create empty Tablas controller test
 *///Test Unitario sobre Tablas Controller Test
class TablasControllerTest {
    //Propiedad mockeada.
    @MockK
    lateinit var tablaService: TablaService

    //Objeto de la clase a probar
    var tablasController: TablasController? = null

    /**
     * Init - Inicializacion de los tests
     *
     */
    @BeforeEach
    fun init() {
        //Inicializacion de las variables mock
        MockKAnnotations.init(this, relaxUnitFun = true)
        //Variables necesarias para mockear (se genera un dispositivo)
        //val disp1 = Tablas.Dispositivos(1, "111", "111", true);
        val disp1dto = DispositivosDto(1, "111", "111", true);
        //Definir la llamada a mockear. Cada vez que se llame a dispositivosRepository.findAll() se devolverá lo mismo.
        every { tablaService.getAllDevicesDispositivos(any()) } returns disp1dto
        //Inicializacion de la clase para probar
        tablasController = TablasController(tablaService)
    }

    /**
     * Listar dispositivo
     *
     */
    @Test
    fun listDispositivo() {
        val result = tablasController?.listDispositivo("1")
        Assertions.assertNotNull(result)
        //Comprueba el resultado devuelto
        Assertions.assertEquals(1, result?.size)
        //Comprobación de que el primer elemento tenga por id 1
        Assertions.assertEquals(1, result?.get(0)?.id)
    }

}

