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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/networks.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/networks
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6(
  requested: List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8728f198>? = null,
) {
  public val requested:
      List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8728f198>? =
      requested?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var requestedValue:
        List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8728f198>? = null

    public var requested:
        List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8728f198>?
      get() = requestedValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        requestedValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6 = InlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6(
      requested = requested,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6(
        requested = rawObject["requested"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8728f198>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6(block: InlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6 = InlineV1PaymentIntentsConfirmPostRequestFormNetworksX2d30cfc6.build(block)
