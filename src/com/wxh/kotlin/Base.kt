package com.wxh.kotlin

/**
 * @auther wxh
 * @date  2018/1/23 15:21
 */
open  class Base{
    open fun f(){

    }
}

/**
 *  定义抽象类
 */
abstract class Derived : Base() {
    override abstract fun f()
}
