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

public enum class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aadBranch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X799408f7,
}

public sealed class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aadDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aadNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aadDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aadInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X799408f7:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X799408f7).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/tax_rates
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aad.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aad internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aadInspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X799408f7:
      InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X799408f7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X799408f7) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X799408f7>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aadBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aadBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X799408f7) add(InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aadBranch.InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X799408f7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aad {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aad(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aadNoMatchException("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aad matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aad(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aad")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aad) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aad").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aad(element: JsonElement): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aadInspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X799408f7 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X799408f7>()
  return InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aadInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X799408f7 = matchesInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X799408f7,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X799408f7) add("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X799408f7: value does not match InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesAnyOf2X799408f7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
