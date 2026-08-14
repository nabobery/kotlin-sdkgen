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
 * EPS is an Austria-based payment method that allows customers to complete transactions online using their bank
 * credentials. EPS is supported by all Austrian banks and is accepted by over 80% of Austrian online retailers. Check
 * this [page](https://docs.stripe.com/payments/eps) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/eps
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormEpsX94fb81fc.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormEpsX94fb81fc(
  public val displayPreference:
      InlineV1PaymentMethodConfigurationsPostRequestFormEpsDisplayPreferenceXde62a7f7? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfigurationsPostRequestFormEpsDisplayPreferenceXde62a7f7? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormEpsX94fb81fc = InlineV1PaymentMethodConfigurationsPostRequestFormEpsX94fb81fc(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormEpsX94fb81fc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormEpsX94fb81fc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormEpsX94fb81fc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormEpsX94fb81fc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormEpsX94fb81fc must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormEpsX94fb81fc(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormEpsDisplayPreferenceXde62a7f7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormEpsX94fb81fc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormEpsX94fb81fc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormEpsX94fb81fc(block: InlineV1PaymentMethodConfigurationsPostRequestFormEpsX94fb81fc.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormEpsX94fb81fc = InlineV1PaymentMethodConfigurationsPostRequestFormEpsX94fb81fc.build(block)
