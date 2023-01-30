package com.andr.firstproject.Basics

fun main(args: Array<String>) {

    // immutable
    println("-------------------------Immutable Map----------------------")
    var age = mapOf<String, Int>("david" to 20, "ronaldo" to 25)

    println("age of david: " + age["david"])
    println("age of ronaldo: " + age["ronaldo"])

    //mutable
    println("-------------------------Immutable Map----------------------")
    var mutableAge = mutableMapOf<String, Int>("david" to 20, "ronaldo" to 25)

    mutableAge.put("buffon", 30)
    println("age of david: " + age["david"])
    println("age of ronaldo: " + age["ronaldo"])
    println("age of buffon: " + mutableAge.get("buffon"))


}