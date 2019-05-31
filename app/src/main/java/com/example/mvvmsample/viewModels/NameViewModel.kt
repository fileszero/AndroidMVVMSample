package com.example.mvvmsample.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel

// https://developer.android.com/topic/libraries/architecture/livedata?hl=ja#create_livedata_objects
class NameViewModel : ViewModel() {
    val currentName: MutableLiveData<String> by lazy {
        MutableLiveData<String>().apply { this.value = "!!test NameViewModel!!" }
    }

    val length: MutableLiveData<Int> = MutableLiveData()

    init {
        length.postValue(123)
        currentName.observeForever(Observer {
            length.postValue(it.length)
        })
    }

    fun toUpper() {
        currentName.postValue(currentName.value?.toUpperCase())
    }

    fun toLower() {
        currentName.postValue(currentName.value?.toLowerCase())
    }


}