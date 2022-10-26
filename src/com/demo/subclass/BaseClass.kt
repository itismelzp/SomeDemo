package com.demo.subclass

open class BaseClass {

    var aInt: Int = 0
    var aStr: String = ""

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        var result = aInt
        result = 31 * result + aStr.hashCode()
        return result
    }
}