package com.example.mytoastlibrary

import android.content.Context
import android.widget.Toast

class DisplaySimpleToast {


    fun DisplayShortToast(context: Context , message: String ){
        Toast.makeText(context , message , Toast.LENGTH_SHORT).show()
    }



    fun DisplayLongToast(context: Context , message: String ){
        Toast.makeText(context , message , Toast.LENGTH_LONG).show()
    }


}