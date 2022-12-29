package com.example.vennappsandroidjuniortest.utils

class Basket(private val products: ArrayList<Product>) {

//    var productList = products
//    productList.ad

    fun addProductToBasket(product: Product) {
        if (product.productQuant > 0) {
            product.productQuant  = product.productQuant - 1
            products.add(product)
         }
    }

    fun numItemsBasket(): Int {
        return products.size
    }

    fun valTotalItemsBasket(): Int {
        var sum = 0

        for(product in products) {
            sum += product.productPrice
        }

        return sum
    }
}