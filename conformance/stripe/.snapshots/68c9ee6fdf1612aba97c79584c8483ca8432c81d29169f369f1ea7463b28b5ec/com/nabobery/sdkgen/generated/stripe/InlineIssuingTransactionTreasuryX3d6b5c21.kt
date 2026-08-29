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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineIssuingTransactionTreasuryX3d6b5c21Branch {
  IssuingTransactionTreasury,
}

public sealed class InlineIssuingTransactionTreasuryX3d6b5c21DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingTransactionTreasuryX3d6b5c21NoMatchException(
  message: String,
) : InlineIssuingTransactionTreasuryX3d6b5c21DecodingException(message)

internal data class InlineIssuingTransactionTreasuryX3d6b5c21Inspection(
  public val matchesIssuingTransactionTreasury: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingTransactionTreasury).count { it }
}

/**
 * [Treasury](https://docs.stripe.com/api/treasury) details related to this transaction if it was created on a
 * [FinancialAccount](/docs/api/treasury/financial_accounts
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.transaction/properties/treasury
 */
@Serializable(with = InlineIssuingTransactionTreasuryX3d6b5c21.Serializer::class)
public class InlineIssuingTransactionTreasuryX3d6b5c21 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingTransactionTreasuryX3d6b5c21Inspection,
) {
  public val issuingTransactionTreasury: IssuingTransactionTreasuryView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingTransactionTreasury) json.decodeFromJsonElement<IssuingTransactionTreasuryView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingTransactionTreasuryX3d6b5c21Branch>
    get() = buildSet {
      if (inspection.matchesIssuingTransactionTreasury) add(InlineIssuingTransactionTreasuryX3d6b5c21Branch.IssuingTransactionTreasury)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingTransactionTreasuryX3d6b5c21 {
      val inspection = inspectInlineIssuingTransactionTreasuryX3d6b5c21(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingTransactionTreasuryX3d6b5c21NoMatchException("InlineIssuingTransactionTreasuryX3d6b5c21 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingTransactionTreasuryX3d6b5c21(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingTransactionTreasuryX3d6b5c21> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingTransactionTreasuryX3d6b5c21 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionTreasuryX3d6b5c21")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTransactionTreasuryX3d6b5c21) {
      encoder.requireJsonEncoder("InlineIssuingTransactionTreasuryX3d6b5c21").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingTransactionTreasuryX3d6b5c21(element: JsonElement): InlineIssuingTransactionTreasuryX3d6b5c21Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingTransactionTreasuryX3d6b5c21Inspection(
    matchesIssuingTransactionTreasury = false,
    failures = listOf("IssuingTransactionTreasury: expected JSON object"),
  )
  val matchesIssuingTransactionTreasury = true
  return InlineIssuingTransactionTreasuryX3d6b5c21Inspection(
    matchesIssuingTransactionTreasury = matchesIssuingTransactionTreasury,
    failures = buildList {
      if (!matchesIssuingTransactionTreasury) add("IssuingTransactionTreasury: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
