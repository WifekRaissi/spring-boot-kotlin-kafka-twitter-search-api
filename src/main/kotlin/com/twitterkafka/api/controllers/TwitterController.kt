package com.twitterkafka.api.controllers

import com.twitterkafka.api.services.TwitterSearchService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RequestMapping



@RestController
@RequestMapping
open class TwitterController {



    @Autowired
    lateinit var twitterSearchService: TwitterSearchService


    @RequestMapping("/api/hello")
    fun greet(): String=
         "Hello from the other side!!!"




    @PostMapping("/tweets")
    fun greeting(@RequestParam(value = "term") term: String)=

        twitterSearchService.searchTweet(term)

   }



