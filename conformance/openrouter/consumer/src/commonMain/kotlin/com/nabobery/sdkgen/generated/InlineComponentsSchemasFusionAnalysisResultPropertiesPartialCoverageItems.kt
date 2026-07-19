package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/FusionAnalysisResult/properties/partial_coverage/items.
 */
@Serializable(with = InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems.Serializer::class)
public class InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems(
  models: List<String>,
  public val point: String,
) {
  public val models: List<String> = models.toList()

  public class Builder {
    private var modelsValue: List<String>? = null

    public var models: List<String>
      get() = requireNotNull(modelsValue) { "models is required" }
      set(`value`) {
        modelsValue = value
      }

    private var pointValue: String? = null

    public var point: String
      get() = requireNotNull(pointValue) { "point is required" }
      set(`value`) {
        pointValue = value
      }

    public fun build(): InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems {
      check(modelsValue != null) { "models is required" }
      check(pointValue != null) { "point is required" }
      return InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems(
        models = models,
        point = point,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems must " +
          "be a JSON object")
      val models = json.decodeRequired<List<String>>(raw, "models")
      val point = json.decodeRequired<String>(raw, "point")
      return InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems(
        models = models,
        point = point,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("models", json.encodeToJsonElement(value.models))
        put("point", value.point)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems(block: InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems.Builder.() -> Unit): InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems = InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasFusionAnalysisResultPropertiesPartialCoverageItems is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
