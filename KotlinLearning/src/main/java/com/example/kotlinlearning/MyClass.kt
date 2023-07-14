package com.example.kotlinlearning

fun main() {
//    var name ="Akhilesh" //mutable
//    name ="Rohit"
//    val MyName = "Mamata"// immutable
//    println("hello $name")
//    println("hello $MyName")
//
//    val name1: String
//    val num : Int
//    num = 13
//    name1 = "Akhil"
//    println(name1)
//    println(num)

    //****************************Functions**********************
    //calculate(1, 100, "is multiple of", 3)
    //calculate( massage = "is multiple of", multipleOf =  12)
    //calculate(first = 12, second = 100,  massage = "is multiple of", multipleOf =  12)

    //********************Function and Return type********************
   // val catAge = calculateCatAge  (age = 5)
    val catAge = calculateCatAge  (age = 2)
    println("This cat us $catAge years old")
    if (checkAge(catAge))
    println("This cat is old $catAge")
    else
        println("This cat is young $catAge")


}

fun calculateCatAge(age: Int): Int {
    return age * 5
}
fun checkAge(catAge : Int): Boolean{

    return catAge >= 15
}

fun calculate(first: Int =11, second: Int=1000, massage: String, multipleOf: Int) {
    for (i in first..second)
        if (i % multipleOf == 0) println("$i $massage $multipleOf") else ("---------")
}
//}fun calculate(first: Int, Second: Int, massage: String, multipleOf: Int) {
//    for (i in first..Second)
//        if (i % multipleOf == 0) println("$i $massage $multipleOf") else ("---------")
//}