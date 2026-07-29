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

public enum class InlineV1ChargesPostRequestFormMetadataXae7bfa5eBranch {
  Branch1,
  InlineV1ChargesPostRequestFormMetadataAnyOf2X8d04583c,
}

public sealed class InlineV1ChargesPostRequestFormMetadataXae7bfa5eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ChargesPostRequestFormMetadataXae7bfa5eNoMatchException(
  message: String,
) : InlineV1ChargesPostRequestFormMetadataXae7bfa5eDecodingException(message)

internal data class InlineV1ChargesPostRequestFormMetadataXae7bfa5eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1ChargesPostRequestFormMetadataAnyOf2X8d04583c: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1ChargesPostRequestFormMetadataAnyOf2X8d04583c).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/metadata
 */
@Serializable(with = InlineV1ChargesPostRequestFormMetadataXae7bfa5e.Serializer::class)
public class InlineV1ChargesPostRequestFormMetadataXae7bfa5e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1ChargesPostRequestFormMetadataXae7bfa5eInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1ChargesPostRequestFormMetadataAnyOf2X8d04583c:
      InlineV1ChargesPostRequestFormMetadataAnyOf2X8d04583c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ChargesPostRequestFormMetadataAnyOf2X8d04583c) json.decodeFromJsonElement<InlineV1ChargesPostRequestFormMetadataAnyOf2X8d04583c>(raw) else null }

  public val matchedBranches: Set<InlineV1ChargesPostRequestFormMetadataXae7bfa5eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1ChargesPostRequestFormMetadataXae7bfa5eBranch.Branch1)
      if (inspection.matchesInlineV1ChargesPostRequestFormMetadataAnyOf2X8d04583c) add(InlineV1ChargesPostRequestFormMetadataXae7bfa5eBranch.InlineV1ChargesPostRequestFormMetadataAnyOf2X8d04583c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ChargesPostRequestFormMetadataXae7bfa5e {
      val inspection = inspectInlineV1ChargesPostRequestFormMetadataXae7bfa5e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ChargesPostRequestFormMetadataXae7bfa5eNoMatchException("InlineV1ChargesPostRequestFormMetadataXae7bfa5e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ChargesPostRequestFormMetadataXae7bfa5e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1ChargesPostRequestFormMetadataXae7bfa5e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesPostRequestFormMetadataXae7bfa5e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesPostRequestFormMetadataXae7bfa5e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesPostRequestFormMetadataXae7bfa5e) {
      encoder.requireJsonEncoder("InlineV1ChargesPostRequestFormMetadataXae7bfa5e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ChargesPostRequestFormMetadataXae7bfa5e(element: JsonElement): InlineV1ChargesPostRequestFormMetadataXae7bfa5eInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1ChargesPostRequestFormMetadataAnyOf2X8d04583c = element.isJsonDecodable<InlineV1ChargesPostRequestFormMetadataAnyOf2X8d04583c>()
  return InlineV1ChargesPostRequestFormMetadataXae7bfa5eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1ChargesPostRequestFormMetadataAnyOf2X8d04583c = matchesInlineV1ChargesPostRequestFormMetadataAnyOf2X8d04583c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1ChargesPostRequestFormMetadataAnyOf2X8d04583c) add("InlineV1ChargesPostRequestFormMetadataAnyOf2X8d04583c: value does not match InlineV1ChargesPostRequestFormMetadataAnyOf2X8d04583c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
