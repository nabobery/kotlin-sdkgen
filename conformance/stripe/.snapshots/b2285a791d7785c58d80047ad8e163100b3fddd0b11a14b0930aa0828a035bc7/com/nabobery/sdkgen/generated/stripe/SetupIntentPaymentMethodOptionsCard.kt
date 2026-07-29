package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class SetupIntentPaymentMethodOptionsCardView(
  @SerialName("mandate_options")
  public val mandateOptions:
      InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401a? = null,
  public val network: InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df? = null,
  @SerialName("request_three_d_secure")
  public val requestThreeDSecure:
      InlineSetupIntentPaymentMethodOptionsCardRequestThreeDSecureX9349dbd2? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_card
 */
@Serializable(with = SetupIntentPaymentMethodOptionsCard.Serializer::class)
public class SetupIntentPaymentMethodOptionsCard(
  /**
   * Configuration options for setting up an eMandate for cards issued in India.
   */
  public val mandateOptions:
      InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401a? = null,
  /**
   * Selected network to process this SetupIntent on. Depends on the available networks of the card attached to the
   * setup intent. Can be only set confirm-time.
   */
  public val network: InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df? = null,
  /**
   * We strongly recommend that you rely on our SCA Engine to automatically prompt your customers for authentication
   * based on risk level and [other requirements](https://docs.stripe.com/strong-customer-authentication). However, if
   * you wish to request 3D Secure based on logic from your own fraud engine, provide this option. If not provided, this
   * value defaults to `automatic`. Read our guide on [manually requesting 3D
   * Secure](https://docs.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds) for more information on how
   * this configuration interacts with Radar and our SCA Engine.
   */
  public val requestThreeDSecure:
      InlineSetupIntentPaymentMethodOptionsCardRequestThreeDSecureX9349dbd2? = null,
) {
  public class Builder {
    /**
     * Configuration options for setting up an eMandate for cards issued in India.
     */
    public var mandateOptions: InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401a? =
        null

    /**
     * Selected network to process this SetupIntent on. Depends on the available networks of the card attached to the
     * setup intent. Can be only set confirm-time.
     */
    public var network: InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df? = null

    /**
     * We strongly recommend that you rely on our SCA Engine to automatically prompt your customers for authentication
     * based on risk level and [other requirements](https://docs.stripe.com/strong-customer-authentication). However, if
     * you wish to request 3D Secure based on logic from your own fraud engine, provide this option. If not provided,
     * this value defaults to `automatic`. Read our guide on [manually requesting 3D
     * Secure](https://docs.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds) for more information on
     * how this configuration interacts with Radar and our SCA Engine.
     */
    public var requestThreeDSecure:
        InlineSetupIntentPaymentMethodOptionsCardRequestThreeDSecureX9349dbd2? = null

    public fun build(): SetupIntentPaymentMethodOptionsCard = SetupIntentPaymentMethodOptionsCard(
      mandateOptions = mandateOptions,
      network = network,
      requestThreeDSecure = requestThreeDSecure,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupIntentPaymentMethodOptionsCard = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SetupIntentPaymentMethodOptionsCard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupIntentPaymentMethodOptionsCard {
      val jsonDecoder = decoder.requireJsonDecoder("SetupIntentPaymentMethodOptionsCard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupIntentPaymentMethodOptionsCard must be a JSON object")
      return SetupIntentPaymentMethodOptionsCard(
        mandateOptions = rawObject["mandate_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401a?>(element) },
        network = rawObject["network"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df?>(element) },
        requestThreeDSecure = rawObject["request_three_d_secure"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsCardRequestThreeDSecureX9349dbd2?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupIntentPaymentMethodOptionsCard) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupIntentPaymentMethodOptionsCard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.network?.let { put("network", json.encodeToJsonElement(it)) }
        value.requestThreeDSecure?.let { put("request_three_d_secure", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupIntentPaymentMethodOptionsCard(block: SetupIntentPaymentMethodOptionsCard.Builder.() -> Unit): SetupIntentPaymentMethodOptionsCard = SetupIntentPaymentMethodOptionsCard.build(block)
