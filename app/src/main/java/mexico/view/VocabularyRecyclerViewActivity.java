package mexico.view;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.engineering.andonian.a10000spanishflashcards.R;

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
        return new Palabra[] {
                new Palabra("fuego", new Uri.Builder()
                        .path("https://pixabay.com/get/51e2d3414c5ab108f5d084609629367f1c3dd9e1574c704c722e7cd69644c05e_1280.jpg")
                        .build()),
                new Palabra("tiera", new Uri.Builder()
                        .path("https://pixabay.com/get/50e0d5474355b108f5d084609629367f1c3dd9e1574c704c722e7cd6954ec35e_1280.jpg")
                        .build()),
                new Palabra("agua", new Uri.Builder()
                        .path("https://pixabay.com/get/57e8d344485aa914f6da8c7dda79367f1436dce257556c4870287ad3954fc158bf_1280.jpg")
                        .build()),
                new Palabra("viento", new Uri.Builder()
                .path("https://cdn.pixabay.com/photo/2016/10/25/14/03/clouds-1768967_960_720.jpg")
                .build())
        };
    }

}
