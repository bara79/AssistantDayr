package com.bara_x.assistantdayr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bara_x.assistantdayr.Transport.TransportListActivity
import com.bara_x.assistantdayr.listActivity.*
import com.bara_x.assistantdayr.medicine.MedicineListActivity
import com.bara_x.assistantdayr.settings.SettingsActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonBtnQuest = findViewById<Button>(R.id.btnQuest)
        val textViewQuest = findViewById<TextView>(R.id.tvQuest)
        val imageViewQuest = findViewById<ImageView>(R.id.ivQuest)

        buttonBtnQuest.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.scale)
            buttonBtnQuest.startAnimation(animation)
            textViewQuest.startAnimation(animation)
            imageViewQuest.startAnimation(animation)
            val intent = Intent(this, QuestListActivity::class.java)
            startActivity(intent)
        }

        val buttonMedicine = findViewById<Button>(R.id.buttonMedicine)
        val textViewMedicine = findViewById<TextView>(R.id.textViewMedicine)
        val imageViewMedicine = findViewById<ImageView>(R.id.imageViewMedicine)

        buttonMedicine.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.scale)
            buttonMedicine.startAnimation(animation)
            textViewMedicine.startAnimation(animation)
            imageViewMedicine.startAnimation(animation)
            val intent = Intent(this, MedicineListActivity::class.java)
            startActivity(intent)
        }

        val buttonFood = findViewById<Button>(R.id.buttonFood)
        val textViewFood = findViewById<TextView>(R.id.textViewFood)
        val imageViewFood = findViewById<ImageView>(R.id.imageViewFood)

        buttonFood.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.scale)
            buttonFood.startAnimation(animation)
            textViewFood.startAnimation(animation)
            imageViewFood.startAnimation(animation)
            val intent = Intent(this, FoodListActivity::class.java)
            startActivity(intent)
        }

        val buttonCharacters = findViewById<Button>(R.id.buttonCharacter)
        val textViewCharacters = findViewById<TextView>(R.id.textViewCharacter)
        val imageViewCharacters = findViewById<ImageView>(R.id.imageViewCharacter)

        buttonCharacters.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.scale)
            buttonCharacters.startAnimation(animation)
            textViewCharacters.startAnimation(animation)
            imageViewCharacters.startAnimation(animation)
            val intent = Intent(this, CharacterListActivity::class.java)
            startActivity(intent)
        }

        val buttonComponents = findViewById<Button>(R.id.buttonComponents)
        val textViewComponents = findViewById<TextView>(R.id.textViewComponents)
        val imageViewComponents = findViewById<ImageView>(R.id.imageViewComponents)

        buttonComponents.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.scale)
            buttonComponents.startAnimation(animation)
            textViewComponents.startAnimation(animation)
            imageViewComponents.startAnimation(animation)
            val intent = Intent(this, ComponentsListActivity::class.java)
            startActivity(intent)
        }

        val buttonEnemy = findViewById<Button>(R.id.buttonEnemy)
        val textViewEnemy = findViewById<TextView>(R.id.textViewEnemy)
        val imageViewEnemy = findViewById<ImageView>(R.id.imageViewEnemy)

        buttonEnemy.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.scale)
            buttonEnemy.startAnimation(animation)
            textViewEnemy.startAnimation(animation)
            imageViewEnemy.startAnimation(animation)
            val intent = Intent(this, EnemyListActivity::class.java)
            startActivity(intent)
        }

        val buttonEquipment = findViewById<Button>(R.id.buttonEquipment)
        val textViewEquipment = findViewById<TextView>(R.id.textViewEquipment)
        val imageViewEquipment = findViewById<ImageView>(R.id.imageViewEquipment)

        buttonEquipment.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.scale)
            buttonEquipment.startAnimation(animation)
            textViewEquipment.startAnimation(animation)
            imageViewEquipment.startAnimation(animation)
            val intent = Intent(this, EquipmentListActivity::class.java)
            startActivity(intent)
        }

        val buttonWeapon = findViewById<Button>(R.id.buttonWeapon)
        val textViewWeapon = findViewById<TextView>(R.id.textViewWeapon)
        val imageViewWeapon = findViewById<ImageView>(R.id.imageViewWeapon)

        buttonWeapon.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.scale)
            buttonWeapon.startAnimation(animation)
            textViewWeapon.startAnimation(animation)
            imageViewWeapon.startAnimation(animation)
            val intent = Intent(this, WeaponListActivity::class.java)
            startActivity(intent)
        }

        val buttonTransport = findViewById<Button>(R.id.buttonTransport)
        val textViewTransport = findViewById<TextView>(R.id.textViewTransport)
        val imageViewTransport = findViewById<ImageView>(R.id.imageViewTransport)

        buttonTransport.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.scale)
            buttonTransport.startAnimation(animation)
            textViewTransport.startAnimation(animation)
            imageViewTransport.startAnimation(animation)
            val intent = Intent(this, TransportListActivity::class.java)
            startActivity(intent)
        }

        val buttonSurvival = findViewById<Button>(R.id.buttonSurvival)
        val textViewSurvival = findViewById<TextView>(R.id.textViewSurvival)
        val imageViewSurvival = findViewById<ImageView>(R.id.imageViewSurvival)

        buttonSurvival.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.scale)
            buttonSurvival.startAnimation(animation)
            textViewSurvival.startAnimation(animation)
            imageViewSurvival.startAnimation(animation)
            val intent = Intent(this, SurvivalListActivity::class.java)
            startActivity(intent)
        }

        val buttonSettings = findViewById<Button>(R.id.buttonSettings)
        val textViewSettings = findViewById<TextView>(R.id.textViewSettings)
        val imageViewSettings = findViewById<ImageView>(R.id.imageViewSettings)

        buttonSettings.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.scale)
            buttonSettings.startAnimation(animation)
            textViewSettings.startAnimation(animation)
            imageViewSettings.startAnimation(animation)
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }


    }

}




