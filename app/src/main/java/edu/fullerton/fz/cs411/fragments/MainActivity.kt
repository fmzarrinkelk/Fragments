package edu.fullerton.fz.cs411.fragments

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frame1 = supportFragmentManager.findFragmentById(R.id.primary_frame)

        if (frame1 == null) {
            val fragment1 = PrimaryFragment()
            this.supportFragmentManager
                .beginTransaction()
                .add(R.id.primary_frame, fragment1)
                .commit()
        }

        if (this.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            val frame2 = supportFragmentManager.findFragmentById(R.id.secondary_frame)

            if (frame2 == null) {
                val fragment2 = SecondaryFragment()
                this.supportFragmentManager
                    .beginTransaction()
                    .add(R.id.secondary_frame, fragment2)
                    .commit()
            }
        }

    }
}