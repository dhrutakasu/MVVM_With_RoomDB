package com.demo.interviewtask.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ClassName2 {
    var associatedDrug:List<AssociatedDrug>? = null
    @SerializedName("associatedDrug#2")
    @Expose
    var associatedDrug2:List<AssociatedDrug2>? = null
}
