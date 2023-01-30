package com.andr.firstproject

import kotlin.random.Random

fun main(args: Array<String>) {

/*    var k =1
    var fact = 1

    while (k<6) {
        fact *=k
        println("$k is $fact")
        k++
    }*/

    val number = Random.nextInt(0,10)
    println(number)
    println("Enter a number")
    while (2>1) {
        val userGuess: Int = readLine()!!.toInt()
        if (userGuess == number) {
            println("correct")
            break
        }
        else if (userGuess < number) {
            println("Increase the no")
        } else {
            println("Decrease the no")
        }
    }

}