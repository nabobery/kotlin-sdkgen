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
 * Naver Pay is a popular local wallet available in South Korea.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/naver_pay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayX8fa2157c.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayX8fa2157c(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormNaverPayDisplayPreferenceX1dc82d17? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormNaverPayDisplayPreferenceX1dc82d17? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayX8fa2157c = InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayX8fa2157c(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayX8fa2157c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayX8fa2157c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayX8fa2157c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayX8fa2157c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayX8fa2157c must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayX8fa2157c(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormNaverPayDisplayPreferenceX1dc82d17>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayX8fa2157c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayX8fa2157c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormNaverPayX8fa2157c(block: InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayX8fa2157c.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayX8fa2157c = InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayX8fa2157c.build(block)
