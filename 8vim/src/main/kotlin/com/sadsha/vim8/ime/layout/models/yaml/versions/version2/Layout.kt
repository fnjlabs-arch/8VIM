package com.sadsha.vim8.ime.layout.models.yaml.versions.version2

import arrow.optics.optics
import com.fasterxml.jackson.annotation.JsonProperty
import com.sadsha.vim8.ime.layout.models.yaml.versions.common.LayoutInfo
import com.sadsha.vim8.ime.layout.models.yaml.versions.version21.Layout as Layout21
import com.sadsha.vim8.lib.ExcludeFromJacocoGeneratedReport

@ExcludeFromJacocoGeneratedReport
@optics
data class Layout(
    @JsonProperty(required = true) val layers: Layers = Layers(),
    val info: LayoutInfo = LayoutInfo(),
    val version: String = "2"
) {
    companion object
}

fun Layout.toLatest(): Layout21 = Layout21(
    layers = layers.toLatest(),
    info = info,
    version = version
)
