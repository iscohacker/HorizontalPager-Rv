package uz.iskandarbek.proekt19

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import uz.iskandarbek.proekt19.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var rvAdapter: RvAdapter
    private lateinit var list: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        list = ArrayList()
        loadData()

        rvAdapter = RvAdapter(list)
        binding.rvImage.adapter = rvAdapter
    }

    private fun loadData() {
        list.add(User(R.drawable.greeens))
        list.add(User(R.drawable.iphone16))
        list.add(User(R.drawable.sasa))
        list.add(User(R.drawable.hackes))
    }
}
