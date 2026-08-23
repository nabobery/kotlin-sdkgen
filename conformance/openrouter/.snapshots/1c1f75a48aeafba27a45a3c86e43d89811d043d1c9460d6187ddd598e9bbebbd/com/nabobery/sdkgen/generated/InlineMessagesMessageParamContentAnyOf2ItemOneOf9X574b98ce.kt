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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/8.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/8
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce.Serializer::class)
public class InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce(
  public val content: InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e,
  public val toolUseId: String,
  public val type: InlineMessagesMessageParamContentAnyOf2ItemOneOf9TypeX4e989d66,
  public val cacheControl: AnthropicCacheControlDirective? = null,
) {
  public class Builder {
    private var contentValue: InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e? =
        null

    public var content: InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var toolUseIdValue: String? = null

    public var toolUseId: String
      get() = requireNotNull(toolUseIdValue) { "toolUseId is required" }
      set(`value`) {
        toolUseIdValue = value
      }

    private var typeValue: InlineMessagesMessageParamContentAnyOf2ItemOneOf9TypeX4e989d66? = null

    public var type: InlineMessagesMessageParamContentAnyOf2ItemOneOf9TypeX4e989d66
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cacheControl: AnthropicCacheControlDirective? = null

    public fun build(): InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce {
      check(contentValue != null) { "content is required" }
      check(toolUseIdValue != null) { "toolUseId is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce(
        content = content,
        toolUseId = toolUseId,
        type = type,
        cacheControl = cacheControl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce must be a JSON object")
      val content = json.decodeRequired<InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e>(rawObject, "content")
      val toolUseId = json.decodeRequired<String>(rawObject, "tool_use_id")
      val type = json.decodeRequired<InlineMessagesMessageParamContentAnyOf2ItemOneOf9TypeX4e989d66>(rawObject, "type")
      return InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce(
        content = content,
        toolUseId = toolUseId,
        type = type,
        cacheControl = rawObject["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
        put("tool_use_id", value.toolUseId)
        put("type", json.encodeToJsonElement(value.type))
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce(block: InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce.Builder.() -> Unit): InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce = InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
