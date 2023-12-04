package com.example.newenglish

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(var context: Context, var lesson: ArrayList<Lesson>): BaseAdapter() {
    private class ViewHolder(row: View?){
        var txtname: TextView
        var ivname: ImageView

        init{
            this.txtname = row?.findViewById(R.id.textView3) as TextView
            this.ivname = row?.findViewById(R.id.imageView3) as ImageView
        }
    }


    override fun getCount(): Int {
        return lesson.count()
    }

    override fun getItem(position: Int): Any {
        return lesson.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View?
        var viewHolder: ViewHolder
        if (convertView == null) {
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.lessonslist, parent, false)
            viewHolder = ViewHolder (view)
            view.tag = viewHolder
        } else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var lesson: Lesson = getItem(position) as Lesson
        viewHolder.txtname.text =  lesson.name
        viewHolder.ivname.setImageResource(lesson.image)

        return view as View
    }
}