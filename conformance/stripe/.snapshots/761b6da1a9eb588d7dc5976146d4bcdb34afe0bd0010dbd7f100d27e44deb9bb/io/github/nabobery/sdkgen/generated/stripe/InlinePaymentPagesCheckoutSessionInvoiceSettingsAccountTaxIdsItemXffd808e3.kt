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

public enum class InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3Branch {
  Branch1,
  TaxId,
  DeletedTaxId,
}

public sealed class InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3NoMatchException(
  message: String,
) : InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3DecodingException(message)

internal data class InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3Inspection(
  public val matchesBranch1: Boolean,
  public val matchesTaxId: Boolean,
  public val matchesDeletedTaxId: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesTaxId, matchesDeletedTaxId).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_invoice_settings/properties/account_t
 * ax_ids/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_invoice_settings/properties/account_t
 * ax_ids/items
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3.Serializer::class)
public class InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val taxId: TaxId? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxId) json.decodeFromJsonElement<TaxId>(raw) else null }

  public val deletedTaxId: DeletedTaxId? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedTaxId) json.decodeFromJsonElement<DeletedTaxId>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3Branch.Branch1)
      if (inspection.matchesTaxId) add(InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3Branch.TaxId)
      if (inspection.matchesDeletedTaxId) add(InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3Branch.DeletedTaxId)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3 {
      val inspection = inspectInlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3NoMatchException("InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3) {
      encoder.requireJsonEncoder("InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3(element: JsonElement): InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTaxId = element.isJsonDecodable<TaxId>()
  val matchesDeletedTaxId = element.isJsonDecodable<DeletedTaxId>()
  return InlinePaymentPagesCheckoutSessionInvoiceSettingsAccountTaxIdsItemXffd808e3Inspection(
    matchesBranch1 = matchesBranch1,
    matchesTaxId = matchesTaxId,
    matchesDeletedTaxId = matchesDeletedTaxId,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesTaxId) add("TaxId: value does not match TaxId")
      if (!matchesDeletedTaxId) add("DeletedTaxId: value does not match DeletedTaxId")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
