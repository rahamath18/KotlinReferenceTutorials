package com.test.kotlintutorial

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.text.Html
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_introduction.*

class IntroductionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduction)
        setSupportActionBar(toolbarIntroduction)

        val txtTopicIntro: TextView = findViewById(R.id.txtTopicIntro);
        txtTopicIntro.text = Html.fromHtml(getString(R.string.topicIntro))

        val btnKotlinprogramminglanguage: Button = findViewById(R.id.btnKotlinprogramminglanguage)
        btnKotlinprogramminglanguage.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            //intent.putExtra("pre_topic_name", R.string.ID_1);
            //intent.putExtra("pre_toolbar_title", R.string.ID_2);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentKotlinprogramminglanguage);
            intent.putExtra("toolbar_title", R.string.labelKotlinprogramminglanguage);

            // next chapter
            intent.putExtra("next_topic_name", R.string.topicContentKotlinforServerSide);
            intent.putExtra("next_toolbar_title", R.string.labelKotlinforServerSide);

            this.startActivity(intent)
        })

        val btnKotlinforServerSide: Button = findViewById(R.id.btnKotlinforServerSide)
        btnKotlinforServerSide.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            intent.putExtra("pre_topic_name", R.string.topicContentKotlinprogramminglanguage);
            intent.putExtra("pre_toolbar_title", R.string.labelKotlinprogramminglanguage);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentKotlinforServerSide);
            intent.putExtra("toolbar_title", R.string.labelKotlinforServerSide);

            // next chapter
            intent.putExtra("next_topic_name", R.string.topicContentKotlinforAndroid);
            intent.putExtra("next_toolbar_title", R.string.labelKotlinforAndroid);

            this.startActivity(intent)
        })

        val btnKotlinforAndroid: Button = findViewById(R.id.btnKotlinforAndroid)
        btnKotlinforAndroid.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            intent.putExtra("pre_topic_name", R.string.topicContentKotlinforServerSide);
            intent.putExtra("pre_toolbar_title", R.string.labelKotlinforServerSide);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentKotlinforAndroid);
            intent.putExtra("toolbar_title", R.string.labelKotlinforAndroid);

            // next chapter
            intent.putExtra("next_topic_name", R.string.topicContentKotlinforJavaScript);
            intent.putExtra("next_toolbar_title", R.string.labelKotlinforJavaScript);

            this.startActivity(intent)
        })

        val btnKotlinforJavaScript: Button = findViewById(R.id.btnKotlinforJavaScript)
        btnKotlinforJavaScript.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            intent.putExtra("pre_topic_name", R.string.topicContentKotlinforAndroid);
            intent.putExtra("pre_toolbar_title", R.string.labelKotlinforAndroid);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentKotlinforJavaScript);
            intent.putExtra("toolbar_title", R.string.labelKotlinforJavaScript);

            // next chapter
            intent.putExtra("next_topic_name", R.string.topicContentWhatsNewin11);
            intent.putExtra("next_toolbar_title", R.string.labelWhatsNewin11);

            this.startActivity(intent)
        })

        val btnWhatsNewin11: Button = findViewById(R.id.btnWhatsNewin11)
        btnWhatsNewin11.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            intent.putExtra("pre_topic_name", R.string.topicContentKotlinforJavaScript);
            intent.putExtra("pre_toolbar_title", R.string.labelKotlinforJavaScript);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentWhatsNewin11);
            intent.putExtra("toolbar_title", R.string.labelWhatsNewin11);

            // next chapter
            intent.putExtra("next_topic_name", R.string.topicContentBasicSyntax);
            intent.putExtra("next_toolbar_title", R.string.labelBasicSyntax);

            this.startActivity(intent)
        })

        val btnBasicSyntax: Button = findViewById(R.id.btnBasicSyntax)
        btnBasicSyntax.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            intent.putExtra("pre_topic_name", R.string.topicContentWhatsNewin11);
            intent.putExtra("pre_toolbar_title", R.string.labelWhatsNewin11);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentBasicSyntax);
            intent.putExtra("toolbar_title", R.string.labelBasicSyntax);

            // next chapter
            intent.putExtra("next_topic_name", R.string.topicContentIdioms);
            intent.putExtra("next_toolbar_title", R.string.labelIdioms);

            this.startActivity(intent)
        })

        val btnIdioms: Button = findViewById(R.id.btnIdioms)
        btnIdioms.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            intent.putExtra("pre_topic_name", R.string.topicContentBasicSyntax);
            intent.putExtra("pre_toolbar_title", R.string.labelBasicSyntax);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentIdioms);
            intent.putExtra("toolbar_title", R.string.labelIdioms);

            // next chapter
            intent.putExtra("next_topic_name", R.string.topicContentCodingConventions);
            intent.putExtra("next_toolbar_title", R.string.labelCodingConventions);

            this.startActivity(intent)
        })

        val btnCodingConventions: Button = findViewById(R.id.btnCodingConventions)
        btnCodingConventions.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            intent.putExtra("pre_topic_name", R.string.topicContentIdioms);
            intent.putExtra("pre_toolbar_title", R.string.labelIdioms);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentCodingConventions);
            intent.putExtra("toolbar_title", R.string.labelCodingConventions);

            // next chapter
            //intent.putExtra("next_topic_name", R.string.ID_3);
            //intent.putExtra("next_toolbar_title", R.string.ID_4);

            this.startActivity(intent)
        })

        val mToolbar: Toolbar = findViewById(R.id.toolbarIntroduction)
        setSupportActionBar(mToolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        val id = item.itemId

        if (id == R.id.action_settings) {
            showToastValidationMsg("No Setting Available!")
            return true
        }

        if (id == R.id.action_about_us) {
            // Start AboutUs activity here
            //setContentView(R.layout.aboutus);
            Log.d("About App", "Button clicked!")
            val intent = Intent(this, AboutAppActivity::class.java)
            this.startActivity(intent)
            return true
        }
        return super.onOptionsItemSelected(item)

        /*
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }*/
    }

    private fun showToastValidationMsg(s: String) {
        val toast = Toast.makeText(applicationContext, Html.fromHtml("<font color='green' ><b>"
                + s + "</b></font>"), Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }

}
