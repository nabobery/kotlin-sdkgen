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

public enum class InlineCustomerBalanceTransactionInvoiceXa74b01e8Branch {
  Branch1,
  Invoice,
}

public sealed class InlineCustomerBalanceTransactionInvoiceXa74b01e8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerBalanceTransactionInvoiceXa74b01e8NoMatchException(
  message: String,
) : InlineCustomerBalanceTransactionInvoiceXa74b01e8DecodingException(message)

internal data class InlineCustomerBalanceTransactionInvoiceXa74b01e8Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInvoice: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInvoice).count { it }
}

/**
 * The ID of the invoice (if any) related to the transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_balance_transaction/properties/invoice
 */
@Serializable(with = InlineCustomerBalanceTransactionInvoiceXa74b01e8.Serializer::class)
public class InlineCustomerBalanceTransactionInvoiceXa74b01e8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomerBalanceTransactionInvoiceXa74b01e8Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val invoice: Invoice? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoice) json.decodeFromJsonElement<Invoice>(raw) else null }

  public val matchedBranches: Set<InlineCustomerBalanceTransactionInvoiceXa74b01e8Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCustomerBalanceTransactionInvoiceXa74b01e8Branch.Branch1)
      if (inspection.matchesInvoice) add(InlineCustomerBalanceTransactionInvoiceXa74b01e8Branch.Invoice)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerBalanceTransactionInvoiceXa74b01e8 {
      val inspection = inspectInlineCustomerBalanceTransactionInvoiceXa74b01e8(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerBalanceTransactionInvoiceXa74b01e8NoMatchException("InlineCustomerBalanceTransactionInvoiceXa74b01e8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerBalanceTransactionInvoiceXa74b01e8(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerBalanceTransactionInvoiceXa74b01e8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerBalanceTransactionInvoiceXa74b01e8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerBalanceTransactionInvoiceXa74b01e8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerBalanceTransactionInvoiceXa74b01e8) {
      encoder.requireJsonEncoder("InlineCustomerBalanceTransactionInvoiceXa74b01e8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerBalanceTransactionInvoiceXa74b01e8(element: JsonElement): InlineCustomerBalanceTransactionInvoiceXa74b01e8Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInvoice = element.isJsonDecodable<Invoice>()
  return InlineCustomerBalanceTransactionInvoiceXa74b01e8Inspection(
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
