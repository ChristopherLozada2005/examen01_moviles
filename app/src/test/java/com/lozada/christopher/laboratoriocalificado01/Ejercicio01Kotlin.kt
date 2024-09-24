package com.lozada.christopher.laboratoriocalificado01

class Ejercicio01Kotlin {

    fun contarFrecuencia(palabra: String): Map<Char, Int> { // Creamos la funcion para realizar el conteo

        val frecuencia = mutableMapOf<Char, Int>() // Almacenamos las frecuencias

        for (caracter in palabra) { // Creamos un for para poder recorrer cada letra en la palabra

            if (frecuencia.containsKey(caracter)) { // usamos una condicional para sumar un valor en caso se repita una letra
                frecuencia[caracter] = frecuencia[caracter]!! + 1
            } else {
                frecuencia[caracter] = 1
            }
        }

        return frecuencia // retornamos para recibir las frecuencias
    }
}

fun main() {
    val ejercicio = Ejercicio01Kotlin()
    val resultado = ejercicio.contarFrecuencia("hello") // asignamos la palabra para el conteo
    println(resultado)  // imprimimos el resultado
}
