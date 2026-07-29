package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Double
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

public enum class InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83eBranch {
  Branch1,
  InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2X50339a20,
}

public sealed class InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83eNoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83eDecodingException(message)

internal data class InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2X50339a20: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2X50339a20).count { it }
}

/**
 * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
 * subscription invoice total that will be transferred to the application owner's Stripe account. There must be at least
 * 1 line item with a recurring price to use this field.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/application_fee_percent
 */
@Serializable(with = InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83e.Serializer::class)
public class InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83eInspection,
) {
  public val branch1: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Double>(raw) else null }

  public val inlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2X50339a20:
      InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2X50339a20? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2X50339a20) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2X50339a20>(raw) else null }

  public val matchedBranches: Set<InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83eBranch.Branch1)
      if (inspection.matchesInlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2X50339a20) add(InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83eBranch.InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2X50339a20)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83e {
      val inspection = inspectInlineV1QuotesPostRequestFormApplicationFeePercentXb102a83e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83eNoMatchException("InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83e) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormApplicationFeePercentXb102a83e(element: JsonElement): InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83eInspection {
  val matchesBranch1 = element.isJsonDecodable<Double>()
  val matchesInlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2X50339a20 = element.isJsonDecodable<InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2X50339a20>()
  return InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2X50339a20 = matchesInlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2X50339a20,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Double")
      if (!matchesInlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2X50339a20) add("InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2X50339a20: value does not match InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2X50339a20")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
