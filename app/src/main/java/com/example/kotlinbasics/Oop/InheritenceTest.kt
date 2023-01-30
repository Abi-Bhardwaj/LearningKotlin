package com.andr.firstproject.Oop

fun main(args: Array<String>) {

    //creating new car object
    var car = Cars()
    car.type = "Car"
    car.model = "Ferrari"
    car.maxSpeed = 320

    car.show()

    //creating new motorcycle object
    var motor = Motorcycle()
    motor.model = "Yahama"
    motor.type = "Motorcycle"
    motor.maxSpeed = 180

    motor.show()

}