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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlockParam/properties/source/oneOf/2
 */
@Serializable(with = InlineAnthropicDocumentBlockParamSourceOneOf3Xbf40f882.Serializer::class)
public class InlineAnthropicDocumentBlockParamSourceOneOf3Xbf40f882(
  public val content: InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8,
  public val type: InlineAnthropicDocumentBlockParamSourceOneOf3TypeXcbc5a6c7,
) {
  public class Builder {
    private var contentValue: InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8? = null

    public var content: InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var typeValue: InlineAnthropicDocumentBlockParamSourceOneOf3TypeXcbc5a6c7? = null

    public var type: InlineAnthropicDocumentBlockParamSourceOneOf3TypeXcbc5a6c7
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineAnthropicDocumentBlockParamSourceOneOf3Xbf40f882 {
      check(contentValue != null) { "content is required" }
      check(typeValue != null) { "type is required" }
      return InlineAnthropicDocumentBlockParamSourceOneOf3Xbf40f882(
        content = content,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnthropicDocumentBlockParamSourceOneOf3Xbf40f882 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnthropicDocumentBlockParamSourceOneOf3Xbf40f882> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnthropicDocumentBlockParamSourceOneOf3Xbf40f882 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnthropicDocumentBlockParamSourceOneOf3Xbf40f882")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnthropicDocumentBlockParamSourceOneOf3Xbf40f882 must be a JSON object")
      val content = json.decodeRequired<InlineAnthropicDocumentBlockParamSourceOneOf3ContentX376b90e8>(rawObject, "content")
      val type = json.decodeRequired<InlineAnthropicDocumentBlockParamSourceOneOf3TypeXcbc5a6c7>(rawObject, "type")
      return InlineAnthropicDocumentBlockParamSourceOneOf3Xbf40f882(
        content = content,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicDocumentBlockParamSourceOneOf3Xbf40f882) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnthropicDocumentBlockParamSourceOneOf3Xbf40f882")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAnthropicDocumentBlockParamSourceOneOf3Xbf40f882(block: InlineAnthropicDocumentBlockParamSourceOneOf3Xbf40f882.Builder.() -> Unit): InlineAnthropicDocumentBlockParamSourceOneOf3Xbf40f882 = InlineAnthropicDocumentBlockParamSourceOneOf3Xbf40f882.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnthropicDocumentBlockParamSourceOneOf3Xbf40f882 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
