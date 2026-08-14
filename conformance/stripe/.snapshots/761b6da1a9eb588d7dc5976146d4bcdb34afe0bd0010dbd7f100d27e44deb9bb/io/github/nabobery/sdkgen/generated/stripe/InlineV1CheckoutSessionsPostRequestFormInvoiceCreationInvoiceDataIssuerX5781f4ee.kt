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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/invoice_creation/properties/invoice_data/properties/issuer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/invoice_creation/properties/invoice_data/properties/issuer
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee(
  public val type: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataTypeXa631abb0,
  public val account: String? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataTypeXa631abb0? = null

    public var type: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataTypeXa631abb0
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var account: String? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee {
      check(typeValue != null) { "type is required" }
      return InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee(
        type = type,
        account = account,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee must be a JSON object")
      val type = json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataTypeXa631abb0>(rawObject, "type")
      return InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee(
        type = type,
        account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.account?.let { put("account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee(block: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee = InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataIssuerX5781f4ee is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
