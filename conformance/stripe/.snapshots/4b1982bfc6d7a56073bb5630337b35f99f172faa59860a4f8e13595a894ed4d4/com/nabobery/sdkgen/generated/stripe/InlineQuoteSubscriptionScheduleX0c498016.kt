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

public enum class InlineQuoteSubscriptionScheduleX0c498016Branch {
  Branch1,
  SubscriptionSchedule,
}

public sealed class InlineQuoteSubscriptionScheduleX0c498016DecodingException(
  message: String,
) : SerializationException(message)

public class InlineQuoteSubscriptionScheduleX0c498016NoMatchException(
  message: String,
) : InlineQuoteSubscriptionScheduleX0c498016DecodingException(message)

internal data class InlineQuoteSubscriptionScheduleX0c498016Inspection(
  public val matchesBranch1: Boolean,
  public val matchesSubscriptionSchedule: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesSubscriptionSchedule).count { it }
}

/**
 * The subscription schedule that was created or updated from this quote.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quote/properties/subscription_schedule
 */
@Serializable(with = InlineQuoteSubscriptionScheduleX0c498016.Serializer::class)
public class InlineQuoteSubscriptionScheduleX0c498016 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineQuoteSubscriptionScheduleX0c498016Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val subscriptionSchedule: SubscriptionSchedule? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscriptionSchedule) json.decodeFromJsonElement<SubscriptionSchedule>(raw) else null }

  public val matchedBranches: Set<InlineQuoteSubscriptionScheduleX0c498016Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineQuoteSubscriptionScheduleX0c498016Branch.Branch1)
      if (inspection.matchesSubscriptionSchedule) add(InlineQuoteSubscriptionScheduleX0c498016Branch.SubscriptionSchedule)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineQuoteSubscriptionScheduleX0c498016 {
      val inspection = inspectInlineQuoteSubscriptionScheduleX0c498016(raw)
      if (inspection.matchCount == 0) {
        throw InlineQuoteSubscriptionScheduleX0c498016NoMatchException("InlineQuoteSubscriptionScheduleX0c498016 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineQuoteSubscriptionScheduleX0c498016(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineQuoteSubscriptionScheduleX0c498016> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineQuoteSubscriptionScheduleX0c498016 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineQuoteSubscriptionScheduleX0c498016")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineQuoteSubscriptionScheduleX0c498016) {
      encoder.requireJsonEncoder("InlineQuoteSubscriptionScheduleX0c498016").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineQuoteSubscriptionScheduleX0c498016(element: JsonElement): InlineQuoteSubscriptionScheduleX0c498016Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesSubscriptionSchedule = element.isJsonDecodable<SubscriptionSchedule>()
  return InlineQuoteSubscriptionScheduleX0c498016Inspection(
    matchesBranch1 = matchesBranch1,
    matchesSubscriptionSchedule = matchesSubscriptionSchedule,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesSubscriptionSchedule) add("SubscriptionSchedule: value does not match SubscriptionSchedule")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
