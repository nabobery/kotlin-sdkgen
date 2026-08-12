package com.nabobery.sdkgen.generated.stripe

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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_credit_grants_resource_scope
 */
@Serializable(with = BillingCreditGrantsResourceScope.Serializer::class)
public class BillingCreditGrantsResourceScope(
  /**
   * The price type that credit grants can apply to. We currently only support the `metered` price type. This refers to
   * prices that have a [Billing Meter](https://docs.stripe.com/api/billing/meter) attached to them. Cannot be used in
   * combination with `prices`.
   */
  public val priceType: InlineBillingCreditGrantsResourceScopePriceTypeX8ec94b64? = null,
  prices: List<BillingCreditGrantsResourceApplicablePrice>? = null,
) {
  /**
   * The prices that credit grants can apply to. We currently only support `metered` prices. This refers to prices that
   * have a [Billing Meter](https://docs.stripe.com/api/billing/meter) attached to them. Cannot be used in combination
   * with `price_type`.
   */
  public val prices: List<BillingCreditGrantsResourceApplicablePrice>? =
      prices?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The price type that credit grants can apply to. We currently only support the `metered` price type. This refers
     * to prices that have a [Billing Meter](https://docs.stripe.com/api/billing/meter) attached to them. Cannot be used
     * in combination with `prices`.
     */
    public var priceType: InlineBillingCreditGrantsResourceScopePriceTypeX8ec94b64? = null

    private var pricesValue: List<BillingCreditGrantsResourceApplicablePrice>? = null

    /**
     * The prices that credit grants can apply to. We currently only support `metered` prices. This refers to prices
     * that have a [Billing Meter](https://docs.stripe.com/api/billing/meter) attached to them. Cannot be used in
     * combination with `price_type`.
     */
    public var prices: List<BillingCreditGrantsResourceApplicablePrice>?
      get() = pricesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        pricesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): BillingCreditGrantsResourceScope = BillingCreditGrantsResourceScope(
      priceType = priceType,
      prices = prices,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingCreditGrantsResourceScope = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BillingCreditGrantsResourceScope> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingCreditGrantsResourceScope {
      val jsonDecoder = decoder.requireJsonDecoder("BillingCreditGrantsResourceScope")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingCreditGrantsResourceScope must be a JSON object")
      return BillingCreditGrantsResourceScope(
        priceType = rawObject["price_type"]?.let { json.decodeFromJsonElement<InlineBillingCreditGrantsResourceScopePriceTypeX8ec94b64>(it) },
        prices = rawObject["prices"]?.let { json.decodeFromJsonElement<List<BillingCreditGrantsResourceApplicablePrice>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingCreditGrantsResourceScope) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingCreditGrantsResourceScope")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.priceType?.let { put("price_type", json.encodeToJsonElement(it)) }
        value.prices?.let { put("prices", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingCreditGrantsResourceScope(block: BillingCreditGrantsResourceScope.Builder.() -> Unit): BillingCreditGrantsResourceScope = BillingCreditGrantsResourceScope.build(block)
