package com.wxh.kotlin

/**
 *  Kotlin泛型
 * @auther wxh
 * @date  2018/1/24 11:19
 */

/**
 *  定义泛型类
 */
class Box<T>(t: T){
    // 定义泛型变量
    var value = t
}

/**
 *  定义泛型函数
 */
fun <T> doPrintln(content: T){
    // 条件控制语句
    when(content){
        is Int -> println("整型数字为 $content")
        is String -> println("字符串转换为大写：${content.toUpperCase()}")
        else -> println("T 既不是整型，也不是字符串")
    }

}

/**
 *  泛型约束
 */
fun <T : Comparable<T>> sort(list: List<T>) {
    // OK。Int 是 Comparable<Int> 的子类型
    sort(listOf(1, 2, 3))
    // 错误：HashMap<Int, String> 不是 Comparable<HashMap<Int, String>> 的子类型
//    sort(listOf(HashMap<Int, String>()))

}


/**
 *  程序入口
 */
fun main(args: Array<String>){
    // 泛型类
    var boxInt = Box<Int>(10)
    var boxString = Box<String>("zhangsan")
    // 泛型变量
    println(boxInt.value)
    println(boxString.value)

    // 泛型函数
    val age = 45
    val name = "zhansan"
    val bool = true
    // 整型
    doPrintln(age)
    // 字符串
    doPrintln(name)
    // 布尔型
    doPrintln(bool)

}
