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

public enum class InlineV1PromotionCodesPostRequestFormMetadataX1f097777Branch {
  Branch1,
  InlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844,
}

public sealed class InlineV1PromotionCodesPostRequestFormMetadataX1f097777DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PromotionCodesPostRequestFormMetadataX1f097777NoMatchException(
  message: String,
) : InlineV1PromotionCodesPostRequestFormMetadataX1f097777DecodingException(message)

internal data class InlineV1PromotionCodesPostRequestFormMetadataX1f097777Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1promotion_codes~1{promotion_code}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1PromotionCodesPostRequestFormMetadataX1f097777.Serializer::class)
public class InlineV1PromotionCodesPostRequestFormMetadataX1f097777 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PromotionCodesPostRequestFormMetadataX1f097777Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844:
      InlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844) json.decodeFromJsonElement<InlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844>(raw) else null }

  public val matchedBranches: Set<InlineV1PromotionCodesPostRequestFormMetadataX1f097777Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PromotionCodesPostRequestFormMetadataX1f097777Branch.Branch1)
      if (inspection.matchesInlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844) add(InlineV1PromotionCodesPostRequestFormMetadataX1f097777Branch.InlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PromotionCodesPostRequestFormMetadataX1f097777 {
      val inspection = inspectInlineV1PromotionCodesPostRequestFormMetadataX1f097777(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PromotionCodesPostRequestFormMetadataX1f097777NoMatchException("InlineV1PromotionCodesPostRequestFormMetadataX1f097777 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PromotionCodesPostRequestFormMetadataX1f097777(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PromotionCodesPostRequestFormMetadataX1f097777> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PromotionCodesPostRequestFormMetadataX1f097777 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PromotionCodesPostRequestFormMetadataX1f097777")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PromotionCodesPostRequestFormMetadataX1f097777) {
      encoder.requireJsonEncoder("InlineV1PromotionCodesPostRequestFormMetadataX1f097777").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PromotionCodesPostRequestFormMetadataX1f097777(element: JsonElement): InlineV1PromotionCodesPostRequestFormMetadataX1f097777Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844 = element.isJsonDecodable<InlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844>()
  return InlineV1PromotionCodesPostRequestFormMetadataX1f097777Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844 = matchesInlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844) add("InlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844: value does not match InlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
