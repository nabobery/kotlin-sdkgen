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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/us_bank_account/properties/networks.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/us_bank_account/properties/networks
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686(
  requested: List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemXfb64e29a>? = null,
) {
  public val requested: List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemXfb64e29a>?
      = requested?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var requestedValue:
        List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemXfb64e29a>? = null

    public var requested:
        List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemXfb64e29a>?
      get() = requestedValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        requestedValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686(
      requested = requested,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686(
        requested = rawObject["requested"]?.let { json.decodeFromJsonElement<List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemXfb64e29a>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686.build(block)
