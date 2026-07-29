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

public enum class InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7caBranch {
  Branch1,
  InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataAnyOf2Xcd0baea7,
}

public sealed class InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7caDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7caNoMatchException(
  message: String,
) : InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7caDecodingException(message)

internal data class InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7caInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataAnyOf2Xcd0baea7:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataAnyOf2Xcd0baea7).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1authorizations~1{authorization}~1decline/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7ca.Serializer::class)
public class InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7ca internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7caInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataAnyOf2Xcd0baea7:
      InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataAnyOf2Xcd0baea7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataAnyOf2Xcd0baea7) json.decodeFromJsonElement<InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataAnyOf2Xcd0baea7>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7caBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7caBranch.Branch1)
      if (inspection.matchesInlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataAnyOf2Xcd0baea7) add(InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7caBranch.InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataAnyOf2Xcd0baea7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7ca {
      val inspection = inspectInlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7ca(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7caNoMatchException("InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7ca matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7ca(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7ca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7ca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7ca")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7ca) {
      encoder.requireJsonEncoder("InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7ca").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7ca(element: JsonElement): InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7caInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataAnyOf2Xcd0baea7 = element.isJsonDecodable<InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataAnyOf2Xcd0baea7>()
  return InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7caInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataAnyOf2Xcd0baea7 = matchesInlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataAnyOf2Xcd0baea7,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataAnyOf2Xcd0baea7) add("InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataAnyOf2Xcd0baea7: value does not match InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataAnyOf2Xcd0baea7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
