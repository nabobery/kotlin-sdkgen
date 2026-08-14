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

public enum class InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7eBranch {
  Branch1,
  InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34,
}

public sealed class InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7eNoMatchException(
  message: String,
) : InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7eDecodingException(message)

internal data class InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data/properties/billing_details/properties/phone.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data/properties/billing_details/properties/phone
 */
@Serializable(with = InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7e.Serializer::class)
public class InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34:
      InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34) json.decodeFromJsonElement<InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34>(raw) else null }

  public val matchedBranches: Set<InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7eBranch.Branch1)
      if (inspection.matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34) add(InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7eBranch.InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7e {
      val inspection = inspectInlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7eNoMatchException("InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7e) {
      encoder.requireJsonEncoder("InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7e(element: JsonElement): InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34 = element.isJsonDecodable<InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34>()
  return InlineV1TreasuryOutboundPab148PostRequestFormPhoneXd6b64e7eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34 = matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34) add("InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34: value does not match InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
