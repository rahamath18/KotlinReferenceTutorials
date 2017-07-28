package com.test.kotlintutorial

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.text.Html
import android.util.Log
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_basics.*
import kotlinx.android.synthetic.main.activity_java_code_vs_kotlin_code.*

class BasicsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basics)
        setSupportActionBar(toolbarBasics)

        val txtTopicBasics: TextView = findViewById(R.id.txtTopicBasics);
        txtTopicBasics.text = Html.fromHtml(getString(R.string.topicBasics))

        val btnBasicTypes: Button = findViewById(R.id.btnBasicTypes)
        btnBasicTypes.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            //intent.putExtra("pre_topic_name", R.string.ID_1);
            //intent.putExtra("pre_toolbar_title", R.string.ID_2);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentBasicTypes);
            intent.putExtra("toolbar_title", R.string.labelBasicTypes);

            // next chapter
            intent.putExtra("next_topic_name", R.string.topicContentPackages);
            intent.putExtra("next_toolbar_title", R.string.labelPackages);

            this.startActivity(intent)
        })

        val btnPackages: Button = findViewById(R.id.btnPackages)
        btnPackages.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            intent.putExtra("pre_topic_name", R.string.topicContentBasicTypes);
            intent.putExtra("pre_toolbar_title", R.string.labelBasicTypes);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentPackages);
            intent.putExtra("toolbar_title", R.string.labelPackages);

            // next chapter
            intent.putExtra("next_topic_name", R.string.topicContentControlFlow);
            intent.putExtra("next_toolbar_title", R.string.labelControlFlow);

            this.startActivity(intent)
        })

        val btnControlFlow: Button = findViewById(R.id.btnControlFlow)
        btnControlFlow.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            intent.putExtra("pre_topic_name", R.string.topicContentPackages);
            intent.putExtra("pre_toolbar_title", R.string.labelPackages);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentControlFlow);
            intent.putExtra("toolbar_title", R.string.labelControlFlow);

            // next chapter
            intent.putExtra("next_topic_name", R.string.topicContentReturnsandJumps);
            intent.putExtra("next_toolbar_title", R.string.labelReturnsandJumps);

            this.startActivity(intent)
        })

        val btnReturnsandJumps: Button = findViewById(R.id.btnReturnsandJumps)
        btnReturnsandJumps.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            intent.putExtra("pre_topic_name", R.string.topicContentControlFlow);
            intent.putExtra("pre_toolbar_title", R.string.labelControlFlow);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentReturnsandJumps);
            intent.putExtra("toolbar_title", R.string.labelReturnsandJumps);

            // next chapter
            //intent.putExtra("next_topic_name", R.string.ID_3);
            //intent.putExtra("next_toolbar_title", R.string.ID_4);

            this.startActivity(intent)
        })

        val mToolbar: Toolbar = findViewById(R.id.toolbarBasics)
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