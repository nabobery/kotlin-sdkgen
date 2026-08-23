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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesStartEvent/properties/message/properties/usage/allOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesStartEvent/properties/message/properties/usage/allOf/1
 */
@Serializable(with = InlineMessagesStartEventMessageUsageAllOf2Xcef88799.Serializer::class)
public class InlineMessagesStartEventMessageUsageAllOf2Xcef88799(
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

    public fun build(): InlineMessagesStartEventMessageUsageAllOf2Xcef88799 = InlineMessagesStartEventMessageUsageAllOf2Xcef88799(
      iterations = iterations,
      speed = speed,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesStartEventMessageUsageAllOf2Xcef88799 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesStartEventMessageUsageAllOf2Xcef88799> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesStartEventMessageUsageAllOf2Xcef88799 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesStartEventMessageUsageAllOf2Xcef88799")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesStartEventMessageUsageAllOf2Xcef88799 must be a JSON object")
      return InlineMessagesStartEventMessageUsageAllOf2Xcef88799(
        iterations = rawObject["iterations"]?.let { json.decodeFromJsonElement<List<AnthropicUsageIteration>>(it) },
        speed = rawObject["speed"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicSpeed?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesStartEventMessageUsageAllOf2Xcef88799) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesStartEventMessageUsageAllOf2Xcef88799")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.iterations?.let { put("iterations", json.encodeToJsonElement(it)) }
        value.speed?.let { put("speed", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesStartEventMessageUsageAllOf2Xcef88799(block: InlineMessagesStartEventMessageUsageAllOf2Xcef88799.Builder.() -> Unit): InlineMessagesStartEventMessageUsageAllOf2Xcef88799 = InlineMessagesStartEventMessageUsageAllOf2Xcef88799.build(block)
