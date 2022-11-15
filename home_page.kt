package com.outriders.groupapp

import android.content.Intent
import android.os.Bundle
import android.net.Uri
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class home_page: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)

        ///Navigation Icons
        var videosSection = findViewById<ImageView>(R.id.VideosSection)
        var HomeSection = findViewById<ImageView>(R.id.HomeSection)
        var ContactSection = findViewById<ImageView>(R.id.ContactSection)
        var UserSection = findViewById<ImageView>(R.id.UserSection)
        var StoreSection = findViewById<ImageView>(R.id.StoreSection)
        var searchSection = findViewById<ImageView>(R.id.searchbutton)
        //////

        ///////Contributers
        var GhostyIcon = findViewById<ImageView>(R.id.GhostyIcon)
        var Shaquille = findViewById<ImageView>(R.id.Shaquille)
        var Kiyashan = findViewById<ImageView>(R.id.Kiyashan)
        var Yashni = findViewById<ImageView>(R.id.Yashni)
        ///////


        StoreSection.setOnClickListener {
            Toast.makeText(this@home_page, "StorePage", Toast.LENGTH_SHORT).show()
            val StorePageIntent = Intent(this, MainActivity::class.java)
            startActivity(StorePageIntent)
        }
        UserSection.setOnClickListener {
            Toast.makeText(this@home_page, "login_page", Toast.LENGTH_SHORT).show()
            val login_pageIntent = Intent(this, login_page::class.java)
            startActivity(login_pageIntent)
        }
        ContactSection.setOnClickListener {
            Toast.makeText(this@home_page, "contact", Toast.LENGTH_SHORT).show()
            val contantIntent = Intent(this, contact::class.java)
            startActivity(contantIntent)
        }
        videosSection.setOnClickListener {
            Toast.makeText(this@home_page, "video_page", Toast.LENGTH_SHORT).show()
            val videosSectionIntent = Intent(this, video_page::class.java)
            startActivity(videosSectionIntent)
        }
        HomeSection.setOnClickListener {
            Toast.makeText(this@home_page, "home_page", Toast.LENGTH_SHORT).show()
            val home_pageIntent = Intent(this, home_page::class.java)
            startActivity(home_pageIntent)
        }

        searchSection.setOnClickListener {
            Toast.makeText(this@home_page, "searchpage", Toast.LENGTH_SHORT).show()
            val searchpageIntent = Intent(this, searchpage::class.java)
            startActivity(searchpageIntent)
        }

        ///////Contributers
        GhostyIcon.setOnClickListener {
            val KuriUrl = "https://twitter.com/Kurokeida"
            val K1 = Intent(Intent.ACTION_VIEW)
            K1.data = Uri.parse(KuriUrl)
            startActivity(K1)
        }
        Shaquille.setOnClickListener {
            val ShaqUrl = "https://www.instagram.com/shaquille_thangavay/?igshid=YmMyMTA2M2Y%3D"
            val S1 = Intent(Intent.ACTION_VIEW)
            S1.data = Uri.parse(ShaqUrl)
            startActivity(S1)
        }
        Kiyashan.setOnClickListener {
            val KiyUrl = "https://www.instagram.com/ktnadasen/"
            val K2 = Intent(Intent.ACTION_VIEW)
            K2.data = Uri.parse(KiyUrl)
            startActivity(K2)
        }
        Yashni.setOnClickListener {
            val YasUrl = "https://www.instagram.com/yashni.g/"
            val Y1 = Intent(Intent.ACTION_VIEW)
            Y1.data = Uri.parse(YasUrl)
            startActivity(Y1)
        }

    }
}