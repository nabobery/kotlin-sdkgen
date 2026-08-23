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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/acss_debit/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/acss_debit/anyOf/0
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c(
  public val mandateOptions:
      InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7? = null,
  public val verificationMethod:
      InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodX3d3332f6? = null,
) {
  public class Builder {
    public var mandateOptions:
        InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7? = null

    public var verificationMethod:
        InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodX3d3332f6? = null

    public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c(
      mandateOptions = mandateOptions,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c must be a JSON object")
      return InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXbc5324b7>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodX3d3332f6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c(block: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c.Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c.build(block)
