package mexico.model

import android.net.Uri
import org.json.JSONObject
import java.net.URL

class PixabayPictureRetriever {

    fun getImage(palabra: String): Uri {
        val apiResponse = URL("https://pixabay.com/api/?key=11192744-0760850d09e4a3e42b8c7de16&q$palabra&image_type=photo&orientation=horizontal&safesearch=true")
                .readText()
        val imagePath = JSONObject(apiResponse)
                .getJSONArray("hits")
                .getJSONObject(0)
                .getString("largeImageURL")
        return Uri.Builder()
                .path(imagePath)
                .build()
    }

}