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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineQuoteInvoiceX5bd1d2d6Branch {
  Branch1,
  Invoice,
  DeletedInvoice,
}

public sealed class InlineQuoteInvoiceX5bd1d2d6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineQuoteInvoiceX5bd1d2d6NoMatchException(
  message: String,
) : InlineQuoteInvoiceX5bd1d2d6DecodingException(message)

internal data class InlineQuoteInvoiceX5bd1d2d6Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInvoice: Boolean,
  public val matchesDeletedInvoice: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInvoice, matchesDeletedInvoice).count { it }
}

/**
 * The invoice that was created from this quote.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quote/properties/invoice
 */
@Serializable(with = InlineQuoteInvoiceX5bd1d2d6.Serializer::class)
public class InlineQuoteInvoiceX5bd1d2d6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineQuoteInvoiceX5bd1d2d6Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val invoice: Invoice? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoice) json.decodeFromJsonElement<Invoice>(raw) else null }

  public val deletedInvoice: DeletedInvoice? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedInvoice) json.decodeFromJsonElement<DeletedInvoice>(raw) else null }

  public val matchedBranches: Set<InlineQuoteInvoiceX5bd1d2d6Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineQuoteInvoiceX5bd1d2d6Branch.Branch1)
      if (inspection.matchesInvoice) add(InlineQuoteInvoiceX5bd1d2d6Branch.Invoice)
      if (inspection.matchesDeletedInvoice) add(InlineQuoteInvoiceX5bd1d2d6Branch.DeletedInvoice)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineQuoteInvoiceX5bd1d2d6 {
      val inspection = inspectInlineQuoteInvoiceX5bd1d2d6(raw)
      if (inspection.matchCount == 0) {
        throw InlineQuoteInvoiceX5bd1d2d6NoMatchException("InlineQuoteInvoiceX5bd1d2d6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineQuoteInvoiceX5bd1d2d6(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineQuoteInvoiceX5bd1d2d6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineQuoteInvoiceX5bd1d2d6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineQuoteInvoiceX5bd1d2d6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineQuoteInvoiceX5bd1d2d6) {
      encoder.requireJsonEncoder("InlineQuoteInvoiceX5bd1d2d6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineQuoteInvoiceX5bd1d2d6(element: JsonElement): InlineQuoteInvoiceX5bd1d2d6Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInvoice = element.isJsonDecodable<Invoice>()
  val matchesDeletedInvoice = element.isJsonDecodable<DeletedInvoice>()
  return InlineQuoteInvoiceX5bd1d2d6Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInvoice = matchesInvoice,
    matchesDeletedInvoice = matchesDeletedInvoice,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInvoice) add("Invoice: value does not match Invoice")
      if (!matchesDeletedInvoice) add("DeletedInvoice: value does not match DeletedInvoice")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
