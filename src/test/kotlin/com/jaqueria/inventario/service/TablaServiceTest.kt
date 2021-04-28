package com.jaqueria.inventario.service

import com.jaqueria.inventario.data.DispositivosRepository
import com.jaqueria.inventario.data.RegistrosRepository
import com.jaqueria.inventario.data.Tablas
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

//Test Unitario sobre Tabla Service Test
class TablaServiceTest(){

    //PRopiedades Mockeadas: cada una usa un Mock. Son las propiedades que estan dentro de la clase
    @MockK
    lateinit var  dispositivosRepository: DispositivosRepository;

    //Otra propiedad mockeada.
    @MockK
    lateinit var registrosRepository: RegistrosRepository;



    //Objeto de la clase a probar
    var tablaservice:TablaService?=null


    //Inicializacion de los tests
    @BeforeEach
    fun init(){
        //Inicializacion de las variables mock
        MockKAnnotations.init(this,relaxUnitFun = true)
        //Variables necesarias para mockear (se genera un dispositivo)
        val disp1=Tablas.Dispositivos(1,111,"111",true);
        //Definir la llamada a mockear. Cada vez que se llame a dispositivosRepository.findAll() se devolverá lo mismo.

        every { dispositivosRepository.findAll() } returns listOf(disp1)
        //Inicializacion de la clase para probar
        tablaservice= TablaService(dispositivosRepository,registrosRepository)
    }

    //Test Unitario
    @Test
    fun whengetAllDispositivos_thenok(){

        //Se prueba la llamada al metodo
        val result = tablaservice?.getAllDevicesDispositivos()
        //COmprobaciones. Se comprueba que no es null el resultado
        Assertions.assertNotNull(result)
        //COmprobamos el tamaño de la lista
        Assertions.assertEquals(1, result?.size)
        //Se comprueba que la lista no es nula y que el objeto obtenido tampoco lo es y se comprueba que su id es 1.
        result?.get(0)?.let { Assertions.assertEquals(1, it.id) }
    }


}