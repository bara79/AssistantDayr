package com.bara_x.assistantdayr.Transport//package com.bara_x.assistantdayr.Transport
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.ImageView
//import android.widget.TextView
//import com.bara_x.assistantdayr.R
//

/* экран описания транспорта и наполнение данного экрнана контентом из транспортлистактивити
 из массивов
*/


//class DescriptionActivityTransport : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_description_transport)
//
//        val headingNews: TextView = findViewById(R.id.heading_transport)
//        val mainNews: TextView = findViewById(R.id.description_transport)
//        val imageTransport: ImageView = findViewById(R.id.image_heading_transport)
//
//        val bundle: Bundle? = intent.extras
//        val heading = bundle!!.getString("heading")
//        val imageId = bundle.getInt("imageId")
//        val description = bundle.getString("description")
//
//        headingNews.text = heading
//        mainNews.text = description
//        imageTransport.setImageResource(imageId)
//
//
//    }
//}