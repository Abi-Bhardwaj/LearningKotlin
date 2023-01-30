package com.andr.firstproject.Oop

fun main(args: Array<String>) {

    /*var myCar = Cars()
    myCar.name = "SRT"
    myCar.model = 2018

    var myCar2 = Cars()
    myCar2.name = "Mustang"
    myCar2.model = 1967

    println("Car name is ${myCar.name} & model is ${myCar.model}")
    println("Car name is ${myCar2.name} & model is ${myCar2.model}")*/

    //var myNewCar = MyCars("Thar", 2022)
//    println("My car's name is ${myNewCar.name} & model is ${myNewCar.model}")

    var mySecondCars = MySecondCars("Merc", 2022)

    mySecondCars.name = "Audi"
    mySecondCars.model = 2018 // set (using encapsulation)
    println("My car's name is ${mySecondCars.name} & ${mySecondCars.model}")
}