package com.example.wishlist

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="Wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0L,
    @ColumnInfo(name="wish-title")
    val title : String="",
    @ColumnInfo(name="wish-description")
    val description : String=""
)

object DummyWish{
    val wishList= listOf(
        Wish(title="Google Watch 2",description="An android Watch"),
        Wish(title="Oculus Quest 2",description="A VR headset for playing games"),
        Wish(title="no boom white Book ",description="A science friction book any best seller"),
        Wish(title="Barbie Bag",description="A costly bean bag to substitute a chair"),
    )
}
