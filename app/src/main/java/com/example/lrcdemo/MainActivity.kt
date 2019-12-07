package com.example.lrcdemo

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var itemList: HashMap<String, Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        itemList = HashMap()

        val title = ArrayList<String>()
        val size = 50
        for (i in 0 until size) {
            title.add("Hello$i")
        }
        val layoutManager1 = GalleryLayoutManager(GalleryLayoutManager.VERTICAL)
        layoutManager1.attach(main_recycle1, 0)
        layoutManager1.setItemTransformer(ScaleTransformer())
        val demoAdapter1 = DemoAdapter(title)
        layoutManager1.setOnItemSelectedListener { _, item, position ->
//            if (!itemList.contains(position.toString())) {
//                itemList[position.toString()] = position
//            }
//            for (en in itemList.entries) {
//                if (en.key == position.toString()) {
//                    main_recycle1.getChildAt(position)
//                        .findViewById<TextView>(R.id.item_tv_title)
//                        .setTextColor(Color.parseColor("#FFFFFF"))
//                } else {
//                    main_recycle1.getChildAt(en.value)
//                        .findViewById<TextView>(R.id.item_tv_title)
//                        .setTextColor(Color.parseColor("#D81B60"))
//                }
//            }


        }
        main_recycle1.adapter = demoAdapter1

    }
}
