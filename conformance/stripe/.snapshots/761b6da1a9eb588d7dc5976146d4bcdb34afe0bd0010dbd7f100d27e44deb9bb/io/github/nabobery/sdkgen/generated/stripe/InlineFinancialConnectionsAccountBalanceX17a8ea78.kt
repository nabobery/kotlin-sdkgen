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

public enum class InlineFinancialConnectionsAccountBalanceX17a8ea78Branch {
  BankConnectionsResourceBalance,
}

public sealed class InlineFinancialConnectionsAccountBalanceX17a8ea78DecodingException(
  message: String,
) : SerializationException(message)

public class InlineFinancialConnectionsAccountBalanceX17a8ea78NoMatchException(
  message: String,
) : InlineFinancialConnectionsAccountBalanceX17a8ea78DecodingException(message)

internal data class InlineFinancialConnectionsAccountBalanceX17a8ea78Inspection(
  public val matchesBankConnectionsResourceBalance: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBankConnectionsResourceBalance).count { it }
}

/**
 * The most recent information about the account's balance.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.account/properties/balance
 */
@Serializable(with = InlineFinancialConnectionsAccountBalanceX17a8ea78.Serializer::class)
public class InlineFinancialConnectionsAccountBalanceX17a8ea78 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineFinancialConnectionsAccountBalanceX17a8ea78Inspection,
) {
  public val bankConnectionsResourceBalance: BankConnectionsResourceBalanceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBankConnectionsResourceBalance) json.decodeFromJsonElement<BankConnectionsResourceBalanceView>(raw) else null }

  public val matchedBranches: Set<InlineFinancialConnectionsAccountBalanceX17a8ea78Branch>
    get() = buildSet {
      if (inspection.matchesBankConnectionsResourceBalance) add(InlineFinancialConnectionsAccountBalanceX17a8ea78Branch.BankConnectionsResourceBalance)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineFinancialConnectionsAccountBalanceX17a8ea78 {
      val inspection = inspectInlineFinancialConnectionsAccountBalanceX17a8ea78(raw)
      if (inspection.matchCount == 0) {
        throw InlineFinancialConnectionsAccountBalanceX17a8ea78NoMatchException("InlineFinancialConnectionsAccountBalanceX17a8ea78 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineFinancialConnectionsAccountBalanceX17a8ea78(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineFinancialConnectionsAccountBalanceX17a8ea78> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFinancialConnectionsAccountBalanceX17a8ea78 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFinancialConnectionsAccountBalanceX17a8ea78")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineFinancialConnectionsAccountBalanceX17a8ea78) {
      encoder.requireJsonEncoder("InlineFinancialConnectionsAccountBalanceX17a8ea78").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineFinancialConnectionsAccountBalanceX17a8ea78(element: JsonElement): InlineFinancialConnectionsAccountBalanceX17a8ea78Inspection {
  val raw = element as? JsonObject ?: return InlineFinancialConnectionsAccountBalanceX17a8ea78Inspection(
    matchesBankConnectionsResourceBalance = false,
    failures = listOf("BankConnectionsResourceBalance: expected JSON object"),
  )
  val matchesBankConnectionsResourceBalance = raw["as_of"] != null && raw["current"] != null && raw["type"] != null
  return InlineFinancialConnectionsAccountBalanceX17a8ea78Inspection(
    matchesBankConnectionsResourceBalance = matchesBankConnectionsResourceBalance,
    failures = buildList {
      if (!matchesBankConnectionsResourceBalance) add("BankConnectionsResourceBalance: required properties 'as_of', 'current', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
