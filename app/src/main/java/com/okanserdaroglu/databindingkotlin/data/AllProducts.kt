package com.okanserdaroglu.databindingkotlin.data

import com.okanserdaroglu.databindingkotlin.R

class AllProducts {

    var allProductsArray: Array<Product>
    var allProductsMap: HashMap<String, Product> = HashMap()

    init {
        val KIRMIZI_LAMBA = Product(
            "Kırmızı Lamba", "Harika bir kırmızı lamba", R.drawable.red_lamp,
            25.99, 22.99, 150, 4.5f, 123456
        )

        val SARI_LAMBA = Product(
            "Sarı Lamba",
            "Harika bir sarı lamba", R.drawable.yellow_lamp, 24.99, 0.0, 122,
            3.5f, 212123
        )

        val MAVI_KUPA = Product(
            "Mavi Kahve Kupası",
            "Yüzde yüz seramik bir mavi kahve kupası", R.drawable.blue_mug, 6.99, 0.0, 84,
            2.0f, 952123
        )

        val BEYAZ_KUPA = Product(
            "Beyaz Kahve Kupası",
            "Yüzde yüz seramik bir beyaz kahve kupası", R.drawable.white_mug, 5.99, 0.0, 152,
            2.5f, 214523
        )

        val KIRMIZI_KUPA = Product(
            "Kırmızı Kahve Kupası",
            "Yüzde yüz seramik bir kırmızı kahve kupası", R.drawable.red_mug, 9.99, 7.99, 65,
            3.0f, 987456
        )


        val MAVI_SAPKA = Product(
            "Mavi Baseball Şapka",
            "El yapımı mavi baseball şapkası", R.drawable.blue_hat, 27.99, 0.0, 84,
            5.0f, 952923
        )

        val BEYAZ_SAPKA = Product(
            "Beyaz Baseball Şapka",
            "El yapımı beyaz baseball şapkası", R.drawable.white_hat, 24.99, 0.0, 84,
            4.0f, 954653
        )

        val TURUNCU_SAPKA = Product(
            "Turuncu Baseball Şapka",
            "El yapımı turuncu baseball şapkası", R.drawable.orange_hat, 29.99, 21.55, 84,
            4.8f, 951433
        )

        allProductsArray = arrayOf(
            KIRMIZI_LAMBA,
            SARI_LAMBA,
            MAVI_KUPA,
            BEYAZ_KUPA,
            KIRMIZI_KUPA,
            MAVI_SAPKA,
            BEYAZ_SAPKA,
            TURUNCU_SAPKA
        )

        for (product in allProductsArray) {
            allProductsMap[product.serialNumber.toString()] =
                product // allProductsMap.put(product.serialNumber.toString(), product)

        }
    }

}