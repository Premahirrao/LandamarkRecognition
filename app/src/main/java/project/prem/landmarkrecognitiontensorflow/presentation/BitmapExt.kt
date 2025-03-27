package project.prem.landmarkrecognitiontensorflow.presentation

import android.graphics.Bitmap
import android.icu.number.IntegerWidth

fun Bitmap.centreCrop(desiredWidth: Int,desiredHeight: Int): Bitmap{
    val xStart= (width-desiredWidth) /2
    val yStart= (height-desiredHeight) /2
    if (xStart<0 || yStart<0|| desiredHeight> height||desiredWidth>width){
        throw IllegalArgumentException("Invalid Argument for Centre Cropping")
    }
    return Bitmap.createBitmap(this,xStart,yStart,desiredWidth,desiredHeight)
}