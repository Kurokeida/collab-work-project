package com.outriders.groupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import android.content.Intent


class login_page : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)



        var DifferencePrices = intArrayOf()

        ///Navigation Icons
        var videosSection = findViewById<ImageView>(R.id.VideosSection)
        var HomeSection = findViewById<ImageView>(R.id.HomeSection)
        var ContactSection = findViewById<ImageView>(R.id.ContactSection)
        var UserSection = findViewById<ImageView>(R.id.UserSection)
        var StoreSection = findViewById<ImageView>(R.id.StoreSection)
        var searchSection = findViewById<ImageView>(R.id.searchbutton)
        //////



        StoreSection.setOnClickListener {
            Toast.makeText(this@login_page, "StorePage", Toast.LENGTH_SHORT).show()
            val StorePageIntent = Intent(this, MainActivity::class.java)
            startActivity(StorePageIntent)
        }
        UserSection.setOnClickListener {
            Toast.makeText(this@login_page, "login_page", Toast.LENGTH_SHORT).show()
            val login_pageIntent = Intent(this, login_page::class.java)
            startActivity(login_pageIntent)
        }
        ContactSection.setOnClickListener {
            Toast.makeText(this@login_page, "contact", Toast.LENGTH_SHORT).show()
            val contantIntent = Intent(this, contact::class.java)
            startActivity(contantIntent)
        }
        videosSection.setOnClickListener {
            Toast.makeText(this@login_page, "video_page", Toast.LENGTH_SHORT).show()
            val videosSectionIntent = Intent(this, video_page::class.java)
            startActivity(videosSectionIntent)
        }
        HomeSection.setOnClickListener {
            Toast.makeText(this@login_page, "home_page", Toast.LENGTH_SHORT).show()
            val home_pageIntent = Intent(this, home_page::class.java)
            startActivity(home_pageIntent)
        }

        searchSection.setOnClickListener {
            Toast.makeText(this@login_page, "searchpage", Toast.LENGTH_SHORT).show()
            val searchpageIntent = Intent(this, searchpage::class.java)
            startActivity(searchpageIntent)
        }

    }



}