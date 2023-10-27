package com.base.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.view.animation.LayoutAnimationController
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val isimList = ArrayList<IsimModel>()
        isimList.add(IsimModel("İsim 1"))
        isimList.add(IsimModel("İsim 2"))
        isimList.add(IsimModel("İsim 3"))
        isimList.add(IsimModel("İsim 4"))

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val button = findViewById<Button>(R.id.button)

        val adapter = IsimAdapter(isimList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        button.setOnClickListener {
            recyclerView
                .startLayoutAnimation()
        }
    }
}