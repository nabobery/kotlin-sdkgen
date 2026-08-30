package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/card/properties/networks.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/card/properties/networks
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11(
  public val preferred: InlineV1PaymentMethodsPostRequestFormCardNetworksPreferredXd875bbe4? = null,
) {
  public class Builder {
    public var preferred: InlineV1PaymentMethodsPostRequestFormCardNetworksPreferredXd875bbe4? =
        null

    public fun build(): InlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11 = InlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11(
      preferred = preferred,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11 must be a JSON object")
      return InlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11(
        preferred = rawObject["preferred"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormCardNetworksPreferredXd875bbe4>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.preferred?.let { put("preferred", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11(block: InlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11 = InlineV1PaymentMethodsPostRequestFormCardNetworksX8c7ffc11.build(block)
