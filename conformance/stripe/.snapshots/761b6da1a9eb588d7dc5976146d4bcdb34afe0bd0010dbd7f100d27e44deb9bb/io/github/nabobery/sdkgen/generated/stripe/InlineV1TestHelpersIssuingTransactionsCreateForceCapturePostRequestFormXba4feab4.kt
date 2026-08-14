package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4.Serializer::class)
public class InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4(
  /**
   * The total amount to attempt to capture. This amount is in the provided currency, or defaults to the cards currency,
   * and in the [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal).
   */
  public val amount: Int,
  /**
   * Card associated with this transaction.
   */
  public val card: String,
  /**
   * The currency of the capture. If not provided, defaults to the currency of the card. Three-letter [ISO currency
   * code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported
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
      InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57? = null,
  /**
   * Additional purchase information that is optionally provided by the merchant.
   */
  public val purchaseDetails:
      InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d? = null,
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
     * The currency of the capture. If not provided, defaults to the currency of the card. Three-letter [ISO currency
     * code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported
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
    public var merchantData: InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57? =
        null

    /**
     * Additional purchase information that is optionally provided by the merchant.
     */
    public var purchaseDetails:
        InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d? = null

    public fun build(): InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4 {
      check(amountValue != null) { "amount is required" }
      check(cardValue != null) { "card is required" }
      return InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4(
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
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4 must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val card = json.decodeRequired<String>(rawObject, "card")
      return InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4(
        amount = amount,
        card = card,
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        merchantData = rawObject["merchant_data"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57>(it) },
        purchaseDetails = rawObject["purchase_details"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4")
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

public fun inlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4(block: InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4.Builder.() -> Unit): InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4 = InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
