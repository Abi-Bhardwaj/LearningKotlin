package com.andr.firstproject.Oop.overriding

open class Vehicle {

    open fun start() {
        println("Vehicle has Started")
    }

    open fun accelerate(speed:Int) {
        println("Vehicle Accelerates at $speed.")
    }

    open fun stop() {
        println("Vehicle has stopped")
    }
}