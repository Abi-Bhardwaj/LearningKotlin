package com.andr.firstproject.Basics

fun main(args: Array<String>) {

    var age = arrayOf(1,2,3)
    println("First element of array: " + age[0])
    println("Second element of array: " + age[1])
    println("Third element of array: " + age[2])

    println("--------------------------------------")

    var cars = arrayOf("Audi", "BMW", "RR")

    println("First element of array: " + cars[0])
    println("Second element of array: " + cars.get(1))
    println("Third element of array: " + cars[2])

    println("--------------------------------------")

    cars.set(0, "Mustang")
    println("First element of array: " + cars[0])
    println("Second element of array: " + cars.get(1))
    println("Third element of array: " + cars[2])

    println("Size of cars array is: " + cars.size)

    println("--------------------------------------")

    var carsandage = arrayOf("Audi", 12, "Thar", 1)

    println("First element of array: " + carsandage[0])
    println("Second element of array: " + carsandage.get(1))
    println("Third element of array: " + carsandage[2])
    println("Fourth element of array: " + carsandage[3])

    println("Fourth element of array: " + carsandage[4])
}