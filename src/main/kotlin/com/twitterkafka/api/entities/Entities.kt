package com.twitterkafka.api.entities

import org.apache.tomcat.jni.Time

data class Metadata(
        val result_type:String?,
        val  iso_language_code:String?
)


data class Urls(
        val display_url:String?,
        val indices : MutableList<Int>?,
        val expanded_url:String?,
        val url:String?
)
data class Url(
        val urls: MutableList<Urls>?
)
data class Description(
        val urls: MutableList<Urls>?
)
data class User_mentions(
        val indices: MutableList<Int>?,
        val screen_name:String?,
        val id_str:String?,
        val name:String?,
        val id:Long?


)
data class Hashtag(
        val indices:MutableList<Int>?,
        val text: String?
)
data class Symbol(
        val indices:MutableList<Int>?,
        val text: String?
)
data class Size(
        val w:Int?,
        val h:Int?,
        val resize:String?
)
data class Sizes(
        val thumb: Size?,
        val large: Size?,
        val medium: Size?,
        val small: Size?
)
data class  Variants(
        val bitrate:Int?,
        val content_type:String,
        val url:String?
)

data class Video_info(
        val aspect_ratio:MutableList<Int>?,
        val duration_millis:String?,
        val variants:MutableList<Variants>?

)
data class Media(
        val display_url:String?,
        val expanded_url:String?,
        val id:Long?,
        val id_str:String?,
        val indices:MutableList<Int>?,
        val media_url:String?,
        val media_url_http:String?,
        val media_url_https:String?,
        val sizes: Sizes?,
        val source_status_id:Long?,
        val source_status_id_str:Long?,
        val type:String?,
        val url:String?,
        val source_user_id:Long?,
        val source_user_id_str:String?,
        val video_info: Video_info?,
        val additional_media_info: Additional_media_info?

)
data class Additional_media_info(

        val title:String?,
        val description:String?,
        val embeddable:Boolean?,
        val monetizable:Boolean?,
        val source_user: User?,
        val source_user_id:Long?,
        val source_user_id_str:String?
)
data class Entities(
        val hashtags:MutableList<Hashtag>?,
        val urls:MutableList<Urls>?,
        val user_mentions: MutableList<User_mentions>?,

        val symbols:MutableList<Symbol>?,
        val url: Url?,
        val description: Description?,
        val media:MutableList<Media>?
)
data class Extended_Entities(
        val media:MutableList<Media>?,
        val additional_media_info: Additional_media_info?
)
data class User(
        val utc_offset:Int?,
        val friends_count:Int?,
        val profile_image_url_https:String?,
        val listed_count:Int?,
        val profile_background_image_url:String?,
        val default_profile_image:Boolean,
        val favourites_count:Int?,
        val description:String?,
        val created_at:String?,
        val is_translator:Boolean,
        val  profile_background_image_url_https:String?,
        val protected:Boolean,
        val   screen_name:String?,
        val  id_str:String?,
        val profile_link_color:String?,
        val is_translation_enabled:Boolean,
        val translator_type:String?,
        val id:Long?,
        val geo_enabled:Boolean,
        val profile_background_color:String?,
        val lang:String?,
        val has_extended_profile:Boolean,
        val profile_sidebar_border_color:String?,
        val profile_text_color:String?,
        val verified:Boolean,
        val profile_image_url:String?,
        val time_zone:String?,
        val url:String?,
        val contributors_enabled:Boolean,
        val profile_background_tile:Boolean,
        val profile_banner_url:String?,
        val entities: Entities?,
        val statuses_count:Int?,
        val follow_request_sent:String?,
        val followers_count:Int?,
        val default_profile:Boolean,
        val following:String?,
        val name:String?,
        val location:String?,
        val profile_sidebar_fill_color:String?,
        val notifications:String?,
        val profile_use_background_image:Boolean
)
data class Coordinates(
        val coordinates:Any?,
        val type: String?
)


data class Bounding_box(
        val coordinates:MutableList<Coordinates>?,
        val type:String?
)
data class Place(
        val attributes:Any,
        val bounding_box: Coordinates?,
        val country:String?,
        val country_code:String?,
        val full_name:String?,
        val id:String?,
        val name:String?,
        val place_type:String?,
        val url:String?,
        val contained_within:Any?
)

data class Statuses(
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
        val quoted_status: Tweet?
)
data class   Search_metadata(
        val max_id_str:String?,
        val since_id_str:String?,
        val query:String?,
        val count:Int?,
        val max_id:Int?,
        val since_id:Int?,
        val completed_in:Time?,
        val refresh_url:String?


)