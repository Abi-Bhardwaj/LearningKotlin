package com.andr.firstproject.Oop.overriding

class Car: Vehicle() {

    fun superStart() {
        super.start()
    }

    fun superAccelerate() {
        super.accelerate(100)
    }

    fun superStop() {
        super.stop()
    }

    override fun start() {
        println("Car has Started")
    }

    override fun accelerate(speed:Int) {
        println("Car Accelerates at $speed.")
    }

    override fun stop() {
        println("Car has stopped")
    }


}