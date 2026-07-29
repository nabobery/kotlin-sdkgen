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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsX16586dde.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsX16586dde(
  public val defaultMandate:
      InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96? = null,
  public val paymentMethodOptions:
      InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23? = null,
  public val paymentMethodTypes:
      InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXb9bf1472? = null,
) {
  public class Builder {
    public var defaultMandate:
        InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96? = null

    public var paymentMethodOptions:
        InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23? = null

    public var paymentMethodTypes:
        InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXb9bf1472? = null

    public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsX16586dde = InlineV1InvoicesPostRequestFormPaymentSettingsX16586dde(
      defaultMandate = defaultMandate,
      paymentMethodOptions = paymentMethodOptions,
      paymentMethodTypes = paymentMethodTypes,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsX16586dde = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsX16586dde> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsX16586dde {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsX16586dde")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormPaymentSettingsX16586dde must be a JSON object")
      return InlineV1InvoicesPostRequestFormPaymentSettingsX16586dde(
        defaultMandate = rawObject["default_mandate"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX5cf8ed96>(it) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsXd05ced23>(it) },
        paymentMethodTypes = rawObject["payment_method_types"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXb9bf1472>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsX16586dde) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsX16586dde")
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

public fun inlineV1InvoicesPostRequestFormPaymentSettingsX16586dde(block: InlineV1InvoicesPostRequestFormPaymentSettingsX16586dde.Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsX16586dde = InlineV1InvoicesPostRequestFormPaymentSettingsX16586dde.build(block)
