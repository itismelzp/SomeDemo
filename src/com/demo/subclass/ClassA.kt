package com.demo.subclass

class ClassA : BaseClass() {
    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if (other !is ClassA) {
            return false
        }
        return other.aInt == aInt && other.aStr == aStr
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }



}

fun main() {
    println(OperatorModeEnum.findMode(OperatorModeEnum.OPERATOR_MODE_NEWHAND))
}