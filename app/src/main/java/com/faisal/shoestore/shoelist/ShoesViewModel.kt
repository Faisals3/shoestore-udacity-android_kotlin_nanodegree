package com.faisal.shoestore.shoelist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoesViewModel : ViewModel() {

    private val _shoesListLiveData: MutableLiveData<List<ShoeUiModel>> =
        MutableLiveData(emptyList())
    val shoesListLiveData: LiveData<List<ShoeUiModel>>
        get() = _shoesListLiveData

    init {
        addDummyShoesData()
    }

    private fun addDummyShoesData() {
        _shoesListLiveData.value = listOf(
            ShoeUiModel(
                "Puma-liteX",
                "Puma",
                47,
                "New Red black Puma shoe"
            ),
            ShoeUiModel(
                "Original-classic",
                "Classic",
                44,
                "This is a classic shoe"
            ),
            ShoeUiModel(
                "Fancy expensive shoe",
                "Fancy",
                25,
                "Nice fancy shoe"
            ),
            ShoeUiModel(
                "black x white shoe",
                "Dark and Light shoe",
                16,
                "Black and White theme shoe"
            ),
            ShoeUiModel(
                "Extra speed",
                "faisal for shoes",
                46,
                "This shoe will make you faster"
            ),
            ShoeUiModel(
                "Slow speed",
                "rival company",
                44,
                "This is a bad uncomfirtable shoe"
            ),
            ShoeUiModel(
                "Custome shoe",
                "Skechers",
                44,
                "This is a Skechers shoe"
            ),
        )
    }

    fun addShoe(shoe: ShoeUiModel) {
        val shoesList: MutableList<ShoeUiModel> = _shoesListLiveData.value!!.toMutableList()
        shoesList.add(shoe)
        _shoesListLiveData.value = shoesList
    }
}