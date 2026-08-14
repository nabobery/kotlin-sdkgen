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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/upi/anyOf/0
 * .
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/upi/anyOf/0
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e(
  public val mandateOptions:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX72c2a72b? = null,
) {
  public class Builder {
    public var mandateOptions:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX72c2a72b? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e = InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX72c2a72b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e(block: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e = InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e.build(block)
