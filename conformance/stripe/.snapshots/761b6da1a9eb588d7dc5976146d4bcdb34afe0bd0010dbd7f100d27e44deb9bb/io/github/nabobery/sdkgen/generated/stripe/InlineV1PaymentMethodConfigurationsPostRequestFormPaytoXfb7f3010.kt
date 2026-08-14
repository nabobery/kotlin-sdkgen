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
 * PayTo is a [real-time](https://docs.stripe.com/payments/real-time) payment method that enables customers in Australia
 * to pay by providing their bank account details. Customers must accept a mandate authorizing you to debit their
 * account. Check this [page](https://docs.stripe.com/payments/payto) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/payto
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormPaytoDisplayPreferenceX7f2529bd? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormPaytoDisplayPreferenceX7f2529bd? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010 = InlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormPaytoDisplayPreferenceX7f2529bd>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010(block: InlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010 = InlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010.build(block)
