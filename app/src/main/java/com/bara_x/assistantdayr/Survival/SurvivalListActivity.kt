package com.bara_x.assistantdayr.Survival

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.bara_x.assistantdayr.R
import com.bara_x.assistantdayr.transport.Transport

class SurvivalListActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Survival>
    lateinit var imageId: Array<Int>
    lateinit var headingSurvival: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survival_list)

        imageId = arrayOf(

            //TODO  загрузить изображения


        )


        headingSurvival= arrayOf(
            //TODO загрузить названия выживания
        )

    }


}