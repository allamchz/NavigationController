package cr.ac.una.test.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import cr.ac.una.jsoncrud.entity.Item
import cr.ac.una.test.R

class itemAdapter(context: Context, items: List<Item>) :
    ArrayAdapter<Item>(context, 0, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }
        val item = getItem(position)

        val nameTextView = view!!.findViewById<TextView>(R.id.name)
        val descriptionTextView = view.findViewById<TextView>(R.id.description)


        nameTextView.text = item!!.name.toString()
        descriptionTextView.text = item.description.toString()

        return view
        return view!!
    }
}
