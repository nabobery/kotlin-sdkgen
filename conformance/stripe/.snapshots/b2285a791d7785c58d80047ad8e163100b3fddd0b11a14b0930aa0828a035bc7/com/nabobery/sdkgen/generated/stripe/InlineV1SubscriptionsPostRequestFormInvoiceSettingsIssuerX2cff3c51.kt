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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/issuer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/issuer
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51(
  public val type: InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerTypeXf32f58de,
  public val account: String? = null,
) {
  public class Builder {
    private var typeValue: InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerTypeXf32f58de? =
        null

    public var type: InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerTypeXf32f58de
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var account: String? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51 {
      check(typeValue != null) { "type is required" }
      return InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51(
        type = type,
        account = account,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51 must be a JSON object")
      val type = json.decodeRequired<InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerTypeXf32f58de>(rawObject, "type")
      return InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51(
        type = type,
        account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.account?.let { put("account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51(block: InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51 = InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerX2cff3c51 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
