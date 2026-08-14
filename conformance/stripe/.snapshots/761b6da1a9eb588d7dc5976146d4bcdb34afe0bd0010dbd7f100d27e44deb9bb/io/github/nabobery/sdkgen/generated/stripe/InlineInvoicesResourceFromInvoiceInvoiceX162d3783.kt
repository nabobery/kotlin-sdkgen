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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineInvoicesResourceFromInvoiceInvoiceX162d3783Branch {
  Branch1,
  Invoice,
}

public sealed class InlineInvoicesResourceFromInvoiceInvoiceX162d3783DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoicesResourceFromInvoiceInvoiceX162d3783NoMatchException(
  message: String,
) : InlineInvoicesResourceFromInvoiceInvoiceX162d3783DecodingException(message)

internal data class InlineInvoicesResourceFromInvoiceInvoiceX162d3783Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInvoice: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInvoice).count { it }
}

/**
 * The invoice that was cloned.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_resource_from_invoice/properties/invoice
 */
@Serializable(with = InlineInvoicesResourceFromInvoiceInvoiceX162d3783.Serializer::class)
public class InlineInvoicesResourceFromInvoiceInvoiceX162d3783 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoicesResourceFromInvoiceInvoiceX162d3783Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val invoice: Invoice? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoice) json.decodeFromJsonElement<Invoice>(raw) else null }

  public val matchedBranches: Set<InlineInvoicesResourceFromInvoiceInvoiceX162d3783Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoicesResourceFromInvoiceInvoiceX162d3783Branch.Branch1)
      if (inspection.matchesInvoice) add(InlineInvoicesResourceFromInvoiceInvoiceX162d3783Branch.Invoice)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoicesResourceFromInvoiceInvoiceX162d3783 {
      val inspection = inspectInlineInvoicesResourceFromInvoiceInvoiceX162d3783(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoicesResourceFromInvoiceInvoiceX162d3783NoMatchException("InlineInvoicesResourceFromInvoiceInvoiceX162d3783 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoicesResourceFromInvoiceInvoiceX162d3783(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInvoicesResourceFromInvoiceInvoiceX162d3783> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoicesResourceFromInvoiceInvoiceX162d3783 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesResourceFromInvoiceInvoiceX162d3783")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoicesResourceFromInvoiceInvoiceX162d3783) {
      encoder.requireJsonEncoder("InlineInvoicesResourceFromInvoiceInvoiceX162d3783").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoicesResourceFromInvoiceInvoiceX162d3783(element: JsonElement): InlineInvoicesResourceFromInvoiceInvoiceX162d3783Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInvoice = element.isJsonDecodable<Invoice>()
  return InlineInvoicesResourceFromInvoiceInvoiceX162d3783Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInvoice = matchesInvoice,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInvoice) add("Invoice: value does not match Invoice")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
