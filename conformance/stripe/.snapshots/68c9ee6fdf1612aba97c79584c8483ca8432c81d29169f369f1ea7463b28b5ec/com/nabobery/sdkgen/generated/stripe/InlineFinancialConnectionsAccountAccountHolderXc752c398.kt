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

public enum class InlineFinancialConnectionsAccountAccountHolderXc752c398Branch {
  BankConnectionsResourceAccountholder,
}

public sealed class InlineFinancialConnectionsAccountAccountHolderXc752c398DecodingException(
  message: String,
) : SerializationException(message)

public class InlineFinancialConnectionsAccountAccountHolderXc752c398NoMatchException(
  message: String,
) : InlineFinancialConnectionsAccountAccountHolderXc752c398DecodingException(message)

internal data class InlineFinancialConnectionsAccountAccountHolderXc752c398Inspection(
  public val matchesBankConnectionsResourceAccountholder: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBankConnectionsResourceAccountholder).count { it }
}

/**
 * The account holder that this account belongs to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.account/properties/account_holder
 */
@Serializable(with = InlineFinancialConnectionsAccountAccountHolderXc752c398.Serializer::class)
public class InlineFinancialConnectionsAccountAccountHolderXc752c398 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineFinancialConnectionsAccountAccountHolderXc752c398Inspection,
) {
  public val bankConnectionsResourceAccountholder: BankConnectionsResourceAccountholderView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBankConnectionsResourceAccountholder) json.decodeFromJsonElement<BankConnectionsResourceAccountholderView>(raw) else null }

  public val matchedBranches: Set<InlineFinancialConnectionsAccountAccountHolderXc752c398Branch>
    get() = buildSet {
      if (inspection.matchesBankConnectionsResourceAccountholder) add(InlineFinancialConnectionsAccountAccountHolderXc752c398Branch.BankConnectionsResourceAccountholder)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineFinancialConnectionsAccountAccountHolderXc752c398 {
      val inspection = inspectInlineFinancialConnectionsAccountAccountHolderXc752c398(raw)
      if (inspection.matchCount == 0) {
        throw InlineFinancialConnectionsAccountAccountHolderXc752c398NoMatchException("InlineFinancialConnectionsAccountAccountHolderXc752c398 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineFinancialConnectionsAccountAccountHolderXc752c398(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineFinancialConnectionsAccountAccountHolderXc752c398> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFinancialConnectionsAccountAccountHolderXc752c398 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFinancialConnectionsAccountAccountHolderXc752c398")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineFinancialConnectionsAccountAccountHolderXc752c398) {
      encoder.requireJsonEncoder("InlineFinancialConnectionsAccountAccountHolderXc752c398").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineFinancialConnectionsAccountAccountHolderXc752c398(element: JsonElement): InlineFinancialConnectionsAccountAccountHolderXc752c398Inspection {
  val raw = element as? JsonObject ?: return InlineFinancialConnectionsAccountAccountHolderXc752c398Inspection(
    matchesBankConnectionsResourceAccountholder = false,
    failures = listOf("BankConnectionsResourceAccountholder: expected JSON object"),
  )
  val matchesBankConnectionsResourceAccountholder = raw["type"] != null
  return InlineFinancialConnectionsAccountAccountHolderXc752c398Inspection(
    matchesBankConnectionsResourceAccountholder = matchesBankConnectionsResourceAccountholder,
    failures = buildList {
      if (!matchesBankConnectionsResourceAccountholder) add("BankConnectionsResourceAccountholder: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
