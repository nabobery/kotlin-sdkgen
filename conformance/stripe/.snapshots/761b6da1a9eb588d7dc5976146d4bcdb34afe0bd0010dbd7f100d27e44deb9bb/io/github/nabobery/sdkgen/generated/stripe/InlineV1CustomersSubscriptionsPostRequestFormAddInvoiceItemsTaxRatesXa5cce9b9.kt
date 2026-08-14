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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9Branch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2X5041fa56,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2X5041fa56:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2X5041fa56).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/tax_rates
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2X5041fa56:
      InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2X5041fa56? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2X5041fa56) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2X5041fa56>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9Branch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2X5041fa56) add(InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9Branch.InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2X5041fa56)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2X5041fa56 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2X5041fa56>()
  return InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2X5041fa56 = matchesInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2X5041fa56,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2X5041fa56) add("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2X5041fa56: value does not match InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemAnyOf2X5041fa56")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
