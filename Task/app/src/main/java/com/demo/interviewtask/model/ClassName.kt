package com.demo.interviewtask.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class ClassName {
    private val associatedDrug: List<AssociatedDrug>? = null
    @SerializedName("associatedDrug#2")
    @Expose
    private val associatedDrug2: List<AssociatedDrug2>? = null
}
