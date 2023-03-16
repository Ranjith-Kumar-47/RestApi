package com.example.restapi1

import android.content.Context
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GetRepository(val context: Context) {
    lateinit var repository: Repository

    fun getPosts(): Model {
        var model = Model()
        repository = RetrofitInstance.getInstance().create(Repository::class.java)
        repository.getResult().enqueue(object : Callback<Model> {
            override fun onResponse(call: Call<Model>, response: Response<Model>) {
                val body = response.body()
                if (body != null) model = body
            }

            override fun onFailure(call: Call<Model>, t: Throwable) {
                Toast.makeText(context, t.toString(), Toast.LENGTH_SHORT).show()
            }

        })
        Toast.makeText(context, model.toString(), Toast.LENGTH_SHORT).show()

        return model
    }


}