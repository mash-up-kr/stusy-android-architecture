package miinjung.study.test.Model

import com.google.gson.annotations.SerializedName

data class owner(
    val login: String? = null,
    @SerializedName("avatar_url") val avatarUrl:String? = null
)