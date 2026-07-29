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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1{transaction}~1refund/post/requestBody
 * /content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1{transaction}~1refund/post/requestBody
 * /content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a.Serializer::class)
public class InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a(
  expand: List<String>? = null,
  /**
   * The total amount to attempt to refund. This amount is in the provided currency, or defaults to the cards currency,
   * and in the [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal).
   */
  public val refundAmount: Int? = null,
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

    /**
     * The total amount to attempt to refund. This amount is in the provided currency, or defaults to the cards
     * currency, and in the [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal).
     */
    public var refundAmount: Int? = null

    public fun build(): InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a = InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a(
      expand = expand,
      refundAmount = refundAmount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a must be a JSON object")
      return InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        refundAmount = rawObject["refund_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.refundAmount?.let { put("refund_amount", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a(block: InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a.Builder.() -> Unit): InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a = InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a.build(block)
