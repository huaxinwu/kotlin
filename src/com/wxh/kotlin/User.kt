package com.wxh.kotlin

/**
 *  扩展函数
 * @auther wxh
 * @date  2018/1/24 9:45
 */
class User(var name: String){

}

/**
 *  扩展伴生对象
 */
class MyClass{
    // 将被称为 "Companion"
    companion object{
    }
}

/**
 *  伴随对象的扩展函数
 */
fun MyClass.Companion.foo(){
    println("伴随对象的扩展函数")
}

/**
 *  伴随对象的扩展属性
 */
val MyClass.Companion.no: Int
    get() = 10




/**
 *  定义扩展函数
 */
fun User.Print(){
    println("用户名:$name")
}

/**
 *  扩展函数 ，列表的wap,调换不同位置的值
 */
fun MutableList<Int>.swap(index1: Int, index2: Int){
    //  this 对应该列表
    var temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

/**
 *  扩展一个对象
 */
fun Any?.toString(): String{
    if(this == null) return "null"
    // 空检测之后，“this”会自动转换为非空类型，所以下面的 toString()
    // 解析为 Any 类的成员函数
    return toString()
}

/**
 *  程序入口
 */
fun main(args: Array<String>){
    // 创建user对象
    var user = User("zhangsan")
    // 调用扩展函数
    user.Print()

    // 交换多项列表中元素
    var list = mutableListOf<Int>(1,2,3)
    // 将索引为0和2的元素交换位置
    list.swap(0,2)
    // 输出 [3,2，1]
    println(list.toString())


    // 扩展一个对象
    var obj = null
    println(obj.toString())

    // 伴生对象的扩展：函数和属性,通过类名点形式调用
    println("no: ${MyClass.no}")
    MyClass.foo()
}