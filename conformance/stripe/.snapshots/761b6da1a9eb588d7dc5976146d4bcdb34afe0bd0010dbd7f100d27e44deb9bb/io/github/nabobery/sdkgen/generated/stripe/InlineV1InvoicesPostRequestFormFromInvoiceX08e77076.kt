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
 * Revise an existing invoice. The new invoice will be created in `status=draft`. See the [revision
 * documentation](https://docs.stripe.com/invoicing/invoice-revisions) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/from_invoice
 */
@Serializable(with = InlineV1InvoicesPostRequestFormFromInvoiceX08e77076.Serializer::class)
public class InlineV1InvoicesPostRequestFormFromInvoiceX08e77076(
  public val action: InlineV1InvoicesPostRequestFormFromInvoiceActionX46ac8805,
  public val invoice: String,
) {
  public class Builder {
    private var actionValue: InlineV1InvoicesPostRequestFormFromInvoiceActionX46ac8805? = null

    public var action: InlineV1InvoicesPostRequestFormFromInvoiceActionX46ac8805
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var invoiceValue: String? = null

    public var invoice: String
      get() = requireNotNull(invoiceValue) { "invoice is required" }
      set(`value`) {
        invoiceValue = value
      }

    public fun build(): InlineV1InvoicesPostRequestFormFromInvoiceX08e77076 {
      check(actionValue != null) { "action is required" }
      check(invoiceValue != null) { "invoice is required" }
      return InlineV1InvoicesPostRequestFormFromInvoiceX08e77076(
        action = action,
        invoice = invoice,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormFromInvoiceX08e77076 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormFromInvoiceX08e77076> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormFromInvoiceX08e77076 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormFromInvoiceX08e77076")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormFromInvoiceX08e77076 must be a JSON object")
      val action = json.decodeRequired<InlineV1InvoicesPostRequestFormFromInvoiceActionX46ac8805>(rawObject, "action")
      val invoice = json.decodeRequired<String>(rawObject, "invoice")
      return InlineV1InvoicesPostRequestFormFromInvoiceX08e77076(
        action = action,
        invoice = invoice,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormFromInvoiceX08e77076) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormFromInvoiceX08e77076")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("invoice", value.invoice)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormFromInvoiceX08e77076(block: InlineV1InvoicesPostRequestFormFromInvoiceX08e77076.Builder.() -> Unit): InlineV1InvoicesPostRequestFormFromInvoiceX08e77076 = InlineV1InvoicesPostRequestFormFromInvoiceX08e77076.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesPostRequestFormFromInvoiceX08e77076 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
