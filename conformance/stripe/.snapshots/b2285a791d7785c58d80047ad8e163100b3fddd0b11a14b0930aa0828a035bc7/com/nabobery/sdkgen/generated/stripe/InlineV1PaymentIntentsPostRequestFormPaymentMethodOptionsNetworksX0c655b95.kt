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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/networks.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/networks
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95(
  requested: List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX780dacd3>? = null,
) {
  public val requested:
      List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX780dacd3>? =
      requested?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var requestedValue:
        List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX780dacd3>? = null

    public var requested:
        List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX780dacd3>?
      get() = requestedValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        requestedValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95(
      requested = requested,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95(
        requested = rawObject["requested"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX780dacd3>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNetworksX0c655b95.build(block)
