package com.arka.daggerhiltbasic.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arka.daggerhiltbasic.Dog
import com.arka.daggerhiltbasic.DogsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val dogsRepository: DogsRepository
) : ViewModel() {

    private val dogBreedsEmitter = MutableLiveData<List<Dog>>()
    val dogBreeds: LiveData<List<Dog>> = dogBreedsEmitter

    init {
        loadDogBreeds()
    }

    private fun loadDogBreeds() {
        dogBreedsEmitter.value = dogsRepository.getBreeds()
    }
}
