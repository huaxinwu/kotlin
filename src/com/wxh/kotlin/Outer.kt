package com.wxh.kotlin

/**
 *  嵌套类、内部类
 * @auther wxh
 * @date  2018/1/23 15:24
 */
class Outer{
    private val bar: Int = 1
    var v = "成员属性"
    // 嵌套类
    class Nested{
        fun foo()= 2
    }
    // 内部类
    inner class Inner{
        // 访问外部类成员
        fun foo() = bar
        fun innerTest(){
            // 获取外部类的成员变量
            var o = this@Outer
            println("内部类可以引用外部类的成员，例如：" + o.v)
        }
    }
}