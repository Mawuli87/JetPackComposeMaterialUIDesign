package com.yawomessie.gmailclone.models

//Todo 2: create a data class for the mail list
data class MailData(
    val mailId:Int,
    val userName:String,
    val subject:String,
    val body:String,
    val timeStamp:String=""
)
