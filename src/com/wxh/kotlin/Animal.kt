package com.wxh.kotlin

/**
 *  Kotlin 数据类与密封类
 * @auther wxh
 * @date  2018/1/24 10:50
 */


/**
 *  定义数据类
 */
data class Animal(var name: String , var age: Int)

/**
 *  程序入口
 */
fun main(args: Array<String>){
    var animal = Animal(name = "仓鼠",age = 10)
    // 复制函数
    var newAnimal = animal.copy(age = 20)
    println(animal)
    println(newAnimal)


}