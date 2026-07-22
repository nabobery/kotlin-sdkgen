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

public enum class InlineReposPagesPutRequestJsonSourceX1af4db52Branch {
  InlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d,
  InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea,
}

public sealed class InlineReposPagesPutRequestJsonSourceX1af4db52DecodingException(
  message: String,
) : SerializationException(message)

public class InlineReposPagesPutRequestJsonSourceX1af4db52NoMatchException(
  message: String,
) : InlineReposPagesPutRequestJsonSourceX1af4db52DecodingException(message)

internal data class InlineReposPagesPutRequestJsonSourceX1af4db52Inspection(
  public val matchesInlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d: Boolean,
  public val matchesInlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d, matchesInlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pages/put/requestBody/content/application~1json/schema/
 * properties/source.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pages/put/requestBody/content/application~1json/schema/
 * properties/source
 */
@Serializable(with = InlineReposPagesPutRequestJsonSourceX1af4db52.Serializer::class)
public class InlineReposPagesPutRequestJsonSourceX1af4db52 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineReposPagesPutRequestJsonSourceX1af4db52Inspection,
) {
  public val inlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d:
      InlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d) json.decodeFromJsonElement<InlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d>(raw) else null }

  public val inlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea:
      InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea) json.decodeFromJsonElement<InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea>(raw) else null }

  public val matchedBranches: Set<InlineReposPagesPutRequestJsonSourceX1af4db52Branch>
    get() = buildSet {
      if (inspection.matchesInlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d) add(InlineReposPagesPutRequestJsonSourceX1af4db52Branch.InlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d)
      if (inspection.matchesInlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea) add(InlineReposPagesPutRequestJsonSourceX1af4db52Branch.InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineReposPagesPutRequestJsonSourceX1af4db52 {
      val inspection = inspectInlineReposPagesPutRequestJsonSourceX1af4db52(raw)
      if (inspection.matchCount == 0) {
        throw InlineReposPagesPutRequestJsonSourceX1af4db52NoMatchException("InlineReposPagesPutRequestJsonSourceX1af4db52 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineReposPagesPutRequestJsonSourceX1af4db52(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineReposPagesPutRequestJsonSourceX1af4db52> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPagesPutRequestJsonSourceX1af4db52 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPagesPutRequestJsonSourceX1af4db52")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPagesPutRequestJsonSourceX1af4db52) {
      encoder.requireJsonEncoder("InlineReposPagesPutRequestJsonSourceX1af4db52").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineReposPagesPutRequestJsonSourceX1af4db52(element: JsonElement): InlineReposPagesPutRequestJsonSourceX1af4db52Inspection {
  val matchesInlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d = element.isJsonDecodable<InlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d>()
  val matchesInlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea = element.isJsonDecodable<InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea>()
  return InlineReposPagesPutRequestJsonSourceX1af4db52Inspection(
    matchesInlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d = matchesInlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d,
    matchesInlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea = matchesInlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea,
    failures = buildList {
      if (!matchesInlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d) add("InlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d: value does not match InlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d")
      if (!matchesInlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea) add("InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea: value does not match InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
