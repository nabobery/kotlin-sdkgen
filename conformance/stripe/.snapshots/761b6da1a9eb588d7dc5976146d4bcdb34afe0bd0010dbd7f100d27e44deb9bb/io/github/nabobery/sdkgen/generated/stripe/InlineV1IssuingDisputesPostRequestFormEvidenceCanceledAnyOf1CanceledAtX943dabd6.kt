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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6Branch {
  Branch1,
  InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6NoMatchException(
  message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/canceled/anyOf/0/properties/canceled_at.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/canceled/anyOf/0/properties/canceled_at
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06:
      InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06) json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6Branch.Branch1)
      if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06) add(InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6Branch.InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6 {
      val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6NoMatchException("InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6) {
      encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6(element: JsonElement): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06 = element.isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06>()
  return InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1CanceledAtX943dabd6Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06) add("InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
