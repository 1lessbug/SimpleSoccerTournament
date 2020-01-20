package ashok.subedi89.simplesoccertournament

import android.os.Bundle
import android.os.Message
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindView()

        // initialize message recyclerView and its adapter
       val messageList: List<Message> = ArrayList()
    }

    private fun bindView() {
        progressBar_mainActivity.visibility = View.GONE
        button_sendChat.setOnClickListener {
            editText_chatMessage.setText("")
            showToast("Well you've clicked me")
        }
    }

    private fun signOut() {
        showToast("Well you've clicked signed out")
    }

    // region menu-stuff
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_signOut -> {
                signOut()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
    // endregion
}
