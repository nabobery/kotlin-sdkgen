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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/shipping_options/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/shipping_options/items
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6(
  public val shippingRate: String? = null,
) {
  public class Builder {
    public var shippingRate: String? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6 = InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6(
      shippingRate = shippingRate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6 must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6(
        shippingRate = rawObject["shipping_rate"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.shippingRate?.let { put("shipping_rate", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6(block: InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6 = InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6.build(block)
