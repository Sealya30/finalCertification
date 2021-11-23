package com.sealya.finalcertification

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class LessonsAdapter(private val lessonsList: List<Lessons>) :
    RecyclerView.Adapter<LessonsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonsViewHolder {
        val lessonsView = LayoutInflater.from(parent.context)
            .inflate(R.layout.lessons_card_view_item, parent, false)

        return LessonsViewHolder(lessonsView)
    }

    override fun onBindViewHolder(holder: LessonsViewHolder, position: Int) {
        val lessons = lessonsList[position]
        holder.bind(lessons)
    }

    override fun getItemCount(): Int {
        return lessonsList.size
    }
}