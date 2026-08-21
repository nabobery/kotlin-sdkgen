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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/subscription_data/properties/invoice_settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/subscription_data/properties/invoice_settings
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e(
  public val issuer: InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX25f8b706? = null,
) {
  public class Builder {
    public var issuer: InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX25f8b706? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e = InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e(
      issuer = issuer,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e(
        issuer = rawObject["issuer"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX25f8b706>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.issuer?.let { put("issuer", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e(block: InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e = InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e.build(block)
