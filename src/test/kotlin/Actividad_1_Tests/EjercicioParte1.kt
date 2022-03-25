package Actividad_1_Tests

import ArrayFunctions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.*

class EjercicioParte1 {
    @Test
    internal fun TestsComprobacionArray() {
        val arr1 = arrayOf(5,7,9,8,6)
        val arrFunc = ArrayFunctions(arr1)

        assertAll("Primera comprobación del funcionamiento de la clase ArrayFunctions",
            { assertTrue(arrFunc.sumArray() > 50, "La suma de los elementos del array no es mayor") },
            { assertContains(arr1,10,"El array no contiene ningún número igual a 10") },
            { assertNotNull(arrFunc.sumArray(), "La suma del array es nula") },
            { assertNotEquals(arrFunc.minNumber(), 5, "El número menor del array es un 5") }
        )
    }
}