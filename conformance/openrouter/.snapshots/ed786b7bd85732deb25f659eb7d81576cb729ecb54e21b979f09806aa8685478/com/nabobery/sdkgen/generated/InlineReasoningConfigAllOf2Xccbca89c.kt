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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ReasoningConfig/allOf/1
 */
@Serializable(with = InlineReasoningConfigAllOf2Xccbca89c.Serializer::class)
public class InlineReasoningConfigAllOf2Xccbca89c(
  public val enabled: Boolean? = null,
  public val maxTokens: Int? = null,
) {
  public class Builder {
    public var enabled: Boolean? = null

    public var maxTokens: Int? = null

    public fun build(): InlineReasoningConfigAllOf2Xccbca89c = InlineReasoningConfigAllOf2Xccbca89c(
      enabled = enabled,
      maxTokens = maxTokens,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReasoningConfigAllOf2Xccbca89c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReasoningConfigAllOf2Xccbca89c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReasoningConfigAllOf2Xccbca89c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReasoningConfigAllOf2Xccbca89c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReasoningConfigAllOf2Xccbca89c must be a JSON object")
      return InlineReasoningConfigAllOf2Xccbca89c(
        enabled = rawObject["enabled"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        maxTokens = rawObject["max_tokens"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReasoningConfigAllOf2Xccbca89c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReasoningConfigAllOf2Xccbca89c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
        value.maxTokens?.let { put("max_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReasoningConfigAllOf2Xccbca89c(block: InlineReasoningConfigAllOf2Xccbca89c.Builder.() -> Unit): InlineReasoningConfigAllOf2Xccbca89c = InlineReasoningConfigAllOf2Xccbca89c.build(block)
