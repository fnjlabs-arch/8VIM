package com.sadsha.vim8.ime.layout.models.yaml.versions.version21

import arrow.core.None
import arrow.core.Option
import arrow.optics.optics
import com.fasterxml.jackson.annotation.JsonProperty
import com.sadsha.vim8.ime.layout.models.yaml.versions.common.Action
import com.sadsha.vim8.ime.layout.models.yaml.versions.common.ExtraLayer
import com.sadsha.vim8.ime.layout.models.yaml.versions.common.Layer
import java.util.EnumMap

@optics
data class Layers(
    val hidden: List<Action> = ArrayList(),
    val functions: List<Action> = ArrayList(),
    @JsonProperty("default") val defaultLayer: Option<Layer> = None,
    val extraLayers: Map<ExtraLayer, Layer> = EnumMap(ExtraLayer::class.java)
) {
    companion object
}
