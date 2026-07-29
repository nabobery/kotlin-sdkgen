package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineInvoicesResourceInvoiceRenderingPdfX02773b89Branch {
  InvoiceRenderingPdf,
}

public sealed class InlineInvoicesResourceInvoiceRenderingPdfX02773b89DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoicesResourceInvoiceRenderingPdfX02773b89NoMatchException(
  message: String,
) : InlineInvoicesResourceInvoiceRenderingPdfX02773b89DecodingException(message)

internal data class InlineInvoicesResourceInvoiceRenderingPdfX02773b89Inspection(
  public val matchesInvoiceRenderingPdf: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoiceRenderingPdf).count { it }
}

/**
 * Invoice pdf rendering options
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_resource_invoice_rendering/properties/pdf
 */
@Serializable(with = InlineInvoicesResourceInvoiceRenderingPdfX02773b89.Serializer::class)
public class InlineInvoicesResourceInvoiceRenderingPdfX02773b89 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoicesResourceInvoiceRenderingPdfX02773b89Inspection,
) {
  public val invoiceRenderingPdf: InvoiceRenderingPdfView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoiceRenderingPdf) json.decodeFromJsonElement<InvoiceRenderingPdfView>(raw) else null }

  public val matchedBranches: Set<InlineInvoicesResourceInvoiceRenderingPdfX02773b89Branch>
    get() = buildSet {
      if (inspection.matchesInvoiceRenderingPdf) add(InlineInvoicesResourceInvoiceRenderingPdfX02773b89Branch.InvoiceRenderingPdf)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoicesResourceInvoiceRenderingPdfX02773b89 {
      val inspection = inspectInlineInvoicesResourceInvoiceRenderingPdfX02773b89(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoicesResourceInvoiceRenderingPdfX02773b89NoMatchException("InlineInvoicesResourceInvoiceRenderingPdfX02773b89 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoicesResourceInvoiceRenderingPdfX02773b89(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoicesResourceInvoiceRenderingPdfX02773b89> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoicesResourceInvoiceRenderingPdfX02773b89 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesResourceInvoiceRenderingPdfX02773b89")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoicesResourceInvoiceRenderingPdfX02773b89) {
      encoder.requireJsonEncoder("InlineInvoicesResourceInvoiceRenderingPdfX02773b89").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoicesResourceInvoiceRenderingPdfX02773b89(element: JsonElement): InlineInvoicesResourceInvoiceRenderingPdfX02773b89Inspection {
  val raw = element as? JsonObject ?: return InlineInvoicesResourceInvoiceRenderingPdfX02773b89Inspection(
    matchesInvoiceRenderingPdf = false,
    failures = listOf("InvoiceRenderingPdf: expected JSON object"),
  )
  val matchesInvoiceRenderingPdf = true
  return InlineInvoicesResourceInvoiceRenderingPdfX02773b89Inspection(
    matchesInvoiceRenderingPdf = matchesInvoiceRenderingPdf,
    failures = buildList {
      if (!matchesInvoiceRenderingPdf) add("InvoiceRenderingPdf: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
