package mexico.view;

import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

public class VocabularyListAdapterJava extends RecyclerView.Adapter<VocabularyListAdapterJava.ItemHolder> {

    public static class ItemHolder {

        public TextView name;
        public ImageView icon;

        public ItemHolder() {
            super()
        }
    }
}
