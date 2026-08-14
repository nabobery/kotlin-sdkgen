package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/4.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/4
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721.Serializer::class)
public class InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721(
  public val toolUseId: String,
  public val type: InlineMessagesMessageParamContentAnyOf2ItemOneOf5TypeX4f80d75d,
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val content: InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93? = null,
  public val isError: Boolean? = null,
) {
  public class Builder {
    private var toolUseIdValue: String? = null

    public var toolUseId: String
      get() = requireNotNull(toolUseIdValue) { "toolUseId is required" }
      set(`value`) {
        toolUseIdValue = value
      }

    private var typeValue: InlineMessagesMessageParamContentAnyOf2ItemOneOf5TypeX4f80d75d? = null

    public var type: InlineMessagesMessageParamContentAnyOf2ItemOneOf5TypeX4f80d75d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cacheControl: AnthropicCacheControlDirective? = null

    public var content: InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93? = null

    public var isError: Boolean? = null

    public fun build(): InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721 {
      check(toolUseIdValue != null) { "toolUseId is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721(
        toolUseId = toolUseId,
        type = type,
        cacheControl = cacheControl,
        content = content,
        isError = isError,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721 must be a JSON object")
      val toolUseId = json.decodeRequired<String>(rawObject, "tool_use_id")
      val type = json.decodeRequired<InlineMessagesMessageParamContentAnyOf2ItemOneOf5TypeX4f80d75d>(rawObject, "type")
      return InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721(
        toolUseId = toolUseId,
        type = type,
        cacheControl = rawObject["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        content = rawObject["content"]?.let { json.decodeFromJsonElement<InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93>(it) },
        isError = rawObject["is_error"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tool_use_id", value.toolUseId)
        put("type", json.encodeToJsonElement(value.type))
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
        value.content?.let { put("content", json.encodeToJsonElement(it)) }
        value.isError?.let { put("is_error", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721(block: InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721.Builder.() -> Unit): InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721 = InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
