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

public enum class InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420Branch {
  Branch1,
  InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X48a8e632,
}

public sealed class InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420NoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420DecodingException(message)

internal data class InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X48a8e632:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X48a8e632).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/subscription_data/properties/trial_period_days.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/subscription_data/properties/trial_period_days
 */
@Serializable(with = InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420.Serializer::class)
public class InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X48a8e632:
      InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X48a8e632? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X48a8e632) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X48a8e632>(raw) else null }

  public val matchedBranches:
      Set<InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420Branch.Branch1)
      if (inspection.matchesInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X48a8e632) add(InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420Branch.InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X48a8e632)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420 {
      val inspection = inspectInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420NoMatchException("InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420(element: JsonElement): InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X48a8e632 = element.isJsonDecodable<InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X48a8e632>()
  return InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc8000420Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X48a8e632 = matchesInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X48a8e632,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X48a8e632) add("InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X48a8e632: value does not match InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X48a8e632")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
