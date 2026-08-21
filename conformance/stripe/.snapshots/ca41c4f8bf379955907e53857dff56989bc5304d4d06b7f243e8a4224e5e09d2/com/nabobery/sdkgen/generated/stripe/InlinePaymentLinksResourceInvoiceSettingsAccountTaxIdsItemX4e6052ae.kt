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

public enum class InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052aeBranch {
  Branch1,
  TaxId,
  DeletedTaxId,
}

public sealed class InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052aeDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052aeNoMatchException(
  message: String,
) : InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052aeDecodingException(message)

internal data class InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052aeInspection(
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
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_invoice_settings/properties/account_tax_ids/i
 * tems.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_invoice_settings/properties/account_tax_ids/i
 * tems
 */
@Serializable(with = InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052ae.Serializer::class)
public class InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052ae internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052aeInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val taxId: TaxId? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxId) json.decodeFromJsonElement<TaxId>(raw) else null }

  public val deletedTaxId: DeletedTaxId? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedTaxId) json.decodeFromJsonElement<DeletedTaxId>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052aeBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052aeBranch.Branch1)
      if (inspection.matchesTaxId) add(InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052aeBranch.TaxId)
      if (inspection.matchesDeletedTaxId) add(InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052aeBranch.DeletedTaxId)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052ae {
      val inspection = inspectInlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052ae(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052aeNoMatchException("InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052ae matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052ae(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052ae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052ae {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052ae")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052ae) {
      encoder.requireJsonEncoder("InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052ae").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052ae(element: JsonElement): InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052aeInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTaxId = element.isJsonDecodable<TaxId>()
  val matchesDeletedTaxId = element.isJsonDecodable<DeletedTaxId>()
  return InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052aeInspection(
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
