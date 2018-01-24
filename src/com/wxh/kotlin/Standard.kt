package com.wxh.kotlin

/**
 *  Kotlin标准委托
 * @auther wxh
 * @date  2018/1/24 17:01
 */

val lazyValue: String by lazy {
    // 第一次调用输出，第二次调用不执行
    println("computed")
    "Hello"
}

fun main(args: Array<String>){
    // 第一次执行，执行两次输出表达式
    println(lazyValue)
    // 第二次执行，只输出返回值
    println(lazyValue)
}