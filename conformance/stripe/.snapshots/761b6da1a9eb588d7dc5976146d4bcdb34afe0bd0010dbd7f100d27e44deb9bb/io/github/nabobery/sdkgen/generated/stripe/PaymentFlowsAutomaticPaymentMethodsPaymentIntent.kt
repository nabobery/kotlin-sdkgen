package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentFlowsAutomaticPaymentMethodsPaymentIntentView(
  @SerialName("allow_redirects")
  public val allowRedirects:
      InlinePaymentFlowsAutomaticPaymentMethodsPaymentIntentAllowRedirectsX4b260eab? = null,
  public val enabled: Boolean,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_flows_automatic_payment_methods_payment_intent
 */
@Serializable(with = PaymentFlowsAutomaticPaymentMethodsPaymentIntent.Serializer::class)
public class PaymentFlowsAutomaticPaymentMethodsPaymentIntent(
  /**
   * Automatically calculates compatible payment methods
   */
  public val enabled: Boolean,
  /**
   * Controls whether this PaymentIntent will accept redirect-based payment methods.
   *
   * Redirect-based payment methods may require your customer to be redirected to a payment method's app or site for
   * authentication or additional steps. To [confirm](https://docs.stripe.com/api/payment_intents/confirm) this
   * PaymentIntent, you may be required to provide a `return_url` to redirect customers back to your site after they
   * authenticate or complete the payment.
   */
  public val allowRedirects:
      InlinePaymentFlowsAutomaticPaymentMethodsPaymentIntentAllowRedirectsX4b260eab? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    /**
     * Controls whether this PaymentIntent will accept redirect-based payment methods.
     *
     * Redirect-based payment methods may require your customer to be redirected to a payment method's app or site for
     * authentication or additional steps. To [confirm](https://docs.stripe.com/api/payment_intents/confirm) this
     * PaymentIntent, you may be required to provide a `return_url` to redirect customers back to your site after they
     * authenticate or complete the payment.
     */
    public var allowRedirects:
        InlinePaymentFlowsAutomaticPaymentMethodsPaymentIntentAllowRedirectsX4b260eab? = null

    public fun build(): PaymentFlowsAutomaticPaymentMethodsPaymentIntent {
      check(enabledValue != null) { "enabled is required" }
      return PaymentFlowsAutomaticPaymentMethodsPaymentIntent(
        enabled = enabled,
        allowRedirects = allowRedirects,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentFlowsAutomaticPaymentMethodsPaymentIntent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentFlowsAutomaticPaymentMethodsPaymentIntent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentFlowsAutomaticPaymentMethodsPaymentIntent {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsAutomaticPaymentMethodsPaymentIntent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentFlowsAutomaticPaymentMethodsPaymentIntent must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return PaymentFlowsAutomaticPaymentMethodsPaymentIntent(
        enabled = enabled,
        allowRedirects = rawObject["allow_redirects"]?.let { json.decodeFromJsonElement<InlinePaymentFlowsAutomaticPaymentMethodsPaymentIntentAllowRedirectsX4b260eab>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentFlowsAutomaticPaymentMethodsPaymentIntent) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsAutomaticPaymentMethodsPaymentIntent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.allowRedirects?.let { put("allow_redirects", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentFlowsAutomaticPaymentMethodsPaymentIntent(block: PaymentFlowsAutomaticPaymentMethodsPaymentIntent.Builder.() -> Unit): PaymentFlowsAutomaticPaymentMethodsPaymentIntent = PaymentFlowsAutomaticPaymentMethodsPaymentIntent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentFlowsAutomaticPaymentMethodsPaymentIntent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
