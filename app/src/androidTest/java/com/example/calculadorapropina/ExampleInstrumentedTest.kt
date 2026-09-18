package com.example.calculadorapropina

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

// Pruebas instrumentadas para el contexto de la aplicación.
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Obtiene el contexto de la aplicación.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.calculadorapropina", appContext.packageName)
    }
}