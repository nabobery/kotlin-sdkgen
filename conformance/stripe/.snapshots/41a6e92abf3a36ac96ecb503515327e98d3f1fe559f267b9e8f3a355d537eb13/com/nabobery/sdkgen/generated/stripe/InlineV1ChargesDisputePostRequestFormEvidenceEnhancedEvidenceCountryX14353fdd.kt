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

public enum class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fddBranch {
  Branch1,
  InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e,
}

public sealed class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fddDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fddNoMatchException(
  message: String,
) : InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fddDecodingException(message)

internal data class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fddInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/prior_undisputed_transactions/items/properties/shipping_address/properties/country.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/prior_undisputed_transactions/items/properties/shipping_address/properties/country
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fdd.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fdd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fddInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e) json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e>(raw) else null }

  public val matchedBranches:
      Set<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fddBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fddBranch.Branch1)
      if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e) add(InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fddBranch.InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fdd {
      val inspection = inspectInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fdd(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fddNoMatchException("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fdd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fdd(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fdd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fdd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fdd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fdd) {
      encoder.requireJsonEncoder("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fdd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fdd(element: JsonElement): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fddInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e = element.isJsonDecodable<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e>()
  return InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fddInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e = matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e) add("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e: value does not match InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
