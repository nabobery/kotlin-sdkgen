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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/acss_debit/anyO
 * f/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/acss_debit/anyO
 * f/0
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160(
  public val mandateOptions:
      InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4? = null,
  public val verificationMethod:
      InlineV1CustomersSubscriptionsPostRequestFormVerificationMethodXa387adb0? = null,
) {
  public class Builder {
    public var mandateOptions: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4?
        = null

    public var verificationMethod:
        InlineV1CustomersSubscriptionsPostRequestFormVerificationMethodXa387adb0? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160 = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160(
      mandateOptions = mandateOptions,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160 must be a JSON object")
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX22b61eb4>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormVerificationMethodXa387adb0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160(block: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160 = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160.build(block)
