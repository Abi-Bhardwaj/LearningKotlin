package com.andr.firstproject.Oop.abstract

class Car(override var model: Int) : Vehicle() {
    override fun vehicleName(name: String): String {
        return name
    }
}