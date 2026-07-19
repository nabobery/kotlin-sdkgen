package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ReasoningConfig/allOf/1.
 */
@Serializable(with = InlineComponentsSchemasReasoningConfigAllOf1.Serializer::class)
public class InlineComponentsSchemasReasoningConfigAllOf1(
  public val enabled: Boolean? = null,
  public val maxTokens: Int? = null,
) {
  public class Builder {
    public var enabled: Boolean? = null

    public var maxTokens: Int? = null

    public fun build(): InlineComponentsSchemasReasoningConfigAllOf1 = InlineComponentsSchemasReasoningConfigAllOf1(
      enabled = enabled,
      maxTokens = maxTokens,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasReasoningConfigAllOf1 = Builder().apply(block)
      .build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasReasoningConfigAllOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasReasoningConfigAllOf1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasReasoningConfigAllOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasReasoningConfigAllOf1 must be a JSON object")
      return InlineComponentsSchemasReasoningConfigAllOf1(
        enabled = raw["enabled"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Boolean?>(element) },
        maxTokens = raw["max_tokens"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasReasoningConfigAllOf1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasReasoningConfigAllOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
        value.maxTokens?.let { put("max_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasReasoningConfigAllOf1(block: InlineComponentsSchemasReasoningConfigAllOf1.Builder
  .() -> Unit): InlineComponentsSchemasReasoningConfigAllOf1 = InlineComponentsSchemasReasoningConfigAllOf1.build(block)
