package com.wxh.kotlin

/**
 *  定义类
 * @auther wxh
 * @date  2018/1/23 14:18
 */
class Example constructor(name: String){

    /**
     *  定义属性
     */
    var name: String = ""
    var url: String = ""
    var city: String = ""
    val a: Int = 6

    // 初始化代码段使用 init 关键字作为前缀
    init {
        System.out.print("name is $name")
    }

    /**
     *  次构造函数
     */
    constructor(name: String, city: String) : this(name) {
        println("city: ${city}")
    }


    /**
     *  定义函数
     */
    fun foo(){
        println("foo函数")
    }

}

