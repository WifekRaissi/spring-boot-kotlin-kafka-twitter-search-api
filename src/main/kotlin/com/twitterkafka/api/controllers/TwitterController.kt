package com.twitterkafka.api.controllers

import com.twitterkafka.api.services.TwitterSearchService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping
open class TwitterController {



    @Autowired
    lateinit var twitterSearchService: TwitterSearchService


    @PostMapping("/tweets")
    fun greeting(@RequestParam(value = "term") term: String)=

        twitterSearchService.searchTweet(term)

   }



