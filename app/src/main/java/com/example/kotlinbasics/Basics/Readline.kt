package com.andr.firstproject

fun main(args: Array<String>) {

    print("What is your name? ")
    var name: String? = readLine()

    print("How old? ")
    var age:Int = readLine()!!.toInt()
    println("name is $name and age is $age")

}