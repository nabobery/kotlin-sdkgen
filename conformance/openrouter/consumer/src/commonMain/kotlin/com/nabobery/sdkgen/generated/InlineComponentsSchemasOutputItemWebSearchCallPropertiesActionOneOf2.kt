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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/action/oneOf/2.
 */
@Serializable(with = InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2.Serializer::class)
public class InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2(
  public val pattern: String,
  public val type:
      InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2PropertiesType,
  public val url: String,
) {
  public class Builder {
    private var patternValue: String? = null

    public var pattern: String
      get() = requireNotNull(patternValue) { "pattern is required" }
      set(`value`) {
        patternValue = value
      }

    private var typeValue:
        InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2PropertiesType? = null

    public var type:
        InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2PropertiesType
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

    public fun build(): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2 {
      check(patternValue != null) { "pattern is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      return InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2(
        pattern = pattern,
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2 must be a " +
          "JSON object")
      val pattern = json.decodeRequired<String>(raw, "pattern")
      val type = json
        .decodeRequired<InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2PropertiesType>(raw, "type")
      val url = json.decodeRequired<String>(raw, "url")
      return InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2(
        pattern = pattern,
        type = type,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("pattern", value.pattern)
        put("type", json.encodeToJsonElement(value.type))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2(block: InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2.Builder.() -> Unit): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2 = InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
