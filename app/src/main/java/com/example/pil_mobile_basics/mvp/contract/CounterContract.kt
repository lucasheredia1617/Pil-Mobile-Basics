package com.example.pil_mobile_basics.mvp.contract // ktlint-disable package-name

interface CounterContract {
    interface Model {
        fun getCount(): String
        fun setInitialValue(value: Int)
        fun increaseCount(value: Int)
        fun decrementCount(value: Int)
        fun resetCount()
    }
    interface View {
        fun setCount(number: String)
        fun onClickButtonToIncrease(onClick: () -> Unit)
        fun onClickButtonToDecrement(onClick: () -> Unit)
        fun onClickButtonToReset(onClick: () -> Unit)
        fun getInput(): Int
        fun verifyInput(): Boolean
        fun showCountReset()
    }

    interface Presenter {
        fun onClickButtonToIncrease()
        fun onClickButtonToDecrement()
        fun onClickButtonToReset()
    }
}
