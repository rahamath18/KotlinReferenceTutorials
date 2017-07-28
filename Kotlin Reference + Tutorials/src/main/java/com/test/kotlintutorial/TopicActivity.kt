package com.test.kotlintutorial

/**
 * Created by rahamathullahrahamathullah on 7/13/17.
 */


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_about_app.*
import android.text.Html
import android.view.Gravity
import android.view.View
import android.support.v7.widget.Toolbar
import android.text.method.LinkMovementMethod
import com.test.kotlintutorial.R.id.toolbarTopic
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import kotlinx.android.synthetic.main.activity_topic.*
import android.widget.LinearLayout
import android.widget.ScrollView
import android.support.constraint.ConstraintSet
import com.test.kotlintutorial.R.layout.activity_main
import android.R.attr.button
import com.test.kotlintutorial.R.layout.content_main



internal class TopicActivity : AppCompatActivity() {

    private var topicCount = 0;

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topic)
        setSupportActionBar(toolbarTopic)

        val bundle = intent.extras
        val content_id = bundle.getInt("topic_name")


        val txtViewAboutTopic: TextView = findViewById(R.id.txtViewAboutTopic)


        if (Build.VERSION.SDK_INT >= 24) {
            txtViewAboutTopic.text = Html.fromHtml(getString(content_id), 0) // for 24 api and more
        } else {
            txtViewAboutTopic.text = Html.fromHtml(getString(content_id)) // or for older api
        }

        txtViewAboutTopic.setMovementMethod(ScrollingMovementMethod())
        txtViewAboutTopic.setMovementMethod(LinkMovementMethod.getInstance());


        /* val cl: ConstraintLayout = findViewById(R.id.TopicActivityConstraintLayout)
        val set = ConstraintSet()
        set.clone(cl)
        val nextButton = Button(cl.context)
        nextButton.text = "NEXT Chapter....."

        nextButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                showToastValidationMsg("you clicked to go to next topic!")
                val intent = Intent(this@TopicActivity, TopicActivity::class.java)

                val topic_content = bundle.getInt("next_topic_name")
                val topic_label = bundle.getInt("next_toolbar_title")

                intent.putExtra("topic_name", topic_content);
                intent.putExtra("toolbar_title", topic_label);
                startActivity(intent)
            }
        })
        cl.addView(nextButton) */


        val mToolbar: Toolbar = findViewById(R.id.toolbarTopic)
        val toolbar_title = bundle.getInt("toolbar_title")
        mToolbar.setTitle(toolbar_title)
        setSupportActionBar(mToolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        mToolbar.setNavigationOnClickListener { finish() }
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
