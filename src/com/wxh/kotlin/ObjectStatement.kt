package com.wxh.kotlin

/**
 *  对象声明
 * @auther wxh
 * @date  2018/1/24 16:03
 */

/**
 *  声明一个对象
 */
object  Site{
    var url: String = ""
    var name: String = "zhangsan"
}

/**
 *  程序入口
 */
fun main(args: Array<String>) {
    var s1 = Site
    var s2 = Site
    s1.url = "www.xxx.com"
    // 输出结果一样，因为声明的对象是单利的
    println(s1.url)
    println(s2.url)
}