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

public enum class InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00efBranch {
  Branch1,
  InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X0f6bed99,
}

public sealed class InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00efDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00efNoMatchException(
  message: String,
) : InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00efDecodingException(message)

internal data class InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00efInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X0f6bed99:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X0f6bed99).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /disputed_transaction/properties/customer_device_fingerprint.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /disputed_transaction/properties/customer_device_fingerprint
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00ef.Serializer::class)
public class InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00ef internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00efInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X0f6bed99:
      InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X0f6bed99? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X0f6bed99) json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X0f6bed99>(raw) else null }

  public val matchedBranches:
      Set<InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00efBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00efBranch.Branch1)
      if (inspection.matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X0f6bed99) add(InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00efBranch.InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X0f6bed99)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00ef {
      val inspection = inspectInlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00ef(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00efNoMatchException("InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00ef matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00ef(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00ef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00ef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00ef")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00ef) {
      encoder.requireJsonEncoder("InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00ef").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00ef(element: JsonElement): InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00efInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X0f6bed99 = element.isJsonDecodable<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X0f6bed99>()
  return InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00efInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X0f6bed99 = matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X0f6bed99,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X0f6bed99) add("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X0f6bed99: value does not match InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X0f6bed99")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
