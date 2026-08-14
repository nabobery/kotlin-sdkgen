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

public enum class InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39dBranch {
  Branch1,
  InlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X1b412b86,
}

public sealed class InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39dNoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39dDecodingException(message)

internal data class InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X1b412b86: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X1b412b86).count { it }
}

/**
 * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to the
 * application owner's Stripe account. There cannot be any line items with recurring prices when using this field.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/application_fee_amount
 */
@Serializable(with = InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39d.Serializer::class)
public class InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39dInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X1b412b86:
      InlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X1b412b86? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X1b412b86) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X1b412b86>(raw) else null }

  public val matchedBranches: Set<InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39dBranch.Branch1)
      if (inspection.matchesInlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X1b412b86) add(InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39dBranch.InlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X1b412b86)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39d {
      val inspection = inspectInlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39dNoMatchException("InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39d) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39d(element: JsonElement): InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39dInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X1b412b86 = element.isJsonDecodable<InlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X1b412b86>()
  return InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X1b412b86 = matchesInlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X1b412b86,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X1b412b86) add("InlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X1b412b86: value does not match InlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X1b412b86")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
