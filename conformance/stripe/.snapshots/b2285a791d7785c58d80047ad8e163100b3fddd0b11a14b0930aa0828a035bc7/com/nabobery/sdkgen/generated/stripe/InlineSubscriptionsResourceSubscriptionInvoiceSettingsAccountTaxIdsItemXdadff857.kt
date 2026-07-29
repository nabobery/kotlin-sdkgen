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

public enum class InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857Branch {
  Branch1,
  TaxId,
  DeletedTaxId,
}

public sealed class InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857NoMatchException(
  message: String,
) : InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857DecodingException(message)

internal data class InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857Inspection(
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
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_subscription_invoice_settings/properties/acco
 * unt_tax_ids/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_subscription_invoice_settings/properties/acco
 * unt_tax_ids/items
 */
@Serializable(with = InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857.Serializer::class)
public class InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val taxId: TaxId? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxId) json.decodeFromJsonElement<TaxId>(raw) else null }

  public val deletedTaxId: DeletedTaxId? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedTaxId) json.decodeFromJsonElement<DeletedTaxId>(raw) else null }

  public val matchedBranches:
      Set<InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857Branch.Branch1)
      if (inspection.matchesTaxId) add(InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857Branch.TaxId)
      if (inspection.matchesDeletedTaxId) add(InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857Branch.DeletedTaxId)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857 {
      val inspection = inspectInlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857NoMatchException("InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857) {
      encoder.requireJsonEncoder("InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857(element: JsonElement): InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTaxId = element.isJsonDecodable<TaxId>()
  val matchesDeletedTaxId = element.isJsonDecodable<DeletedTaxId>()
  return InlineSubscriptionsResourceSubscriptionInvoiceSettingsAccountTaxIdsItemXdadff857Inspection(
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
