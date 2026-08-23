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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/issuer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/issuer
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd(
  public val type: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerTypeX52e21ee5,
  public val account: String? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerTypeX52e21ee5? = null

    public var type: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerTypeX52e21ee5
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var account: String? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd {
      check(typeValue != null) { "type is required" }
      return InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd(
        type = type,
        account = account,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd must be a JSON object")
      val type = json.decodeRequired<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerTypeX52e21ee5>(rawObject, "type")
      return InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd(
        type = type,
        account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.account?.let { put("account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd(block: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd = InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX7dfee6bd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
