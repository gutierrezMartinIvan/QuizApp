package ar.beniko.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName = findViewById<TextView>(R.id.tv_name)
        val tvScore = findViewById<TextView>(R.id.tv_score)
        val btnFinish = findViewById<Button>(R.id.btn_finish)
        tvName.text = intent.getStringExtra(Constants.USER_NAME)

        tvScore.text = "Your score is ${intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)} out of ${intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)}"
        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}