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

public enum class InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1ccBranch {
  Branch1,
  InlineV1IssuingAuthorizationsPostRequestFormMetadataAnyOf2X3f717ec1,
}

public sealed class InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1ccDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1ccNoMatchException(
  message: String,
) : InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1ccDecodingException(message)

internal data class InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1ccInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingAuthorizationsPostRequestFormMetadataAnyOf2X3f717ec1: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingAuthorizationsPostRequestFormMetadataAnyOf2X3f717ec1).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1authorizations~1{authorization}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1cc.Serializer::class)
public class InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1cc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1ccInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1IssuingAuthorizationsPostRequestFormMetadataAnyOf2X3f717ec1:
      InlineV1IssuingAuthorizationsPostRequestFormMetadataAnyOf2X3f717ec1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingAuthorizationsPostRequestFormMetadataAnyOf2X3f717ec1) json.decodeFromJsonElement<InlineV1IssuingAuthorizationsPostRequestFormMetadataAnyOf2X3f717ec1>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1ccBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1ccBranch.Branch1)
      if (inspection.matchesInlineV1IssuingAuthorizationsPostRequestFormMetadataAnyOf2X3f717ec1) add(InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1ccBranch.InlineV1IssuingAuthorizationsPostRequestFormMetadataAnyOf2X3f717ec1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1cc {
      val inspection = inspectInlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1cc(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1ccNoMatchException("InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1cc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1cc(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1cc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1cc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1cc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1cc) {
      encoder.requireJsonEncoder("InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1cc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1cc(element: JsonElement): InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1ccInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1IssuingAuthorizationsPostRequestFormMetadataAnyOf2X3f717ec1 = element.isJsonDecodable<InlineV1IssuingAuthorizationsPostRequestFormMetadataAnyOf2X3f717ec1>()
  return InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1ccInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingAuthorizationsPostRequestFormMetadataAnyOf2X3f717ec1 = matchesInlineV1IssuingAuthorizationsPostRequestFormMetadataAnyOf2X3f717ec1,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1IssuingAuthorizationsPostRequestFormMetadataAnyOf2X3f717ec1) add("InlineV1IssuingAuthorizationsPostRequestFormMetadataAnyOf2X3f717ec1: value does not match InlineV1IssuingAuthorizationsPostRequestFormMetadataAnyOf2X3f717ec1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
