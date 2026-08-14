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

public enum class InlineInvoiceAccountTaxIdsItemX1551760aBranch {
  Branch1,
  TaxId,
  DeletedTaxId,
}

public sealed class InlineInvoiceAccountTaxIdsItemX1551760aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceAccountTaxIdsItemX1551760aNoMatchException(
  message: String,
) : InlineInvoiceAccountTaxIdsItemX1551760aDecodingException(message)

internal data class InlineInvoiceAccountTaxIdsItemX1551760aInspection(
  public val matchesBranch1: Boolean,
  public val matchesTaxId: Boolean,
  public val matchesDeletedTaxId: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesTaxId, matchesDeletedTaxId).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/components/schemas/invoice/properties/account_tax_ids/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/account_tax_ids/items
 */
@Serializable(with = InlineInvoiceAccountTaxIdsItemX1551760a.Serializer::class)
public class InlineInvoiceAccountTaxIdsItemX1551760a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoiceAccountTaxIdsItemX1551760aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val taxId: TaxId? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxId) json.decodeFromJsonElement<TaxId>(raw) else null }

  public val deletedTaxId: DeletedTaxId? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedTaxId) json.decodeFromJsonElement<DeletedTaxId>(raw) else null }

  public val matchedBranches: Set<InlineInvoiceAccountTaxIdsItemX1551760aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoiceAccountTaxIdsItemX1551760aBranch.Branch1)
      if (inspection.matchesTaxId) add(InlineInvoiceAccountTaxIdsItemX1551760aBranch.TaxId)
      if (inspection.matchesDeletedTaxId) add(InlineInvoiceAccountTaxIdsItemX1551760aBranch.DeletedTaxId)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceAccountTaxIdsItemX1551760a {
      val inspection = inspectInlineInvoiceAccountTaxIdsItemX1551760a(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceAccountTaxIdsItemX1551760aNoMatchException("InlineInvoiceAccountTaxIdsItemX1551760a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceAccountTaxIdsItemX1551760a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInvoiceAccountTaxIdsItemX1551760a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceAccountTaxIdsItemX1551760a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceAccountTaxIdsItemX1551760a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceAccountTaxIdsItemX1551760a) {
      encoder.requireJsonEncoder("InlineInvoiceAccountTaxIdsItemX1551760a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceAccountTaxIdsItemX1551760a(element: JsonElement): InlineInvoiceAccountTaxIdsItemX1551760aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTaxId = element.isJsonDecodable<TaxId>()
  val matchesDeletedTaxId = element.isJsonDecodable<DeletedTaxId>()
  return InlineInvoiceAccountTaxIdsItemX1551760aInspection(
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
