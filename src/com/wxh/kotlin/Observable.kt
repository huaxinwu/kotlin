package com.wxh.kotlin

import kotlin.properties.Delegates

/**
 *  可观察属性
 *  Delegates.observable() 函数接受两个参数: 第一个是初始化值, 第二个是属性值变化事件的响应器(handler)。
 *  在属性赋值后会执行事件的响应器(handler)，它有三个参数：被赋值的属性、旧值和新值
 * @auther wxh
 * @date  2018/1/24 17:06
 */
class Userr{
    var name: String by Delegates.observable("初始值"){
        prop, old, new ->
        println("旧值：$old -> 新值：$new")
    }
}

fun main(args: Array<String>){
    var user = Userr()
    user.name = "第一次赋值"
    user.name = "第二次赋值"
}