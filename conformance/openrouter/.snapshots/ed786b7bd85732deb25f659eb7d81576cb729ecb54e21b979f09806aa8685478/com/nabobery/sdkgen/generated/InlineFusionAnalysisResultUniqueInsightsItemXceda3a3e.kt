package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/FusionAnalysisResult/properties/unique_insights/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionAnalysisResult/properties/unique_insights/items
 */
@Serializable(with = InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e.Serializer::class)
public class InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e(
  public val insight: String,
  public val model: String,
) {
  public class Builder {
    private var insightValue: String? = null

    public var insight: String
      get() = requireNotNull(insightValue) { "insight is required" }
      set(`value`) {
        insightValue = value
      }

    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    public fun build(): InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e {
      check(insightValue != null) { "insight is required" }
      check(modelValue != null) { "model is required" }
      return InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e(
        insight = insight,
        model = model,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e must be a JSON object")
      val insight = json.decodeRequired<String>(rawObject, "insight")
      val model = json.decodeRequired<String>(rawObject, "model")
      return InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e(
        insight = insight,
        model = model,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("insight", value.insight)
        put("model", value.model)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFusionAnalysisResultUniqueInsightsItemXceda3a3e(block: InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e.Builder.() -> Unit): InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e = InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineFusionAnalysisResultUniqueInsightsItemXceda3a3e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
