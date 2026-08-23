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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1QuotesPostRequestFormDiscountsXcce02801Branch {
  Branch1,
  InlineV1QuotesPostRequestFormDiscountsAnyOf2X2b7ea7a9,
}

public sealed class InlineV1QuotesPostRequestFormDiscountsXcce02801DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormDiscountsXcce02801NoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormDiscountsXcce02801DecodingException(message)

internal data class InlineV1QuotesPostRequestFormDiscountsXcce02801Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1QuotesPostRequestFormDiscountsAnyOf2X2b7ea7a9: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormDiscountsAnyOf2X2b7ea7a9).count { it }
}

/**
 * The discounts applied to the quote.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/discounts
 */
@Serializable(with = InlineV1QuotesPostRequestFormDiscountsXcce02801.Serializer::class)
public class InlineV1QuotesPostRequestFormDiscountsXcce02801 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1QuotesPostRequestFormDiscountsXcce02801Inspection,
) {
  public val branch1: List<InlineV1QuotesPostRequestFormDiscountsAnyOf1ItemX0df5d957>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1QuotesPostRequestFormDiscountsAnyOf1ItemX0df5d957>>(raw) else null }

  public val inlineV1QuotesPostRequestFormDiscountsAnyOf2X2b7ea7a9:
      InlineV1QuotesPostRequestFormDiscountsAnyOf2X2b7ea7a9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormDiscountsAnyOf2X2b7ea7a9) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormDiscountsAnyOf2X2b7ea7a9>(raw) else null }

  public val matchedBranches: Set<InlineV1QuotesPostRequestFormDiscountsXcce02801Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormDiscountsXcce02801Branch.Branch1)
      if (inspection.matchesInlineV1QuotesPostRequestFormDiscountsAnyOf2X2b7ea7a9) add(InlineV1QuotesPostRequestFormDiscountsXcce02801Branch.InlineV1QuotesPostRequestFormDiscountsAnyOf2X2b7ea7a9)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormDiscountsXcce02801 {
      val inspection = inspectInlineV1QuotesPostRequestFormDiscountsXcce02801(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormDiscountsXcce02801NoMatchException("InlineV1QuotesPostRequestFormDiscountsXcce02801 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormDiscountsXcce02801(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormDiscountsXcce02801> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormDiscountsXcce02801 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormDiscountsXcce02801")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormDiscountsXcce02801) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormDiscountsXcce02801").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormDiscountsXcce02801(element: JsonElement): InlineV1QuotesPostRequestFormDiscountsXcce02801Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1QuotesPostRequestFormDiscountsAnyOf1ItemX0df5d957>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1QuotesPostRequestFormDiscountsAnyOf2X2b7ea7a9 = element.isJsonDecodable<InlineV1QuotesPostRequestFormDiscountsAnyOf2X2b7ea7a9>()
  return InlineV1QuotesPostRequestFormDiscountsXcce02801Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1QuotesPostRequestFormDiscountsAnyOf2X2b7ea7a9 = matchesInlineV1QuotesPostRequestFormDiscountsAnyOf2X2b7ea7a9,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1QuotesPostRequestFormDiscountsAnyOf2X2b7ea7a9) add("InlineV1QuotesPostRequestFormDiscountsAnyOf2X2b7ea7a9: value does not match InlineV1QuotesPostRequestFormDiscountsAnyOf2X2b7ea7a9")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
