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

public enum class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fcBranch {
  InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3,
  InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X0bbfce3c,
}

public sealed class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fcDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fcNoMatchException(
  message: String,
) : InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fcDecodingException(message)

internal data class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fcInspection(
  public val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3:
      Boolean,
  public val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X0bbfce3c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3, matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X0bbfce3c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fc.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fcInspection,
) {
  public val inlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3) json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3>(raw) else null }

  public val inlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X0bbfce3c:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X0bbfce3c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X0bbfce3c) json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X0bbfce3c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fcBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3) add(InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fcBranch.InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3)
      if (inspection.matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X0bbfce3c) add(InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fcBranch.InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X0bbfce3c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fc {
      val inspection = inspectInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fc(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fcNoMatchException("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fc(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fc) {
      encoder.requireJsonEncoder("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fc(element: JsonElement): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fcInspection {
  val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3 = element.isJsonDecodable<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3>()
  val matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X0bbfce3c = element.isJsonDecodable<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X0bbfce3c>()
  return InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fcInspection(
    matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3 = matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3,
    matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X0bbfce3c = matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X0bbfce3c,
    failures = buildList {
      if (!matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3) add("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3: value does not match InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1X7ad333e3")
      if (!matchesInlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X0bbfce3c) add("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X0bbfce3c: value does not match InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X0bbfce3c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
