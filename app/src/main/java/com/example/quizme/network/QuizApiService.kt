package com.example.quizme.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create
import retrofit2.http.GET

private const val BASE_URL = "https://opentdb.com/api.php?amount=10"
private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

/**
 * Interface that describes how retrofit fit talks to the web service
 */
interface QuizApiService{
    @GET("questions")
    fun getQuestions(): String
}

object QuizApi{
    val retrofitService: QuizApiService by lazy {
        retrofit.create(QuizApiService::class.java)
    }
}
