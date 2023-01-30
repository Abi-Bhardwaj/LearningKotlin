package com.andr.firstproject.Basics

fun main(args: Array<String>) {

//    Arraylists can be initialized in 2 types
//    1. var age = ArrayList<Int>()     // Use add() to add items. Cannot declare and initialize the arraylist at same time.
//    2. var mixArrayList = arrayListOf<Any>("Thar", 2, "RR", 4)

    var age = ArrayList<Int>()
    age.add(10)
    age.add(1, 11)
    age.add(12)

    println("First element of age ArrayList is " + age[0])
    println("Second element of age ArrayList is " + age.get(1))
    println("Third element of age ArrayList is ${age[2]}")

    println("----------------------------------------------------------")

    age.remove(12)

    println("First element of age ArrayList is " + age[0])
    println("Second element of age ArrayList is " + age.get(1))

    println("----------------------------------------------------------")

    var cars = arrayListOf<String>("Thar", "RR")

    println("First element of age ArrayList is " + cars[0])
    println("Second element of age ArrayList is " + cars.get(1))

    println("----------------------------------------------------------")

    cars.add("Mustang")

    println("First element of age ArrayList is " + cars[0])
    println("Second element of age ArrayList is " + cars.get(1))
    println("Third element of age ArrayList is " + cars.get(2))

    println("----------------------------------------------------------")

    var mixArrayList = arrayListOf<Any>("Thar", 2, "RR", 4)

    println("First element of age ArrayList is " + mixArrayList[0])
    println("Second element of age ArrayList is " + mixArrayList.get(1))
    println("Third element of age ArrayList is " + mixArrayList.get(2))
    println("Fourth element of age ArrayList is " + mixArrayList[3])

    println("----------------------------------------------------------")

    var myMixArrayList = ArrayList<Any>()

    myMixArrayList.add("Thar")
    myMixArrayList.add(2)
    myMixArrayList.add(3.4)
    myMixArrayList.add(false)
    myMixArrayList.add("A")

    println(myMixArrayList[0])
    println(myMixArrayList[1])
    println(myMixArrayList[2])
    println(myMixArrayList[3])
    println(myMixArrayList[4])

}
