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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1bBranch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X0be6b264,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1bNoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1bDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1bInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X0be6b264:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X0be6b264).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/other/anyOf/0/properties/product_description.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/other/anyOf/0/properties/product_description
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1b.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1bInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X0be6b264:
      InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X0be6b264? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X0be6b264) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X0be6b264>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1bBranch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X0be6b264) add(InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1bBranch.InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X0be6b264)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1b {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1bNoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1b) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1b(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1bInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X0be6b264 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X0be6b264>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceOtherProductDescriptionX4802bb1bInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X0be6b264 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X0be6b264,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X0be6b264) add("InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X0be6b264: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X0be6b264")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
