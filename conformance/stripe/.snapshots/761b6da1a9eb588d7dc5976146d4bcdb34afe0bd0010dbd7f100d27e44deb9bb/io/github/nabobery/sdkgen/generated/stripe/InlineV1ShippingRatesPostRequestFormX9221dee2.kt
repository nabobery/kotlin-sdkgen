package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates~1{shipping_rate_token}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates~1{shipping_rate_token}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1ShippingRatesPostRequestFormX9221dee2.Serializer::class)
public class InlineV1ShippingRatesPostRequestFormX9221dee2(
  /**
   * Whether the shipping rate can be used for new purchases. Defaults to `true`.
   */
  public val active: Boolean? = null,
  expand: List<String>? = null,
  /**
   * Describes a fixed amount to charge for shipping. Must be present if type is `fixed_amount`.
   */
  public val fixedAmount: InlineV1ShippingRatesPostRequestFormFixedAmountX419a059a? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1ShippingRatesPostRequestFormMetadataX4f9f06a5? = null,
  /**
   * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of `inclusive`, `exclusive`,
   * or `unspecified`.
   */
  public val taxBehavior: InlineV1ShippingRatesPostRequestFormTaxBehaviorX733e1857? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Whether the shipping rate can be used for new purchases. Defaults to `true`.
     */
    public var active: Boolean? = null

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
     * Describes a fixed amount to charge for shipping. Must be present if type is `fixed_amount`.
     */
    public var fixedAmount: InlineV1ShippingRatesPostRequestFormFixedAmountX419a059a? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1ShippingRatesPostRequestFormMetadataX4f9f06a5? = null

    /**
     * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of `inclusive`,
     * `exclusive`, or `unspecified`.
     */
    public var taxBehavior: InlineV1ShippingRatesPostRequestFormTaxBehaviorX733e1857? = null

    public fun build(): InlineV1ShippingRatesPostRequestFormX9221dee2 = InlineV1ShippingRatesPostRequestFormX9221dee2(
      active = active,
      expand = expand,
      fixedAmount = fixedAmount,
      metadata = metadata,
      taxBehavior = taxBehavior,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ShippingRatesPostRequestFormX9221dee2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ShippingRatesPostRequestFormX9221dee2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ShippingRatesPostRequestFormX9221dee2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ShippingRatesPostRequestFormX9221dee2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ShippingRatesPostRequestFormX9221dee2 must be a JSON object")
      return InlineV1ShippingRatesPostRequestFormX9221dee2(
        active = rawObject["active"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        fixedAmount = rawObject["fixed_amount"]?.let { json.decodeFromJsonElement<InlineV1ShippingRatesPostRequestFormFixedAmountX419a059a>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1ShippingRatesPostRequestFormMetadataX4f9f06a5>(it) },
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1ShippingRatesPostRequestFormTaxBehaviorX733e1857>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ShippingRatesPostRequestFormX9221dee2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ShippingRatesPostRequestFormX9221dee2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.active?.let { put("active", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.fixedAmount?.let { put("fixed_amount", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ShippingRatesPostRequestFormX9221dee2(block: InlineV1ShippingRatesPostRequestFormX9221dee2.Builder.() -> Unit): InlineV1ShippingRatesPostRequestFormX9221dee2 = InlineV1ShippingRatesPostRequestFormX9221dee2.build(block)
