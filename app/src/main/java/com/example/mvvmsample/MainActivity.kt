package com.example.mvvmsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvmsample.fragments.BindingBasicFragment
import com.example.mvvmsample.fragments.NameFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState==null){
            //val fragment=BindingBasicFragment()
            val fragment=NameFragment()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container,fragment,fragment::class.java.simpleName)
                .commit()
        }
    }
}
