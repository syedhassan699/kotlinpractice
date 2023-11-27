package com.example.cofeemachine

fun coffeeMachine(sugarCount: Int, name: String){



    if (sugarCount == 0)
    {
        println("Coffee with No Sugar for $name")
    }

    else if (sugarCount==1){
        println("Coffee with $sugarCount tablespoon of Sugar for $name")
    }

    else
    {
        println("Coffee with $sugarCount tablespoons of Sugar for $name")
    }
}

fun main() {
    println("Enter Your Name")
    var name = readln();
    println("How Much Sugar you want??")
    var sugarCount = readln();
    var sugarCountInt = sugarCount.toInt()
    coffeeMachine(sugarCountInt, name)
}