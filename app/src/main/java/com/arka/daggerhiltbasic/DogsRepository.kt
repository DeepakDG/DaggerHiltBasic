package com.arka.daggerhiltbasic

interface DogsRepository {
    fun getBreeds(): List<Dog>
}