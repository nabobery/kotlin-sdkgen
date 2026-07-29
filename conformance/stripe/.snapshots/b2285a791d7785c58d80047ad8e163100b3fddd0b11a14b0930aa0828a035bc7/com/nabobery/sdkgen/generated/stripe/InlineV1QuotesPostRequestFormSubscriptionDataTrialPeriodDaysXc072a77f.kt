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

public enum class InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77fBranch {
  Branch1,
  InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e,
}

public sealed class InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77fNoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77fDecodingException(message)

internal data class InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/subscription_data/properties/trial_period_days.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/subscription_data/properties/trial_period_days
 */
@Serializable(with = InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77f.Serializer::class)
public class InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77fInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e:
      InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e>(raw) else null }

  public val matchedBranches:
      Set<InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77fBranch.Branch1)
      if (inspection.matchesInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e) add(InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77fBranch.InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77f {
      val inspection = inspectInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77fNoMatchException("InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77f(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77f) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77f(element: JsonElement): InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77fInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e = element.isJsonDecodable<InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e>()
  return InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysXc072a77fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e = matchesInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e) add("InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e: value does not match InlineV1QuotesPostRequestFormSubscriptionDataTrialPeriodDaysAnyOf2X8805a44e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
