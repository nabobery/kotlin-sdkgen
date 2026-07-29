package com.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_cost/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_cost/anyOf/0
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed.Serializer::class)
public class InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed(
  public val shippingRate: String? = null,
  public val shippingRateData:
      InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199? = null,
) {
  public class Builder {
    public var shippingRate: String? = null

    public var shippingRateData:
        InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199? = null

    public fun build(): InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed = InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed(
      shippingRate = shippingRate,
      shippingRateData = shippingRateData,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed must be a JSON object")
      return InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed(
        shippingRate = rawObject["shipping_rate"]?.let { json.decodeFromJsonElement<String>(it) },
        shippingRateData = rawObject["shipping_rate_data"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.shippingRate?.let { put("shipping_rate", it) }
        value.shippingRateData?.let { put("shipping_rate_data", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed(block: InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed.Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed = InlineV1InvoicesPostRequestFormShippingCostAnyOf1Xcc788bed.build(block)
