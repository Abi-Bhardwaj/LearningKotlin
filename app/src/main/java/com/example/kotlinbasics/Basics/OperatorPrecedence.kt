package com.andr.firstproject

fun main(args: Array<String>) {

    var result:Int = 5 + 2 * 4
    println(result)

    result = (5 + 2) * 4
    println(result)

    var x:Int = 8
    var y:Int = 4
    var z:Int = 2
    var sum:Int = 0

    println(--y)
    println(--z)

    sum = x + --y + --z
    println(sum)

}