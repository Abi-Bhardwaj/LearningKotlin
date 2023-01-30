package com.andr.firstproject.Basics

fun main(args: Array<String>) {

    println("Please enter a number: ")
    var number:Int = readLine()!!.toInt()

    if (number % 2 ==0) {
        println("Even")
    } else {
        println("Odd")
    }
}