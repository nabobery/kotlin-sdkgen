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
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/acss_debit/
 * anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/acss_debit/
 * anyOf/0
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846(
  public val mandateOptions:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84? = null,
  public val verificationMethod:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsVerificationMethodX4b2a79a5? = null,
) {
  public class Builder {
    public var mandateOptions:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84? = null

    public var verificationMethod:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsVerificationMethodX4b2a79a5? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846 = InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846(
      mandateOptions = mandateOptions,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846 must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX653e9f84>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsVerificationMethodX4b2a79a5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846(block: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846 = InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846.build(block)
