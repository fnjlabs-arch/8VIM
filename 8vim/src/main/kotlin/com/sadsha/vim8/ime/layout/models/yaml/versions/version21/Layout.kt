package com.sadsha.vim8.ime.layout.models.yaml.versions.version21

import arrow.optics.optics
import com.fasterxml.jackson.annotation.JsonProperty
import com.sadsha.vim8.ime.layout.models.yaml.versions.common.LayoutInfo
import com.sadsha.vim8.lib.ExcludeFromJacocoGeneratedReport

@ExcludeFromJacocoGeneratedReport
@optics
data class Layout(
    @JsonProperty(required = true) val layers: Layers = Layers(),
    val info: LayoutInfo = LayoutInfo(),
    @JsonProperty(required = true) val version: String = "2.1"
) {
    companion object
}
