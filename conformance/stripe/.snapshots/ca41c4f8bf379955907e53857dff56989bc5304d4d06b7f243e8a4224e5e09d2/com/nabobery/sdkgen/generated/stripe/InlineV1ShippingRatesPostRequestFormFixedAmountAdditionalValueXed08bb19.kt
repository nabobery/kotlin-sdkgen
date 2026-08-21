package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.Unit
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
 * 1x-www-form-urlencoded/schema/properties/fixed_amount/properties/currency_options/additionalProperties.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates~1{shipping_rate_token}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/fixed_amount/properties/currency_options/additionalProperties
 */
@Serializable(with = InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19.Serializer::class)
public class InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19(
  public val amount: Int? = null,
  public val taxBehavior:
      InlineV1ShippingRatesPostRequestFormFixedAmountTaxBehaviorXa4f95857? = null,
) {
  public class Builder {
    public var amount: Int? = null

    public var taxBehavior: InlineV1ShippingRatesPostRequestFormFixedAmountTaxBehaviorXa4f95857? =
        null

    public fun build(): InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19 = InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19(
      amount = amount,
      taxBehavior = taxBehavior,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19 must be a JSON object")
      return InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1ShippingRatesPostRequestFormFixedAmountTaxBehaviorXa4f95857>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19(block: InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19.Builder.() -> Unit): InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19 = InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19.build(block)
