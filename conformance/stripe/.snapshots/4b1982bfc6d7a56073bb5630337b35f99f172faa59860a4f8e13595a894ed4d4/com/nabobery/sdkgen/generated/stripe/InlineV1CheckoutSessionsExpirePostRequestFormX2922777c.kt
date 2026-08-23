package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}~1expire/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}~1expire/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1CheckoutSessionsExpirePostRequestFormX2922777c.Serializer::class)
public class InlineV1CheckoutSessionsExpirePostRequestFormX2922777c(
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1CheckoutSessionsExpirePostRequestFormX2922777c = InlineV1CheckoutSessionsExpirePostRequestFormX2922777c(
      expand = expand,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsExpirePostRequestFormX2922777c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsExpirePostRequestFormX2922777c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsExpirePostRequestFormX2922777c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsExpirePostRequestFormX2922777c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsExpirePostRequestFormX2922777c must be a JSON object")
      return InlineV1CheckoutSessionsExpirePostRequestFormX2922777c(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsExpirePostRequestFormX2922777c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsExpirePostRequestFormX2922777c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsExpirePostRequestFormX2922777c(block: InlineV1CheckoutSessionsExpirePostRequestFormX2922777c.Builder.() -> Unit): InlineV1CheckoutSessionsExpirePostRequestFormX2922777c = InlineV1CheckoutSessionsExpirePostRequestFormX2922777c.build(block)
