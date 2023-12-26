package com.mh.curvenavigation

interface SpaceOnClickListener {

    fun onCentreButtonClick()

    fun onItemClick(itemIndex: Int, itemName: String)

    fun onItemReselected(itemIndex: Int, itemName: String)
}
