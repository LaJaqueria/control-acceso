package com.jaqueria.inventario.controller

import com.jaqueria.inventario.data.DispositivosRepository
import com.jaqueria.inventario.data.RegistrosRepository
import com.jaqueria.inventario.data.Tablas
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.data.repository.findByIdOrNull
import org.springframework.ui.Model
import java.util.*

/**
 * Web controller test
 *
 * @constructor Create empty Web controller test
 *Test Unitario sobre Tablas Web Controller Test
 *(@Autowired val mockMvc: MockMvc)*/
class WebControllerTest {
    @MockK
    private lateinit var dispositivosRepository: DispositivosRepository

    @MockK
    private lateinit var registrosRepository: RegistrosRepository

    @MockK
    lateinit var model: Model

    var webController: WebController? = null


    /**
     * Init
     *
     *///Inicializacion de los tests
    @BeforeEach
    fun init() {
        //Inicializacion de las variables mock
        MockKAnnotations.init(this, relaxUnitFun = true)
        //Variables necesarias para mockear (se genera un dispositivo)
        val disp1 = Tablas.Dispositivos(1, "111", "111", true);
        var reg1 = Tablas.Registros(1,disp1,"1111","1111")
        //Definir la llamada a mockear. Cada vez que se llame a dispositivosRepository.findAll() se devolverá lo mismo.

        every { dispositivosRepository.findByIdOrNull(any()) } returns disp1
        every { model.addAttribute(any(),any()) } returns model
        every { registrosRepository.findById(any()) }returns Optional.of(reg1)
        //Inicializacion de la clase para probar
        webController = WebController(dispositivosRepository, registrosRepository)
    }


    /*
     * Listar dispositivos
     *
     */
//    @Test
//    fun listarDispositivos() {
//        val result= webController?.listarDispositivos(model)
//        Assertions.assertNotNull(result)
//        Assertions.assertEquals("dispositivoslista",result)
//    }

    /**
     * Detalle dispositivos
     *
     */
    @Test
    fun detalleDispositivos() {
        val result = webController?.detalleDispositivos(1, model)
        Assertions.assertNotNull(result)
        Assertions.assertEquals("dispositivos", result)
    }

    /*
     * Listar registros
     *
     */
//    @Test
//    fun listarRegistros() {
//    }

    /**
     * Detalle registros
     *
     */
    @Test
    fun detalleRegistros() {
        val result = webController?.detalleRegistros(1, model)
        Assertions.assertNotNull(result)
        Assertions.assertEquals("registros", result)
    }

}