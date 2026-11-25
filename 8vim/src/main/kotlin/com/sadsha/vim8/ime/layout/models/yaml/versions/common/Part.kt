package com.sadsha.vim8.ime.layout.models.yaml.versions.common

import arrow.optics.optics
import com.fasterxml.jackson.annotation.JsonProperty
import com.sadsha.vim8.ime.layout.models.Direction
import com.sadsha.vim8.lib.ExcludeFromJacocoGeneratedReport

@ExcludeFromJacocoGeneratedReport
@optics
data class Part(@JsonProperty(required = true) val parts: Map<Direction, List<Action>> = mapOf()) {
    companion object
}
