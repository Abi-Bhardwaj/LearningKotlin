package com.andr.firstproject.Oop

open class Vehicle {

    var type: String? = null
    var model: String? = null
    var maxSpeed: Int? = null

    fun show() {
        println("Type: $type")
        println("Model: $model")
        println("MaxSpeed: $maxSpeed")
    }
}