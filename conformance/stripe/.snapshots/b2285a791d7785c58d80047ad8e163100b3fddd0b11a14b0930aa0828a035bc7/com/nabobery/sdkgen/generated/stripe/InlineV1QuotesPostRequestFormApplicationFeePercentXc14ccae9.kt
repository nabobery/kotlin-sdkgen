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

public enum class InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9Branch {
  Branch1,
  InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c,
}

public sealed class InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9NoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9DecodingException(message)

internal data class InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c).count { it }
}

/**
 * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
 * subscription invoice total that will be transferred to the application owner's Stripe account. There must be at least
 * 1 line item with a recurring price to use this field.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/application_fee_percent
 */
@Serializable(with = InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9.Serializer::class)
public class InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9Inspection,
) {
  public val branch1: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Double>(raw) else null }

  public val inlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c:
      InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c>(raw) else null }

  public val matchedBranches: Set<InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9Branch.Branch1)
      if (inspection.matchesInlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c) add(InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9Branch.InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9 {
      val inspection = inspectInlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9NoMatchException("InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9(element: JsonElement): InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9Inspection {
  val matchesBranch1 = element.isJsonDecodable<Double>()
  val matchesInlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c = element.isJsonDecodable<InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c>()
  return InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c = matchesInlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Double")
      if (!matchesInlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c) add("InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c: value does not match InlineV1QuotesPostRequestFormApplicationFeePercentAnyOf2Xfd43864c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
