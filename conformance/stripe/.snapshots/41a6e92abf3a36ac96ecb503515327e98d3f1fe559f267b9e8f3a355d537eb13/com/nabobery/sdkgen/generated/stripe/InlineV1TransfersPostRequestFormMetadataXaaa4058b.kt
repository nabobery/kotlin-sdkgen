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

public enum class InlineV1TransfersPostRequestFormMetadataXaaa4058bBranch {
  Branch1,
  InlineV1TransfersPostRequestFormMetadataAnyOf2X76d5e619,
}

public sealed class InlineV1TransfersPostRequestFormMetadataXaaa4058bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TransfersPostRequestFormMetadataXaaa4058bNoMatchException(
  message: String,
) : InlineV1TransfersPostRequestFormMetadataXaaa4058bDecodingException(message)

internal data class InlineV1TransfersPostRequestFormMetadataXaaa4058bInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TransfersPostRequestFormMetadataAnyOf2X76d5e619: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TransfersPostRequestFormMetadataAnyOf2X76d5e619).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1transfers~1{transfer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/metadata
 */
@Serializable(with = InlineV1TransfersPostRequestFormMetadataXaaa4058b.Serializer::class)
public class InlineV1TransfersPostRequestFormMetadataXaaa4058b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TransfersPostRequestFormMetadataXaaa4058bInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1TransfersPostRequestFormMetadataAnyOf2X76d5e619:
      InlineV1TransfersPostRequestFormMetadataAnyOf2X76d5e619? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TransfersPostRequestFormMetadataAnyOf2X76d5e619) json.decodeFromJsonElement<InlineV1TransfersPostRequestFormMetadataAnyOf2X76d5e619>(raw) else null }

  public val matchedBranches: Set<InlineV1TransfersPostRequestFormMetadataXaaa4058bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TransfersPostRequestFormMetadataXaaa4058bBranch.Branch1)
      if (inspection.matchesInlineV1TransfersPostRequestFormMetadataAnyOf2X76d5e619) add(InlineV1TransfersPostRequestFormMetadataXaaa4058bBranch.InlineV1TransfersPostRequestFormMetadataAnyOf2X76d5e619)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TransfersPostRequestFormMetadataXaaa4058b {
      val inspection = inspectInlineV1TransfersPostRequestFormMetadataXaaa4058b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TransfersPostRequestFormMetadataXaaa4058bNoMatchException("InlineV1TransfersPostRequestFormMetadataXaaa4058b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TransfersPostRequestFormMetadataXaaa4058b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TransfersPostRequestFormMetadataXaaa4058b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TransfersPostRequestFormMetadataXaaa4058b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TransfersPostRequestFormMetadataXaaa4058b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TransfersPostRequestFormMetadataXaaa4058b) {
      encoder.requireJsonEncoder("InlineV1TransfersPostRequestFormMetadataXaaa4058b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TransfersPostRequestFormMetadataXaaa4058b(element: JsonElement): InlineV1TransfersPostRequestFormMetadataXaaa4058bInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1TransfersPostRequestFormMetadataAnyOf2X76d5e619 = element.isJsonDecodable<InlineV1TransfersPostRequestFormMetadataAnyOf2X76d5e619>()
  return InlineV1TransfersPostRequestFormMetadataXaaa4058bInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TransfersPostRequestFormMetadataAnyOf2X76d5e619 = matchesInlineV1TransfersPostRequestFormMetadataAnyOf2X76d5e619,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1TransfersPostRequestFormMetadataAnyOf2X76d5e619) add("InlineV1TransfersPostRequestFormMetadataAnyOf2X76d5e619: value does not match InlineV1TransfersPostRequestFormMetadataAnyOf2X76d5e619")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
