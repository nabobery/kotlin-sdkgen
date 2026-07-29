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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/invoice_settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/invoice_settings
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd(
  public val issuer: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataIssuerX7945e170? = null,
) {
  public class Builder {
    public var issuer: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataIssuerX7945e170? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd(
      issuer = issuer,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd(
        issuer = rawObject["issuer"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataIssuerX7945e170>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.issuer?.let { put("issuer", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd(block: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd.build(block)
