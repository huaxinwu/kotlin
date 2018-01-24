package com.wxh.kotlin

/**
 *  Kotlin 委托模式
 * @auther wxh
 * @date  2018/1/24 16:33
 */


/**
 *  定义接口
 */
interface Basee{
    fun print()
}

/**
 *  实现此接口的被委托的类
 */
class BaseeImpl(val x: Int): Basee{
    override fun print() {
        print(x)
    }
}

/**
 *  通过关键字 by 建立委托类
 */
class Derivedd(b: Basee) : Basee by b

fun main(args: Array<String>){
    // 接口实例化
    val b = BaseeImpl(10)
    // 通过委托类调用函数
    Derivedd(b).print()
}