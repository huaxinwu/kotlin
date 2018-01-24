package com.wxh.kotlin

/**
 *  匿名内部类
 * @auther wxh
 * @date  2018/1/23 15:31
 */
class  Test{
    var v = "成员属性"
    fun setInterFace(test: TestInterface){
        test.test()
    }
}

/**
 *  定义接口
 */
interface TestInterface{
    fun test()
}

fun main(args: Array<String>) {
    var test = Test()
    /**
     * 采用对象表达式来创建接口对象，即匿名内部类的实例。
     */
    test.setInterFace(object : TestInterface{
        override fun test(){
            println("对象表达式创建匿名内部类的实例")
        }
    })
}