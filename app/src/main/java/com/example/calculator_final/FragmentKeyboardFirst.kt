package com.example.calculator_final

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_keyboard_1.*

class FragmentKeyboardFirst : Fragment() {

    enum class ButtonType {
        NUMBER,
        OPERATOR,
        DELETE,
        CLEAR,
        CALCULATING,
        CHANGEKEYBOARD
    }

    var communicator: Communicator? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        communicator = context as Communicator
        return inflater.inflate(R.layout.fragment_keyboard_1, container, false)
    }

    override fun onResume() {
        super.onResume()

        // Number
        buttonNumZero.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, buttonNumZero.text.toString()) }
        buttonNumOne.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, buttonNumOne.text.toString()) }
        buttonNumTwo.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, buttonNumTwo.text.toString()) }
        buttonNumThree.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, buttonNumThree.text.toString()) }
        buttonNumFour.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, buttonNumFour.text.toString()) }
        buttonNumFive.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, buttonNumFive.text.toString()) }
        buttonNumSix.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, buttonNumSix.text.toString()) }
        buttonNumSeven.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, buttonNumSeven.text.toString()) }
        buttonNumEight.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, buttonNumEight.text.toString()) }
        buttonNumNight.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, buttonNumNight.text.toString()) }

        // Operator
        buttonPlus.setOnClickListener { communicator?.respondData(ButtonType.OPERATOR, buttonPlus.text.toString()) }
        buttonMinus.setOnClickListener { communicator?.respondData(ButtonType.OPERATOR, buttonMinus.text.toString()) }
        buttonMulti.setOnClickListener { communicator?.respondData(ButtonType.OPERATOR, buttonMulti.text.toString()) }
        buttonDivide.setOnClickListener { communicator?.respondData(ButtonType.OPERATOR, buttonDivide.text.toString()) }
        buttonMod.setOnClickListener { communicator?.respondData(ButtonType.OPERATOR, buttonMod.text.toString()) }
        buttonDot.setOnClickListener { communicator?.respondData(ButtonType.OPERATOR, buttonDot.text.toString()) }

        // Delete
        buttonDel.setOnClickListener { communicator?.respondData(ButtonType.DELETE, "delete") }

        // Clear
        buttonAC.setOnClickListener { communicator?.respondData(ButtonType.CLEAR, "clear") }

        // Calculating
        buttonEquals.setOnClickListener { communicator?.respondData(ButtonType.CALCULATING, "calculating") }

        // Change Keyboard
        buttonChangeKeyboard.setOnClickListener { communicator?.respondData(ButtonType.CHANGEKEYBOARD, "changeKeyboard") }
    }
}
