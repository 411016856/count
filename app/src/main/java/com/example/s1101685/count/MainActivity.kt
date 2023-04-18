package com.example.s1101685.count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count:Int = 0
    var word:String = ""
    lateinit var txv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv = findViewById(R.id.txv)
    }

    fun AddOne(v:View) {
        if(v.id == R.id.btn) {
            count++
            if(count==1) {
                word = "我叫洪詳華，就讀靜宜大學資訊管理學系二年級。"
            }
            if(count==2) {
                word = "我來自新北市，\n" +
                        "對於下來台中讀書的原因是，\n" +
                        "想離開台北的舒適圈，\n" +
                        "到其他縣市闖闖看，\n" +
                        "所以選擇就讀台中的學校。"
            }
            if(count==3) {
                word = "我平常的興趣是打排球，\n" +
                        "也有加入系排，\n" +
                        "雖然沒有說打得特別好，\n" +
                        "但在打球的時候特別快樂。\n" +
                        "除了運動外，\n" +
                        "我還很喜歡交朋友，\n" +
                        "我有擔任學校領頭羊，\n" +
                        "除了認識其他系的人以外，\n" +
                        "還能與大一拉近距離。"
            }

        }
        else{
            count = 0
            word = "黑皮END!!"
        }
        txv.text = word


    }

}