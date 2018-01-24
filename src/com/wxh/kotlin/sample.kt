package com.wxh.kotlin

/**
 *  Kotlin 条件语句、循环语句等示例
 * @auther wxh
 * @date  2018/1/23 9:50
 */

fun main(args: Array<String>){
    //===================条件语句=====================================
    // 传统用法
    val a = 3
    val b = 5
    var max = a
    if(a < b) max = b

    // 使用 else
    var max1: Int
    if(a < b){
        max1 = b
    }else{
        max1 = a
    }

    // 作为表达式,类似Java三目运算
    var max2 = if(a < b) b else a

    println("--------------if语句-------------")
    // 使用区间,in
    var x = 4
    if(x in 1..8){
        println("x在此区间内")
    }

    println("--------------when语句-------------")
    // 相当于Java的switch
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        2 -> println("x == 2")
        in 3..10 -> println("x in 3..10")
        else -> { // 注意这个块--switch的default
            println("x 不是 1 ，也不是 2")
        }
    }

    //=======================循环语句=================================
    val items = listOf("apple","banana","kiwi")
    println("--------------for语句-------------")
    // 遍历迭代器每个对象
    for(item in items){
        println(item)
    }

    // 通过索引遍历一个数组或者一个 list
    for(index in items.indices){
        println("item is $index is ${items[index]}")
    }
    println("--------------while语句-------------")
    var y = 5
    while(y > 0){
        println(y--)
    }
    println("--------------do ..while语句-------------")
    var x1 = 7
    do {
        println(x1--)
    }while (x1 > 0)

    println("--------------返回和跳转-------------")
    for(i in 1..10){
        // i 为 3 时跳过当前循环，继续下一次循环
        if(i == 3) continue
        println(i)
        // 跳转整个循环，i 为 6 时 跳出循环
        if(i > 5) break
    }
    println("--------------标签标记/-------------")
    loop@ for(i in 1..100){
        for(j in 1..100){
            // 跳转双层循环，重新开始
            if(j>50) break@loop
        }
    }
    println("--------------标签处返回/-------------")


}

/**
 *  定义函数
 */
fun hasPrefix(x: Any) = when(x){
    is String -> x.startsWith("prefix")
    else -> false
}



