package com.wxh.kotlin

/**
 *  Kotlin 密封类
 * @auther wxh
 * @date  2018/1/24 11:10
 */

/**
 *  密封类
 */
sealed class Expr
/**
 *  数据类
 */
data class  Const(val number: Double): Expr()
data class  Sum(val e1: Expr, val e2: Expr): Expr()
/**
 *  对象
 */
object NotANumber : Expr()

/**
 *  定义函数
 */
fun eval(expr: Expr): Double = when(expr){
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
    // 不再需要 `else` 子句，因为我们已经覆盖了所有的情况

}

