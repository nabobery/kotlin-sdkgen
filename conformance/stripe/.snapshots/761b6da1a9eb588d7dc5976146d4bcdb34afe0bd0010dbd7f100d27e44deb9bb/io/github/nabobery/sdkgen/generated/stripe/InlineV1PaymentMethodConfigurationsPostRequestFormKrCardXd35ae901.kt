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
 * Korean cards let users pay using locally issued cards from South Korea.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/kr_card
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormKrCardDisplayPreferenceX85ea5a5a? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormKrCardDisplayPreferenceX85ea5a5a? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901 = InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormKrCardDisplayPreferenceX85ea5a5a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901(block: InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901 = InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901.build(block)
