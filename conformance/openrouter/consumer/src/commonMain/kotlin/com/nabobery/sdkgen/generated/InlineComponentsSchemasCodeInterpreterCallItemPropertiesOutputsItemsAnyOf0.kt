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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterCallItem/properties/outputs/items/anyOf/0.
 */
@Serializable(with = InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0.Serializer::class)
public class InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0(
  public val type:
      InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0PropertiesType,
  public val url: String,
) {
  public class Builder {
    private var typeValue:
        InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0PropertiesType? =
        null

    public var type:
        InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0 {
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      return InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0(
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0 must " +
          "be a JSON object")
      val type = json
        .decodeRequired<InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0PropertiesType>(raw,
          "type")
      val url = json.decodeRequired<String>(raw, "url")
      return InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0(
        type = type,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0(block: InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0.Builder.() -> Unit): InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0 = InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0 is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
