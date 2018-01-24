package com.wxh.kotlin

/**
 *  定义Kotlin接口
 *  使用 interface 关键字定义接口，允许方法有默认实现
 * @auther wxh
 * @date  2018/1/23 16:35
 */
interface MyInterface {
    // name属性, 抽象的,但是在类中必须初始化
    var name: String

    // 未实现
    fun bar()
    //已实现
    fun foo(){
        // 可选的方法体
        println("foo")
    }
}

/**
 *  实现接口
 */
class Child:MyInterface{
    // 重载属性
    override var name: String = "runoob"

    override fun bar() {
        println("bar")
    }
}

fun main(args: Array<String>){
    var c = Child()
    c.foo()
    c.bar()
}