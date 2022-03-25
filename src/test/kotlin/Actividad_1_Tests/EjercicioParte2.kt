package Actividad_1_Tests

import ArrayFunctions
import org.junit.jupiter.api.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertSame

@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class EjercicioParte2 {

    @BeforeEach
    internal fun setUp() {
        val dateTime = SimpleDateFormat("HH:mm:ss.SSS")
        println("Comienzo test")
        println("=============")

        println("Hora de inicio del test: ${dateTime.format(Date())}\n")
    }

    @AfterEach
    internal fun tearDown() {
        val dateTime = SimpleDateFormat("HH:mm:ss.SSS")
        println("Finaliza test")
        println("=============")

        println("Hora de finalización del test: ${dateTime.format(Date())}\n")
    }

    @Test
    @Order (4)
    internal fun `Test Comprobacion Numero Mayor`() {
        val arr1 = arrayOf(5,7,9,8,6)
        val arrFunc = ArrayFunctions(arr1)

        println("Test de comprobación del número mayor del array\n")
        assertEquals(arrFunc.maxNumber(), 9, "El número mayor del array no es igual a 9")
    }

    @Test
    @Order (2)
    internal fun `Test Comprobacion Contenido Array`() {
        val arr1 = arrayOf(5,7,9,8,6)
        val arrFunc = ArrayFunctions(arr1)

        println("Test de comprobación del contenido del array ordenado\n")
        assertContentEquals(arrFunc.orderArray(), arr1, message = "El array no contiene los mismos elementos que el array original")
    }

    @Test
    @Order (3)
    internal fun `Test Comprobacion Tipos Arrays`() {
        val arr1 = arrayOf(5,7,9,8,6)
        val arrFunc = ArrayFunctions(arr1)

        println("Test de comprobación del tipo de los arrays, original y ordenado\n")
        assertSame(arrFunc.orderArray(), arr1, message = "El array original y el devuelto no son del mismo tipo")
    }

    @Test
    @Order (1)
    internal fun `Test Comprobacion Tipo Numero Maximo`() {
        val arr1 = arrayOf(5,7,9,8,6)
        val arrFunc = ArrayFunctions(arr1)

        println("Test de comprobación del tipo del número máximo del array\n")
        assertIs<Int>(arrFunc.maxNumber(), message = "El número máximo del array no es de tipo Integer")
    }
}