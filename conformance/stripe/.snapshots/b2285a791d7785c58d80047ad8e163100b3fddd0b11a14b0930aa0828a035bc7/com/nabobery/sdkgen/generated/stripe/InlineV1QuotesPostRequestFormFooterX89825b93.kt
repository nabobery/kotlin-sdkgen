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

public enum class InlineV1QuotesPostRequestFormFooterX89825b93Branch {
  Branch1,
  InlineV1QuotesPostRequestFormFooterAnyOf2X16942521,
}

public sealed class InlineV1QuotesPostRequestFormFooterX89825b93DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormFooterX89825b93NoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormFooterX89825b93DecodingException(message)

internal data class InlineV1QuotesPostRequestFormFooterX89825b93Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1QuotesPostRequestFormFooterAnyOf2X16942521: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormFooterAnyOf2X16942521).count { it }
}

/**
 * A footer that will be displayed on the quote PDF.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/footer
 */
@Serializable(with = InlineV1QuotesPostRequestFormFooterX89825b93.Serializer::class)
public class InlineV1QuotesPostRequestFormFooterX89825b93 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1QuotesPostRequestFormFooterX89825b93Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1QuotesPostRequestFormFooterAnyOf2X16942521:
      InlineV1QuotesPostRequestFormFooterAnyOf2X16942521? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormFooterAnyOf2X16942521) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormFooterAnyOf2X16942521>(raw) else null }

  public val matchedBranches: Set<InlineV1QuotesPostRequestFormFooterX89825b93Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormFooterX89825b93Branch.Branch1)
      if (inspection.matchesInlineV1QuotesPostRequestFormFooterAnyOf2X16942521) add(InlineV1QuotesPostRequestFormFooterX89825b93Branch.InlineV1QuotesPostRequestFormFooterAnyOf2X16942521)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormFooterX89825b93 {
      val inspection = inspectInlineV1QuotesPostRequestFormFooterX89825b93(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormFooterX89825b93NoMatchException("InlineV1QuotesPostRequestFormFooterX89825b93 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormFooterX89825b93(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1QuotesPostRequestFormFooterX89825b93> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormFooterX89825b93 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormFooterX89825b93")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormFooterX89825b93) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormFooterX89825b93").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormFooterX89825b93(element: JsonElement): InlineV1QuotesPostRequestFormFooterX89825b93Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1QuotesPostRequestFormFooterAnyOf2X16942521 = element.isJsonDecodable<InlineV1QuotesPostRequestFormFooterAnyOf2X16942521>()
  return InlineV1QuotesPostRequestFormFooterX89825b93Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1QuotesPostRequestFormFooterAnyOf2X16942521 = matchesInlineV1QuotesPostRequestFormFooterAnyOf2X16942521,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1QuotesPostRequestFormFooterAnyOf2X16942521) add("InlineV1QuotesPostRequestFormFooterAnyOf2X16942521: value does not match InlineV1QuotesPostRequestFormFooterAnyOf2X16942521")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
