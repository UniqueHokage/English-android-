package com.example.newenglish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView

class LessonsUroki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessonsuroki)

        var arrlesson: ArrayList<Lesson> = ArrayList()
        arrlesson.add(Lesson("Урок 1. Ознакомление", R.drawable.gh))
        arrlesson.add(Lesson("Урок 2. У меня не получается нормально задавать вопросы!", R.drawable.gh))
        arrlesson.add(Lesson("Урок 3. Чем отличаются \"I like\" и \"I'd like\"?", R.drawable.gh))
        arrlesson.add(Lesson("Урок 4.  Почему иногда надо говорить \"do you have\", а иногда - \"have you\"?", R.drawable.gh))
        arrlesson.add(Lesson("Урок 5. Что такое Present Perfect?", R.drawable.gh))

        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = CustomAdapter(applicationContext, arrlesson)
        listView.isClickable = true

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            if (position == 0) {
                val intent: Intent = Intent(this@LessonsUroki, lesson1::class.java)
                startActivity(intent)
            } else if (position == 1) {
                val intent: Intent = Intent(this@LessonsUroki, lesson2::class.java)
                startActivity(intent)
            }
            else if (position == 2) {
                val intent: Intent = Intent(this@LessonsUroki, lesson3::class.java)
                startActivity(intent)
            }
            else if (position == 3) {
                val intent: Intent = Intent(this@LessonsUroki, lesson4::class.java)
                startActivity(intent)
            }
            else if (position == 4) {
                val intent: Intent = Intent(this@LessonsUroki, lesson5::class.java)
                startActivity(intent)
            }

        }
    }
}
