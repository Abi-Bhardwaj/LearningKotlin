package com.andr.firstproject.Oop.abstract

fun main(args: Array<String>) {
//    var vehicle =  Vehicle()

    var car = Car(2020)
    car.speed = 300
    println("Name: ${car.vehicleName("Shelby")} \n " +
            "Type: ${car.vehicleType("Car")} \n " +
            "Model: ${car.model} \n " +
            "Speed: ${car.speed}")



}