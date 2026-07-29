package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * /properties/payment_settings/properties/payment_method_options/properties/pix/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/pix/anyOf/0
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc(
  public val amountIncludesIof:
      InlineV1InvoicesPostRequestFormPaymentSettingsAmountIncludesIofX2423a186? = null,
  public val expiresAfterSeconds: Int? = null,
) {
  public class Builder {
    public var amountIncludesIof:
        InlineV1InvoicesPostRequestFormPaymentSettingsAmountIncludesIofX2423a186? = null

    public var expiresAfterSeconds: Int? = null

    public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc(
      amountIncludesIof = amountIncludesIof,
      expiresAfterSeconds = expiresAfterSeconds,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc must be a JSON object")
      return InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc(
        amountIncludesIof = rawObject["amount_includes_iof"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAmountIncludesIofX2423a186>(it) },
        expiresAfterSeconds = rawObject["expires_after_seconds"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountIncludesIof?.let { put("amount_includes_iof", json.encodeToJsonElement(it)) }
        value.expiresAfterSeconds?.let { put("expires_after_seconds", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc(block: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc.Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X454a46bc.build(block)
