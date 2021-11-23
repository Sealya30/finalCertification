package com.sealya.finalcertification

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LessonsViewHolder(itemView: View): RecyclerView.ViewHolder (itemView) {
    fun bind (lessons: Lessons) {
        val lessonsImageView: ImageView = itemView.findViewById(R.id.lesson_image_view)
        val lessonsDescriptionTextView: TextView = itemView.findViewById(R.id.lessons_text_view)

        lessonsImageView.setImageDrawable(itemView.context.getDrawable(lessons.imageRes))
        lessonsDescriptionTextView.text = lessons.description
    }
}