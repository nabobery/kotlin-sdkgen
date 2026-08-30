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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85fBranch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2X245c16e2,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85fNoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85fDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2X245c16e2:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2X245c16e2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/fraudulent/anyOf/0/properties/explanation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/fraudulent/anyOf/0/properties/explanation
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85f.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85fInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2X245c16e2:
      InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2X245c16e2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2X245c16e2) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2X245c16e2>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85fBranch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2X245c16e2) add(InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85fBranch.InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2X245c16e2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85f {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85fNoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85f) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85f(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85fInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2X245c16e2 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2X245c16e2>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentExplanationXc481d85fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2X245c16e2 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2X245c16e2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2X245c16e2) add("InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2X245c16e2: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1AnyOf2X245c16e2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
