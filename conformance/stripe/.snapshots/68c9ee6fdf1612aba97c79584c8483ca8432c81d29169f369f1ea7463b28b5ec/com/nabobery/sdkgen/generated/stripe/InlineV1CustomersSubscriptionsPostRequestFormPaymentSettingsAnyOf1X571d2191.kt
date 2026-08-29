package com.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/bancontact/anyO
 * f/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/bancontact/anyO
 * f/0
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191(
  public val preferredLanguage:
      InlineV1CustomersSubscriptionsPostRequestFormPreferredLanguageX56944da5? = null,
) {
  public class Builder {
    public var preferredLanguage:
        InlineV1CustomersSubscriptionsPostRequestFormPreferredLanguageX56944da5? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191 = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191(
      preferredLanguage = preferredLanguage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191 must be a JSON object")
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191(
        preferredLanguage = rawObject["preferred_language"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPreferredLanguageX56944da5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.preferredLanguage?.let { put("preferred_language", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191(block: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191 = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191.build(block)
