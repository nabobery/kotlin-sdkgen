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

public enum class InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bfBranch {
  Branch1,
  InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa,
}

public sealed class InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bfDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bfNoMatchException(
  message: String,
) : InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bfDecodingException(message)

internal data class InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bfInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1authorizations~1{authorization}~1approve/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bf.Serializer::class)
public class InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bf internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bfInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa:
      InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa) json.decodeFromJsonElement<InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bfBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bfBranch.Branch1)
      if (inspection.matchesInlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa) add(InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bfBranch.InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bf {
      val inspection = inspectInlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bf(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bfNoMatchException("InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bf matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bf(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bf")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bf) {
      encoder.requireJsonEncoder("InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bf").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bf(element: JsonElement): InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bfInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa = element.isJsonDecodable<InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa>()
  return InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataXbd7902bfInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa = matchesInlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa) add("InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa: value does not match InlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
