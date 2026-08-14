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

public enum class InlinePaymentIntentReviewX626eb3f1Branch {
  Branch1,
  Review,
}

public sealed class InlinePaymentIntentReviewX626eb3f1DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentReviewX626eb3f1NoMatchException(
  message: String,
) : InlinePaymentIntentReviewX626eb3f1DecodingException(message)

internal data class InlinePaymentIntentReviewX626eb3f1Inspection(
  public val matchesBranch1: Boolean,
  public val matchesReview: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesReview).count { it }
}

/**
 * ID of the review associated with this PaymentIntent, if any.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/review
 */
@Serializable(with = InlinePaymentIntentReviewX626eb3f1.Serializer::class)
public class InlinePaymentIntentReviewX626eb3f1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentReviewX626eb3f1Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val review: Review? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesReview) json.decodeFromJsonElement<Review>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentReviewX626eb3f1Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePaymentIntentReviewX626eb3f1Branch.Branch1)
      if (inspection.matchesReview) add(InlinePaymentIntentReviewX626eb3f1Branch.Review)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentReviewX626eb3f1 {
      val inspection = inspectInlinePaymentIntentReviewX626eb3f1(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentReviewX626eb3f1NoMatchException("InlinePaymentIntentReviewX626eb3f1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentReviewX626eb3f1(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentReviewX626eb3f1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentReviewX626eb3f1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentReviewX626eb3f1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentReviewX626eb3f1) {
      encoder.requireJsonEncoder("InlinePaymentIntentReviewX626eb3f1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentReviewX626eb3f1(element: JsonElement): InlinePaymentIntentReviewX626eb3f1Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesReview = element.isJsonDecodable<Review>()
  return InlinePaymentIntentReviewX626eb3f1Inspection(
    matchesBranch1 = matchesBranch1,
    matchesReview = matchesReview,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesReview) add("Review: value does not match Review")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
