package com.wxh.kotlin


import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.JComponent

/**
 *  对象表达式
 * @auther wxh
 * @date  2018/1/24 15:25
 */

/**
 *  表示此类可以被继承
 */
open class  A(x: Int){
    public open  val y: Int = x
}

/**
 *  定义接口
 */
interface  B{
}

/**
 *  请注意，匿名对象可以用作只在本地和私有作用域中声明的类型
 *  如果你使用匿名对象作为公有函数的,在匿名对象 中添加的成员将无法访问。
 */
class  C{
    // 私有函数，所以其返回类型是匿名对象类型
    private fun foo() = object {
        val x: String = "x"
    }
    // 公有函数，所以其返回类型是 Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar(){
        // 编译通过
        val x1 = foo().x
        // 编译不通过--未能解析引用x
//        val x2 = publicFoo().x
    }
}

/**
 * 在对象表达中可以方便的访问到作用域中的其他变量:
 */
fun countClick(window: JComponent){
    var clickCount = 0;
    var enterCount = 0

    window.addMouseListener(object : MouseAdapter(){
        // 鼠标点击
        override fun mouseClicked(e: MouseEvent){
            clickCount++
        }
        // 鼠标进入
        override fun mouseEntered(e: MouseEvent){
            enterCount++
        }
    })
}


/**
 *  对象表达式使用
 */
val ab: A = object : A(1), B{
    override val y = 5
}

fun main(args: Array<String>){
    // 通过对象表达式可以越过类的定义直接得到一个对象
    val site = object {
        var name: String = "zhannsan"
        var url: String = "www.xxx.com"
    }
    println(site.name)
    println(site.url)

}