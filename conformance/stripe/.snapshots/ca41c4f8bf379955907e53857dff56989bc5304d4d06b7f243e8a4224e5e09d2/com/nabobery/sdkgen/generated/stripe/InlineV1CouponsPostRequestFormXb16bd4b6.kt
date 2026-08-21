package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1coupons~1{coupon}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1coupons~1{coupon}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema
 */
@Serializable(with = InlineV1CouponsPostRequestFormXb16bd4b6.Serializer::class)
public class InlineV1CouponsPostRequestFormXb16bd4b6(
  currencyOptions: Map<String, InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3>? = null,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1CouponsPostRequestFormMetadataX75f28b84? = null,
  /**
   * Name of the coupon displayed to customers on, for instance invoices, or receipts. By default the `id` is shown if
   * `name` is not set.
   */
  public val name: String? = null,
) {
  /**
   * Coupons defined in each available currency option (only supported if the coupon is amount-based). Each key must be
   * a three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html) and a [supported
   * currency](https://stripe.com/docs/currencies).
   */
  public val currencyOptions:
      Map<String, InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3>? =
      currencyOptions?.let { collection0 -> collection0.toMap() }

  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var currencyOptionsValue:
        Map<String, InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3>? = null

    /**
     * Coupons defined in each available currency option (only supported if the coupon is amount-based). Each key must
     * be a three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html) and a [supported
     * currency](https://stripe.com/docs/currencies).
     */
    public var currencyOptions:
        Map<String, InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3>?
      get() = currencyOptionsValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        currencyOptionsValue = value?.let { collection0 -> collection0.toMap() }
      }

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
    public var metadata: InlineV1CouponsPostRequestFormMetadataX75f28b84? = null

    /**
     * Name of the coupon displayed to customers on, for instance invoices, or receipts. By default the `id` is shown if
     * `name` is not set.
     */
    public var name: String? = null

    public fun build(): InlineV1CouponsPostRequestFormXb16bd4b6 = InlineV1CouponsPostRequestFormXb16bd4b6(
      currencyOptions = currencyOptions,
      expand = expand,
      metadata = metadata,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CouponsPostRequestFormXb16bd4b6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CouponsPostRequestFormXb16bd4b6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CouponsPostRequestFormXb16bd4b6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CouponsPostRequestFormXb16bd4b6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CouponsPostRequestFormXb16bd4b6 must be a JSON object")
      return InlineV1CouponsPostRequestFormXb16bd4b6(
        currencyOptions = rawObject["currency_options"]?.let { json.decodeFromJsonElement<Map<String, InlineV1CouponsPostRequestFormCurrencyOptionsAdditionalValueXe615f0e3>>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1CouponsPostRequestFormMetadataX75f28b84>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CouponsPostRequestFormXb16bd4b6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CouponsPostRequestFormXb16bd4b6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.currencyOptions?.let { put("currency_options", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CouponsPostRequestFormXb16bd4b6(block: InlineV1CouponsPostRequestFormXb16bd4b6.Builder.() -> Unit): InlineV1CouponsPostRequestFormXb16bd4b6 = InlineV1CouponsPostRequestFormXb16bd4b6.build(block)
