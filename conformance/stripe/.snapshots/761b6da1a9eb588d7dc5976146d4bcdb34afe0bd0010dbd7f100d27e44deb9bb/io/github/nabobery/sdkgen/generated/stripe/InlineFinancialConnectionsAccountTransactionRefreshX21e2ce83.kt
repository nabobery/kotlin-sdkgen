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

public enum class InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83Branch {
  BankConnectionsResourceTransactionRefresh,
}

public sealed class InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83DecodingException(
  message: String,
) : SerializationException(message)

public class InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83NoMatchException(
  message: String,
) : InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83DecodingException(message)

internal data class InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83Inspection(
  public val matchesBankConnectionsResourceTransactionRefresh: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBankConnectionsResourceTransactionRefresh).count { it }
}

/**
 * The state of the most recent attempt to refresh the account transactions.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.account/properties/transaction_refresh
 */
@Serializable(with = InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83.Serializer::class)
public class InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83Inspection,
) {
  public val bankConnectionsResourceTransactionRefresh:
      BankConnectionsResourceTransactionRefreshView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBankConnectionsResourceTransactionRefresh) json.decodeFromJsonElement<BankConnectionsResourceTransactionRefreshView>(raw) else null }

  public val matchedBranches:
      Set<InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83Branch>
    get() = buildSet {
      if (inspection.matchesBankConnectionsResourceTransactionRefresh) add(InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83Branch.BankConnectionsResourceTransactionRefresh)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83 {
      val inspection = inspectInlineFinancialConnectionsAccountTransactionRefreshX21e2ce83(raw)
      if (inspection.matchCount == 0) {
        throw InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83NoMatchException("InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83) {
      encoder.requireJsonEncoder("InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineFinancialConnectionsAccountTransactionRefreshX21e2ce83(element: JsonElement): InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83Inspection {
  val raw = element as? JsonObject ?: return InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83Inspection(
    matchesBankConnectionsResourceTransactionRefresh = false,
    failures = listOf("BankConnectionsResourceTransactionRefresh: expected JSON object"),
  )
  val matchesBankConnectionsResourceTransactionRefresh = raw["id"].isString() && raw["last_attempted_at"] != null && raw["status"] != null
  return InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83Inspection(
    matchesBankConnectionsResourceTransactionRefresh = matchesBankConnectionsResourceTransactionRefresh,
    failures = buildList {
      if (!matchesBankConnectionsResourceTransactionRefresh) add("BankConnectionsResourceTransactionRefresh: required properties 'id', 'last_attempted_at', 'status' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
