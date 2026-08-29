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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1TokensPostRequestFormPersonMetadataX25e1fccdBranch {
  Branch1,
  InlineV1TokensPostRequestFormPersonMetadataAnyOf2Xe44bae0b,
}

public sealed class InlineV1TokensPostRequestFormPersonMetadataX25e1fccdDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TokensPostRequestFormPersonMetadataX25e1fccdNoMatchException(
  message: String,
) : InlineV1TokensPostRequestFormPersonMetadataX25e1fccdDecodingException(message)

internal data class InlineV1TokensPostRequestFormPersonMetadataX25e1fccdInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TokensPostRequestFormPersonMetadataAnyOf2Xe44bae0b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TokensPostRequestFormPersonMetadataAnyOf2Xe44bae0b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/metadata
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonMetadataX25e1fccd.Serializer::class)
public class InlineV1TokensPostRequestFormPersonMetadataX25e1fccd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TokensPostRequestFormPersonMetadataX25e1fccdInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1TokensPostRequestFormPersonMetadataAnyOf2Xe44bae0b:
      InlineV1TokensPostRequestFormPersonMetadataAnyOf2Xe44bae0b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TokensPostRequestFormPersonMetadataAnyOf2Xe44bae0b) json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonMetadataAnyOf2Xe44bae0b>(raw) else null }

  public val matchedBranches: Set<InlineV1TokensPostRequestFormPersonMetadataX25e1fccdBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TokensPostRequestFormPersonMetadataX25e1fccdBranch.Branch1)
      if (inspection.matchesInlineV1TokensPostRequestFormPersonMetadataAnyOf2Xe44bae0b) add(InlineV1TokensPostRequestFormPersonMetadataX25e1fccdBranch.InlineV1TokensPostRequestFormPersonMetadataAnyOf2Xe44bae0b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TokensPostRequestFormPersonMetadataX25e1fccd {
      val inspection = inspectInlineV1TokensPostRequestFormPersonMetadataX25e1fccd(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TokensPostRequestFormPersonMetadataX25e1fccdNoMatchException("InlineV1TokensPostRequestFormPersonMetadataX25e1fccd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TokensPostRequestFormPersonMetadataX25e1fccd(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonMetadataX25e1fccd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonMetadataX25e1fccd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormPersonMetadataX25e1fccd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonMetadataX25e1fccd) {
      encoder.requireJsonEncoder("InlineV1TokensPostRequestFormPersonMetadataX25e1fccd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TokensPostRequestFormPersonMetadataX25e1fccd(element: JsonElement): InlineV1TokensPostRequestFormPersonMetadataX25e1fccdInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1TokensPostRequestFormPersonMetadataAnyOf2Xe44bae0b = element.isJsonDecodable<InlineV1TokensPostRequestFormPersonMetadataAnyOf2Xe44bae0b>()
  return InlineV1TokensPostRequestFormPersonMetadataX25e1fccdInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TokensPostRequestFormPersonMetadataAnyOf2Xe44bae0b = matchesInlineV1TokensPostRequestFormPersonMetadataAnyOf2Xe44bae0b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1TokensPostRequestFormPersonMetadataAnyOf2Xe44bae0b) add("InlineV1TokensPostRequestFormPersonMetadataAnyOf2Xe44bae0b: value does not match InlineV1TokensPostRequestFormPersonMetadataAnyOf2Xe44bae0b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
