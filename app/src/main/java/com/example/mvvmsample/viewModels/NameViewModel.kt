package com.example.mvvmsample.viewModels

import android.util.Log
import androidx.lifecycle.*

// https://developer.android.com/topic/libraries/architecture/livedata?hl=ja#create_livedata_objects
class NameViewModel : ViewModel() {
    val currentName: MutableLiveData<String> by lazy {
        MutableLiveData<String>().apply { this.value = "Test String" }
    }

    val length = Transformations.switchMap( currentName){
        Log.i("NameViewModel","Transformations.switchMap( currentName )" )
        MutableLiveData<Int>().apply {
            this.value=it.length
        }
    }

    init {
    }

    fun toUpper() {
        currentName.postValue(currentName.value?.toUpperCase())
    }

    fun toLower() {
        currentName.postValue(currentName.value?.toLowerCase())
    }

    override fun onCleared() {
        super.onCleared()
    }


}