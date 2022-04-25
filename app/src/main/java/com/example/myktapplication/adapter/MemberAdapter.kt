package com.example.myktapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myktapplication.R
import com.example.myktapplication.model.Member

class MemberAdapter(var context: Context, var members: ArrayList<Member>) : BaseAdapter(){

    var inflter: LayoutInflater? = null

    init{
        inflter = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return members.size
    }

    override fun getItem(position: Int): Member {
        return members.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val convertView = inflter!!.inflate(R.layout.item_member_list, null)
        val iv_profile = convertView.findViewById<ImageView>(R.id.img_profile)
        val tv_fullname = convertView.findViewById<TextView>(R.id.tv_fullname)
        val member = members[position]
        iv_profile.setImageResource(member.getProfile())
        tv_fullname.text = member.getFullname()


        return convertView
    }

}





