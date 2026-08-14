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
 * Alma is a Buy Now, Pay Later payment method that offers customers the ability to pay in 2, 3, or 4 installments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/alma
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049(
  public val displayPreference:
      InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX7a7da163? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX7a7da163? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049 = InlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX7a7da163>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049(block: InlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049 = InlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049.build(block)
