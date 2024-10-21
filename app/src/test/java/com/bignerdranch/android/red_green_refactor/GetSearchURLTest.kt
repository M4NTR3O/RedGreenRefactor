package com.bignerdranch.android.red_green_refactor

import org.junit.Test

class GetSearchURLTest {
    @Test
    fun firstTest(){
        var nullResult = getSearchUrl(null)
        if (nullResult == null){
            print("Success\n")
        }
        else {
            throw AssertionError("Result was not null")
        }
    }
    @Test
    fun secondTest(){
        var notNullResult = getSearchUrl("toaster")
        if (notNullResult != null){
            print("Success")
        }
        else {
            throw AssertionError("Result was null")
        }
    }
}