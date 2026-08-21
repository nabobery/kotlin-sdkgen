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

public enum class InlineV1IssuingDisputesPostRequestFormMetadataXc035432eBranch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormMetadataAnyOf2X37ef5172,
}

public sealed class InlineV1IssuingDisputesPostRequestFormMetadataXc035432eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormMetadataXc035432eNoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormMetadataXc035432eDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormMetadataXc035432eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormMetadataAnyOf2X37ef5172: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormMetadataAnyOf2X37ef5172).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormMetadataXc035432e.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormMetadataXc035432e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1IssuingDisputesPostRequestFormMetadataXc035432eInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormMetadataAnyOf2X37ef5172:
      InlineV1IssuingDisputesPostRequestFormMetadataAnyOf2X37ef5172? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormMetadataAnyOf2X37ef5172) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormMetadataAnyOf2X37ef5172>(raw) else null }

  public val matchedBranches: Set<InlineV1IssuingDisputesPostRequestFormMetadataXc035432eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormMetadataXc035432eBranch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormMetadataAnyOf2X37ef5172) add(InlineV1IssuingDisputesPostRequestFormMetadataXc035432eBranch.InlineV1IssuingDisputesPostRequestFormMetadataAnyOf2X37ef5172)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormMetadataXc035432e {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormMetadataXc035432e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormMetadataXc035432eNoMatchException("InlineV1IssuingDisputesPostRequestFormMetadataXc035432e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormMetadataXc035432e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormMetadataXc035432e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormMetadataXc035432e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormMetadataXc035432e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormMetadataXc035432e) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormMetadataXc035432e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormMetadataXc035432e(element: JsonElement): InlineV1IssuingDisputesPostRequestFormMetadataXc035432eInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1IssuingDisputesPostRequestFormMetadataAnyOf2X37ef5172 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormMetadataAnyOf2X37ef5172>()
  return InlineV1IssuingDisputesPostRequestFormMetadataXc035432eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormMetadataAnyOf2X37ef5172 = matchesInlineV1IssuingDisputesPostRequestFormMetadataAnyOf2X37ef5172,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1IssuingDisputesPostRequestFormMetadataAnyOf2X37ef5172) add("InlineV1IssuingDisputesPostRequestFormMetadataAnyOf2X37ef5172: value does not match InlineV1IssuingDisputesPostRequestFormMetadataAnyOf2X37ef5172")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
