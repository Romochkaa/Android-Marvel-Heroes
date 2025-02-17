package com.example.marvelheroesapp

class ApiKeys {
    companion object {
        val PUBLIC_KEY = ApiKey("205eec059fe358a29d0245db7bff0855")
        val PRIVATE_KEY = ApiKey("b8018da274c71cfb3ed51fc11f71d70b74762fe9")
    }

    class ApiKey(val key: String)
}
