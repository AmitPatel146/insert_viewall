package com.example.amit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_item.view.*

class EmpAdaptor  (val context: Context, var arr:ArrayList<Emp>)
    : RecyclerView.Adapter<EmpAdaptor.PersonViewHolde>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolde {
        var inflater = LayoutInflater.from(parent.context)
        var view = inflater.inflate(R.layout.card_item, parent, false)
        return PersonViewHolde(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolde, position: Int) {
        holder.bind(arr[position])

    }

    override fun getItemCount(): Int {
        return arr.size
    }

    class PersonViewHolde(var view: View) : RecyclerView.ViewHolder(view) {
        fun bind(p: Emp) {
            view.tvname.setText(p.Emp_name)
            view.tvGender.setText(p.Emp_gender)
            view.tvage.setText(p.Emp_age.toString())
            view.tvAddress.setText(p.Emp_Address)


        }
    }
}
