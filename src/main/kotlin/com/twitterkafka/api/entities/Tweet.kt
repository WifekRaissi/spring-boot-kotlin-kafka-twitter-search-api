package com.twitterkafka.api.entities
import java.util.*


data class Tweet (

        val term:String?,
        val statuses: ArrayList<Statuses>,
        val search_metadata:Search_metadata

)