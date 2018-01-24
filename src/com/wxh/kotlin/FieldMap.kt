package com.wxh.kotlin

/**
 *  把属性储存在映射中
 * @auther wxh
 * @date  2018/1/24 17:13
 */
class Sitee(val map: Map<String, Any?>){
    val name: String by map
    val url: String  by map
}

fun main(args: Array<String>) {
    // 构造函数接受一个映射参数
    var site = Sitee(mapOf(
            "name" to "zhangsan",
            "url"  to  "www.xxx.com"
    ))

    // 读取映射值
    println(site.name)
    println(site.url)

}