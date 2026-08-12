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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963cBranch {
  InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1X26c57d47,
  InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2X20d277dd,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963cNoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963cDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963cInspection(
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1X26c57d47:
      Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2X20d277dd:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1X26c57d47, matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2X20d277dd).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/not_received.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/not_received
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963c.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963cInspection,
) {
  public val inlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1X26c57d47:
      InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1X26c57d47? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1X26c57d47) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1X26c57d47>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2X20d277dd:
      InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2X20d277dd? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2X20d277dd) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2X20d277dd>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963cBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1X26c57d47) add(InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963cBranch.InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1X26c57d47)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2X20d277dd) add(InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963cBranch.InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2X20d277dd)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963c {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963cNoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963c) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963c(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963cInspection {
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1X26c57d47 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1X26c57d47>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2X20d277dd = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2X20d277dd>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedX1fdb963cInspection(
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1X26c57d47 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1X26c57d47,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2X20d277dd = matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2X20d277dd,
    failures = buildList {
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1X26c57d47) add("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1X26c57d47: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1X26c57d47")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2X20d277dd) add("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2X20d277dd: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf2X20d277dd")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
