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
 */
@Serializable(with = InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems.Serializer::class)
public class InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems(
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

    public fun build(): InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems {
      check(insightValue != null) { "insight is required" }
      check(modelValue != null) { "model is required" }
      return InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems(
        insight = insight,
        model = model,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems must " +
          "be a JSON object")
      val insight = json.decodeRequired<String>(raw, "insight")
      val model = json.decodeRequired<String>(raw, "model")
      return InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems(
        insight = insight,
        model = model,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("insight", value.insight)
        put("model", value.model)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems(block: InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems.Builder.() -> Unit): InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems = InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasFusionAnalysisResultPropertiesUniqueInsightsItems is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
