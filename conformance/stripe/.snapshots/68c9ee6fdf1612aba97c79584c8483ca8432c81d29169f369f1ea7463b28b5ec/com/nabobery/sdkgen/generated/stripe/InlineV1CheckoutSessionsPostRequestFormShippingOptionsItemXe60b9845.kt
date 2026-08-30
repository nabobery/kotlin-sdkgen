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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_options/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_options/items
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845(
  public val shippingRate: String? = null,
  public val shippingRateData:
      InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce? = null,
) {
  public class Builder {
    public var shippingRate: String? = null

    public var shippingRateData:
        InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845 = InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845(
      shippingRate = shippingRate,
      shippingRateData = shippingRateData,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845(
        shippingRate = rawObject["shipping_rate"]?.let { json.decodeFromJsonElement<String>(it) },
        shippingRateData = rawObject["shipping_rate_data"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataX66a756ce>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.shippingRate?.let { put("shipping_rate", it) }
        value.shippingRateData?.let { put("shipping_rate_data", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845(block: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845 = InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845.build(block)
