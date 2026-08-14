package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492bBranch {
  InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d,
  InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X01a62efa,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492bNoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492bDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492bInspection(
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d:
      Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X01a62efa:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d, matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X01a62efa).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/fraudulent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/fraudulent
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492b.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492bInspection,
) {
  public val inlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d:
      InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X01a62efa:
      InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X01a62efa? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X01a62efa) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X01a62efa>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492bBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d) add(InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492bBranch.InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X01a62efa) add(InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492bBranch.InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X01a62efa)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492b {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492bNoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492b) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492b(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492bInspection {
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X01a62efa = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X01a62efa>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentXaf1a492bInspection(
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d = matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X01a62efa = matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X01a62efa,
    failures = buildList {
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d) add("InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X54614d7d")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X01a62efa) add("InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X01a62efa: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X01a62efa")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
