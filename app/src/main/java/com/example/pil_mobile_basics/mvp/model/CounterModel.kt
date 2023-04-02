package com.example.pil_mobile_basics.mvp.model // ktlint-disable package-name

import com.example.pil_mobile_basics.mvp.contract.CounterContract
import com.example.pil_mobile_basics.util.Contants.ZERO

// ktlint-disable package-name

class CounterModel : CounterContract.Model {

    private var count = ZERO
    override fun getCount(): String {
        return count.toString()
    }

    override fun setInitialValue(value: Int) {
        count = value
    }

    override fun increaseCount(value: Int) {
        count += value
    }

    override fun decrementCount(value: Int) {
        count -= value
    }

    override fun resetCount() {
        count = ZERO
    }
}
