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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3cBranch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173,
}

public sealed class InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3cNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3cDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3cInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173).count { it }
}

/**
 * The coupons to redeem into discounts for the subscription. If not specified or empty, inherits the discount from the
 * subscription's customer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/discounts
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3c.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3cInspection,
) {
  public val branch1: List<InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX7b6369c0>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX7b6369c0>>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173:
      InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3cBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173) add(InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3cBranch.InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3c {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormDiscountsX04b76c3c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3cNoMatchException("InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3c) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormDiscountsX04b76c3c(element: JsonElement): InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3cInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX7b6369c0>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173>()
  return InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3cInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173 = matchesInlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173) add("InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173: value does not match InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
