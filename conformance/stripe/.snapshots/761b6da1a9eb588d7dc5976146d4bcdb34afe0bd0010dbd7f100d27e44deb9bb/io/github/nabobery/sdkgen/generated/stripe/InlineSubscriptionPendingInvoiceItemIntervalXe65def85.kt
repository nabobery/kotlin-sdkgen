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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineSubscriptionPendingInvoiceItemIntervalXe65def85Branch {
  SubscriptionPendingInvoiceItemInterval,
}

public sealed class InlineSubscriptionPendingInvoiceItemIntervalXe65def85DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionPendingInvoiceItemIntervalXe65def85NoMatchException(
  message: String,
) : InlineSubscriptionPendingInvoiceItemIntervalXe65def85DecodingException(message)

internal data class InlineSubscriptionPendingInvoiceItemIntervalXe65def85Inspection(
  public val matchesSubscriptionPendingInvoiceItemInterval: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSubscriptionPendingInvoiceItemInterval).count { it }
}

/**
 * Specifies an interval for how often to bill for any pending invoice items. It is analogous to calling [Create an
 * invoice](/api/invoices/create) for the given subscription at the specified interval.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/pending_invoice_item_interval
 */
@Serializable(with = InlineSubscriptionPendingInvoiceItemIntervalXe65def85.Serializer::class)
public class InlineSubscriptionPendingInvoiceItemIntervalXe65def85 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionPendingInvoiceItemIntervalXe65def85Inspection,
) {
  public val subscriptionPendingInvoiceItemInterval: SubscriptionPendingInvoiceItemIntervalView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscriptionPendingInvoiceItemInterval) json.decodeFromJsonElement<SubscriptionPendingInvoiceItemIntervalView>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionPendingInvoiceItemIntervalXe65def85Branch>
    get() = buildSet {
      if (inspection.matchesSubscriptionPendingInvoiceItemInterval) add(InlineSubscriptionPendingInvoiceItemIntervalXe65def85Branch.SubscriptionPendingInvoiceItemInterval)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionPendingInvoiceItemIntervalXe65def85 {
      val inspection = inspectInlineSubscriptionPendingInvoiceItemIntervalXe65def85(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionPendingInvoiceItemIntervalXe65def85NoMatchException("InlineSubscriptionPendingInvoiceItemIntervalXe65def85 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionPendingInvoiceItemIntervalXe65def85(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionPendingInvoiceItemIntervalXe65def85> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionPendingInvoiceItemIntervalXe65def85 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionPendingInvoiceItemIntervalXe65def85")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionPendingInvoiceItemIntervalXe65def85) {
      encoder.requireJsonEncoder("InlineSubscriptionPendingInvoiceItemIntervalXe65def85").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionPendingInvoiceItemIntervalXe65def85(element: JsonElement): InlineSubscriptionPendingInvoiceItemIntervalXe65def85Inspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionPendingInvoiceItemIntervalXe65def85Inspection(
    matchesSubscriptionPendingInvoiceItemInterval = false,
    failures = listOf("SubscriptionPendingInvoiceItemInterval: expected JSON object"),
  )
  val matchesSubscriptionPendingInvoiceItemInterval = raw["interval"] != null && raw["interval_count"] != null
  return InlineSubscriptionPendingInvoiceItemIntervalXe65def85Inspection(
    matchesSubscriptionPendingInvoiceItemInterval = matchesSubscriptionPendingInvoiceItemInterval,
    failures = buildList {
      if (!matchesSubscriptionPendingInvoiceItemInterval) add("SubscriptionPendingInvoiceItemInterval: required properties 'interval', 'interval_count' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
