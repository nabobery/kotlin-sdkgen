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

public enum class InlineInvoiceitemInvoiceX2a82d179Branch {
  Branch1,
  Invoice,
}

public sealed class InlineInvoiceitemInvoiceX2a82d179DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceitemInvoiceX2a82d179NoMatchException(
  message: String,
) : InlineInvoiceitemInvoiceX2a82d179DecodingException(message)

internal data class InlineInvoiceitemInvoiceX2a82d179Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInvoice: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInvoice).count { it }
}

/**
 * The ID of the invoice this invoice item belongs to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoiceitem/properties/invoice
 */
@Serializable(with = InlineInvoiceitemInvoiceX2a82d179.Serializer::class)
public class InlineInvoiceitemInvoiceX2a82d179 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoiceitemInvoiceX2a82d179Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val invoice: Invoice? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoice) json.decodeFromJsonElement<Invoice>(raw) else null }

  public val matchedBranches: Set<InlineInvoiceitemInvoiceX2a82d179Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoiceitemInvoiceX2a82d179Branch.Branch1)
      if (inspection.matchesInvoice) add(InlineInvoiceitemInvoiceX2a82d179Branch.Invoice)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceitemInvoiceX2a82d179 {
      val inspection = inspectInlineInvoiceitemInvoiceX2a82d179(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceitemInvoiceX2a82d179NoMatchException("InlineInvoiceitemInvoiceX2a82d179 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceitemInvoiceX2a82d179(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoiceitemInvoiceX2a82d179> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceitemInvoiceX2a82d179 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceitemInvoiceX2a82d179")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceitemInvoiceX2a82d179) {
      encoder.requireJsonEncoder("InlineInvoiceitemInvoiceX2a82d179").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceitemInvoiceX2a82d179(element: JsonElement): InlineInvoiceitemInvoiceX2a82d179Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInvoice = element.isJsonDecodable<Invoice>()
  return InlineInvoiceitemInvoiceX2a82d179Inspection(
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
