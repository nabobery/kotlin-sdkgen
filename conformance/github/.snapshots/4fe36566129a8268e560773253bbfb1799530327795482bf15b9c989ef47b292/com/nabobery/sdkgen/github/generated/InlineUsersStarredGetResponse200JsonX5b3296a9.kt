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

public enum class InlineUsersStarredGetResponse200JsonX5b3296a9Branch {
  Branch1,
  Branch2,
}

public sealed class InlineUsersStarredGetResponse200JsonX5b3296a9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineUsersStarredGetResponse200JsonX5b3296a9NoMatchException(
  message: String,
) : InlineUsersStarredGetResponse200JsonX5b3296a9DecodingException(message)

internal data class InlineUsersStarredGetResponse200JsonX5b3296a9Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1starred/get/responses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1starred/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineUsersStarredGetResponse200JsonX5b3296a9.Serializer::class)
public class InlineUsersStarredGetResponse200JsonX5b3296a9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineUsersStarredGetResponse200JsonX5b3296a9Inspection,
) {
  public val branch1: List<StarredRepository>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<StarredRepository>>(raw) else null }

  public val branch2: List<Repository>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<Repository>>(raw) else null }

  public val matchedBranches: Set<InlineUsersStarredGetResponse200JsonX5b3296a9Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineUsersStarredGetResponse200JsonX5b3296a9Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineUsersStarredGetResponse200JsonX5b3296a9Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineUsersStarredGetResponse200JsonX5b3296a9 {
      val inspection = inspectInlineUsersStarredGetResponse200JsonX5b3296a9(raw)
      if (inspection.matchCount == 0) {
        throw InlineUsersStarredGetResponse200JsonX5b3296a9NoMatchException("InlineUsersStarredGetResponse200JsonX5b3296a9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineUsersStarredGetResponse200JsonX5b3296a9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineUsersStarredGetResponse200JsonX5b3296a9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersStarredGetResponse200JsonX5b3296a9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersStarredGetResponse200JsonX5b3296a9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersStarredGetResponse200JsonX5b3296a9) {
      encoder.requireJsonEncoder("InlineUsersStarredGetResponse200JsonX5b3296a9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineUsersStarredGetResponse200JsonX5b3296a9(element: JsonElement): InlineUsersStarredGetResponse200JsonX5b3296a9Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<StarredRepository>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesBranch2 = element.isJsonDecodable<List<Repository>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineUsersStarredGetResponse200JsonX5b3296a9Inspection(
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
