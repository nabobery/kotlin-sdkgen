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

public enum class InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5Branch {
  BankConnectionsResourceBalanceRefresh,
}

public sealed class InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5NoMatchException(
  message: String,
) : InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5DecodingException(message)

internal data class InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5Inspection(
  public val matchesBankConnectionsResourceBalanceRefresh: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBankConnectionsResourceBalanceRefresh).count { it }
}

/**
 * The state of the most recent attempt to refresh the account balance.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.account/properties/balance_refresh
 */
@Serializable(with = InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5.Serializer::class)
public class InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5Inspection,
) {
  public val bankConnectionsResourceBalanceRefresh: BankConnectionsResourceBalanceRefreshView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBankConnectionsResourceBalanceRefresh) json.decodeFromJsonElement<BankConnectionsResourceBalanceRefreshView>(raw) else null }

  public val matchedBranches: Set<InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5Branch>
    get() = buildSet {
      if (inspection.matchesBankConnectionsResourceBalanceRefresh) add(InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5Branch.BankConnectionsResourceBalanceRefresh)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5 {
      val inspection = inspectInlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5(raw)
      if (inspection.matchCount == 0) {
        throw InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5NoMatchException("InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5) {
      encoder.requireJsonEncoder("InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5(element: JsonElement): InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5Inspection {
  val raw = element as? JsonObject ?: return InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5Inspection(
    matchesBankConnectionsResourceBalanceRefresh = false,
    failures = listOf("BankConnectionsResourceBalanceRefresh: expected JSON object"),
  )
  val matchesBankConnectionsResourceBalanceRefresh = raw["last_attempted_at"] != null && raw["status"] != null
  return InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5Inspection(
    matchesBankConnectionsResourceBalanceRefresh = matchesBankConnectionsResourceBalanceRefresh,
    failures = buildList {
      if (!matchesBankConnectionsResourceBalanceRefresh) add("BankConnectionsResourceBalanceRefresh: required properties 'last_attempted_at', 'status' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
