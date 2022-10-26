package com.demo.subclass

enum class OperatorModeEnum(private var mode: Int = 0) {

    OPERATOR_MODE_NEWHAND(0),       // 新手模式
    OPERATOR_MODE_PROFESSIONAL(1);  // 专业模式

    companion object {
        fun findEnum(value: Int): OperatorModeEnum {
            val arr = values()
            for (a in arr) {
                if (a.mode == value) {
                    return a
                }
            }
            return OPERATOR_MODE_NEWHAND
        }

        public fun findMode(enum: OperatorModeEnum): Int {
            return enum.mode
        }
    }

}