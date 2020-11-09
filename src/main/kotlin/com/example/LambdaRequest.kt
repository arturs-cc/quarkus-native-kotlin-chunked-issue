package com.example

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.quarkus.runtime.annotations.RegisterForReflection

@RegisterForReflection
data class LambdaRequest @JsonCreator constructor(

    @JsonProperty(value = "nullProperty")
    val nullProperty: String?,

    @JsonProperty(value = "nonNullProperty")
    val nonNullProperty: String
)