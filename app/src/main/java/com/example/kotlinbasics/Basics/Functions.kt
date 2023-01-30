package com.andr.firstproject.Basics

fun main(args: Array<String>) {

    println("Enter first number ")
    var n1 = readLine()!!.toInt()
    println("Enter second number ")
    var n2 = readLine()!!.toInt()
    show(n1, n2)
    add(n1, n2)
    minNo(n1, n2)
}

fun show(num1: Int, num2: Int) {
    println("You entered $num1 & $num2")
}

fun add(num1: Int, num2: Int) {
    var sum:Int = num1 + num2
    println("sum is: $sum")
}

fun minNo(num1: Int, num2: Int): Int {
    var minNumber: Int = 0
    if (num1>num2) {
        println("$num1 is greater")
        minNumber = num1
    } else {
        println("$num2 is greater")
        minNumber = num2
    }
    return minNumber
}