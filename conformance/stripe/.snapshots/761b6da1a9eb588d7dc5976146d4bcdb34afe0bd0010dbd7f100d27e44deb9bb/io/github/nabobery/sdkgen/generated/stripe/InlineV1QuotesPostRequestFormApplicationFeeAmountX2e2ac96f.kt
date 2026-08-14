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

public enum class InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96fBranch {
  Branch1,
  InlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X9acea27a,
}

public sealed class InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96fNoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96fDecodingException(message)

internal data class InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X9acea27a: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X9acea27a).count { it }
}

/**
 * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to the
 * application owner's Stripe account. There cannot be any line items with recurring prices when using this field.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/application_fee_amount
 */
@Serializable(with = InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96f.Serializer::class)
public class InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96fInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X9acea27a:
      InlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X9acea27a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X9acea27a) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X9acea27a>(raw) else null }

  public val matchedBranches: Set<InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96fBranch.Branch1)
      if (inspection.matchesInlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X9acea27a) add(InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96fBranch.InlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X9acea27a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96f {
      val inspection = inspectInlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96fNoMatchException("InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96f) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96f(element: JsonElement): InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96fInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X9acea27a = element.isJsonDecodable<InlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X9acea27a>()
  return InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X9acea27a = matchesInlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X9acea27a,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X9acea27a) add("InlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X9acea27a: value does not match InlineV1QuotesPostRequestFormApplicationFeeAmountAnyOf2X9acea27a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
