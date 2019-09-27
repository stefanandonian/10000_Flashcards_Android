package mexico.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.engineering.andonian.a10000spanishflashcards.R

class VocabularySetGrid : AppCompatActivity () {

    private val itemList: Array<String>
        get() = arrayOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10", "Item 11", "Item 12", "Item 13", "Item 14", "Item 15", "Item 16", "Item 17", "Item 18", "Item 19", "Item 20", "Item 21", "Item 22")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vocabulary_set_grid)

        val gridView = findViewById<GridView>(R.id.vocabarySetGridView)

        val adapter = VocabularySetGridAdapter(this, R.layout.vocabulary_set_grid_item, itemList)
        gridView.adapter = adapter

        gridView.onItemClickListener = AdapterView.OnItemClickListener { parent, v, position, id ->
            Toast.makeText(this@VocabularySetGrid, " Clicked Position: " + (position + 1),
                    Toast.LENGTH_SHORT).show()
        }
    }

}