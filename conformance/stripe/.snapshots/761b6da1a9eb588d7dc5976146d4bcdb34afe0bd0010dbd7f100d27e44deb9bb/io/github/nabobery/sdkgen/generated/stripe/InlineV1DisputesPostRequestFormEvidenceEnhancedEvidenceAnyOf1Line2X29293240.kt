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

public enum class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240Branch {
  Branch1,
  InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X99308e87,
}

public sealed class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240NoMatchException(
  message: String,
) : InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240DecodingException(message)

internal data class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X99308e87:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X99308e87).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /prior_undisputed_transactions/items/properties/shipping_address/properties/line2.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /prior_undisputed_transactions/items/properties/shipping_address/properties/line2
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240.Serializer::class)
public class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X99308e87:
      InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X99308e87? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X99308e87) json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X99308e87>(raw) else null }

  public val matchedBranches:
      Set<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240Branch.Branch1)
      if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X99308e87) add(InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240Branch.InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X99308e87)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240 {
      val inspection = inspectInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240NoMatchException("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240) {
      encoder.requireJsonEncoder("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240(element: JsonElement): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X99308e87 = element.isJsonDecodable<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X99308e87>()
  return InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X29293240Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X99308e87 = matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X99308e87,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X99308e87) add("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X99308e87: value does not match InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X99308e87")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
