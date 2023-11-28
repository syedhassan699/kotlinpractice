package com.example.cofeemachine

fun main() {

/*Immutable list cant add anything in that
    var carsList = listOf("Honda","Toyota","Bmw","Mercedes")
    println(carsList)
*/
/*Mutable list can be updated later

  var carsList = mutableListOf("Honda","Toyota","Bmw","Mercedes")
    println(carsList)
    carsList.add(4,"Nissan")
    println(carsList)
    carsList.removeAt(1)
    println(carsList)
    carsList.replaceAll { "Tesla" }
    println(carsList)
*/
/*   var fruitList = mutableListOf("Apple","Banana","Mango","Orange")
    println(fruitList)
    fruitList.add(1,"Pomegranate")
    println(fruitList)
    fruitList.removeAt(3)
    println(fruitList)
    while (true){
        println("Enter Name OF Fruit")
        var fruit = readln()

        if (fruitList.contains(fruit)) {
            println("Available")
        }else
            println("Not Available")
    }
*/

    // Looping  with List
    val num = mutableListOf(1,2,3,4,5)
    for (index in 0..4) {
        var nnum = (num[index] * 2)
            println(nnum)
        }

}