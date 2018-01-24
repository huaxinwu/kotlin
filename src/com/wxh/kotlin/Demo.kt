package com.wxh.kotlin

import kotlin.reflect.KProperty


/**
 *  定义一个被委托的类
 * @auther wxh
 * @date  2018/1/24 16:44
 */

/**
 *  定义包含属性委托的类
 */
class  Examplee{
    var p: String by Delegate()
}

/**
 *  委托的类
 */
class Delegate{
    // 获取值
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String{
        return "$thisRef, 这里委托了 ${property.name} 属性"
    }
    // 设置值
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String){
        println("$thisRef 的 ${property.name} 属性赋值为 ${value}")
    }
}

/**
 *  主函数
 */
fun main(args: Array<String>){
    // 创建一个对象
    val e = Examplee()
    // 访问该属性，调用 getValue() 函数
    println(e.p)

    // 调用 setValue() 函数
    e.p = "zhangsan"
    println(e.p)


}