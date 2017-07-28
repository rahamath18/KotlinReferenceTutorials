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

import kotlinx.android.synthetic.main.activity_classesand_objects.*

class ClassesandObjectsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classesand_objects)
        setSupportActionBar(toolbarClassesandObjects)

        val txtTopicClassesandObjects: TextView = findViewById(R.id.txtTopicClassesandObjects);
        txtTopicClassesandObjects.text = Html.fromHtml(getString(R.string.topicClassesandObject))

        val btnClassesandInheritance: Button = findViewById(R.id.btnClassesandInheritance)
        btnClassesandInheritance.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.topicContentClassesandInheritance);
            intent.putExtra("toolbar_title", R.string.labelClassesandInheritance);
            this.startActivity(intent)
        })

        val btnPropertiesandFields: Button = findViewById(R.id.btnPropertiesandFields)
        btnPropertiesandFields.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.topicContentPropertiesandFields);
            intent.putExtra("toolbar_title", R.string.labelPropertiesandFields);
            this.startActivity(intent)
        })

        val btnInterfaces: Button = findViewById(R.id.btnInterfaces)
        btnInterfaces.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.topicContentInterfaces);
            intent.putExtra("toolbar_title", R.string.labelInterfaces);
            this.startActivity(intent)
        })

        val btnVisibilityModifiers: Button = findViewById(R.id.btnVisibilityModifiers)
        btnVisibilityModifiers.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.topicContentVisibilityModifiers);
            intent.putExtra("toolbar_title", R.string.labelVisibilityModifiers);
            this.startActivity(intent)
        })

        val btnExtensions: Button = findViewById(R.id.btnExtensions)
        btnExtensions.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.topicContentExtensions);
            intent.putExtra("toolbar_title", R.string.labelExtensions);
            this.startActivity(intent)
        })

        val btnDataClasses: Button = findViewById(R.id.btnDataClasses)
        btnDataClasses.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.topicContentDataClasses);
            intent.putExtra("toolbar_title", R.string.labelDataClasses);
            this.startActivity(intent)
        })

        val btnSealedClasses: Button = findViewById(R.id.btnSealedClasses)
        btnSealedClasses.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.topicContentSealedClasses);
            intent.putExtra("toolbar_title", R.string.labelSealedClasses);
            this.startActivity(intent)
        })

        val btnGenerics: Button = findViewById(R.id.btnGenerics)
        btnGenerics.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.topicContentGenerics);
            intent.putExtra("toolbar_title", R.string.labelGenerics);
            this.startActivity(intent)
        })

        val btnNestedClasses: Button = findViewById(R.id.btnNestedClasses)
        btnNestedClasses.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.topicContentNestedClasses);
            intent.putExtra("toolbar_title", R.string.labelNestedClasses);
            this.startActivity(intent)
        })

        val btnEnumClasses: Button = findViewById(R.id.btnEnumClasses)
        btnEnumClasses.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.topicContentEnumClasses);
            intent.putExtra("toolbar_title", R.string.labelEnumClasses);
            this.startActivity(intent)
        })

        val btnObjects: Button = findViewById(R.id.btnObjects)
        btnObjects.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.topicContentObjects);
            intent.putExtra("toolbar_title", R.string.labelObjects);
            this.startActivity(intent)
        })

        val btnDelegation: Button = findViewById(R.id.btnDelegation)
        btnDelegation.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.topicContentDelegation);
            intent.putExtra("toolbar_title", R.string.labelDelegation);
            this.startActivity(intent)
        })

        val btnDelegatedProperties: Button = findViewById(R.id.btnDelegatedProperties)
        btnDelegatedProperties.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.topicContentDelegatedProperties);
            intent.putExtra("toolbar_title", R.string.labelDelegatedProperties);
            this.startActivity(intent)
        })

        val mToolbar: Toolbar = findViewById(R.id.toolbarClassesandObjects)
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
