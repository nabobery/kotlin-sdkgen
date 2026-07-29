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

public enum class InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440dBranch {
  Branch1,
  TaxId,
  DeletedTaxId,
}

public sealed class InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440dNoMatchException(
  message: String,
) : InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440dDecodingException(message)

internal data class InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440dInspection(
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
 * sdkgen://source/openapi.json#/components/schemas/invoice_setting_subscription_schedule_setting/properties/account_tax
 * _ids/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoice_setting_subscription_schedule_setting/properties/account_tax
 * _ids/items
 */
@Serializable(with = InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440d.Serializer::class)
public class InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440dInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val taxId: TaxId? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxId) json.decodeFromJsonElement<TaxId>(raw) else null }

  public val deletedTaxId: DeletedTaxId? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedTaxId) json.decodeFromJsonElement<DeletedTaxId>(raw) else null }

  public val matchedBranches:
      Set<InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440dBranch.Branch1)
      if (inspection.matchesTaxId) add(InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440dBranch.TaxId)
      if (inspection.matchesDeletedTaxId) add(InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440dBranch.DeletedTaxId)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440d {
      val inspection = inspectInlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440d(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440dNoMatchException("InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440d(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440d) {
      encoder.requireJsonEncoder("InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440d(element: JsonElement): InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440dInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTaxId = element.isJsonDecodable<TaxId>()
  val matchesDeletedTaxId = element.isJsonDecodable<DeletedTaxId>()
  return InlineInvoiceSettingSubscriptionScheduleSettingAccountTaxIdsItemX443d440dInspection(
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
