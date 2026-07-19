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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/action/oneOf/1.
 */
@Serializable(with = InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1.Serializer::class)
public class InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1(
  public val type:
      InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1PropertiesType,
  public val url: String? = null,
) {
  public class Builder {
    private var typeValue:
        InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1PropertiesType? = null

    public var type:
        InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var url: String? = null

    public fun build(): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1 {
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1(
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1 must be a " +
          "JSON object")
      val type = json
        .decodeRequired<InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1PropertiesType>(raw, "type")
      return InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1(
        type = type,
        url = raw["url"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1(block: InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1.Builder.() -> Unit): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1 = InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
