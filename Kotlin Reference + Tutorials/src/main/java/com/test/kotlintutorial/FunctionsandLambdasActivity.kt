package com.test.kotlintutorial

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.text.Html
import android.text.method.LinkMovementMethod
import android.util.Log
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_classesand_objects.*

import kotlinx.android.synthetic.main.activity_functionsand_lambdas.*

class FunctionsandLambdasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_functionsand_lambdas)
        setSupportActionBar(toolbarFunctionsandLambdas)

        val txtTopicFunctionsandLambdas: TextView = findViewById(R.id.txtTopicFunctionsandLambdas);
        txtTopicFunctionsandLambdas.text = Html.fromHtml(getString(R.string.topicFunctionsandLambdas))

        val btnFunctions: Button = findViewById(R.id.btnFunctions)
        btnFunctions.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.topicContentFunctions);
            intent.putExtra("toolbar_title", R.string.labelFunctions);
            this.startActivity(intent)
        })

        val btnLambdas: Button = findViewById(R.id.btnLambdas)
        btnLambdas.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.topicContentLambdas);
            intent.putExtra("toolbar_title", R.string.labelLambdas);
            this.startActivity(intent)
        })

        val btnInlineFunctions: Button = findViewById(R.id.btnInlineFunctions)
        btnInlineFunctions.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.topicContentInlineFunctions);
            intent.putExtra("toolbar_title", R.string.labelInlineFunctions);
            this.startActivity(intent)
        })

        val btnCoroutines: Button = findViewById(R.id.btnCoroutines)
        btnCoroutines.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.topicContentCoroutines);
            intent.putExtra("toolbar_title", R.string.labelCoroutines);
            this.startActivity(intent)
        })

        val mToolbar: Toolbar = findViewById(R.id.toolbarFunctionsandLambdas)
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
