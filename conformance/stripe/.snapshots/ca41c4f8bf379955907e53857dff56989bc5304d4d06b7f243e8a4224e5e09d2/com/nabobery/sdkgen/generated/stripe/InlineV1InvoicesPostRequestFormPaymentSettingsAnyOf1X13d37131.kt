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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/acss_debit/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/acss_debit/anyOf/0
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131(
  public val mandateOptions:
      InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b? = null,
  public val verificationMethod:
      InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodXc10ca459? = null,
) {
  public class Builder {
    public var mandateOptions:
        InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b? = null

    public var verificationMethod:
        InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodXc10ca459? = null

    public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131 = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131(
      mandateOptions = mandateOptions,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131 must be a JSON object")
      return InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXfa368f8b>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodXc10ca459>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131(block: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131.Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131 = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131.build(block)
