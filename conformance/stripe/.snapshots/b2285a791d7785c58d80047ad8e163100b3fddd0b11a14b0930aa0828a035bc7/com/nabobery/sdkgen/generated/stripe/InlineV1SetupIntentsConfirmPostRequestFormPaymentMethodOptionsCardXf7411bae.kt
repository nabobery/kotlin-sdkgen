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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/card
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae(
  public val mandateOptions:
      InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5d2b2a00? = null,
  public val network:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX3a46c255? = null,
  public val requestThreeDSecure:
      InlineV1SetupIntentsConfirmPostRequestFormRequestThreeDSecureX8705b60a? = null,
  public val threeDSecure: InlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a? = null,
) {
  public class Builder {
    public var mandateOptions: InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5d2b2a00? =
        null

    public var network:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX3a46c255? = null

    public var requestThreeDSecure:
        InlineV1SetupIntentsConfirmPostRequestFormRequestThreeDSecureX8705b60a? = null

    public var threeDSecure: InlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a? = null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae(
      mandateOptions = mandateOptions,
      network = network,
      requestThreeDSecure = requestThreeDSecure,
      threeDSecure = threeDSecure,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX5d2b2a00>(it) },
        network = rawObject["network"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX3a46c255>(it) },
        requestThreeDSecure = rawObject["request_three_d_secure"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormRequestThreeDSecureX8705b60a>(it) },
        threeDSecure = rawObject["three_d_secure"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormThreeDSecureXc3861f7a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.network?.let { put("network", json.encodeToJsonElement(it)) }
        value.requestThreeDSecure?.let { put("request_three_d_secure", json.encodeToJsonElement(it)) }
        value.threeDSecure?.let { put("three_d_secure", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae(block: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae.build(block)
