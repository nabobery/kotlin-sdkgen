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

public enum class InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7dBranch {
  Branch1,
  InlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a,
}

public sealed class InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7dNoMatchException(
  message: String,
) : InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7dDecodingException(message)

internal data class InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/full_name_aliases.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/full_name_aliases
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7d.Serializer::class)
public class InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7dInspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a:
      InlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a) json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a>(raw) else null }

  public val matchedBranches: Set<InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7dBranch.Branch1)
      if (inspection.matchesInlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a) add(InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7dBranch.InlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7d {
      val inspection = inspectInlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7dNoMatchException("InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7d) {
      encoder.requireJsonEncoder("InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7d(element: JsonElement): InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7dInspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a = element.isJsonDecodable<InlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a>()
  return InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a = matchesInlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a) add("InlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a: value does not match InlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
