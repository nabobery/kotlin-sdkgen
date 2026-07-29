package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1prices~1{price}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices~1{price}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema
 */
@Serializable(with = InlineV1PricesPostRequestFormXe33007fa.Serializer::class)
public class InlineV1PricesPostRequestFormXe33007fa(
  /**
   * Whether the price can be used for new purchases. Defaults to `true`.
   */
  public val active: Boolean? = null,
  /**
   * Prices defined in each available currency option. Each key must be a three-letter [ISO currency
   * code](https://www.iso.org/iso-4217-currency-codes.html) and a [supported
   * currency](https://stripe.com/docs/currencies).
   */
  public val currencyOptions: InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54? = null,
  expand: List<String>? = null,
  /**
   * A lookup key used to retrieve prices dynamically from a static string. This may be up to 200 characters.
   */
  public val lookupKey: String? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1PricesPostRequestFormMetadataXea1f6a49? = null,
  /**
   * A brief description of the price, hidden from customers.
   */
  public val nickname: String? = null,
  /**
   * Only required if a [default tax
   * behavior](https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(r
   * ecommended)) was not provided in the Stripe Tax settings. Specifies whether the price is considered inclusive of
   * taxes or exclusive of taxes. One of `inclusive`, `exclusive`, or `unspecified`. Once specified as either
   * `inclusive` or `exclusive`, it cannot be changed.
   */
  public val taxBehavior: InlineV1PricesPostRequestFormTaxBehaviorX568b489a? = null,
  /**
   * If set to true, will atomically remove the lookup key from the existing price, and assign it to this price.
   */
  public val transferLookupKey: Boolean? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Whether the price can be used for new purchases. Defaults to `true`.
     */
    public var active: Boolean? = null

    /**
     * Prices defined in each available currency option. Each key must be a three-letter [ISO currency
     * code](https://www.iso.org/iso-4217-currency-codes.html) and a [supported
     * currency](https://stripe.com/docs/currencies).
     */
    public var currencyOptions: InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54? = null

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
     * A lookup key used to retrieve prices dynamically from a static string. This may be up to 200 characters.
     */
    public var lookupKey: String? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1PricesPostRequestFormMetadataXea1f6a49? = null

    /**
     * A brief description of the price, hidden from customers.
     */
    public var nickname: String? = null

    /**
     * Only required if a [default tax
     * behavior](https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-
     * (recommended)) was not provided in the Stripe Tax settings. Specifies whether the price is considered inclusive
     * of taxes or exclusive of taxes. One of `inclusive`, `exclusive`, or `unspecified`. Once specified as either
     * `inclusive` or `exclusive`, it cannot be changed.
     */
    public var taxBehavior: InlineV1PricesPostRequestFormTaxBehaviorX568b489a? = null

    /**
     * If set to true, will atomically remove the lookup key from the existing price, and assign it to this price.
     */
    public var transferLookupKey: Boolean? = null

    public fun build(): InlineV1PricesPostRequestFormXe33007fa = InlineV1PricesPostRequestFormXe33007fa(
      active = active,
      currencyOptions = currencyOptions,
      expand = expand,
      lookupKey = lookupKey,
      metadata = metadata,
      nickname = nickname,
      taxBehavior = taxBehavior,
      transferLookupKey = transferLookupKey,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PricesPostRequestFormXe33007fa = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PricesPostRequestFormXe33007fa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormXe33007fa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PricesPostRequestFormXe33007fa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PricesPostRequestFormXe33007fa must be a JSON object")
      return InlineV1PricesPostRequestFormXe33007fa(
        active = rawObject["active"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        currencyOptions = rawObject["currency_options"]?.let { json.decodeFromJsonElement<InlineV1PricesPostRequestFormCurrencyOptionsX22fe6a54>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        lookupKey = rawObject["lookup_key"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1PricesPostRequestFormMetadataXea1f6a49>(it) },
        nickname = rawObject["nickname"]?.let { json.decodeFromJsonElement<String>(it) },
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1PricesPostRequestFormTaxBehaviorX568b489a>(it) },
        transferLookupKey = rawObject["transfer_lookup_key"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesPostRequestFormXe33007fa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PricesPostRequestFormXe33007fa")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.active?.let { put("active", json.encodeToJsonElement(it)) }
        value.currencyOptions?.let { put("currency_options", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.lookupKey?.let { put("lookup_key", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.nickname?.let { put("nickname", it) }
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
        value.transferLookupKey?.let { put("transfer_lookup_key", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PricesPostRequestFormXe33007fa(block: InlineV1PricesPostRequestFormXe33007fa.Builder.() -> Unit): InlineV1PricesPostRequestFormXe33007fa = InlineV1PricesPostRequestFormXe33007fa.build(block)
