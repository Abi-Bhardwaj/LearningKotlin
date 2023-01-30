package com.andr.firstproject.Basics

fun main(args: Array<String>) {

    // This is array for example. It stores duplicate values.
    var myArray = arrayListOf<Any>("Kotlin", 2, 2.5, 'K', true, "Kotlin")

    println(myArray.size)
    println(myArray.last())

    println("--------------------------------------")

    //This is Set. Doesn't store duplicate values.
    var mySetArray = setOf<Any>("Kotlin", 2, 2.5, 'K', true, "Kotlin")

    println(mySetArray.size)
    println(mySetArray.last())

}