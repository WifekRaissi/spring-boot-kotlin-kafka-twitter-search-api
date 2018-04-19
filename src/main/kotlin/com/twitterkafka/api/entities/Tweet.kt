package com.twitterkafka.api.entities

data class Tweet(
        val metadata: Metadata?,
        val in_reply_to_status_id_str:String?,
        val in_reply_to_status_id:String?,
        val created_at:String?,
        val in_reply_to_user_id_str:String?,
        val source:String?,
        val retweet_count:Int?,
        val retweeted:Boolean,
        val geo: Coordinates?,
        val in_reply_to_screen_name:String?,
        val  is_quote_status:Boolean,
        val quoted_status_id:Long?, //used when the Tweet is a quote Tweet. This field contains the integer value Tweet ID of the quoted Tweet. Example:
        val quoted_status_id_str:String?,/* This field only surfaces when the Tweet is a quote Tweet. This is the string representation Tweet ID of the quoted Tweet*/
        val id_str:String?,
        val in_reply_to_user_id:Long?,
        val favorite_count:Int?,
        val id:Long, //Int64
        val text:String?,
        val place: Place?,
        val lang:String?,
        val favorited:Boolean,
        val possibly_sensitive:Boolean,
        val coordinates: Coordinates?,
        val truncated:Boolean, //Indicates whether the value of the text parameter was truncated,
        val entities: Entities?,
        val extended_entities: Extended_Entities?,
        val contributors:String?,
        val user: User?,
        val retweeted_status: Tweet?,
        val quoted_status: Tweet?,
        val search_metadata:Any?,
        val statuses: MutableList <Statuses>?

)