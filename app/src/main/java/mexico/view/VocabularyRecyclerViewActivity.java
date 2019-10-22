package mexico.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.engineering.andonian.a10000spanishflashcards.R;

import java.net.MalformedURLException;
import java.net.URL;

import mexico.view.model.Palabra;

public class VocabularyRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private Palabra[] palabras = buildPalabrasList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vocabulary_list);

        recyclerView = findViewById(R.id.vocabularyList);
        adapter = new VocabularyListAdapter(palabras);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    private Palabra[] buildPalabrasList() {
        try {
            return new Palabra[] {
                    new Palabra("fuego", new URL("https://pixabay.com/get/51e2d3414c5ab108f5d084609629367f1c3dd9e1574c704c722e7cd69644c05e_1280.jpg")),
                    new Palabra("tiera", new URL("https://pixabay.com/get/50e0d5474355b108f5d084609629367f1c3dd9e1574c704c722e7cd6954ec35e_1280.jpg")),
                    new Palabra("agua", new URL("https://pixabay.com/get/57e8d344485aa914f6da8c7dda79367f1436dce257556c4870287ad3954fc158bf_1280.jpg"))
            };
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
            return null;
        }
    }

}
