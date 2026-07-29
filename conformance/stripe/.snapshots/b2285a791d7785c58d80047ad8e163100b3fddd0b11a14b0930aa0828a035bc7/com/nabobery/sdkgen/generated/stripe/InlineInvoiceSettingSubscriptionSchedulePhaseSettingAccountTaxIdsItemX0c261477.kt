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

public enum class InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477Branch {
  Branch1,
  TaxId,
  DeletedTaxId,
}

public sealed class InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477NoMatchException(
  message: String,
) : InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477DecodingException(message)

internal data class InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477Inspection(
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
 * sdkgen://source/openapi.json#/components/schemas/invoice_setting_subscription_schedule_phase_setting/properties/accou
 * nt_tax_ids/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoice_setting_subscription_schedule_phase_setting/properties/accou
 * nt_tax_ids/items
 */
@Serializable(with = InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477.Serializer::class)
public class InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val taxId: TaxId? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxId) json.decodeFromJsonElement<TaxId>(raw) else null }

  public val deletedTaxId: DeletedTaxId? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedTaxId) json.decodeFromJsonElement<DeletedTaxId>(raw) else null }

  public val matchedBranches:
      Set<InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477Branch.Branch1)
      if (inspection.matchesTaxId) add(InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477Branch.TaxId)
      if (inspection.matchesDeletedTaxId) add(InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477Branch.DeletedTaxId)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477 {
      val inspection = inspectInlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477NoMatchException("InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477) {
      encoder.requireJsonEncoder("InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477(element: JsonElement): InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTaxId = element.isJsonDecodable<TaxId>()
  val matchesDeletedTaxId = element.isJsonDecodable<DeletedTaxId>()
  return InlineInvoiceSettingSubscriptionSchedulePhaseSettingAccountTaxIdsItemX0c261477Inspection(
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
