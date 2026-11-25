package com.sadsha.vim8.ime.layout.models.yaml.versions.common

import arrow.optics.optics
import com.fasterxml.jackson.annotation.JsonProperty
import com.sadsha.vim8.ime.layout.models.Direction
import com.sadsha.vim8.lib.ExcludeFromJacocoGeneratedReport
import java.util.EnumMap

@ExcludeFromJacocoGeneratedReport
@optics
data class Layer(
    @JsonProperty(required = true) val sectors: Map<Direction, Part> = EnumMap(
        Direction::class.java
    )
) {
    companion object
}
