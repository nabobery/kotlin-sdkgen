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

public enum class InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976Branch {
  InlineV1CustomersSubscriptionsPostRequestFormAnyOf1X6e11cb21,
  InlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976Inspection(
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf1X6e11cb21: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf1X6e11cb21, matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a).count { it }
}

/**
 * Specifies an interval for how often to bill for any pending invoice items. It is analogous to calling [Create an
 * invoice](/api/invoices/create) for the given subscription at the specified interval.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/pending_invoice_item_interval
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976Inspection,
) {
  public val inlineV1CustomersSubscriptionsPostRequestFormAnyOf1X6e11cb21:
      InlineV1CustomersSubscriptionsPostRequestFormAnyOf1X6e11cb21? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf1X6e11cb21) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormAnyOf1X6e11cb21>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a:
      InlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf1X6e11cb21) add(InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976Branch.InlineV1CustomersSubscriptionsPostRequestFormAnyOf1X6e11cb21)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a) add(InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976Branch.InlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976Inspection {
  val matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf1X6e11cb21 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormAnyOf1X6e11cb21>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a>()
  return InlineV1CustomersSubscriptionsPostRequestFormPendingInvoiceItemIntervalXb4220976Inspection(
    matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf1X6e11cb21 = matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf1X6e11cb21,
    matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a = matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a,
    failures = buildList {
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf1X6e11cb21) add("InlineV1CustomersSubscriptionsPostRequestFormAnyOf1X6e11cb21: value does not match InlineV1CustomersSubscriptionsPostRequestFormAnyOf1X6e11cb21")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a) add("InlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a: value does not match InlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
