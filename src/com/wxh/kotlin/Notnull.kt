package com.wxh.kotlin

import kotlin.properties.Delegates

/**
 *  Kotlin Not Null
 * @auther wxh
 * @date  2018/1/24 17:19
 */

class Foo{
    var notNullBar: String by Delegates.notNull<String>()
}


fun main(args: Array<String>) {
    var foo = Foo()
    foo.notNullBar = "bar"
    println(foo.notNullBar)
}