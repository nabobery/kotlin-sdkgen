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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineIssuingDisputeTreasuryXcbdcc676Branch {
  IssuingDisputeTreasury,
}

public sealed class InlineIssuingDisputeTreasuryXcbdcc676DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingDisputeTreasuryXcbdcc676NoMatchException(
  message: String,
) : InlineIssuingDisputeTreasuryXcbdcc676DecodingException(message)

internal data class InlineIssuingDisputeTreasuryXcbdcc676Inspection(
  public val matchesIssuingDisputeTreasury: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingDisputeTreasury).count { it }
}

/**
 * [Treasury](https://docs.stripe.com/api/treasury) details related to this dispute if it was created on a
 * [FinancialAccount](https://docs.stripe.com/api/treasury/financial_accounts)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.dispute/properties/treasury
 */
@Serializable(with = InlineIssuingDisputeTreasuryXcbdcc676.Serializer::class)
public class InlineIssuingDisputeTreasuryXcbdcc676 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingDisputeTreasuryXcbdcc676Inspection,
) {
  public val issuingDisputeTreasury: IssuingDisputeTreasuryView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingDisputeTreasury) json.decodeFromJsonElement<IssuingDisputeTreasuryView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingDisputeTreasuryXcbdcc676Branch>
    get() = buildSet {
      if (inspection.matchesIssuingDisputeTreasury) add(InlineIssuingDisputeTreasuryXcbdcc676Branch.IssuingDisputeTreasury)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingDisputeTreasuryXcbdcc676 {
      val inspection = inspectInlineIssuingDisputeTreasuryXcbdcc676(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingDisputeTreasuryXcbdcc676NoMatchException("InlineIssuingDisputeTreasuryXcbdcc676 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingDisputeTreasuryXcbdcc676(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingDisputeTreasuryXcbdcc676> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingDisputeTreasuryXcbdcc676 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingDisputeTreasuryXcbdcc676")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingDisputeTreasuryXcbdcc676) {
      encoder.requireJsonEncoder("InlineIssuingDisputeTreasuryXcbdcc676").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingDisputeTreasuryXcbdcc676(element: JsonElement): InlineIssuingDisputeTreasuryXcbdcc676Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingDisputeTreasuryXcbdcc676Inspection(
    matchesIssuingDisputeTreasury = false,
    failures = listOf("IssuingDisputeTreasury: expected JSON object"),
  )
  val matchesIssuingDisputeTreasury = raw["received_debit"].isString()
  return InlineIssuingDisputeTreasuryXcbdcc676Inspection(
    matchesIssuingDisputeTreasury = matchesIssuingDisputeTreasury,
    failures = buildList {
      if (!matchesIssuingDisputeTreasury) add("IssuingDisputeTreasury: required properties 'received_debit' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
