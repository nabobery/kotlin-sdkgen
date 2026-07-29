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
 * All invoices will be billed using the specified settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/invoice_settings
 */
@Serializable(with = InlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b.Serializer::class)
public class InlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b(
  public val daysUntilDue: Int? = null,
  public val issuer: InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c? = null,
) {
  public class Builder {
    public var daysUntilDue: Int? = null

    public var issuer: InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c? = null

    public fun build(): InlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b = InlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b(
      daysUntilDue = daysUntilDue,
      issuer = issuer,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b must be a JSON object")
      return InlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b(
        daysUntilDue = rawObject["days_until_due"]?.let { json.decodeFromJsonElement<Int>(it) },
        issuer = rawObject["issuer"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX75f72c4c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.daysUntilDue?.let { put("days_until_due", json.encodeToJsonElement(it)) }
        value.issuer?.let { put("issuer", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b(block: InlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b.Builder.() -> Unit): InlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b = InlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b.build(block)
