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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicRedactedThinkingBlock.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicRedactedThinkingBlock
 */
@Serializable(with = AnthropicRedactedThinkingBlock.Serializer::class)
public class AnthropicRedactedThinkingBlock(
  public val `data`: String,
  public val type: InlineAnthropicRedactedThinkingBlockTypeX8930a877,
) {
  public class Builder {
    private var dataValue: String? = null

    public var `data`: String
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    private var typeValue: InlineAnthropicRedactedThinkingBlockTypeX8930a877? = null

    public var type: InlineAnthropicRedactedThinkingBlockTypeX8930a877
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicRedactedThinkingBlock {
      check(dataValue != null) { "data is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicRedactedThinkingBlock(
        data = data,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicRedactedThinkingBlock = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicRedactedThinkingBlock> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicRedactedThinkingBlock {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicRedactedThinkingBlock")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicRedactedThinkingBlock must be a JSON object")
      val data = json.decodeRequired<String>(rawObject, "data")
      val type = json.decodeRequired<InlineAnthropicRedactedThinkingBlockTypeX8930a877>(rawObject, "type")
      return AnthropicRedactedThinkingBlock(
        data = data,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicRedactedThinkingBlock) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicRedactedThinkingBlock")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", value.data)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicRedactedThinkingBlock(block: AnthropicRedactedThinkingBlock.Builder.() -> Unit): AnthropicRedactedThinkingBlock = AnthropicRedactedThinkingBlock.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicRedactedThinkingBlock is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
