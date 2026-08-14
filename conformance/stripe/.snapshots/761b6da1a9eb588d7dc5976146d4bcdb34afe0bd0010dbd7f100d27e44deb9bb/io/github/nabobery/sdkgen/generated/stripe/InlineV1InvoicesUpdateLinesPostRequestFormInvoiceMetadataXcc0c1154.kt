package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154Branch {
  Branch1,
  InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataAnyOf2X2cda2b70,
}

public sealed class InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154NoMatchException(
  message: String,
) : InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154DecodingException(message)

internal data class InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataAnyOf2X2cda2b70:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataAnyOf2X2cda2b70).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`. For
 * [type=subscription](https://docs.stripe.com/api/invoices/line_item#invoice_line_item_object-type) line items, the
 * incoming metadata specified on the request is directly used to set this value, in contrast to
 * [type=invoiceitem](api/invoices/line_item#invoice_line_item_object-type) line items, where any existing metadata on
 * the invoice line is merged with the incoming data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/invoice_metadata
 */
@Serializable(with = InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154.Serializer::class)
public class InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataAnyOf2X2cda2b70:
      InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataAnyOf2X2cda2b70? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataAnyOf2X2cda2b70) json.decodeFromJsonElement<InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataAnyOf2X2cda2b70>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataAnyOf2X2cda2b70) add(InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154Branch.InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataAnyOf2X2cda2b70)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154 {
      val inspection = inspectInlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154NoMatchException("InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154) {
      encoder.requireJsonEncoder("InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154(element: JsonElement): InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataAnyOf2X2cda2b70 = element.isJsonDecodable<InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataAnyOf2X2cda2b70>()
  return InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataXcc0c1154Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataAnyOf2X2cda2b70 = matchesInlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataAnyOf2X2cda2b70,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataAnyOf2X2cda2b70) add("InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataAnyOf2X2cda2b70: value does not match InlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataAnyOf2X2cda2b70")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
