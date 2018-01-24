package com.wxh.kotlin

/**
 *  Kotlin 枚举类
 * @auther wxh
 * @date  2018/1/24 14:56
 */

/**
 *  定义枚举类
 */
enum class  Color{
    RED,
    BLACK,
    BLUE,
    GREEN,
    WHITE
}

/**
 *  枚举初始化
 */
enum class Shape(value: Int){
    over(100),
    rectangle(200)
}

/**
 *  枚举还支持以声明自己的匿名类及相应的方法、以及覆盖基类的方法
 */
enum class ProtocolState(){
    WAITTIN{
        override fun singal() = TALKING
    },
    TALKING{
        override fun singal() = WAITTIN
    };

    /**
     *  抽象函数
     */
    abstract fun singal(): ProtocolState
}

/**
 *  自 Kotlin 1.1 起，可以使用 enumValues<T>() 和 enumValueOf<T>() 函数以泛型的方式访问枚举类中的常量 ：
 */
inline fun <reified T: Enum<T>> printAllValues(){
    print(enumValues<T>().joinToString { it.name })
}



/**
 *  主函数
 */
fun main(args: Array<String>){
    // 使用枚举常量
    var color: Color = Color.BLUE
    // 获取枚举名称
    println(color.name)
    // 获取枚举值在所有枚举数组中定义的顺序
    println(color.ordinal)

    println(Color.values())
    println(Color.valueOf("RED"))

    // Kotlin1.1 以后使用 enumValues<T>()
    printAllValues<Color>()

}