package com.example.lab5intent_603021046_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.myweb.lab5intent_603021046_5.Student
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data :Bundle? = intent.extras
        var newStudent : Student? = data?.getParcelable<Student>(  "stData")
        idText.text = "รหัสนักศึกษา : ${newStudent?.id}"
        nameText.text = "ชื่อสกุล : ${newStudent?.name}"
        ageText.text = "อายุ : ${newStudent?.age}"
    }

    fun onClickClose(view: View){
        finish()
    }
}
