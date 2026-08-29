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

public enum class InlineInvoicePaymentInvoiceXd7bd6515Branch {
  Branch1,
  Invoice,
  DeletedInvoice,
}

public sealed class InlineInvoicePaymentInvoiceXd7bd6515DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoicePaymentInvoiceXd7bd6515NoMatchException(
  message: String,
) : InlineInvoicePaymentInvoiceXd7bd6515DecodingException(message)

internal data class InlineInvoicePaymentInvoiceXd7bd6515Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInvoice: Boolean,
  public val matchesDeletedInvoice: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInvoice, matchesDeletedInvoice).count { it }
}

/**
 * The invoice that was paid.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_payment/properties/invoice
 */
@Serializable(with = InlineInvoicePaymentInvoiceXd7bd6515.Serializer::class)
public class InlineInvoicePaymentInvoiceXd7bd6515 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoicePaymentInvoiceXd7bd6515Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val invoice: Invoice? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoice) json.decodeFromJsonElement<Invoice>(raw) else null }

  public val deletedInvoice: DeletedInvoice? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedInvoice) json.decodeFromJsonElement<DeletedInvoice>(raw) else null }

  public val matchedBranches: Set<InlineInvoicePaymentInvoiceXd7bd6515Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoicePaymentInvoiceXd7bd6515Branch.Branch1)
      if (inspection.matchesInvoice) add(InlineInvoicePaymentInvoiceXd7bd6515Branch.Invoice)
      if (inspection.matchesDeletedInvoice) add(InlineInvoicePaymentInvoiceXd7bd6515Branch.DeletedInvoice)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoicePaymentInvoiceXd7bd6515 {
      val inspection = inspectInlineInvoicePaymentInvoiceXd7bd6515(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoicePaymentInvoiceXd7bd6515NoMatchException("InlineInvoicePaymentInvoiceXd7bd6515 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoicePaymentInvoiceXd7bd6515(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInvoicePaymentInvoiceXd7bd6515> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoicePaymentInvoiceXd7bd6515 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicePaymentInvoiceXd7bd6515")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoicePaymentInvoiceXd7bd6515) {
      encoder.requireJsonEncoder("InlineInvoicePaymentInvoiceXd7bd6515").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoicePaymentInvoiceXd7bd6515(element: JsonElement): InlineInvoicePaymentInvoiceXd7bd6515Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInvoice = element.isJsonDecodable<Invoice>()
  val matchesDeletedInvoice = element.isJsonDecodable<DeletedInvoice>()
  return InlineInvoicePaymentInvoiceXd7bd6515Inspection(
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
