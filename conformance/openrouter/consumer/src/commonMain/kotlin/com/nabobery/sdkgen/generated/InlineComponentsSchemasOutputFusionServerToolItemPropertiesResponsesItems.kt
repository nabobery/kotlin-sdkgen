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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputFusionServerToolItem/properties/responses/items.
 */
@Serializable(with = InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems.Serializer::class)
public class InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems(
  public val model: String,
  public val content: String? = null,
) {
  public class Builder {
    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    public var content: String? = null

    public fun build(): InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems {
      check(modelValue != null) { "model is required" }
      return InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems(
        model = model,
        content = content,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems must " +
          "be a JSON object")
      val model = json.decodeRequired<String>(raw, "model")
      return InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems(
        model = model,
        content = raw["content"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("model", value.model)
        value.content?.let { put("content", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems(block: InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems.Builder.() -> Unit): InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems = InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasOutputFusionServerToolItemPropertiesResponsesItems is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
