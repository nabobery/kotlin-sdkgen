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
 * PayNow is a Singapore-based payment method that allows customers to make a payment using their preferred app from
 * participating banks and participating non-bank financial institutions. Check this
 * [page](https://docs.stripe.com/payments/paynow) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/paynow
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormPaynowX28b207a7.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormPaynowX28b207a7(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormPaynowDisplayPreferenceX0057d611? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormPaynowDisplayPreferenceX0057d611? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormPaynowX28b207a7 = InlineV1PaymentMethodConfigurationsPostRequestFormPaynowX28b207a7(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPaynowX28b207a7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormPaynowX28b207a7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormPaynowX28b207a7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormPaynowX28b207a7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormPaynowX28b207a7 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormPaynowX28b207a7(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormPaynowDisplayPreferenceX0057d611>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormPaynowX28b207a7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormPaynowX28b207a7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormPaynowX28b207a7(block: InlineV1PaymentMethodConfigurationsPostRequestFormPaynowX28b207a7.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPaynowX28b207a7 = InlineV1PaymentMethodConfigurationsPostRequestFormPaynowX28b207a7.build(block)
