package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1transfers~1{id}~1reversals/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1transfers~1{id}~1reversals/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema
 */
@Serializable(with = InlineV1TransfersReversalsPostRequestFormX5a6bb128.Serializer::class)
public class InlineV1TransfersReversalsPostRequestFormX5a6bb128(
  /**
   * A positive integer in cents (or local equivalent) representing how much of this transfer to reverse. Can only
   * reverse up to the unreversed amount remaining of the transfer. Partial transfer reversals are only allowed for
   * transfers to Stripe Accounts. Defaults to the entire transfer amount.
   */
  public val amount: Int? = null,
  /**
   * An arbitrary string which you can attach to a reversal object. This will be unset if you POST an empty value.
   */
  public val description: String? = null,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8? = null,
  /**
   * Boolean indicating whether the application fee should be refunded when reversing this transfer. If a full transfer
   * reversal is given, the full application fee will be refunded. Otherwise, the application fee will be refunded with
   * an amount proportional to the amount of the transfer reversed.
   */
  public val refundApplicationFee: Boolean? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * A positive integer in cents (or local equivalent) representing how much of this transfer to reverse. Can only
     * reverse up to the unreversed amount remaining of the transfer. Partial transfer reversals are only allowed for
     * transfers to Stripe Accounts. Defaults to the entire transfer amount.
     */
    public var amount: Int? = null

    /**
     * An arbitrary string which you can attach to a reversal object. This will be unset if you POST an empty value.
     */
    public var description: String? = null

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
    public var metadata: InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8? = null

    /**
     * Boolean indicating whether the application fee should be refunded when reversing this transfer. If a full
     * transfer reversal is given, the full application fee will be refunded. Otherwise, the application fee will be
     * refunded with an amount proportional to the amount of the transfer reversed.
     */
    public var refundApplicationFee: Boolean? = null

    public fun build(): InlineV1TransfersReversalsPostRequestFormX5a6bb128 = InlineV1TransfersReversalsPostRequestFormX5a6bb128(
      amount = amount,
      description = description,
      expand = expand,
      metadata = metadata,
      refundApplicationFee = refundApplicationFee,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TransfersReversalsPostRequestFormX5a6bb128 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TransfersReversalsPostRequestFormX5a6bb128> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TransfersReversalsPostRequestFormX5a6bb128 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TransfersReversalsPostRequestFormX5a6bb128")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TransfersReversalsPostRequestFormX5a6bb128 must be a JSON object")
      return InlineV1TransfersReversalsPostRequestFormX5a6bb128(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8>(it) },
        refundApplicationFee = rawObject["refund_application_fee"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TransfersReversalsPostRequestFormX5a6bb128) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TransfersReversalsPostRequestFormX5a6bb128")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.refundApplicationFee?.let { put("refund_application_fee", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TransfersReversalsPostRequestFormX5a6bb128(block: InlineV1TransfersReversalsPostRequestFormX5a6bb128.Builder.() -> Unit): InlineV1TransfersReversalsPostRequestFormX5a6bb128 = InlineV1TransfersReversalsPostRequestFormX5a6bb128.build(block)
