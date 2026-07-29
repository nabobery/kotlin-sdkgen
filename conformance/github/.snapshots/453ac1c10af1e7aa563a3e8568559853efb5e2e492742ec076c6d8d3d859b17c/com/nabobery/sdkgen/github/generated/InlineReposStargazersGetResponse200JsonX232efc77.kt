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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineReposStargazersGetResponse200JsonX232efc77Branch {
  Branch1,
  Branch2,
}

public sealed class InlineReposStargazersGetResponse200JsonX232efc77DecodingException(
  message: String,
) : SerializationException(message)

public class InlineReposStargazersGetResponse200JsonX232efc77NoMatchException(
  message: String,
) : InlineReposStargazersGetResponse200JsonX232efc77DecodingException(message)

internal data class InlineReposStargazersGetResponse200JsonX232efc77Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1stargazers/get/responses/200/content/application~1json/
 * schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1stargazers/get/responses/200/content/application~1json/
 * schema
 */
@Serializable(with = InlineReposStargazersGetResponse200JsonX232efc77.Serializer::class)
public class InlineReposStargazersGetResponse200JsonX232efc77 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineReposStargazersGetResponse200JsonX232efc77Inspection,
) {
  public val branch1: List<SimpleUser>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<SimpleUser>>(raw) else null }

  public val branch2: List<Stargazer>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<Stargazer>>(raw) else null }

  public val matchedBranches: Set<InlineReposStargazersGetResponse200JsonX232efc77Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineReposStargazersGetResponse200JsonX232efc77Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineReposStargazersGetResponse200JsonX232efc77Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineReposStargazersGetResponse200JsonX232efc77 {
      val inspection = inspectInlineReposStargazersGetResponse200JsonX232efc77(raw)
      if (inspection.matchCount == 0) {
        throw InlineReposStargazersGetResponse200JsonX232efc77NoMatchException("InlineReposStargazersGetResponse200JsonX232efc77 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineReposStargazersGetResponse200JsonX232efc77(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineReposStargazersGetResponse200JsonX232efc77> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposStargazersGetResponse200JsonX232efc77 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposStargazersGetResponse200JsonX232efc77")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposStargazersGetResponse200JsonX232efc77) {
      encoder.requireJsonEncoder("InlineReposStargazersGetResponse200JsonX232efc77").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineReposStargazersGetResponse200JsonX232efc77(element: JsonElement): InlineReposStargazersGetResponse200JsonX232efc77Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<SimpleUser>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesBranch2 = element.isJsonDecodable<List<Stargazer>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineReposStargazersGetResponse200JsonX232efc77Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesBranch2) add("Branch2: value does not match List")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
