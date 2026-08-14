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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/upi/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/upi/anyOf/0
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e(
  public val mandateOptions:
      InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXca9c273a? = null,
) {
  public class Builder {
    public var mandateOptions:
        InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXca9c273a? = null

    public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e must be a JSON object")
      return InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsMandateOptionsXca9c273a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e(block: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e.Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e.build(block)
