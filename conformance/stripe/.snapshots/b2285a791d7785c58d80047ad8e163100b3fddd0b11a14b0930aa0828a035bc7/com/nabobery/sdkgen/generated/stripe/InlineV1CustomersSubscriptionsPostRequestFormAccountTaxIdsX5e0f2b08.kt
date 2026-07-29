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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08Branch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X7b9fbef8,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X7b9fbef8:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X7b9fbef8).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/account_tax_ids.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/account_tax_ids
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X7b9fbef8:
      InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X7b9fbef8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X7b9fbef8) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X7b9fbef8>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08Branch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X7b9fbef8) add(InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08Branch.InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X7b9fbef8)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X7b9fbef8 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X7b9fbef8>()
  return InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX5e0f2b08Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X7b9fbef8 = matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X7b9fbef8,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X7b9fbef8) add("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X7b9fbef8: value does not match InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X7b9fbef8")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
