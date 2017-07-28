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
import kotlinx.android.synthetic.main.activity_introduction.*

import kotlinx.android.synthetic.main.activity_java_code_vs_kotlin_code.*

class JavaCodeVsKotlinCodeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java_code_vs_kotlin_code)
        setSupportActionBar(toolbarJavaCodeVsKotlinCode)

        val txtTopicJavaCodeVsKotlinCode: TextView = findViewById(R.id.txtTopicJavaCodeVsKotlinCode);
        txtTopicJavaCodeVsKotlinCode.text = Html.fromHtml(getString(R.string.topicJavaCodeVsKotlinCode))

        val btnDatatypesJavavsKotlin: Button = findViewById(R.id.btnDatatypesJavavsKotlin)
        btnDatatypesJavavsKotlin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            //intent.putExtra("pre_topic_name", R.string.ID_1);
            //intent.putExtra("pre_toolbar_title", R.string.ID_2);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentDatatypesJavavsKotlin);
            intent.putExtra("toolbar_title", R.string.labelDatatypesJavavsKotlin);

            // next chapter
            intent.putExtra("next_topic_name", R.string.topicContentmainmethodJavavsKotlin);
            intent.putExtra("next_toolbar_title", R.string.labelmainmethodJavavsKotlin);

            this.startActivity(intent)
        })

        val btnmainmethodJavavsKotlin: Button = findViewById(R.id.btnmainmethodJavavsKotlin)
        btnmainmethodJavavsKotlin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            intent.putExtra("pre_topic_name", R.string.topicContentDatatypesJavavsKotlin);
            intent.putExtra("pre_toolbar_title", R.string.labelDatatypesJavavsKotlin);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentmainmethodJavavsKotlin);
            intent.putExtra("toolbar_title", R.string.labelmainmethodJavavsKotlin);

            // next chapter
            intent.putExtra("next_topic_name", R.string.topicContentmethodwithreturntypeJavavsKotlin);
            intent.putExtra("next_toolbar_title", R.string.labelmethodwithreturntypeJavavsKotlin);

            this.startActivity(intent)
        })

        val btnmethodwithreturntypeJavavsKotlin: Button = findViewById(R.id.btnmethodwithreturntypeJavavsKotlin)
        btnmethodwithreturntypeJavavsKotlin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            intent.putExtra("pre_topic_name", R.string.topicContentmainmethodJavavsKotlin);
            intent.putExtra("pre_toolbar_title", R.string.labelmainmethodJavavsKotlin);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentmethodwithreturntypeJavavsKotlin);
            intent.putExtra("toolbar_title", R.string.labelmethodwithreturntypeJavavsKotlin);

            // next chapter
            intent.putExtra("next_topic_name", R.string.topicContentPOJOJavavsKotlin);
            intent.putExtra("next_toolbar_title", R.string.labelPOJOJavavsKotlin);

            this.startActivity(intent)
        })

        val btnPOJOJavavsKotlin: Button = findViewById(R.id.btnPOJOJavavsKotlin)
        btnPOJOJavavsKotlin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            intent.putExtra("pre_topic_name", R.string.topicContentmethodwithreturntypeJavavsKotlin);
            intent.putExtra("pre_toolbar_title", R.string.labelmethodwithreturntypeJavavsKotlin);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentPOJOJavavsKotlin);
            intent.putExtra("toolbar_title", R.string.labelPOJOJavavsKotlin);

            // next chapter
            intent.putExtra("next_topic_name", R.string.topicContentSingletonJavavsKotlin);
            intent.putExtra("next_toolbar_title", R.string.labelSingletonJavavsKotlin);

            this.startActivity(intent)
        })

        val btnSingletonJavavsKotlin: Button = findViewById(R.id.btnSingletonJavavsKotlin)
        btnSingletonJavavsKotlin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            intent.putExtra("pre_topic_name", R.string.topicContentPOJOJavavsKotlin);
            intent.putExtra("pre_toolbar_title", R.string.labelPOJOJavavsKotlin);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentSingletonJavavsKotlin);
            intent.putExtra("toolbar_title", R.string.labelSingletonJavavsKotlin);

            // next chapter
            intent.putExtra("next_topic_name", R.string.topicContentInterfaceJavavsKotlin);
            intent.putExtra("next_toolbar_title", R.string.labelInterfaceJavavsKotlin);

            this.startActivity(intent)
        })

        val btnInterfaceJavavsKotlin: Button = findViewById(R.id.btnInterfaceJavavsKotlin)
        btnInterfaceJavavsKotlin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            intent.putExtra("pre_topic_name", R.string.topicContentSingletonJavavsKotlin);
            intent.putExtra("pre_toolbar_title", R.string.labelSingletonJavavsKotlin);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentInterfaceJavavsKotlin);
            intent.putExtra("toolbar_title", R.string.labelInterfaceJavavsKotlin);

            // next chapter
            intent.putExtra("next_topic_name", R.string.topicContentAbstractJavavsKotlin);
            intent.putExtra("next_toolbar_title", R.string.labelAbstractJavavsKotlin);

            this.startActivity(intent)
        })

        val btnAbstractJavavsKotlin: Button = findViewById(R.id.btnAbstractJavavsKotlin)
        btnAbstractJavavsKotlin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            intent.putExtra("pre_topic_name", R.string.topicContentInterfaceJavavsKotlin);
            intent.putExtra("pre_toolbar_title", R.string.labelInterfaceJavavsKotlin);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentAbstractJavavsKotlin);
            intent.putExtra("toolbar_title", R.string.labelAbstractJavavsKotlin);

            // next chapter
            intent.putExtra("next_topic_name", R.string.topicContentInnerClassJavavsKotlin);
            intent.putExtra("next_toolbar_title", R.string.labelInnerClassJavavsKotlin);

            this.startActivity(intent)
        })

        val btnInnerClassJavavsKotlin: Button = findViewById(R.id.btnInnerClassJavavsKotlin)
        btnInnerClassJavavsKotlin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)

            //previous chapter
            intent.putExtra("pre_topic_name", R.string.topicContentAbstractJavavsKotlin);
            intent.putExtra("pre_toolbar_title", R.string.labelAbstractJavavsKotlin);

            // current chapter
            intent.putExtra("topic_name", R.string.topicContentInnerClassJavavsKotlin);
            intent.putExtra("toolbar_title", R.string.labelInnerClassJavavsKotlin);

            // next chapter
            //intent.putExtra("next_topic_name", R.string.ID_3);
            //intent.putExtra("next_toolbar_title", R.string.ID_4);

            this.startActivity(intent)
        })

        val mToolbar: Toolbar = findViewById(R.id.toolbarJavaCodeVsKotlinCode)
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
