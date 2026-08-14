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

public enum class InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eebaBranch {
  Branch1,
  InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X802f997c,
}

public sealed class InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eebaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eebaNoMatchException(
  message: String,
) : InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eebaDecodingException(message)

internal data class InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eebaInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X802f997c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X802f997c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /disputed_transaction/properties/product_description.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /disputed_transaction/properties/product_description
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eeba.Serializer::class)
public class InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eeba internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eebaInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X802f997c:
      InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X802f997c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X802f997c) json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X802f997c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eebaBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eebaBranch.Branch1)
      if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X802f997c) add(InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eebaBranch.InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X802f997c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eeba {
      val inspection = inspectInlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eeba(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eebaNoMatchException("InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eeba matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eeba(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eeba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eeba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eeba")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eeba) {
      encoder.requireJsonEncoder("InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eeba").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eeba(element: JsonElement): InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eebaInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X802f997c = element.isJsonDecodable<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X802f997c>()
  return InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eebaInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X802f997c = matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X802f997c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X802f997c) add("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X802f997c: value does not match InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X802f997c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
