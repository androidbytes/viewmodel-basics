package `in`.androidbytes.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val counter = MutableLiveData<Int>()

    init {
        counter.value = 0
    }

    fun getCounter(): LiveData<Int> {
        return counter
    }

    fun onTap() {
        val currentValue = counter.value!!
        counter.value = currentValue + 1
    }
}