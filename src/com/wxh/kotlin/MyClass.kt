package com.wxh.kotlin

/**
 *  伴生对象
 * @auther wxh
 * @date  2018/1/24 16:13
 */

class MyClasss{
    companion  object Factory{
        fun create(): MyClass = MyClass()
    }
}

// 访问到对象的内部元素
val instance = MyClasss.create()
