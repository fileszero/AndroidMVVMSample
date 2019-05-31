package com.example.mvvmsample.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mvvmsample.databinding.FragmentBindingBasicBinding
import com.example.mvvmsample.models.User

class BindingBasicFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding= FragmentBindingBasicBinding.inflate(inflater,container,false)
        binding.user= User("Test","User")
        return binding.root
    }
}