package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/fixed_amount/properties/currency_options/additionalProperties.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/fixed_amount/properties/currency_options/additionalProperties
 */
@Serializable(with = InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9.Serializer::class)
public class InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9(
  public val amount: Int,
  public val taxBehavior:
      InlineV1ShippingRatesPostRequestFormFixedAmountTaxBehaviorX3c1e2dbd? = null,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    public var taxBehavior: InlineV1ShippingRatesPostRequestFormFixedAmountTaxBehaviorX3c1e2dbd? =
        null

    public fun build(): InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9 {
      check(amountValue != null) { "amount is required" }
      return InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9(
        amount = amount,
        taxBehavior = taxBehavior,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9 must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      return InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9(
        amount = amount,
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1ShippingRatesPostRequestFormFixedAmountTaxBehaviorX3c1e2dbd>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9(block: InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9.Builder.() -> Unit): InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9 = InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
