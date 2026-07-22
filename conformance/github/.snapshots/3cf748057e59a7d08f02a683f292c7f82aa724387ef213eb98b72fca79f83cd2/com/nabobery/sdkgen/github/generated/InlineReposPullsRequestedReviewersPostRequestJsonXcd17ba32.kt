package com.nabobery.sdkgen.github.generated

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

public enum class InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32Branch {
  Branch1,
  Branch2,
}

public sealed class InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32DecodingException(
  message: String,
) : SerializationException(message)

public class InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32NoMatchException(
  message: String,
) : InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32DecodingException(message)

internal data class InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1requested_reviewers/post/requestB
 * ody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1requested_reviewers/post/requestB
 * ody/content/application~1json/schema
 */
@Serializable(with = InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32.Serializer::class)
public class InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32Inspection,
) {
  public val branch1: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val branch2: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val matchedBranches: Set<InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32 {
      val inspection = inspectInlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32(raw)
      if (inspection.matchCount == 0) {
        throw InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32NoMatchException("InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32) {
      encoder.requireJsonEncoder("InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32(element: JsonElement): InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonElement>()
  val matchesBranch2 = element.isJsonDecodable<JsonElement>()
  return InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonElement")
      if (!matchesBranch2) add("Branch2: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
