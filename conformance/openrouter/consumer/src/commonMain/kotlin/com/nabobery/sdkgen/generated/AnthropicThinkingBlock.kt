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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicThinkingBlock.
 */
@Serializable(with = AnthropicThinkingBlock.Serializer::class)
public class AnthropicThinkingBlock(
  public val signature: String,
  public val thinking: String,
  public val type: InlineComponentsSchemasAnthropicThinkingBlockPropertiesType,
) {
  public class Builder {
    private var signatureValue: String? = null

    public var signature: String
      get() = requireNotNull(signatureValue) { "signature is required" }
      set(`value`) {
        signatureValue = value
      }

    private var thinkingValue: String? = null

    public var thinking: String
      get() = requireNotNull(thinkingValue) { "thinking is required" }
      set(`value`) {
        thinkingValue = value
      }

    private var typeValue: InlineComponentsSchemasAnthropicThinkingBlockPropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicThinkingBlockPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicThinkingBlock {
      check(signatureValue != null) { "signature is required" }
      check(thinkingValue != null) { "thinking is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicThinkingBlock(
        signature = signature,
        thinking = thinking,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicThinkingBlock = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicThinkingBlock> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicThinkingBlock {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicThinkingBlock")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicThinkingBlock must be a JSON object")
      val signature = json.decodeRequired<String>(raw, "signature")
      val thinking = json.decodeRequired<String>(raw, "thinking")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicThinkingBlockPropertiesType>(raw, "type")
      return AnthropicThinkingBlock(
        signature = signature,
        thinking = thinking,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicThinkingBlock) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicThinkingBlock")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("signature", value.signature)
        put("thinking", value.thinking)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicThinkingBlock(block: AnthropicThinkingBlock.Builder.() -> Unit): AnthropicThinkingBlock =
  AnthropicThinkingBlock.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicThinkingBlock is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
