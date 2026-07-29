package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1subscription/put/requestBody/content/application~1json/
 * schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1subscription/put/requestBody/content/application~1json/
 * schema
 */
@Serializable(with = InlineReposSubscriptionPutRequestJsonX1f5cf85f.Serializer::class)
public class InlineReposSubscriptionPutRequestJsonX1f5cf85f(
  /**
   * Determines if all notifications should be blocked from this repository.
   */
  public val ignored: Boolean? = null,
  /**
   * Determines if notifications should be received from this repository.
   */
  public val subscribed: Boolean? = null,
) {
  public class Builder {
    /**
     * Determines if all notifications should be blocked from this repository.
     */
    public var ignored: Boolean? = null

    /**
     * Determines if notifications should be received from this repository.
     */
    public var subscribed: Boolean? = null

    public fun build(): InlineReposSubscriptionPutRequestJsonX1f5cf85f = InlineReposSubscriptionPutRequestJsonX1f5cf85f(
      ignored = ignored,
      subscribed = subscribed,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposSubscriptionPutRequestJsonX1f5cf85f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposSubscriptionPutRequestJsonX1f5cf85f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposSubscriptionPutRequestJsonX1f5cf85f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposSubscriptionPutRequestJsonX1f5cf85f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposSubscriptionPutRequestJsonX1f5cf85f must be a JSON object")
      return InlineReposSubscriptionPutRequestJsonX1f5cf85f(
        ignored = rawObject["ignored"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        subscribed = rawObject["subscribed"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposSubscriptionPutRequestJsonX1f5cf85f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposSubscriptionPutRequestJsonX1f5cf85f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ignored?.let { put("ignored", json.encodeToJsonElement(it)) }
        value.subscribed?.let { put("subscribed", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposSubscriptionPutRequestJsonX1f5cf85f(block: InlineReposSubscriptionPutRequestJsonX1f5cf85f.Builder.() -> Unit): InlineReposSubscriptionPutRequestJsonX1f5cf85f = InlineReposSubscriptionPutRequestJsonX1f5cf85f.build(block)
