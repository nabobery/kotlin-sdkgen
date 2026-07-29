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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_unlinked_refund/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_unlinked_refund/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93.Serializer::class)
public class InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93(
  /**
   * The total amount to attempt to refund. This amount is in the provided currency, or defaults to the cards currency,
   * and in the [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal).
   */
  public val amount: Int,
  /**
   * Card associated with this unlinked refund transaction.
   */
  public val card: String,
  /**
   * The currency of the unlinked refund. If not provided, defaults to the currency of the card. Three-letter [ISO
   * currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported
   * currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  expand: List<String>? = null,
  /**
   * Details about the seller (grocery store, e-commerce website, etc.) where the card authorization happened.
   */
  public val merchantData:
      InlineV1TestHelpersIssuingc1dfPostRequestFormMerchantDataXb587c735? = null,
  /**
   * Additional purchase information that is optionally provided by the merchant.
   */
  public val purchaseDetails:
      InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var cardValue: String? = null

    public var card: String
      get() = requireNotNull(cardValue) { "card is required" }
      set(`value`) {
        cardValue = value
      }

    /**
     * The currency of the unlinked refund. If not provided, defaults to the currency of the card. Three-letter [ISO
     * currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported
     * currency](https://stripe.com/docs/currencies).
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

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
     * Details about the seller (grocery store, e-commerce website, etc.) where the card authorization happened.
     */
    public var merchantData: InlineV1TestHelpersIssuingc1dfPostRequestFormMerchantDataXb587c735? =
        null

    /**
     * Additional purchase information that is optionally provided by the merchant.
     */
    public var purchaseDetails:
        InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd? = null

    public fun build(): InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93 {
      check(amountValue != null) { "amount is required" }
      check(cardValue != null) { "card is required" }
      return InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93(
        amount = amount,
        card = card,
        currency = currency,
        expand = expand,
        merchantData = merchantData,
        purchaseDetails = purchaseDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93 must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val card = json.decodeRequired<String>(rawObject, "card")
      return InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93(
        amount = amount,
        card = card,
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        merchantData = rawObject["merchant_data"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingc1dfPostRequestFormMerchantDataXb587c735>(it) },
        purchaseDetails = rawObject["purchase_details"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("card", value.card)
        value.currency?.let { put("currency", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.merchantData?.let { put("merchant_data", json.encodeToJsonElement(it)) }
        value.purchaseDetails?.let { put("purchase_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93(block: InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93.Builder.() -> Unit): InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93 = InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
