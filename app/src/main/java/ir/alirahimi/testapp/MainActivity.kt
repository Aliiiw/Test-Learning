package ir.alirahimi.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ir.alirahimi.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initialBinding()
    }

    private fun initialBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    companion object {
        fun reverseString(input: String): String {
            return input.reversed()
        }
    }
}