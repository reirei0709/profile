package app.itakura.reirei.profile

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name.setOnClickListener{
            profileImage.setImageResource(R.drawable.randy_image)
            profileLabelText.text = "名前"
            profileCommentText.text = "Androidメンターのランディだよ"
            name.backgroundTintList = ColorStateList.valueOf(Color.rgb(0,180,220))
            sports.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            food.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            hobby.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        }

        sports.setOnClickListener{
            profileImage.setImageResource(R.drawable.baseball_image)
            profileLabelText.text = "スポーツ"
            profileCommentText.text = "野球観戦が趣味でスタジアムに通っている"
            name.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            sports.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,100,150))
            food.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            hobby.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        }

        food.setOnClickListener{
            profileImage.setImageResource(R.drawable.donut_image)
            profileLabelText.text = "好きな食べ物"
            profileCommentText.text = "キャンディーやドーナツが大好き"
            name.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            sports.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            food.backgroundTintList = ColorStateList.valueOf(Color.rgb(0,180,120))
            hobby.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        }

        hobby.setOnClickListener{
            profileImage.setImageResource(R.drawable.gadget_image)
            profileLabelText.text = "趣味"
            profileCommentText.text = "ガジェットを集めて動かすこと"
            name.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            sports.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            food.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            hobby.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,100,0))
        }


    }
}