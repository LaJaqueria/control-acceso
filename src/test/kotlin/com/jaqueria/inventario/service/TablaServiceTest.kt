package com.jaqueria.inventario.service

import com.jaqueria.inventario.data.DispositivosRepository
import com.jaqueria.inventario.data.RegistrosRepository
import com.jaqueria.inventario.data.Tablas
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.`when`
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

import org.springframework.boot.test.mock.mockito.MockBean


@SpringBootTest
class TablaServiceTest(){

    @MockBean
    lateinit var  dispositivosRepository: DispositivosRepository;

    @MockBean
    lateinit var registrosRepository: RegistrosRepository;


    @Autowired
    lateinit var tablaservice:TablaService


    @BeforeEach
    fun init(){
        tablaservice= TablaService(dispositivosRepository,registrosRepository)
    }

    @Test
    fun whengetAllDispositivos_thenok(){
        val disp1=Tablas.Dispositivos(1,111,"111",true);
        `when`(dispositivosRepository.findAll()).thenReturn(listOf(disp1))
        val result = tablaservice.getAllDevicesDispositivos()
        Assertions.assertNotNull(result)
        Assertions.assertEquals(1, result.size)
        Assertions.assertEquals(1, result[0].id)
    }


}