package com.bara_x.assistantdayr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonBtnQuest = findViewById<Button>(R.id.btnQuest)
        val textViewQuest = findViewById<TextView>(R.id.tvQuest)
        val imageViewQuest = findViewById<ImageView>(R.id.ivQuest)

            buttonBtnQuest.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.scale)
            buttonBtnQuest.startAnimation(animation)
            textViewQuest.startAnimation(animation)
            imageViewQuest.startAnimation(animation)
            val intent = Intent(this, QuestListActivity::class.java)
            startActivity(intent)
        }
    }

}




