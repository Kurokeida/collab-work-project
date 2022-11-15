package com.outriders.groupapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.ButtonBarLayout

class contact: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.contact)

        ///Navigation Icons
        var videosSection = findViewById<ImageView>(R.id.VideosSection)
        var HomeSection = findViewById<ImageView>(R.id.HomeSection)
        var ContactSection = findViewById<ImageView>(R.id.ContactSection)
        var UserSection = findViewById<ImageView>(R.id.UserSection)
        var StoreSection = findViewById<ImageView>(R.id.StoreSection)
        var searchSection = findViewById<ImageView>(R.id.searchbutton)
        //////

        var WaterfallButton = findViewById<Button>(R.id.WaterfallButton)
        var sandtonButton = findViewById<Button>(R.id.sandtonButton)
        var braamfonteinButton = findViewById<Button>(R.id.braamfonteinButton)


        WaterfallButton.setOnClickListener {
            val WaterfallUrl = "https://www.varsitycollege.co.za/waterfall"
            val W1 = Intent(Intent.ACTION_VIEW)
            W1.data = Uri.parse(WaterfallUrl)
            startActivity(W1)
        }
        sandtonButton.setOnClickListener {
            val sandtonUrl = "https://www.varsitycollege.co.za/sandton"
            val S1 = Intent(Intent.ACTION_VIEW)
            S1.data = Uri.parse(sandtonUrl)
            startActivity(S1)
        }
        braamfonteinButton.setOnClickListener {
            val braamfonteinUrl = "https://www.varsitycollege.co.za/"
            val B1 = Intent(Intent.ACTION_VIEW)
            B1.data = Uri.parse(braamfonteinUrl)
            startActivity(B1)
        }





        StoreSection.setOnClickListener {
            Toast.makeText(this@contact, "StorePage", Toast.LENGTH_SHORT).show()
            val StorePageIntent = Intent(this, MainActivity::class.java)
            startActivity(StorePageIntent)
        }
        UserSection.setOnClickListener {
            Toast.makeText(this@contact, "login_page", Toast.LENGTH_SHORT).show()
            val login_pageIntent = Intent(this, login_page::class.java)
            startActivity(login_pageIntent)
        }
        ContactSection.setOnClickListener {
            Toast.makeText(this@contact, "contact", Toast.LENGTH_SHORT).show()
            val contantIntent = Intent(this, contact::class.java)
            startActivity(contantIntent)
        }
        videosSection.setOnClickListener {
            Toast.makeText(this@contact, "video_page", Toast.LENGTH_SHORT).show()
            val videosSectionIntent = Intent(this, video_page::class.java)
            startActivity(videosSectionIntent)
        }
        HomeSection.setOnClickListener {
            Toast.makeText(this@contact, "home_page", Toast.LENGTH_SHORT).show()
            val home_pageIntent = Intent(this, home_page::class.java)
            startActivity(home_pageIntent)
        }

        searchSection.setOnClickListener {
            Toast.makeText(this@contact, "searchpage", Toast.LENGTH_SHORT).show()
            val searchpageIntent = Intent(this, searchpage::class.java)
            startActivity(searchpageIntent)
        }

    }
}