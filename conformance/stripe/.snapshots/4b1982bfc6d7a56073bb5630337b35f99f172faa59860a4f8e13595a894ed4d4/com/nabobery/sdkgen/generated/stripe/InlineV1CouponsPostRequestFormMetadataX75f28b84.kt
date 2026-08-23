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

public enum class InlineV1CouponsPostRequestFormMetadataX75f28b84Branch {
  Branch1,
  InlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252,
}

public sealed class InlineV1CouponsPostRequestFormMetadataX75f28b84DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CouponsPostRequestFormMetadataX75f28b84NoMatchException(
  message: String,
) : InlineV1CouponsPostRequestFormMetadataX75f28b84DecodingException(message)

internal data class InlineV1CouponsPostRequestFormMetadataX75f28b84Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1coupons~1{coupon}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/metadata
 */
@Serializable(with = InlineV1CouponsPostRequestFormMetadataX75f28b84.Serializer::class)
public class InlineV1CouponsPostRequestFormMetadataX75f28b84 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CouponsPostRequestFormMetadataX75f28b84Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252:
      InlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252) json.decodeFromJsonElement<InlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252>(raw) else null }

  public val matchedBranches: Set<InlineV1CouponsPostRequestFormMetadataX75f28b84Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CouponsPostRequestFormMetadataX75f28b84Branch.Branch1)
      if (inspection.matchesInlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252) add(InlineV1CouponsPostRequestFormMetadataX75f28b84Branch.InlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CouponsPostRequestFormMetadataX75f28b84 {
      val inspection = inspectInlineV1CouponsPostRequestFormMetadataX75f28b84(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CouponsPostRequestFormMetadataX75f28b84NoMatchException("InlineV1CouponsPostRequestFormMetadataX75f28b84 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CouponsPostRequestFormMetadataX75f28b84(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CouponsPostRequestFormMetadataX75f28b84> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CouponsPostRequestFormMetadataX75f28b84 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CouponsPostRequestFormMetadataX75f28b84")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CouponsPostRequestFormMetadataX75f28b84) {
      encoder.requireJsonEncoder("InlineV1CouponsPostRequestFormMetadataX75f28b84").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CouponsPostRequestFormMetadataX75f28b84(element: JsonElement): InlineV1CouponsPostRequestFormMetadataX75f28b84Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252 = element.isJsonDecodable<InlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252>()
  return InlineV1CouponsPostRequestFormMetadataX75f28b84Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252 = matchesInlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252) add("InlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252: value does not match InlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
