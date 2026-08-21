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

public enum class InlineV1FileLinksGetParameterX2ba015a8Branch {
  InlineV1FileLinksGetParameterAnyOf1Xa444c3db,
  Branch2,
}

public sealed class InlineV1FileLinksGetParameterX2ba015a8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1FileLinksGetParameterX2ba015a8NoMatchException(
  message: String,
) : InlineV1FileLinksGetParameterX2ba015a8DecodingException(message)

internal data class InlineV1FileLinksGetParameterX2ba015a8Inspection(
  public val matchesInlineV1FileLinksGetParameterAnyOf1Xa444c3db: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1FileLinksGetParameterAnyOf1Xa444c3db, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1file_links/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1file_links/get/parameters/0/schema
 */
@Serializable(with = InlineV1FileLinksGetParameterX2ba015a8.Serializer::class)
public class InlineV1FileLinksGetParameterX2ba015a8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1FileLinksGetParameterX2ba015a8Inspection,
) {
  public val inlineV1FileLinksGetParameterAnyOf1Xa444c3db:
      InlineV1FileLinksGetParameterAnyOf1Xa444c3db? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1FileLinksGetParameterAnyOf1Xa444c3db) json.decodeFromJsonElement<InlineV1FileLinksGetParameterAnyOf1Xa444c3db>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1FileLinksGetParameterX2ba015a8Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1FileLinksGetParameterAnyOf1Xa444c3db) add(InlineV1FileLinksGetParameterX2ba015a8Branch.InlineV1FileLinksGetParameterAnyOf1Xa444c3db)
      if (inspection.matchesBranch2) add(InlineV1FileLinksGetParameterX2ba015a8Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1FileLinksGetParameterX2ba015a8 {
      val inspection = inspectInlineV1FileLinksGetParameterX2ba015a8(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1FileLinksGetParameterX2ba015a8NoMatchException("InlineV1FileLinksGetParameterX2ba015a8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1FileLinksGetParameterX2ba015a8(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1FileLinksGetParameterX2ba015a8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1FileLinksGetParameterX2ba015a8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1FileLinksGetParameterX2ba015a8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1FileLinksGetParameterX2ba015a8) {
      encoder.requireJsonEncoder("InlineV1FileLinksGetParameterX2ba015a8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1FileLinksGetParameterX2ba015a8(element: JsonElement): InlineV1FileLinksGetParameterX2ba015a8Inspection {
  val matchesInlineV1FileLinksGetParameterAnyOf1Xa444c3db = element.isJsonDecodable<InlineV1FileLinksGetParameterAnyOf1Xa444c3db>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1FileLinksGetParameterX2ba015a8Inspection(
    matchesInlineV1FileLinksGetParameterAnyOf1Xa444c3db = matchesInlineV1FileLinksGetParameterAnyOf1Xa444c3db,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1FileLinksGetParameterAnyOf1Xa444c3db) add("InlineV1FileLinksGetParameterAnyOf1Xa444c3db: value does not match InlineV1FileLinksGetParameterAnyOf1Xa444c3db")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
