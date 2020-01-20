package ashok.subedi89.simplesoccertournament

import android.content.Context
import android.widget.Toast

fun Context.showToast(content: String) {
    Toast.makeText(this, content, Toast.LENGTH_LONG).show()
}