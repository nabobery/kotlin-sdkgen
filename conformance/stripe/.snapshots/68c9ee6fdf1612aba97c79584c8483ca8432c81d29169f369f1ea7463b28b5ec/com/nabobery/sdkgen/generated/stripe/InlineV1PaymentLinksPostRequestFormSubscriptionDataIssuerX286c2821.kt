package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/subscription_data/properties/invoice_settings/properties/issuer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/subscription_data/properties/invoice_settings/properties/issuer
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821(
  public val type: InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsTypeX8064daf5,
  public val account: String? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsTypeX8064daf5? = null

    public var type: InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsTypeX8064daf5
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var account: String? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821 {
      check(typeValue != null) { "type is required" }
      return InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821(
        type = type,
        account = account,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821 must be a JSON object")
      val type = json.decodeRequired<InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsTypeX8064daf5>(rawObject, "type")
      return InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821(
        type = type,
        account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.account?.let { put("account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821(block: InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821 = InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
