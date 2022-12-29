package com.example.vennappsandroidjuniortest

import com.example.vennappsandroidjuniortest.utils.Basket
import com.example.vennappsandroidjuniortest.utils.Product
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun numItemsInBasket_isCorrect() {
        val productOne: Product = Product(1,25, 20)
        val productTwo: Product = Product(2, 15,10)

        val basket: Basket = Basket(arrayListOf(productOne,productTwo))
        assertEquals(2, basket.numItemsBasket())
    }

    @Test
    fun totalPriceItemsInBasket_isCorrect() {
        val productOne: Product = Product(1,25, 20)
        val productTwo: Product = Product(2, 15,10)

        val basket: Basket = Basket(arrayListOf(productOne, productTwo))
        assertEquals(30, basket.valTotalItemsBasket())
    }

    @Test
    fun checkItemStock_isCorrect() {
        val productOne = Product(1, 25, 20)
        val basket = Basket(arrayListOf())
        basket.addProductToBasket(productOne)

        assertEquals(24, productOne.productQuant)
        assertEquals(1, basket.numItemsBasket())
    }

    @Test
    fun lowStockItem_check() {
        val productOne = Product(1, 0, 20)
        val basket = Basket(arrayListOf())
        basket.addProductToBasket(productOne)

        assertEquals(0, productOne.productQuant)
        assertEquals(0, basket.numItemsBasket())
    }
}