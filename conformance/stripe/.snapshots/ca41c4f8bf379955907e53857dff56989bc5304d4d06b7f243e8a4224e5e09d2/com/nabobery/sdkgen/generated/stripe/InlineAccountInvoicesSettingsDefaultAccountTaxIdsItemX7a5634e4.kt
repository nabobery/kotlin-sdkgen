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

public enum class InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4Branch {
  Branch1,
  TaxId,
}

public sealed class InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4NoMatchException(
  message: String,
) : InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4DecodingException(message)

internal data class InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4Inspection(
  public val matchesBranch1: Boolean,
  public val matchesTaxId: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesTaxId).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/account_invoices_settings/properties/default_account_tax_ids/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/account_invoices_settings/properties/default_account_tax_ids/items
 */
@Serializable(with = InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4.Serializer::class)
public class InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val taxId: TaxId? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxId) json.decodeFromJsonElement<TaxId>(raw) else null }

  public val matchedBranches:
      Set<InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4Branch.Branch1)
      if (inspection.matchesTaxId) add(InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4Branch.TaxId)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4 {
      val inspection = inspectInlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4(raw)
      if (inspection.matchCount == 0) {
        throw InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4NoMatchException("InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4) {
      encoder.requireJsonEncoder("InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4(element: JsonElement): InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTaxId = element.isJsonDecodable<TaxId>()
  return InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4Inspection(
    matchesBranch1 = matchesBranch1,
    matchesTaxId = matchesTaxId,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesTaxId) add("TaxId: value does not match TaxId")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
