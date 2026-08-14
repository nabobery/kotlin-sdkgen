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
 * giropay is a German payment method based on online banking, introduced in 2006. It allows customers to complete
 * transactions online using their online banking environment, with funds debited from their bank account. Depending on
 * their bank, customers confirm payments on giropay using a second factor of authentication or a PIN. giropay accounts
 * for 10% of online checkouts in Germany. Check this [page](https://docs.stripe.com/payments/giropay) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/giropay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormGiropayX1d489086.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormGiropayX1d489086(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormGiropayDisplayPreferenceX55a77d4a? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormGiropayDisplayPreferenceX55a77d4a? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormGiropayX1d489086 = InlineV1PaymentMethodConfigurationsPostRequestFormGiropayX1d489086(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormGiropayX1d489086 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormGiropayX1d489086> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormGiropayX1d489086 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormGiropayX1d489086")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormGiropayX1d489086 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormGiropayX1d489086(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormGiropayDisplayPreferenceX55a77d4a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormGiropayX1d489086) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormGiropayX1d489086")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormGiropayX1d489086(block: InlineV1PaymentMethodConfigurationsPostRequestFormGiropayX1d489086.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormGiropayX1d489086 = InlineV1PaymentMethodConfigurationsPostRequestFormGiropayX1d489086.build(block)
