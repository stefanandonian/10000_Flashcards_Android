package mexico.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.engineering.andonian.a10000spanishflashcards.R

internal class VocabularySetGridAdapter internal constructor(context: Context, private val resource: Int, private val itemList: Array<String>?) : ArrayAdapter<VocabularySetGridAdapter.ItemHolder>(context, resource) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        var holder: ItemHolder

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(resource, null)
            holder = ItemHolder()
            holder.name = convertView!!.findViewById(R.id.gridItemTextView)
            holder.icon = convertView!!.findViewById(R.id.gridItemImageView)
            convertView.tag = holder
        } else {
            holder = convertView.tag as ItemHolder
        }

        holder.name!!.text = this.itemList!![position]
        holder.icon!!.setImageResource(R.mipmap.ic_launcher)

        return convertView
    }

    override fun getCount(): Int {
        return if (this.itemList != null) this.itemList.size else 0
    }

    internal class ItemHolder {
        var name: TextView? = null
        var icon: ImageView? = null
    }
}