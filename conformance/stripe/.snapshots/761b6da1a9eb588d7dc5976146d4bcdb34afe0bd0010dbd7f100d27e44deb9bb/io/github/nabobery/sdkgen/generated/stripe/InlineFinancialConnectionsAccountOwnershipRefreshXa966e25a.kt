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

public enum class InlineFinancialConnectionsAccountOwnershipRefreshXa966e25aBranch {
  BankConnectionsResourceOwnershipRefresh,
}

public sealed class InlineFinancialConnectionsAccountOwnershipRefreshXa966e25aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineFinancialConnectionsAccountOwnershipRefreshXa966e25aNoMatchException(
  message: String,
) : InlineFinancialConnectionsAccountOwnershipRefreshXa966e25aDecodingException(message)

internal data class InlineFinancialConnectionsAccountOwnershipRefreshXa966e25aInspection(
  public val matchesBankConnectionsResourceOwnershipRefresh: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBankConnectionsResourceOwnershipRefresh).count { it }
}

/**
 * The state of the most recent attempt to refresh the account owners.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.account/properties/ownership_refresh
 */
@Serializable(with = InlineFinancialConnectionsAccountOwnershipRefreshXa966e25a.Serializer::class)
public class InlineFinancialConnectionsAccountOwnershipRefreshXa966e25a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineFinancialConnectionsAccountOwnershipRefreshXa966e25aInspection,
) {
  public val bankConnectionsResourceOwnershipRefresh: BankConnectionsResourceOwnershipRefreshView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBankConnectionsResourceOwnershipRefresh) json.decodeFromJsonElement<BankConnectionsResourceOwnershipRefreshView>(raw) else null }

  public val matchedBranches: Set<InlineFinancialConnectionsAccountOwnershipRefreshXa966e25aBranch>
    get() = buildSet {
      if (inspection.matchesBankConnectionsResourceOwnershipRefresh) add(InlineFinancialConnectionsAccountOwnershipRefreshXa966e25aBranch.BankConnectionsResourceOwnershipRefresh)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineFinancialConnectionsAccountOwnershipRefreshXa966e25a {
      val inspection = inspectInlineFinancialConnectionsAccountOwnershipRefreshXa966e25a(raw)
      if (inspection.matchCount == 0) {
        throw InlineFinancialConnectionsAccountOwnershipRefreshXa966e25aNoMatchException("InlineFinancialConnectionsAccountOwnershipRefreshXa966e25a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineFinancialConnectionsAccountOwnershipRefreshXa966e25a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineFinancialConnectionsAccountOwnershipRefreshXa966e25a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFinancialConnectionsAccountOwnershipRefreshXa966e25a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFinancialConnectionsAccountOwnershipRefreshXa966e25a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineFinancialConnectionsAccountOwnershipRefreshXa966e25a) {
      encoder.requireJsonEncoder("InlineFinancialConnectionsAccountOwnershipRefreshXa966e25a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineFinancialConnectionsAccountOwnershipRefreshXa966e25a(element: JsonElement): InlineFinancialConnectionsAccountOwnershipRefreshXa966e25aInspection {
  val raw = element as? JsonObject ?: return InlineFinancialConnectionsAccountOwnershipRefreshXa966e25aInspection(
    matchesBankConnectionsResourceOwnershipRefresh = false,
    failures = listOf("BankConnectionsResourceOwnershipRefresh: expected JSON object"),
  )
  val matchesBankConnectionsResourceOwnershipRefresh = raw["last_attempted_at"] != null && raw["status"] != null
  return InlineFinancialConnectionsAccountOwnershipRefreshXa966e25aInspection(
    matchesBankConnectionsResourceOwnershipRefresh = matchesBankConnectionsResourceOwnershipRefresh,
    failures = buildList {
      if (!matchesBankConnectionsResourceOwnershipRefresh) add("BankConnectionsResourceOwnershipRefresh: required properties 'last_attempted_at', 'status' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
