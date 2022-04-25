package com.example.myktapplication.model

import java.io.Serializable

class Member(private var profile: Int, private var fullname: String) : Serializable{


    fun getProfile(): Int {
        return profile
    }

    fun getFullname(): String? {
        return fullname
    }

    fun Member(profile: Int, fullname: String?) {
        this.profile = profile
        this.fullname = fullname!!
    }

    override fun toString(): String {
         return "Member{" +
                "profile=" + profile +
                ", fullName='" + fullname + '\'' +
                '}'
    }
}