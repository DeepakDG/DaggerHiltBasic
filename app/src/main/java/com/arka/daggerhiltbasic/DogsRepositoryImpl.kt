package com.arka.daggerhiltbasic

class DogsRepositoryImpl : DogsRepository {
    override fun getBreeds() = listOf(Dog("https://bit.ly/3le3v5K", "German Shepherd"),
        Dog("https://bit.ly/3nmHmVv", "Labrador Retriever"),
        Dog("https://bit.ly/2X7o9vQ", "Pomeranian"),
        Dog("https://bit.ly/3k4h9Zz", "Siberian Husky"),
        Dog("https://bit.ly/392MUfw", "Shiba Inu"),
        Dog("https://bit.ly/3num6Nt", "Golden Retriever"),
        Dog("https://puri.na/3leLofL", "Bulldog"),
        Dog("https://bit.ly/3k50Trn", "Poodle"),
        Dog("https://bit.ly/3hmHgcI", "American Pit Bull Terrier"),
        Dog("https://bit.ly/3C1dGkI", "Chihuahua"),
        Dog("https://bit.ly/2X9LX2J", "Dobermann"),
    )
}