package com.outriders.groupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var original_price_txt = findViewById<TextView>(R.id.original_price_txt)
        var finaloutputprice = findViewById<TextView>(R.id.finaloutputprice)

        var tempVal1 = 0.0
        var tempVal2 = 0.0
        var VatValue = 0.15
        var tempVatPriceDifference = 0

        var DifferencePrices: IntArray = intArrayOf()



        ///Checkboxes
        var FirstAid = findViewById<CheckBox>(R.id.FirstAid)
        var Sewing = findViewById<CheckBox>(R.id.Sewing)
        var LandScaping = findViewById<CheckBox>(R.id.LandScaping)
        var lifeSkills = findViewById<CheckBox>(R.id.lifeSkills)
        ////////

        ///Buttons
        var PurchaseButtion = findViewById<Button>(R.id.PurchaseButton)
        ///////

        ///Navigation Icons
        var videosSection = findViewById<ImageView>(R.id.VideosSection)
        var HomeSection = findViewById<ImageView>(R.id.HomeSection)
        var ContactSection = findViewById<ImageView>(R.id.ContactSection)
        var UserSection = findViewById<ImageView>(R.id.UserSection)
        var StoreSection = findViewById<ImageView>(R.id.StoreSection)
        var searchSection = findViewById<ImageView>(R.id.searchbutton)
        //////



            StoreSection.setOnClickListener {
                Toast.makeText(this@MainActivity, "StorePage", Toast.LENGTH_SHORT).show()
                val StorePageIntent = Intent(this, MainActivity::class.java)
                startActivity(StorePageIntent)
            }
            UserSection.setOnClickListener {
                Toast.makeText(this@MainActivity, "login_page", Toast.LENGTH_SHORT).show()
                val login_pageIntent = Intent(this, login_page::class.java)
                startActivity(login_pageIntent)
            }
            ContactSection.setOnClickListener {
                 Toast.makeText(this@MainActivity, "contact", Toast.LENGTH_SHORT).show()
                 val contantIntent = Intent(this, contact::class.java)
                 startActivity(contantIntent)
             }
            videosSection.setOnClickListener {
                Toast.makeText(this@MainActivity, "video_page", Toast.LENGTH_SHORT).show()
                val videosSectionIntent = Intent(this, video_page::class.java)
                startActivity(videosSectionIntent)
            }
            HomeSection.setOnClickListener {
                    Toast.makeText(this@MainActivity, "home_page", Toast.LENGTH_SHORT).show()
                    val home_pageIntent = Intent(this, home_page::class.java)
                    startActivity(home_pageIntent)
                }

            searchSection.setOnClickListener {
                Toast.makeText(this@MainActivity, "searchpage", Toast.LENGTH_SHORT).show()
                val searchpageIntent = Intent(this, searchpage::class.java)
                startActivity(searchpageIntent)
            }




            //////////////////////////////////////////
            FirstAid.setOnClickListener {
                if (FirstAid.isChecked) {
                    DifferencePrices += 1500
                    var tempSum = DifferencePrices.sum()
                    original_price_txt.text = tempSum.toString()

                    var TempVatSum1 = tempSum*VatValue
                    var TempVatSum2 = tempSum+TempVatSum1
                    finaloutputprice.text =TempVatSum2.toString()
                }


            }
            //////////////////////////////////////////

            //////////////////////////////////////////
            Sewing.setOnClickListener {
                if (Sewing.isChecked) {
                    DifferencePrices += 1500
                    var tempSum = DifferencePrices.sum()
                    original_price_txt.text = tempSum.toString()

                    var TempVatSum1 = tempSum*VatValue
                    var TempVatSum2 = tempSum+TempVatSum1
                    finaloutputprice.text =TempVatSum2.toString()
                }


            }
            //////////////////////////////////////////

            //////////////////////////////////////////
            LandScaping.setOnClickListener {
                if (LandScaping.isChecked) {
                    DifferencePrices += 1500
                    var tempSum = DifferencePrices.sum()
                    original_price_txt.text = tempSum.toString()

                    var TempVatSum1 = tempSum*VatValue
                    var TempVatSum2 = tempSum+TempVatSum1
                    finaloutputprice.text =TempVatSum2.toString()
                }


            }
            //////////////////////////////////////////

            //////////////////////////////////////////
            lifeSkills.setOnClickListener {
                if (lifeSkills.isChecked) {
                    DifferencePrices += 1500
                    var tempSum = DifferencePrices.sum()
                    original_price_txt.text = tempSum.toString()

                    var TempVatSum1 = tempSum*VatValue
                    var TempVatSum2 = tempSum+TempVatSum1
                    finaloutputprice.text =TempVatSum2.toString()
                }


            }
            //////////////////////////////////////////





        }


    }
