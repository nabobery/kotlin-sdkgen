package com.nabobery.sdkgen.generated

import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/BaseMessagesResult/properties/usage/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseMessagesResult/properties/usage/allOf/1
 */
@Serializable(with = InlineBaseMessagesResultUsageAllOf2Xbea55848.Serializer::class)
public class InlineBaseMessagesResultUsageAllOf2Xbea55848(
  iterations: List<AnthropicUsageIteration>? = null,
  public val speed: AnthropicSpeed? = null,
) {
  public val iterations: List<AnthropicUsageIteration>? =
      iterations?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var iterationsValue: List<AnthropicUsageIteration>? = null

    public var iterations: List<AnthropicUsageIteration>?
      get() = iterationsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        iterationsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var speed: AnthropicSpeed? = null

    public fun build(): InlineBaseMessagesResultUsageAllOf2Xbea55848 = InlineBaseMessagesResultUsageAllOf2Xbea55848(
      iterations = iterations,
      speed = speed,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBaseMessagesResultUsageAllOf2Xbea55848 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineBaseMessagesResultUsageAllOf2Xbea55848> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBaseMessagesResultUsageAllOf2Xbea55848 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBaseMessagesResultUsageAllOf2Xbea55848")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBaseMessagesResultUsageAllOf2Xbea55848 must be a JSON object")
      return InlineBaseMessagesResultUsageAllOf2Xbea55848(
        iterations = rawObject["iterations"]?.let { json.decodeFromJsonElement<List<AnthropicUsageIteration>>(it) },
        speed = rawObject["speed"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicSpeed?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBaseMessagesResultUsageAllOf2Xbea55848) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBaseMessagesResultUsageAllOf2Xbea55848")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.iterations?.let { put("iterations", json.encodeToJsonElement(it)) }
        value.speed?.let { put("speed", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBaseMessagesResultUsageAllOf2Xbea55848(block: InlineBaseMessagesResultUsageAllOf2Xbea55848.Builder.() -> Unit): InlineBaseMessagesResultUsageAllOf2Xbea55848 = InlineBaseMessagesResultUsageAllOf2Xbea55848.build(block)
