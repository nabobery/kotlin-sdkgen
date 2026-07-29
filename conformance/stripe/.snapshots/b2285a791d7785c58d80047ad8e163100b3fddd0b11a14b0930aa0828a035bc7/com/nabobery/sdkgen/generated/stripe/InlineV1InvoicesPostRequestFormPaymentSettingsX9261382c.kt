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
 * Configuration settings for the PaymentIntent that is generated when the invoice is finalized.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsX9261382c.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsX9261382c(
  public val defaultMandate:
      InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393c? = null,
  public val paymentMethodOptions:
      InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22? = null,
  public val paymentMethodTypes:
      InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576? = null,
) {
  public class Builder {
    public var defaultMandate:
        InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393c? = null

    public var paymentMethodOptions:
        InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22? = null

    public var paymentMethodTypes:
        InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576? = null

    public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsX9261382c = InlineV1InvoicesPostRequestFormPaymentSettingsX9261382c(
      defaultMandate = defaultMandate,
      paymentMethodOptions = paymentMethodOptions,
      paymentMethodTypes = paymentMethodTypes,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsX9261382c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsX9261382c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsX9261382c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsX9261382c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormPaymentSettingsX9261382c must be a JSON object")
      return InlineV1InvoicesPostRequestFormPaymentSettingsX9261382c(
        defaultMandate = rawObject["default_mandate"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393c>(it) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsX7dd5ae22>(it) },
        paymentMethodTypes = rawObject["payment_method_types"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsX9261382c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsX9261382c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.defaultMandate?.let { put("default_mandate", json.encodeToJsonElement(it)) }
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.paymentMethodTypes?.let { put("payment_method_types", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsX9261382c(block: InlineV1InvoicesPostRequestFormPaymentSettingsX9261382c.Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsX9261382c = InlineV1InvoicesPostRequestFormPaymentSettingsX9261382c.build(block)
