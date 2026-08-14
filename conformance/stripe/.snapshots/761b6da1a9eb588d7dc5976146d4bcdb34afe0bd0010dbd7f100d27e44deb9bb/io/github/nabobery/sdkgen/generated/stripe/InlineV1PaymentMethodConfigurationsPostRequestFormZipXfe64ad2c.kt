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
 * Zip gives your customers a way to split purchases over a series of payments. Check this
 * [page](https://docs.stripe.com/payments/zip) for more details like country availability.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/zip
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormZipXfe64ad2c.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormZipXfe64ad2c(
  public val displayPreference:
      InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormZipXfe64ad2c = InlineV1PaymentMethodConfigurationsPostRequestFormZipXfe64ad2c(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormZipXfe64ad2c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormZipXfe64ad2c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormZipXfe64ad2c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormZipXfe64ad2c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormZipXfe64ad2c must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormZipXfe64ad2c(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormZipXfe64ad2c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormZipXfe64ad2c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormZipXfe64ad2c(block: InlineV1PaymentMethodConfigurationsPostRequestFormZipXfe64ad2c.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormZipXfe64ad2c = InlineV1PaymentMethodConfigurationsPostRequestFormZipXfe64ad2c.build(block)
