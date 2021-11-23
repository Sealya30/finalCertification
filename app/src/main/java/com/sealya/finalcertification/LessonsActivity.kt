package com.sealya.finalcertification

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LessonsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessons)

        val lessonsList: List<Lessons> = listOf(
            Lessons(R.drawable.green, "Введение в Android разработку"),
            Lessons(R.drawable.yellow, "Основы Android разработки"),
            Lessons(R.drawable.orange, "Разработка сложный приложений"),
            Lessons(R.drawable.red, "Итоговая аттестация")
        )
        val lessonsRecyclerView: RecyclerView = findViewById(R.id.lessons_recycler_view)
        lessonsRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        lessonsRecyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )
        lessonsRecyclerView.adapter = LessonsAdapter(lessonsList)
    }
}