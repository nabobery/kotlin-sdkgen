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

public enum class InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315Branch {
  Branch1,
  InlineV1ApplicationFeesRefundsPostRequestFormMetadataAnyOf2Xe97b3b66,
}

public sealed class InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315NoMatchException(
  message: String,
) : InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315DecodingException(message)

internal data class InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1ApplicationFeesRefundsPostRequestFormMetadataAnyOf2Xe97b3b66: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1ApplicationFeesRefundsPostRequestFormMetadataAnyOf2Xe97b3b66).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1application_fees~1{fee}~1refunds~1{id}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315.Serializer::class)
public class InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1ApplicationFeesRefundsPostRequestFormMetadataAnyOf2Xe97b3b66:
      InlineV1ApplicationFeesRefundsPostRequestFormMetadataAnyOf2Xe97b3b66? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ApplicationFeesRefundsPostRequestFormMetadataAnyOf2Xe97b3b66) json.decodeFromJsonElement<InlineV1ApplicationFeesRefundsPostRequestFormMetadataAnyOf2Xe97b3b66>(raw) else null }

  public val matchedBranches:
      Set<InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315Branch.Branch1)
      if (inspection.matchesInlineV1ApplicationFeesRefundsPostRequestFormMetadataAnyOf2Xe97b3b66) add(InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315Branch.InlineV1ApplicationFeesRefundsPostRequestFormMetadataAnyOf2Xe97b3b66)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315 {
      val inspection = inspectInlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315NoMatchException("InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315) {
      encoder.requireJsonEncoder("InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315(element: JsonElement): InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1ApplicationFeesRefundsPostRequestFormMetadataAnyOf2Xe97b3b66 = element.isJsonDecodable<InlineV1ApplicationFeesRefundsPostRequestFormMetadataAnyOf2Xe97b3b66>()
  return InlineV1ApplicationFeesRefundsPostRequestFormMetadataX0a2d2315Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1ApplicationFeesRefundsPostRequestFormMetadataAnyOf2Xe97b3b66 = matchesInlineV1ApplicationFeesRefundsPostRequestFormMetadataAnyOf2Xe97b3b66,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1ApplicationFeesRefundsPostRequestFormMetadataAnyOf2Xe97b3b66) add("InlineV1ApplicationFeesRefundsPostRequestFormMetadataAnyOf2Xe97b3b66: value does not match InlineV1ApplicationFeesRefundsPostRequestFormMetadataAnyOf2Xe97b3b66")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
