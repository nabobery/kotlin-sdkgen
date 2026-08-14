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
 * Billie is a [single-use](https://docs.stripe.com/payments/payment-methods#usage) payment method that offers
 * businesses Pay by Invoice where they offer payment terms ranging from 7-120 days. Customers are redirected from your
 * website or app, authorize the payment with Billie, then return to your website or app. You get [immediate
 * notification](/payments/payment-methods#payment-notification) of whether the payment succeeded or failed.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/billie
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormBillieXfb0d80cb.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormBillieXfb0d80cb(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormBillieXfb0d80cb = InlineV1PaymentMethodConfigurationsPostRequestFormBillieXfb0d80cb(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBillieXfb0d80cb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormBillieXfb0d80cb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormBillieXfb0d80cb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormBillieXfb0d80cb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormBillieXfb0d80cb must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormBillieXfb0d80cb(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormBillieXfb0d80cb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormBillieXfb0d80cb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormBillieXfb0d80cb(block: InlineV1PaymentMethodConfigurationsPostRequestFormBillieXfb0d80cb.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBillieXfb0d80cb = InlineV1PaymentMethodConfigurationsPostRequestFormBillieXfb0d80cb.build(block)
