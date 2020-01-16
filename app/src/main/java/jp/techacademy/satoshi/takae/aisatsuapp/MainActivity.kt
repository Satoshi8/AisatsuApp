package jp.techacademy.satoshi.takae.aisatsuapp

import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.TimePicker
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pickTimeBtn.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        showTimePickerDialog()
    }

    private fun showTimePickerDialog() {
        val timePickerDialog =
            TimePickerDialog(this, TimePickerDialog.OnTimeSetListener {
                view, hourOfDay, minute ->
                    if (hourOfDay >= 2 && hourOfDay <= 9) {
                        textView.setText("おはよう")
                    } else if (hourOfDay >= 10 && hourOfDay <= 17) {
                        textView.setText("こんにちは")
                    } else if (hourOfDay >= 18 && hourOfDay <= 1) {
                        textView.setText("こんばんは")
                    }

            }, 13, 0, true)
        timePickerDialog.show()
    }
}
