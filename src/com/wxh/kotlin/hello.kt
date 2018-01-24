package com.wxh.kotlin

import java.lang.Integer.parseInt

/**
 *  kotlin主函数入口
 *  Java8 lambda表达式由三部分组成：参数列表、箭头符号，函数体
 *                           （int x, int y）   ->      x+y
 *
 *   Java 8 lambda表达式的语法
 *  (params) -> expression 表达式
 *  (params) -> statement 语句声明
 *  (params) -> { statements }
 *
 *
 * @auther wxh
 * @date  2018/1/22 11:28
 */
fun main(args: Array<String>){
    println("hello kotlin")
    // 表达式作为函数体，返回类型自动推断
    fun sum(a: Int, b: Int) = a + b

    // 调用可变长参数函数
    // 输出12345
    vars(1,2,3,4,5)
    println()

    // lambda使用实例
    val sumLambda: (Int, Int) -> Int = {x, y -> x+y}
    // 输出3
    println(sumLambda(1,2))

    // 定义常量
    val a: Int = 1
    println(a)
    // 定义变量
    var x  = 5;
    println(x)


    /*
      注释支持单行和多行
     */

    // 字符粗模板中的简单名称
    val s1 = "x is $x"
    println(s1)

    // 字符粗模板中的任意表达式
    x = 6
    val s2 = "${s1.replace("is","was")},but now is $x"
    println(s2)

    // null检查机制
    // 类型后面加?表示可为空
    var age: String? = "23"
    println(age)

    // 抛出空指针异常,像Java的try..cathc
    val ages = age!!.toInt()
    println(ages)

    // 不做处理返回 null
    val ages1 = age?.toInt()
    println(ages1)

    // age为空返回-1
    val ages2 = age?.toInt() ?: -1
    println(ages2)

    // 返回值为null的函数演示
//    if(args.size < 2){
//        println("two integer expected")
//        return
//    }

//    val x1 = parseInt(args[0])
//    val y1 = parseInt(args[1])
//    // 直接使用 `x1 * y1` 会导致错误, 因为它们可能为 null.
//    if (x1 != null && y1 != null) {
//        // 在进行过 null 值检查之后, x1 和 y1 的类型会被自动转换为非null变量
//        print(x1 * y1)
//    }

    // 区间
    for(i in 1..4) print(i)
    println()

    for(i in 4..1) print(i)
    println()

    // 使用 step 指定步长,输出 13
    for(i in 1..4 step 2) print(i)
    println()

    // 使用 downTo,输出42
    for(i in 4 downTo 1 step 2) print(i)
    println()

    for(i in 4 downTo 1) print(i)
    println()
    // 字面量
    val oneMillion = 1_000_000
    println(oneMillion)
    val hexBytes = 0xFF_EC_DE_5E
    println(hexBytes)
    val bytes = 0b11010010_01101001_10010100_10010010
    println(bytes)

    // 比较两个数字
    val b: Int = 10000
    // 比较对象地址相等
    println(b === b)

    // 经过了装箱，创建了两个不同的对象
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b
    // 比较对象地址是否相等--false
    println(boxedB === anotherBoxedB)
    // 比较对象的内容是否相等--true
    println(boxedB == anotherBoxedB)

    // 类型转换
    var b1: Byte = 1
    // 不能直接赋值，需要调用函数转换
    var b2: Int = b1.toInt()
    println(b2)

    // 创建数据两种方式
    // [1,2,3]
    val a1 = arrayOf(1,2,3)
    println(a1[0])
    // [0,2,4]
    val a2 = Array(3,{i -> (i*2)})
    println(a2[1])

    // 字符串
    val text = """
    多行字符串
    多行字符串
    """
    println(text)

    val text1 = """
    |多行字符串
    |菜鸟教程
    |多行字符串
    |Runoob
    """.trimMargin()
    // 前置空格删除了
    println(text1)

    // 字符串模板
    val a3 = 10
    val s = "i = $a3"
    println(s)
}

/**
 *  函数定义
 */
fun sum(a: Int,b: Int): Int{
    return a + b;
}

/**
 *  可变长参数函数定义
 */
fun vars(vararg v:Int){
    for(vt in v){
        print(vt)
    }
}

/**
 *  类型检测及自动类型转换
 *   获取字符串长度
 */
fun getStringLength(obj: Any): Int?{
    if(obj is String){
        // 做过类型判断以后，obj会被系统自动转换为String类型
        // 类似Python、Ruby的duckTyping模式
        return obj.length
    }

    // 在这里还有一种方法，与Java中instanceof不同，使用!is
    // if (obj !is String){
    //    XXX
    // }

    return null;
}