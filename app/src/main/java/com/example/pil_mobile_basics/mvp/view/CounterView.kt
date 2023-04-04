package com.example.pil_mobile_basics.mvp.view

import android.app.Activity
import android.widget.Toast
import com.example.pil_mobile_basics.R
import com.example.pil_mobile_basics.databinding.ActivityMainBinding
import com.example.pil_mobile_basics.mvp.contract.CounterContract
import com.example.pil_mobile_basics.util.Contants.ZERO

// ktlint-disable package-name

class CounterView(activity: Activity) : ActivityView(activity), CounterContract.View {

    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    private var zero = ZERO
    init {
        activity.setContentView(binding.root)
    }
    override fun setCount(number: String) {
        binding.Counter.text = number
    }

    override fun onClickButtonToIncrease(onClick: () -> Unit) {
        binding.button2.setOnClickListener { onClick() }
    }

    override fun onClickButtonToDecrement(onClick: () -> Unit) {
        binding.button3.setOnClickListener { onClick() }
    }

    override fun onClickButtonToReset(onClick: () -> Unit) {
        binding.button1.setOnClickListener { onClick() }
    }

    override fun getInput(): Int {
        return binding.number.text.toString().toInt()
    }

    override fun countOnZero(): Boolean {
        return binding.Counter.text.toString() == zero.toString()
    }

    override fun verifyInput(): Boolean {
        return binding.number.text.isEmpty()
    }

    override fun failedInput() {
        Toast.makeText(activity, activity?.resources?.getString(R.string.Empty), Toast.LENGTH_SHORT).show()
    }

    override fun showCountReset() {
        Toast.makeText(activity, activity?.resources?.getString(R.string.Reset), Toast.LENGTH_SHORT).show()
    }
}
