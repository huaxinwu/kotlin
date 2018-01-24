package com.wxh.kotlin

/**
 *  声明处型变
 *  声明处的类型变异使用协变注解修饰符：in、out，消费者 in, 生产者 out
 * @auther wxh
 * @date  2018/1/24 13:43
 */

/**
 *  out的使用
 *  定义一个支持协变的类，支持返回值
 */
class  Runbbo<out A>(val a: A){
    fun foo(): A{
        return a
    }
}

/**
 *  in的使用
 *  定义一个支持逆变的类,不支持返回值
 */
class RunbboIn<in A>(a: A){
    fun foo(a: A){

    }
}

/**
 *  程序入口
 */
fun main(args: Array<String>){
    // 字符串变量
    var strConst = Runbbo("a")
    // 对象
    var anyConst = Runbbo<Any>("b")
    // 赋值地址
    anyConst = strConst
    // 输出 a
    println(anyConst.foo())


    println("-----------in---------------")
    var strCon = RunbboIn("a1")
    var anyCon = RunbboIn<Any>("b1")
    strCon = anyCon
    println(strCon)




}