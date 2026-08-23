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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/acss_debit/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/acss_debit/anyOf/0
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee(
  public val mandateOptions:
      InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee? = null,
  public val verificationMethod:
      InlineV1CustomersSubscriptionsPostRequestFormVerificationMethodXb1cbc513? = null,
) {
  public class Builder {
    public var mandateOptions: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee?
        = null

    public var verificationMethod:
        InlineV1CustomersSubscriptionsPostRequestFormVerificationMethodXb1cbc513? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee(
      mandateOptions = mandateOptions,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee must be a JSON object")
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX417d50ee>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormVerificationMethodXb1cbc513>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee(block: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee.build(block)
