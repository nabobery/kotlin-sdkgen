package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
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
 * Shipping cost details to be used for the calculation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/shipping_cost
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41.Serializer::class)
public class InlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41(
  public val amount: Int? = null,
  public val shippingRate: String? = null,
  public val taxBehavior:
      InlineV1TaxCalculationsPostRequestFormShippingCostTaxBehaviorX0846c4d6? = null,
  public val taxCode: String? = null,
) {
  public class Builder {
    public var amount: Int? = null

    public var shippingRate: String? = null

    public var taxBehavior: InlineV1TaxCalculationsPostRequestFormShippingCostTaxBehaviorX0846c4d6?
        = null

    public var taxCode: String? = null

    public fun build(): InlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41 = InlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41(
      amount = amount,
      shippingRate = shippingRate,
      taxBehavior = taxBehavior,
      taxCode = taxCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41 must be a JSON object")
      return InlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        shippingRate = rawObject["shipping_rate"]?.let { json.decodeFromJsonElement<String>(it) },
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormShippingCostTaxBehaviorX0846c4d6>(it) },
        taxCode = rawObject["tax_code"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.shippingRate?.let { put("shipping_rate", it) }
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
        value.taxCode?.let { put("tax_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41(block: InlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41.Builder.() -> Unit): InlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41 = InlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41.build(block)
