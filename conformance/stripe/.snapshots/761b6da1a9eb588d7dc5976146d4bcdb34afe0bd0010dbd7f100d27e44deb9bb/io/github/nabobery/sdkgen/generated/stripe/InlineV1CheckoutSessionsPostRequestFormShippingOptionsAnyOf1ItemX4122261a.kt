package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/shipping_options/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/shipping_options/anyOf/0/items
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a(
  public val shippingRate: String? = null,
  public val shippingRateData:
      InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataXd411a357? = null,
) {
  public class Builder {
    public var shippingRate: String? = null

    public var shippingRateData:
        InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataXd411a357? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a = InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a(
      shippingRate = shippingRate,
      shippingRateData = shippingRateData,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a(
        shippingRate = rawObject["shipping_rate"]?.let { json.decodeFromJsonElement<String>(it) },
        shippingRateData = rawObject["shipping_rate_data"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormShippingOptionsShippingRateDataXd411a357>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.shippingRate?.let { put("shipping_rate", it) }
        value.shippingRateData?.let { put("shipping_rate_data", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a(block: InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a = InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a.build(block)
