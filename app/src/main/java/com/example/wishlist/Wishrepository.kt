package com.example.wishlist

import kotlinx.coroutines.flow.Flow

class Wishrepository(private val wishDao: WishDao) {
    suspend fun  addAWish(wish: Wish){
        wishDao.addAWish(wish)
    }
    fun getWish(): Flow<List<Wish>> = wishDao.getAllWishes()

    fun getAWishesById (id:Long) :Flow<Wish>{
        return wishDao.getAWishesById(id)
    }
    suspend fun deleteAWish(wish: Wish){
        wishDao.deleteAWish(wish)
    }
    suspend fun  updateAWish(wish: Wish){
        wishDao.updateAWish(wish)
    }
}