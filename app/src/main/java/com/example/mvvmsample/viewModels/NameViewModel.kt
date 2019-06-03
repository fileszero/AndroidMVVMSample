package com.example.mvvmsample.viewModels

import androidx.lifecycle.*

// https://developer.android.com/topic/libraries/architecture/livedata?hl=ja#create_livedata_objects
class NameViewModel : ViewModel() {
    val currentName: MutableLiveData<String> by lazy {
        MutableLiveData<String>().apply { this.value = "Test String" }
    }

    val length = MediatorLiveData<Int>()

    init {
        length.addSource(currentName) { name ->
            length.value = name.length
        }
    }

    fun toUpper() {
        currentName.postValue(currentName.value?.toUpperCase())
    }

    fun toLower() {
        currentName.postValue(currentName.value?.toLowerCase())
    }

}