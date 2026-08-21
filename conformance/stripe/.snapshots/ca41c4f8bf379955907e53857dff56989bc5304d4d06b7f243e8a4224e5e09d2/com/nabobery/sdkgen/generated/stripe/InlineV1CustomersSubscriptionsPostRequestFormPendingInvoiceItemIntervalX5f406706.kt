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

public enum class InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706Branch {
  InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e,
  InlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xb6f57c23,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706Inspection(
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xb6f57c23: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e, matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xb6f57c23).count { it }
}

/**
 * Specifies an interval for how often to bill for any pending invoice items. It is analogous to calling [Create an
 * invoice](/api/invoices/create) for the given subscription at the specified interval.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/pending_invoice_item_interval
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706Inspection,
) {
  public val inlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e:
      InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xb6f57c23:
      InlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xb6f57c23? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xb6f57c23) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xb6f57c23>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e) add(InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706Branch.InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xb6f57c23) add(InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706Branch.InlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xb6f57c23)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706Inspection {
  val matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xb6f57c23 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xb6f57c23>()
  return InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalX5f406706Inspection(
    matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e = matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e,
    matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xb6f57c23 = matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xb6f57c23,
    failures = buildList {
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e) add("InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e: value does not match InlineV1CustomersSubscriptionsPostRequestFormAnyOf1Xe0d3f90e")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xb6f57c23) add("InlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xb6f57c23: value does not match InlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xb6f57c23")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
