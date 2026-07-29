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

public enum class InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caaBranch {
  InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X9eee653b,
  InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2Xc4a33a84,
}

public sealed class InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caaNoMatchException(
  message: String,
) : InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caaDecodingException(message)

internal data class InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caaInspection(
  public val matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X9eee653b: Boolean,
  public val matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2Xc4a33a84: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X9eee653b, matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2Xc4a33a84).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data/properties/billing_details/properties/address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data/properties/billing_details/properties/address
 */
@Serializable(with = InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caa.Serializer::class)
public class InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caa internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caaInspection,
) {
  public val inlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X9eee653b:
      InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X9eee653b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X9eee653b) json.decodeFromJsonElement<InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X9eee653b>(raw) else null }

  public val inlineV1TreasuryOutboundPab148PostRequestFormAnyOf2Xc4a33a84:
      InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2Xc4a33a84? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2Xc4a33a84) json.decodeFromJsonElement<InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2Xc4a33a84>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caaBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X9eee653b) add(InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caaBranch.InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X9eee653b)
      if (inspection.matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2Xc4a33a84) add(InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caaBranch.InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2Xc4a33a84)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caa {
      val inspection = inspectInlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caa(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caaNoMatchException("InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caa matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caa(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caa")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caa) {
      encoder.requireJsonEncoder("InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caa").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caa(element: JsonElement): InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caaInspection {
  val matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X9eee653b = element.isJsonDecodable<InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X9eee653b>()
  val matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2Xc4a33a84 = element.isJsonDecodable<InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2Xc4a33a84>()
  return InlineV1TreasuryOutboundPab148PostRequestFormAddressXdc145caaInspection(
    matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X9eee653b = matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X9eee653b,
    matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2Xc4a33a84 = matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2Xc4a33a84,
    failures = buildList {
      if (!matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X9eee653b) add("InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X9eee653b: value does not match InlineV1TreasuryOutboundPab148PostRequestFormAnyOf1X9eee653b")
      if (!matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2Xc4a33a84) add("InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2Xc4a33a84: value does not match InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2Xc4a33a84")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
