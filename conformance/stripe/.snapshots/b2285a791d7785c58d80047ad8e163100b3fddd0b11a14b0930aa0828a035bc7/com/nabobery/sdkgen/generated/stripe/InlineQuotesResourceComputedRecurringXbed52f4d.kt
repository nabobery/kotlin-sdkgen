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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineQuotesResourceComputedRecurringXbed52f4dBranch {
  QuotesResourceRecurring,
}

public sealed class InlineQuotesResourceComputedRecurringXbed52f4dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineQuotesResourceComputedRecurringXbed52f4dNoMatchException(
  message: String,
) : InlineQuotesResourceComputedRecurringXbed52f4dDecodingException(message)

internal data class InlineQuotesResourceComputedRecurringXbed52f4dInspection(
  public val matchesQuotesResourceRecurring: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesQuotesResourceRecurring).count { it }
}

/**
 * The definitive totals and line items the customer will be charged on a recurring basis. Takes into account the line
 * items with recurring prices and discounts with `duration=forever` coupons only. Defaults to `null` if no inputted
 * line items with recurring prices.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quotes_resource_computed/properties/recurring
 */
@Serializable(with = InlineQuotesResourceComputedRecurringXbed52f4d.Serializer::class)
public class InlineQuotesResourceComputedRecurringXbed52f4d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineQuotesResourceComputedRecurringXbed52f4dInspection,
) {
  public val quotesResourceRecurring: QuotesResourceRecurringView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesQuotesResourceRecurring) json.decodeFromJsonElement<QuotesResourceRecurringView>(raw) else null }

  public val matchedBranches: Set<InlineQuotesResourceComputedRecurringXbed52f4dBranch>
    get() = buildSet {
      if (inspection.matchesQuotesResourceRecurring) add(InlineQuotesResourceComputedRecurringXbed52f4dBranch.QuotesResourceRecurring)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineQuotesResourceComputedRecurringXbed52f4d {
      val inspection = inspectInlineQuotesResourceComputedRecurringXbed52f4d(raw)
      if (inspection.matchCount == 0) {
        throw InlineQuotesResourceComputedRecurringXbed52f4dNoMatchException("InlineQuotesResourceComputedRecurringXbed52f4d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineQuotesResourceComputedRecurringXbed52f4d(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineQuotesResourceComputedRecurringXbed52f4d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineQuotesResourceComputedRecurringXbed52f4d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineQuotesResourceComputedRecurringXbed52f4d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineQuotesResourceComputedRecurringXbed52f4d) {
      encoder.requireJsonEncoder("InlineQuotesResourceComputedRecurringXbed52f4d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineQuotesResourceComputedRecurringXbed52f4d(element: JsonElement): InlineQuotesResourceComputedRecurringXbed52f4dInspection {
  val raw = element as? JsonObject ?: return InlineQuotesResourceComputedRecurringXbed52f4dInspection(
    matchesQuotesResourceRecurring = false,
    failures = listOf("QuotesResourceRecurring: expected JSON object"),
  )
  val matchesQuotesResourceRecurring = raw["amount_subtotal"] != null && raw["amount_total"] != null && raw["interval"] != null && raw["interval_count"] != null && raw["total_details"] != null
  return InlineQuotesResourceComputedRecurringXbed52f4dInspection(
    matchesQuotesResourceRecurring = matchesQuotesResourceRecurring,
    failures = buildList {
      if (!matchesQuotesResourceRecurring) add("QuotesResourceRecurring: required properties 'amount_subtotal', 'amount_total', 'interval', 'interval_count', 'total_details' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
