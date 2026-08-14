package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Generate a post-purchase Invoice for one-time payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/invoice_creation
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd(
  public val enabled: Boolean,
  public val invoiceData:
      InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var invoiceData:
        InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd(
        enabled = enabled,
        invoiceData = invoiceData,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd(
        enabled = enabled,
        invoiceData = rawObject["invoice_data"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataXc7f54a1e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.invoiceData?.let { put("invoice_data", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd(block: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd = InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
