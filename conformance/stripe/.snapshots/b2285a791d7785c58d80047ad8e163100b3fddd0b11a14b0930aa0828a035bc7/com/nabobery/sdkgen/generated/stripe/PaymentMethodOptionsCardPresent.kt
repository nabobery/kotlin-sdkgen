package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
public data class PaymentMethodOptionsCardPresentView(
  @SerialName("capture_method")
  public val captureMethod: InlinePaymentMethodOptionsCardPresentCaptureMethodXd1871575? = null,
  @SerialName("request_extended_authorization")
  public val requestExtendedAuthorization: Boolean? = null,
  @SerialName("request_incremental_authorization_support")
  public val requestIncrementalAuthorizationSupport: Boolean? = null,
  public val routing: PaymentMethodOptionsCardPresentRouting? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_card_present
 */
@Serializable(with = PaymentMethodOptionsCardPresent.Serializer::class)
public class PaymentMethodOptionsCardPresent(
  /**
   * Controls when the funds will be captured from the customer's account.
   */
  public val captureMethod: InlinePaymentMethodOptionsCardPresentCaptureMethodXd1871575? = null,
  /**
   * Request ability to capture this payment beyond the standard [authorization validity
   * window](https://docs.stripe.com/terminal/features/extended-authorizations#authorization-validity)
   */
  public val requestExtendedAuthorization: Boolean? = null,
  /**
   * Request ability to [increment](https://docs.stripe.com/terminal/features/incremental-authorizations) this
   * PaymentIntent if the combination of MCC and card brand is eligible. Check
   * [incremental_authorization_supported](https://docs.stripe.com/api/charges/object#charge_object-payment_method_detai
   * ls-card_present-incremental_authorization_supported) in the
   * [Confirm](https://docs.stripe.com/api/payment_intents/confirm) response to verify support.
   */
  public val requestIncrementalAuthorizationSupport: Boolean? = null,
  public val routing: PaymentMethodOptionsCardPresentRouting? = null,
) {
  public class Builder {
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public var captureMethod: InlinePaymentMethodOptionsCardPresentCaptureMethodXd1871575? = null

    /**
     * Request ability to capture this payment beyond the standard [authorization validity
     * window](https://docs.stripe.com/terminal/features/extended-authorizations#authorization-validity)
     */
    public var requestExtendedAuthorization: Boolean? = null

    /**
     * Request ability to [increment](https://docs.stripe.com/terminal/features/incremental-authorizations) this
     * PaymentIntent if the combination of MCC and card brand is eligible. Check
     * [incremental_authorization_supported](https://docs.stripe.com/api/charges/object#charge_object-payment_method_det
     * ails-card_present-incremental_authorization_supported) in the
     * [Confirm](https://docs.stripe.com/api/payment_intents/confirm) response to verify support.
     */
    public var requestIncrementalAuthorizationSupport: Boolean? = null

    public var routing: PaymentMethodOptionsCardPresentRouting? = null

    public fun build(): PaymentMethodOptionsCardPresent = PaymentMethodOptionsCardPresent(
      captureMethod = captureMethod,
      requestExtendedAuthorization = requestExtendedAuthorization,
      requestIncrementalAuthorizationSupport = requestIncrementalAuthorizationSupport,
      routing = routing,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodOptionsCardPresent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodOptionsCardPresent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodOptionsCardPresent {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsCardPresent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodOptionsCardPresent must be a JSON object")
      return PaymentMethodOptionsCardPresent(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlinePaymentMethodOptionsCardPresentCaptureMethodXd1871575>(it) },
        requestExtendedAuthorization = rawObject["request_extended_authorization"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        requestIncrementalAuthorizationSupport = rawObject["request_incremental_authorization_support"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        routing = rawObject["routing"]?.let { json.decodeFromJsonElement<PaymentMethodOptionsCardPresentRouting>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodOptionsCardPresent) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsCardPresent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.requestExtendedAuthorization?.let { put("request_extended_authorization", json.encodeToJsonElement(it)) }
        value.requestIncrementalAuthorizationSupport?.let { put("request_incremental_authorization_support", json.encodeToJsonElement(it)) }
        value.routing?.let { put("routing", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodOptionsCardPresent(block: PaymentMethodOptionsCardPresent.Builder.() -> Unit): PaymentMethodOptionsCardPresent = PaymentMethodOptionsCardPresent.build(block)
