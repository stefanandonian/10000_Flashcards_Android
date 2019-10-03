package mexico.view

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class VocabularyListAdapter(voculary: Array<String>, context: Context) :
        RecyclerView.Adapter<VocabularyListAdapter.ItemHolder>() {

    var vocabulary: Array<String> = Array<String>()

    inner class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView? = null
        var icon: ImageView? = null
    }
}