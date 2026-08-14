package io.github.nabobery.sdkgen.generated.stripe

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
 * Controls what fields on Customer can be updated by the Checkout Session. Can only be provided when `customer` is
 * provided.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/customer_update
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0(
  public val address: InlineV1CheckoutSessionsPostRequestFormCustomerUpdateAddressXc6dfceb6? = null,
  public val name: InlineV1CheckoutSessionsPostRequestFormCustomerUpdateNameXe5eb429f? = null,
  public val shipping:
      InlineV1CheckoutSessionsPostRequestFormCustomerUpdateShippingXc58a18ab? = null,
) {
  public class Builder {
    public var address: InlineV1CheckoutSessionsPostRequestFormCustomerUpdateAddressXc6dfceb6? =
        null

    public var name: InlineV1CheckoutSessionsPostRequestFormCustomerUpdateNameXe5eb429f? = null

    public var shipping: InlineV1CheckoutSessionsPostRequestFormCustomerUpdateShippingXc58a18ab? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0 = InlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0(
      address = address,
      name = name,
      shipping = shipping,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomerUpdateAddressXc6dfceb6>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomerUpdateNameXe5eb429f>(it) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomerUpdateShippingXc58a18ab>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", json.encodeToJsonElement(it)) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0(block: InlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0 = InlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0.build(block)
