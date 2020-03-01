package com.example.logica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_logica.*

class LogicaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logica)
        initViews()
    }

    private fun initViews() {
        checkBtn.setOnClickListener() {
            onCheckClick()
        }
    }

    private fun onCheckClick() {
        var correctAnswers: Int = 0
        if (answer1.text.toString().toUpperCase() == getString(R.string.true_char))
            correctAnswers++
        if (answer2.text.toString().toUpperCase() == getString(R.string.false_char))
            correctAnswers++
        if (answer3.text.toString().toUpperCase() == getString(R.string.false_char))
            correctAnswers++
        if (answer4.text.toString().toUpperCase() == getString(R.string.false_char))
            correctAnswers++
        answer1.text.clear()
        answer2.text.clear()
        answer3.text.clear()
        answer4.text.clear()
        Toast.makeText(this, getString(R.string.correct_text) + " " + correctAnswers,
            Toast.LENGTH_LONG).show()
    }
}
