package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * sdkgen://source/openapi.json#/paths/~1v1~1coupons/post/requestBody/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1coupons/post/requestBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1CouponsPostRequestFormX8a95aa20.Serializer::class)
public class InlineV1CouponsPostRequestFormX8a95aa20(
  /**
   * A positive integer representing the amount to subtract from an invoice total (required if `percent_off` is not
   * passed).
   */
  public val amountOff: Int? = null,
  /**
   * A hash containing directions for what this Coupon will apply discounts to.
   */
  public val appliesTo: InlineV1CouponsPostRequestFormAppliesToXceb8e268? = null,
  /**
   * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) of the `amount_off` parameter
   * (required if `amount_off` is passed).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  currencyOptions: Map<String, InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505>? = null,
  /**
   * Specifies how long the discount will be in effect if used on a subscription. Defaults to `once`.
   */
  public val duration: InlineV1CouponsPostRequestFormDurationX79d6e553? = null,
  /**
   * Required only if `duration` is `repeating`, in which case it must be a positive integer that specifies the number
   * of months the discount will be in effect.
   */
  public val durationInMonths: Int? = null,
  expand: List<String>? = null,
  /**
   * Unique string of your choice that will be used to identify this coupon when applying it to a customer. If you don't
   * want to specify a particular code, you can leave the ID blank and we'll generate a random code for you.
   */
  public val id: String? = null,
  /**
   * A positive integer specifying the number of times the coupon can be redeemed before it's no longer valid. For
   * example, you might have a 50% off coupon that the first 20 readers of your blog can use.
   */
  public val maxRedemptions: Int? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1CouponsPostRequestFormMetadataX20a6c349? = null,
  /**
   * Name of the coupon displayed to customers on, for instance invoices, or receipts. By default the `id` is shown if
   * `name` is not set.
   */
  public val name: String? = null,
  /**
   * A positive float larger than 0, and smaller or equal to 100, that represents the discount the coupon will apply
   * (required if `amount_off` is not passed).
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val percentOff: Double? = null,
  /**
   * Unix timestamp specifying the last time at which the coupon can be redeemed (cannot be set to more than 5 years in
   * the future). After the redeem_by date, the coupon can no longer be applied to new customers.
   */
  public val redeemBy: Int? = null,
) {
  /**
   * Coupons defined in each available currency option (only supported if `amount_off` is passed). Each key must be a
   * three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html) and a [supported
   * currency](https://stripe.com/docs/currencies).
   */
  public val currencyOptions:
      Map<String, InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505>? =
      currencyOptions?.let { collection0 -> collection0.toMap() }

  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * A positive integer representing the amount to subtract from an invoice total (required if `percent_off` is not
     * passed).
     */
    public var amountOff: Int? = null

    /**
     * A hash containing directions for what this Coupon will apply discounts to.
     */
    public var appliesTo: InlineV1CouponsPostRequestFormAppliesToXceb8e268? = null

    /**
     * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) of the `amount_off` parameter
     * (required if `amount_off` is passed).
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    private var currencyOptionsValue:
        Map<String, InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505>? = null

    /**
     * Coupons defined in each available currency option (only supported if `amount_off` is passed). Each key must be a
     * three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html) and a [supported
     * currency](https://stripe.com/docs/currencies).
     */
    public var currencyOptions:
        Map<String, InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505>?
      get() = currencyOptionsValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        currencyOptionsValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Specifies how long the discount will be in effect if used on a subscription. Defaults to `once`.
     */
    public var duration: InlineV1CouponsPostRequestFormDurationX79d6e553? = null

    /**
     * Required only if `duration` is `repeating`, in which case it must be a positive integer that specifies the number
     * of months the discount will be in effect.
     */
    public var durationInMonths: Int? = null

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
     * Unique string of your choice that will be used to identify this coupon when applying it to a customer. If you
     * don't want to specify a particular code, you can leave the ID blank and we'll generate a random code for you.
     */
    public var id: String? = null

    /**
     * A positive integer specifying the number of times the coupon can be redeemed before it's no longer valid. For
     * example, you might have a 50% off coupon that the first 20 readers of your blog can use.
     */
    public var maxRedemptions: Int? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1CouponsPostRequestFormMetadataX20a6c349? = null

    /**
     * Name of the coupon displayed to customers on, for instance invoices, or receipts. By default the `id` is shown if
     * `name` is not set.
     */
    public var name: String? = null

    /**
     * A positive float larger than 0, and smaller or equal to 100, that represents the discount the coupon will apply
     * (required if `amount_off` is not passed).
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var percentOff: Double? = null

    /**
     * Unix timestamp specifying the last time at which the coupon can be redeemed (cannot be set to more than 5 years
     * in the future). After the redeem_by date, the coupon can no longer be applied to new customers.
     */
    public var redeemBy: Int? = null

    public fun build(): InlineV1CouponsPostRequestFormX8a95aa20 = InlineV1CouponsPostRequestFormX8a95aa20(
      amountOff = amountOff,
      appliesTo = appliesTo,
      currency = currency,
      currencyOptions = currencyOptions,
      duration = duration,
      durationInMonths = durationInMonths,
      expand = expand,
      id = id,
      maxRedemptions = maxRedemptions,
      metadata = metadata,
      name = name,
      percentOff = percentOff,
      redeemBy = redeemBy,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CouponsPostRequestFormX8a95aa20 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CouponsPostRequestFormX8a95aa20> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CouponsPostRequestFormX8a95aa20 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CouponsPostRequestFormX8a95aa20")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CouponsPostRequestFormX8a95aa20 must be a JSON object")
      return InlineV1CouponsPostRequestFormX8a95aa20(
        amountOff = rawObject["amount_off"]?.let { json.decodeFromJsonElement<Int>(it) },
        appliesTo = rawObject["applies_to"]?.let { json.decodeFromJsonElement<InlineV1CouponsPostRequestFormAppliesToXceb8e268>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        currencyOptions = rawObject["currency_options"]?.let { json.decodeFromJsonElement<Map<String, InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueX719f8505>>(it) },
        duration = rawObject["duration"]?.let { json.decodeFromJsonElement<InlineV1CouponsPostRequestFormDurationX79d6e553>(it) },
        durationInMonths = rawObject["duration_in_months"]?.let { json.decodeFromJsonElement<Int>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        maxRedemptions = rawObject["max_redemptions"]?.let { json.decodeFromJsonElement<Int>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1CouponsPostRequestFormMetadataX20a6c349>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        percentOff = rawObject["percent_off"]?.let { json.decodeFromJsonElement<Double>(it) },
        redeemBy = rawObject["redeem_by"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CouponsPostRequestFormX8a95aa20) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CouponsPostRequestFormX8a95aa20")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountOff?.let { put("amount_off", json.encodeToJsonElement(it)) }
        value.appliesTo?.let { put("applies_to", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.currencyOptions?.let { put("currency_options", json.encodeToJsonElement(it)) }
        value.duration?.let { put("duration", json.encodeToJsonElement(it)) }
        value.durationInMonths?.let { put("duration_in_months", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
        value.maxRedemptions?.let { put("max_redemptions", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.percentOff?.let { put("percent_off", json.encodeToJsonElement(it)) }
        value.redeemBy?.let { put("redeem_by", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CouponsPostRequestFormX8a95aa20(block: InlineV1CouponsPostRequestFormX8a95aa20.Builder.() -> Unit): InlineV1CouponsPostRequestFormX8a95aa20 = InlineV1CouponsPostRequestFormX8a95aa20.build(block)
