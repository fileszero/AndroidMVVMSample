package com.example.mvvmsample.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.mvvmsample.R
import com.example.mvvmsample.databinding.FragmentNameBinding
import com.example.mvvmsample.viewModels.NameViewModel

class NameFragment : Fragment() {

    private val viewModel: NameViewModel by lazy{
        ViewModelProviders.of(this).get(NameViewModel::class.java)
    }

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        val binding=FragmentNameBinding.inflate(inflater,container,false)
        binding.viewModel=viewModel
        binding.lifecycleOwner=this
        return binding.root
    }

}
