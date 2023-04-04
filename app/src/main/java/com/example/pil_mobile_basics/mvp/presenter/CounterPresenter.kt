package com.example.pil_mobile_basics.mvp.presenter // ktlint-disable package-name

import com.example.pil_mobile_basics.mvp.contract.CounterContract

class CounterPresenter(private val model: CounterContract.Model, private val view: CounterContract.View) : CounterContract.Presenter {
    override fun onClickButtonToIncrease() {
        if (view.verifyInput()) {
            view.failedInput()
        } else {
            model.increaseCount(view.getInput())
            view.setCount(model.getCount())
        }
    }

    override fun onClickButtonToDecrement() {
        if (view.verifyInput()) {
            view.failedInput()
        } else {
            model.decrementCount(view.getInput())
            view.setCount(model.getCount())
        }
    }

    override fun onClickButtonToReset() {
        if (view.countOnZero()){
            view.showCountReset()
        }
        else{
            model.resetCount()
            view.setCount(model.getCount())
        }
    }

    init {
        view.onClickButtonToReset { onClickButtonToReset() }
        view.onClickButtonToDecrement { onClickButtonToDecrement() }
        view.onClickButtonToIncrease { onClickButtonToIncrease() }
    }
}
