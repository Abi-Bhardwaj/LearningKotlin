package com.andr.firstproject

fun main(args: Array<String>) {
    var a = 10
    var b = 20
    var c = a + b

    println("Result is: $c")
    println(a + b)

//  vales of var type variables can get updated or changed
    var age = 10 // Valid
    age = 12
    println(age)

//    values of val type variables cannot get updated or changed.
    val year = 2019
//    year = 2020
}