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

public enum class InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7Branch {
  Branch1,
  InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X5b8e7701,
}

public sealed class InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7NoMatchException(
  message: String,
) : InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7DecodingException(message)

internal data class InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X5b8e7701: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X5b8e7701).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data/properties/billing_details/properties/email.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data/properties/billing_details/properties/email
 */
@Serializable(with = InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7.Serializer::class)
public class InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X5b8e7701:
      InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X5b8e7701? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X5b8e7701) json.decodeFromJsonElement<InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X5b8e7701>(raw) else null }

  public val matchedBranches: Set<InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7Branch.Branch1)
      if (inspection.matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X5b8e7701) add(InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7Branch.InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X5b8e7701)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7 {
      val inspection = inspectInlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7NoMatchException("InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7) {
      encoder.requireJsonEncoder("InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7(element: JsonElement): InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X5b8e7701 = element.isJsonDecodable<InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X5b8e7701>()
  return InlineV1TreasuryOutboundPab148PostRequestFormEmailXa8ceeab7Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X5b8e7701 = matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X5b8e7701,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X5b8e7701) add("InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X5b8e7701: value does not match InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X5b8e7701")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
