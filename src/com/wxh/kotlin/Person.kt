package com.wxh.kotlin

/**
 * @auther wxh
 * @date  2018/1/23 14:28
 */
class Person{
    var lastName: String = "zhang"
            // 修改getter方法
        get() = field.toUpperCase()
        set
    var no: Int = 100
            // 后端变量
        get() = field
            // 修改setter方法
        set(value) {
            if(value < 10){
                field = value
            }else{
                field = -1
            }
        }

    var heiht: Float = 145.4f
        private set

}

/**
 *  主函数入口,类似Javamain方法
 */
fun main(args: Array<String>) {
    // Kotlin没有new关键字
    var person: Person = Person()
    // 调用属性
    person.lastName = "wang"
    // 使用字符串模板
    println("lastName: ${person.lastName}")

    person.no = 9
    println("no: ${person.no}")

    person.no = 20
    println("no: ${person.no}")
}
