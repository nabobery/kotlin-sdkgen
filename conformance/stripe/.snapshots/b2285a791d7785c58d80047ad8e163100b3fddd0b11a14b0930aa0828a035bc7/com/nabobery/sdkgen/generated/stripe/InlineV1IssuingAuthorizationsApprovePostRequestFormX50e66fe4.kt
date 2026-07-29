package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1authorizations~1{authorization}~1approve/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1authorizations~1{authorization}~1approve/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4.Serializer::class)
public class InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4(
  /**
   * If the authorization's `pending_request.is_amount_controllable` property is `true`, you may provide this value to
   * control how much to hold for the authorization. Must be positive (use
   * [`decline`](https://docs.stripe.com/api/issuing/authorizations/decline) to decline an authorization request).
   */
  public val amount: Int? = null,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bf? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * If the authorization's `pending_request.is_amount_controllable` property is `true`, you may provide this value to
     * control how much to hold for the authorization. Must be positive (use
     * [`decline`](https://docs.stripe.com/api/issuing/authorizations/decline) to decline an authorization request).
     */
    public var amount: Int? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bf? =
        null

    public fun build(): InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4 = InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4(
      amount = amount,
      expand = expand,
      metadata = metadata,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4 must be a JSON object")
      return InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bf>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4(block: InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4.Builder.() -> Unit): InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4 = InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4.build(block)
