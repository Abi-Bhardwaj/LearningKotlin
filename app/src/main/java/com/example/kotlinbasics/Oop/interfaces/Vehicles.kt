package com.andr.firstproject.Oop.interfaces

class Vehicles: CanGo, CanStop {
    override val name: String
        get() = "Ferrari"

    override fun stop() {
        println("Stop")
    }


}