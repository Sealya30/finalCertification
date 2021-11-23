package com.sealya.finalcertification

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class StudentFragment : Fragment() {
    private lateinit var knowButton: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_student, container, false)

        knowButton = view.findViewById(R.id.know_button)
        val link = Uri.parse("https://odin.study/ru/User/Info/93286")
        val aboutStudentIntent = Intent(Intent.ACTION_VIEW, link)

        knowButton.setOnClickListener {
            startActivity(aboutStudentIntent)
        }
        return view
    }
}