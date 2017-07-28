package com.test.kotlintutorial

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.text.Html
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log
import android.view.Gravity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbarMain)

        val txtAppIntro: TextView = findViewById(R.id.txtAppIntro);
        txtAppIntro.text = Html.fromHtml(getString(R.string.contentAppIntroduction))

        val btnInKotlinIntro: Button = findViewById(R.id.btnInKotlinIntro)
        btnInKotlinIntro.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, IntroductionActivity::class.java)
            this.startActivity(intent)
        })

        val btnJavaCodeVsKotlinCode: Button = findViewById(R.id.btnJavaCodeVsKotlinCode)
        btnJavaCodeVsKotlinCode.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, JavaCodeVsKotlinCodeActivity::class.java)
            this.startActivity(intent)
        })

        val btnBasics: Button = findViewById(R.id.btnBasics)
        btnBasics.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, BasicsActivity::class.java)
            this.startActivity(intent)
        })

        val btnClassandObject: Button = findViewById(R.id.btnClassandObject)
        btnClassandObject.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ClassesandObjectsActivity::class.java)
            this.startActivity(intent)
        })

        val btnFunandLambdas: Button = findViewById(R.id.btnFunandLambdas)
        btnFunandLambdas.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, FunctionsandLambdasActivity::class.java)
            this.startActivity(intent)
        })


        val btnCollInKotlin: Button = findViewById(R.id.btnCollInKotlin)
        btnCollInKotlin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, CollectionsActivity::class.java)
            this.startActivity(intent)
        })

        val btnCallAServlet: Button = findViewById(R.id.btnCallAServlet)
        btnCallAServlet.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.call_a_servlet_topic_content);
            intent.putExtra("toolbar_title", R.string.labelCallServlet);
            this.startActivity(intent)
        })

        val btnCallASpring: Button = findViewById(R.id.btnCallASpring)
        btnCallASpring.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.call_a_spring_topic_content);
            intent.putExtra("toolbar_title", R.string.labelCallSpring);
            this.startActivity(intent)
        })

        val btnCallARESTService: Button = findViewById(R.id.btnCallARESTService)
        btnCallARESTService.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.call_a_REST_service_topic_content);
            intent.putExtra("toolbar_title", R.string.labelCallRESTService);
            this.startActivity(intent)
        })

        val btnPostandPersistAForm: Button = findViewById(R.id.btnPostandPersistAForm)
        btnPostandPersistAForm.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.post_persist_form_topic_content);
            intent.putExtra("toolbar_title", R.string.labelPOSTPERSISTAForm);
            this.startActivity(intent)
        })

        val btnStudyMaterialAndRef: Button = findViewById(R.id.btnStudyMaterialAndRef)
        btnStudyMaterialAndRef.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.contentStudyMaterialandReference);
            intent.putExtra("toolbar_title", R.string.labelStudyMaterialandReference);
            this.startActivity(intent)
        })

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

    override fun onResume() {
        // TODO Auto-generated method stub
        if (MyConstant.isApplicationTerminated) {
            finish()
        }
        super.onResume()
    }
}