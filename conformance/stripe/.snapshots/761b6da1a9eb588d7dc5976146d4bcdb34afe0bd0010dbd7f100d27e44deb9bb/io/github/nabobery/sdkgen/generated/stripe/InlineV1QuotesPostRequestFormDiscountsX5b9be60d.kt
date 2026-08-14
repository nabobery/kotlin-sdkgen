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

public enum class InlineV1QuotesPostRequestFormDiscountsX5b9be60dBranch {
  Branch1,
  InlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5,
}

public sealed class InlineV1QuotesPostRequestFormDiscountsX5b9be60dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormDiscountsX5b9be60dNoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormDiscountsX5b9be60dDecodingException(message)

internal data class InlineV1QuotesPostRequestFormDiscountsX5b9be60dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5).count { it }
}

/**
 * The discounts applied to the quote.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/discounts
 */
@Serializable(with = InlineV1QuotesPostRequestFormDiscountsX5b9be60d.Serializer::class)
public class InlineV1QuotesPostRequestFormDiscountsX5b9be60d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1QuotesPostRequestFormDiscountsX5b9be60dInspection,
) {
  public val branch1: List<InlineV1QuotesPostRequestFormDiscountsAnyOf1ItemX7f662bc5>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1QuotesPostRequestFormDiscountsAnyOf1ItemX7f662bc5>>(raw) else null }

  public val inlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5:
      InlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5>(raw) else null }

  public val matchedBranches: Set<InlineV1QuotesPostRequestFormDiscountsX5b9be60dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormDiscountsX5b9be60dBranch.Branch1)
      if (inspection.matchesInlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5) add(InlineV1QuotesPostRequestFormDiscountsX5b9be60dBranch.InlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormDiscountsX5b9be60d {
      val inspection = inspectInlineV1QuotesPostRequestFormDiscountsX5b9be60d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormDiscountsX5b9be60dNoMatchException("InlineV1QuotesPostRequestFormDiscountsX5b9be60d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormDiscountsX5b9be60d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormDiscountsX5b9be60d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormDiscountsX5b9be60d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormDiscountsX5b9be60d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormDiscountsX5b9be60d) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormDiscountsX5b9be60d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormDiscountsX5b9be60d(element: JsonElement): InlineV1QuotesPostRequestFormDiscountsX5b9be60dInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1QuotesPostRequestFormDiscountsAnyOf1ItemX7f662bc5>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5 = element.isJsonDecodable<InlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5>()
  return InlineV1QuotesPostRequestFormDiscountsX5b9be60dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5 = matchesInlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5) add("InlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5: value does not match InlineV1QuotesPostRequestFormDiscountsAnyOf2X9833abb5")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
