package com.okanserdaroglu.databindingkotlin.data

import android.os.Parcel
import android.os.Parcelable

class Product(
    val header: String,
    val detail: String,
    val image: Int,
    val price: Double,
    val discountedPrice: Double,
    val rateNumber: Int,
    val rateNote: Float,
    val serialNumber: Int
):Parcelable {

    fun isCampaign () : Boolean {
        return discountedPrice > 0
    }

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readDouble(),
        parcel.readDouble(),
        parcel.readInt(),
        parcel.readFloat(),
        parcel.readInt()
    )


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(header)
        parcel.writeString(detail)
        parcel.writeInt(image)
        parcel.writeDouble(price)
        parcel.writeDouble(discountedPrice)
        parcel.writeInt(rateNumber)
        parcel.writeFloat(rateNote)
        parcel.writeInt(serialNumber)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Product> {
        override fun createFromParcel(parcel: Parcel): Product {
            return Product(parcel)
        }

        override fun newArray(size: Int): Array<Product?> {
            return arrayOfNulls(size)
        }
    }



}