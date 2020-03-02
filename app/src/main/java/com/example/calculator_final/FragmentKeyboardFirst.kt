package com.example.calculator_final

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_keyboard_1.*

class FragmentKeyboardFirst : Fragment() {

    enum class ButtonType (){
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
        buttonNumZero.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, "0") }
        buttonNumOne.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, "1") }
        buttonNumTwo.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, "2") }
        buttonNumThree.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, "3") }
        buttonNumFour.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, "4") }
        buttonNumFive.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, "5") }
        buttonNumSix.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, "6") }
        buttonNumSeven.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, "7") }
        buttonNumEight.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, "8") }
        buttonNumNight.setOnClickListener { communicator?.respondData(ButtonType.NUMBER, "9") }

        // Operator
        buttonPlus.setOnClickListener { communicator?.respondData(ButtonType.OPERATOR, "+") }
        buttonMinus.setOnClickListener { communicator?.respondData(ButtonType.OPERATOR, "-") }
        buttonMulti.setOnClickListener { communicator?.respondData(ButtonType.OPERATOR, "*") }
        buttonDivide.setOnClickListener { communicator?.respondData(ButtonType.OPERATOR, "/") }
        buttonMod.setOnClickListener { communicator?.respondData(ButtonType.OPERATOR, "%") }
        buttonDot.setOnClickListener { communicator?.respondData(ButtonType.OPERATOR, ".") }

        // Delete
        buttonDel.setOnClickListener { communicator?.respondData(ButtonType.DELETE, "delete") }

        // Clear
        buttonAC.setOnClickListener { communicator?.respondData(ButtonType.CLEAR, "clear") }

        // Calculating
        buttonEquals.setOnClickListener { communicator?.respondData(ButtonType.CALCULATING, "calculating") }

        // Change Keyboard
        buttonChangeKeyboard.setOnClickListener { communicator?.respondData(ButtonType.CHANGEKEYBOARD, "changeKeyboard") }

        Log.d("TAG", ButtonType.NUMBER.toString())
    }
}
