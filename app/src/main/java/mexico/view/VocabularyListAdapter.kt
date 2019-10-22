package mexico.view

import android.support.v7.widget.RecyclerView

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.engineering.andonian.a10000spanishflashcards.R
import mexico.view.model.Palabra

class VocabularyListAdapter(private val dataSet: Array<Palabra>): RecyclerView.Adapter<VocabularyListAdapter.ViewHolder>() {

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val icon: ImageView
        val lemma: TextView

        init {
            v.setOnClickListener { Log.d(TAG, "Element $adapterPosition clicked.") }
            icon = v.findViewById(R.id.vocabulary_list_item_icon)
            lemma = v.findViewById(R.id.vocabulary_list_item_title)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.vocabulary_list_item, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        Log.d(TAG, "Element $position set.")
        viewHolder.lemma.text = dataSet[position].lemma
        viewHolder.icon.setImageURI(dataSet[position].iconUrl)
    }

    override fun getItemCount(): Int = dataSet.size

    companion object {
        private val TAG = "VocabularyListAdapter"
    }
}