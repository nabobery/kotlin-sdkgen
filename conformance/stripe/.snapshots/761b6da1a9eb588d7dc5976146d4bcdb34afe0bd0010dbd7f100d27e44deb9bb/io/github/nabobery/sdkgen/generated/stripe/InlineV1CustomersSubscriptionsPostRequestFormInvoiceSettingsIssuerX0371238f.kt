package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/invoice_settings/properties/issuer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/invoice_settings/properties/issuer
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f(
  public val type: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerTypeX1d179de3,
  public val account: String? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerTypeX1d179de3? = null

    public var type: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerTypeX1d179de3
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var account: String? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f {
      check(typeValue != null) { "type is required" }
      return InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f(
        type = type,
        account = account,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f must be a JSON object")
      val type = json.decodeRequired<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerTypeX1d179de3>(rawObject, "type")
      return InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f(
        type = type,
        account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.account?.let { put("account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f(block: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f = InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
