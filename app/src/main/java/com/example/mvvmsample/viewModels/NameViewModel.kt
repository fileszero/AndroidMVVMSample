package com.example.mvvmsample.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel

// https://developer.android.com/topic/libraries/architecture/livedata?hl=ja#create_livedata_objects
class NameViewModel : ViewModel() {
    val currentName: MutableLiveData<String> by lazy {
        MutableLiveData<String>().apply { this.value = "Test String" }
    }

    val length: MutableLiveData<Int> = MutableLiveData()
    private val currentNameObserver = Observer<String> {
        length.postValue(it.length)
    }
    init {
        currentName.observeForever(currentNameObserver)
    }

    fun toUpper() {
        currentName.postValue(currentName.value?.toUpperCase())
    }

    fun toLower() {
        currentName.postValue(currentName.value?.toLowerCase())
    }

    override fun onCleared() {
        super.onCleared()
        currentName.removeObserver(currentNameObserver)
    }


}