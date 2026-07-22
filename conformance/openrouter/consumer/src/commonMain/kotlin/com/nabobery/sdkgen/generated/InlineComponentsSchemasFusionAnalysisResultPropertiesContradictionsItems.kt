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
 * sdkgen://source/openapi.yaml#/components/schemas/FusionAnalysisResult/properties/contradictions/items.
 */
@Serializable(with = InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems.Serializer::class)
public class InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems(
  stances: List<InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItemsPropertifbe72ae4>,
  public val topic: String,
) {
  public val stances:
      List<InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItemsPropertifbe72ae4>
      = stances.toList()

  public class Builder {
    private var stancesValue:
        List<InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItemsPropertifbe72ae4>?
        = null

    public var stances:
        List<InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItemsPropertifbe72ae4>
      get() = requireNotNull(stancesValue) { "stances is required" }
      set(`value`) {
        stancesValue = value
      }

    private var topicValue: String? = null

    public var topic: String
      get() = requireNotNull(topicValue) { "topic is required" }
      set(`value`) {
        topicValue = value
      }

    public fun build(): InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems {
      check(stancesValue != null) { "stances is required" }
      check(topicValue != null) { "topic is required" }
      return InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems(
        stances = stances,
        topic = topic,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems must " +
          "be a JSON object")
      val stances = json
        .decodeRequired<List<InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItemsPropertifbe72ae4>>(raw, "stances")
      val topic = json.decodeRequired<String>(raw, "topic")
      return InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems(
        stances = stances,
        topic = topic,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("stances", json.encodeToJsonElement(value.stances))
        put("topic", value.topic)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems(block: InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems.Builder.() -> Unit): InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems = InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasFusionAnalysisResultPropertiesContradictionsItems is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
