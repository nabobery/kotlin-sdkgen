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
public data class PaymentFlowsAutomaticPaymentMethodsSetupIntentView(
  @SerialName("allow_redirects")
  public val allowRedirects:
      InlinePaymentFlowsAutomaticPaymentMethodsSetupIntentAllowRedirectsXdba377fb? = null,
  public val enabled: Boolean? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_flows_automatic_payment_methods_setup_intent
 */
@Serializable(with = PaymentFlowsAutomaticPaymentMethodsSetupIntent.Serializer::class)
public class PaymentFlowsAutomaticPaymentMethodsSetupIntent(
  /**
   * Controls whether this SetupIntent will accept redirect-based payment methods.
   *
   * Redirect-based payment methods may require your customer to be redirected to a payment method's app or site for
   * authentication or additional steps. To [confirm](https://docs.stripe.com/api/setup_intents/confirm) this
   * SetupIntent, you may be required to provide a `return_url` to redirect customers back to your site after they
   * authenticate or complete the setup.
   */
  public val allowRedirects:
      InlinePaymentFlowsAutomaticPaymentMethodsSetupIntentAllowRedirectsXdba377fb? = null,
  /**
   * Automatically calculates compatible payment methods
   */
  public val enabled: Boolean? = null,
) {
  public class Builder {
    /**
     * Controls whether this SetupIntent will accept redirect-based payment methods.
     *
     * Redirect-based payment methods may require your customer to be redirected to a payment method's app or site for
     * authentication or additional steps. To [confirm](https://docs.stripe.com/api/setup_intents/confirm) this
     * SetupIntent, you may be required to provide a `return_url` to redirect customers back to your site after they
     * authenticate or complete the setup.
     */
    public var allowRedirects:
        InlinePaymentFlowsAutomaticPaymentMethodsSetupIntentAllowRedirectsXdba377fb? = null

    /**
     * Automatically calculates compatible payment methods
     */
    public var enabled: Boolean? = null

    public fun build(): PaymentFlowsAutomaticPaymentMethodsSetupIntent = PaymentFlowsAutomaticPaymentMethodsSetupIntent(
      allowRedirects = allowRedirects,
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentFlowsAutomaticPaymentMethodsSetupIntent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentFlowsAutomaticPaymentMethodsSetupIntent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentFlowsAutomaticPaymentMethodsSetupIntent {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsAutomaticPaymentMethodsSetupIntent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentFlowsAutomaticPaymentMethodsSetupIntent must be a JSON object")
      return PaymentFlowsAutomaticPaymentMethodsSetupIntent(
        allowRedirects = rawObject["allow_redirects"]?.let { json.decodeFromJsonElement<InlinePaymentFlowsAutomaticPaymentMethodsSetupIntentAllowRedirectsXdba377fb>(it) },
        enabled = rawObject["enabled"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentFlowsAutomaticPaymentMethodsSetupIntent) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsAutomaticPaymentMethodsSetupIntent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowRedirects?.let { put("allow_redirects", json.encodeToJsonElement(it)) }
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentFlowsAutomaticPaymentMethodsSetupIntent(block: PaymentFlowsAutomaticPaymentMethodsSetupIntent.Builder.() -> Unit): PaymentFlowsAutomaticPaymentMethodsSetupIntent = PaymentFlowsAutomaticPaymentMethodsSetupIntent.build(block)
