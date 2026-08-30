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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9fBranch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9fNoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9fDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/duplicate/anyOf/0/properties/card_statement.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/duplicate/anyOf/0/properties/card_statement
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9f.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9fInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf:
      InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9fBranch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf) add(InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9fBranch.InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9f {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9fNoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9f) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9f(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9fInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateCardStatementXf5505b9fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf = matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf) add("InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
