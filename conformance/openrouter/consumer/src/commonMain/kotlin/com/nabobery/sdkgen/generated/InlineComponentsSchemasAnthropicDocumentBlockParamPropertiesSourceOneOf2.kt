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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlockParam/properties/source/oneOf/2.
 */
@Serializable(with = InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2.Serializer::class)
public class InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2(
  public val content:
      InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent,
  public val type:
      InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesType,
) {
  public class Builder {
    private var contentValue:
        InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent? =
        null

    public var content:
        InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var typeValue:
        InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesType? =
        null

    public var type:
        InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2 {
      check(contentValue != null) { "content is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2(
        content = content,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2 must " +
          "be a JSON object")
      val content = json
        .decodeRequired<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent>(raw,
          "content")
      val type = json
        .decodeRequired<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesType>(raw,
          "type")
      return InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2(
        content = content,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2(block: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2.Builder.() -> Unit): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2 = InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
