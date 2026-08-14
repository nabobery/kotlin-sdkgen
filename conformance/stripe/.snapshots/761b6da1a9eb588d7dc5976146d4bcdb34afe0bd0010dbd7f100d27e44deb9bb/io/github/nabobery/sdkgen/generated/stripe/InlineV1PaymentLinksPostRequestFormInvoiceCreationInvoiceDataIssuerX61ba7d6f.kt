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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/invoice_creation/properties/invoice_data/properties/issuer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/invoice_creation/properties/invoice_data/properties/issuer
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f(
  public val type: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerTypeXd16f2a94,
  public val account: String? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerTypeXd16f2a94? = null

    public var type:
        InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerTypeXd16f2a94
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var account: String? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f {
      check(typeValue != null) { "type is required" }
      return InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f(
        type = type,
        account = account,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f must be a JSON object")
      val type = json.decodeRequired<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerTypeXd16f2a94>(rawObject, "type")
      return InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f(
        type = type,
        account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.account?.let { put("account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f(block: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f = InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
