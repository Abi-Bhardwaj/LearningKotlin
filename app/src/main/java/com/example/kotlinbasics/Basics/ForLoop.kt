package com.andr.firstproject.Basics

fun main(args: Array<String>) {

//    for (number in 1..10) {
//        println(number)
//    }

//    var sum:Int = 0
//    for (x in 0..5) {
//        println(x)
//        sum +=x
//        println(sum)
//    }

//    var sum:Int = 0
//    for (x in 0..10) {
//        if (x % 2 == 0) {
//            println(x)
//            sum +=x
//        }
//        println(sum)
//    }

//    var myNumberArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
//
//    for (y in myNumberArray) {
//        println(y)
//    }

//    var myNumberArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
//
//    for (y in 0..(myNumberArray.size)-1) {
//        println(y)
//    }

//    var myNumberArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
//
//    for (y in myNumberArray.indices) {
//        println("[$y] = ${myNumberArray[y]}")
//    }

    // foreach loop
    var myNumberArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)

    myNumberArray.forEach { println(it) }


}