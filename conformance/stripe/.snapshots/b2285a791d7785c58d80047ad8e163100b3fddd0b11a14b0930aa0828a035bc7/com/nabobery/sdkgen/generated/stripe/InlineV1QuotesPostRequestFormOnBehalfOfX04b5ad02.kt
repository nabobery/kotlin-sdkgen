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

public enum class InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02Branch {
  Branch1,
  InlineV1QuotesPostRequestFormOnBehalfOfAnyOf2X323ed212,
}

public sealed class InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02NoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02DecodingException(message)

internal data class InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1QuotesPostRequestFormOnBehalfOfAnyOf2X323ed212: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormOnBehalfOfAnyOf2X323ed212).count { it }
}

/**
 * The account on behalf of which to charge.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/on_behalf_of
 */
@Serializable(with = InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02.Serializer::class)
public class InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1QuotesPostRequestFormOnBehalfOfAnyOf2X323ed212:
      InlineV1QuotesPostRequestFormOnBehalfOfAnyOf2X323ed212? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormOnBehalfOfAnyOf2X323ed212) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormOnBehalfOfAnyOf2X323ed212>(raw) else null }

  public val matchedBranches: Set<InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02Branch.Branch1)
      if (inspection.matchesInlineV1QuotesPostRequestFormOnBehalfOfAnyOf2X323ed212) add(InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02Branch.InlineV1QuotesPostRequestFormOnBehalfOfAnyOf2X323ed212)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02 {
      val inspection = inspectInlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02NoMatchException("InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02(element: JsonElement): InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1QuotesPostRequestFormOnBehalfOfAnyOf2X323ed212 = element.isJsonDecodable<InlineV1QuotesPostRequestFormOnBehalfOfAnyOf2X323ed212>()
  return InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1QuotesPostRequestFormOnBehalfOfAnyOf2X323ed212 = matchesInlineV1QuotesPostRequestFormOnBehalfOfAnyOf2X323ed212,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1QuotesPostRequestFormOnBehalfOfAnyOf2X323ed212) add("InlineV1QuotesPostRequestFormOnBehalfOfAnyOf2X323ed212: value does not match InlineV1QuotesPostRequestFormOnBehalfOfAnyOf2X323ed212")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
