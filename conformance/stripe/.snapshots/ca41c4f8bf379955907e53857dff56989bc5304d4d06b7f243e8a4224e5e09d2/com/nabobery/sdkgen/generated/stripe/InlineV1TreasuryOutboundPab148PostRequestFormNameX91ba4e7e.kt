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

public enum class InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7eBranch {
  Branch1,
  InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X24cd5bad,
}

public sealed class InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7eNoMatchException(
  message: String,
) : InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7eDecodingException(message)

internal data class InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X24cd5bad: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X24cd5bad).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data/properties/billing_details/properties/name.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data/properties/billing_details/properties/name
 */
@Serializable(with = InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7e.Serializer::class)
public class InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X24cd5bad:
      InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X24cd5bad? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X24cd5bad) json.decodeFromJsonElement<InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X24cd5bad>(raw) else null }

  public val matchedBranches: Set<InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7eBranch.Branch1)
      if (inspection.matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X24cd5bad) add(InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7eBranch.InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X24cd5bad)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7e {
      val inspection = inspectInlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7eNoMatchException("InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7e) {
      encoder.requireJsonEncoder("InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7e(element: JsonElement): InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X24cd5bad = element.isJsonDecodable<InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X24cd5bad>()
  return InlineV1TreasuryOutboundPab148PostRequestFormNameX91ba4e7eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X24cd5bad = matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X24cd5bad,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X24cd5bad) add("InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X24cd5bad: value does not match InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X24cd5bad")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
