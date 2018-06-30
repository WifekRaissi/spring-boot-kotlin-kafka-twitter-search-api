package com.twitterkafka.api.services

import org.springframework.stereotype.Service
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.twitterkafka.api.entities.Tweet
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired

import org.springframework.cloud.stream.messaging.Source
import org.springframework.messaging.MessageHeaders
import org.springframework.messaging.support.MessageBuilder.createMessage
import khttp.get
import khttp.post


@Service

open class TwitterSearchServiceImpl:TwitterSearchService {
    val JSON = jacksonObjectMapper()
    private val logger = LoggerFactory.getLogger(TwitterSearchService::class.java)

    @Autowired
    lateinit var output: Source
/*
        val params = mapOf("grant_type" to "client_credentials")
        val headers = mapOf("Authorization" to
        "Basic b3J5c3FvNDRlNnNKZUlBZWlDME5NR0dRSDpzSGZENVlVUHBPS2NsZ0dBbnFPT0lHV0pYWVhDWnc1R3BZM09VVThwYng5WEE4OWNKeA==")
        val auth = post("https://api.twitter.com/oauth2/token", headers = headers, params = params)

         print(auth.jsonObject)
    //   printt(){(auth.jsonObject)}  //Ca te donne un access_token, qu'on va utiliser après



*/

override fun searchTweet(term:String){


    val token = mapOf("Authorization" to "Bearer  ")
    val queryParams = mapOf("q" to term, "count" to "100")
    val response = get("https://api.twitter.com/1.1/search/tweets.json", params = queryParams, headers = token)


    val map = hashMapOf(org.springframework.messaging.MessageHeaders.CONTENT_TYPE to "application/octet-stream") as Map< String, Any>

    val datatByte=JSON.writeValueAsBytes(response.text)

    val msg = createMessage(datatByte, MessageHeaders(map))

    output.output().send(msg)

    logger.info("Tweet written in kafka: " +  msg)




}

}