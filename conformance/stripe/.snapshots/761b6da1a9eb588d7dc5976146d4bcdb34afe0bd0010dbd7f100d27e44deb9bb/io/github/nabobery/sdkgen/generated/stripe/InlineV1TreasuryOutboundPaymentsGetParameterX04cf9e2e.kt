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

public enum class InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2eBranch {
  InlineV1TreasuryOutboundPaymentsGetParameterAnyOf1Xc9b533a6,
  Branch2,
}

public sealed class InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2eNoMatchException(
  message: String,
) : InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2eDecodingException(message)

internal data class InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2eInspection(
  public val matchesInlineV1TreasuryOutboundPaymentsGetParameterAnyOf1Xc9b533a6: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TreasuryOutboundPaymentsGetParameterAnyOf1Xc9b533a6, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/get/parameters/0/schema
 */
@Serializable(with = InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2e.Serializer::class)
public class InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2eInspection,
) {
  public val inlineV1TreasuryOutboundPaymentsGetParameterAnyOf1Xc9b533a6:
      InlineV1TreasuryOutboundPaymentsGetParameterAnyOf1Xc9b533a6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TreasuryOutboundPaymentsGetParameterAnyOf1Xc9b533a6) json.decodeFromJsonElement<InlineV1TreasuryOutboundPaymentsGetParameterAnyOf1Xc9b533a6>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2eBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1TreasuryOutboundPaymentsGetParameterAnyOf1Xc9b533a6) add(InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2eBranch.InlineV1TreasuryOutboundPaymentsGetParameterAnyOf1Xc9b533a6)
      if (inspection.matchesBranch2) add(InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2eBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2e {
      val inspection = inspectInlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2eNoMatchException("InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2e) {
      encoder.requireJsonEncoder("InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2e(element: JsonElement): InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2eInspection {
  val matchesInlineV1TreasuryOutboundPaymentsGetParameterAnyOf1Xc9b533a6 = element.isJsonDecodable<InlineV1TreasuryOutboundPaymentsGetParameterAnyOf1Xc9b533a6>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2eInspection(
    matchesInlineV1TreasuryOutboundPaymentsGetParameterAnyOf1Xc9b533a6 = matchesInlineV1TreasuryOutboundPaymentsGetParameterAnyOf1Xc9b533a6,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1TreasuryOutboundPaymentsGetParameterAnyOf1Xc9b533a6) add("InlineV1TreasuryOutboundPaymentsGetParameterAnyOf1Xc9b533a6: value does not match InlineV1TreasuryOutboundPaymentsGetParameterAnyOf1Xc9b533a6")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
