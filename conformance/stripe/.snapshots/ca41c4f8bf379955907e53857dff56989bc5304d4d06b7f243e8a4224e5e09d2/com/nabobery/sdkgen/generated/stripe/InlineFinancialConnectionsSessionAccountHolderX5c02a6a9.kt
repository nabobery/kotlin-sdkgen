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

public enum class InlineFinancialConnectionsSessionAccountHolderX5c02a6a9Branch {
  BankConnectionsResourceAccountholder,
}

public sealed class InlineFinancialConnectionsSessionAccountHolderX5c02a6a9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineFinancialConnectionsSessionAccountHolderX5c02a6a9NoMatchException(
  message: String,
) : InlineFinancialConnectionsSessionAccountHolderX5c02a6a9DecodingException(message)

internal data class InlineFinancialConnectionsSessionAccountHolderX5c02a6a9Inspection(
  public val matchesBankConnectionsResourceAccountholder: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBankConnectionsResourceAccountholder).count { it }
}

/**
 * The account holder for whom accounts are collected in this session.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.session/properties/account_holder
 */
@Serializable(with = InlineFinancialConnectionsSessionAccountHolderX5c02a6a9.Serializer::class)
public class InlineFinancialConnectionsSessionAccountHolderX5c02a6a9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineFinancialConnectionsSessionAccountHolderX5c02a6a9Inspection,
) {
  public val bankConnectionsResourceAccountholder: BankConnectionsResourceAccountholderView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBankConnectionsResourceAccountholder) json.decodeFromJsonElement<BankConnectionsResourceAccountholderView>(raw) else null }

  public val matchedBranches: Set<InlineFinancialConnectionsSessionAccountHolderX5c02a6a9Branch>
    get() = buildSet {
      if (inspection.matchesBankConnectionsResourceAccountholder) add(InlineFinancialConnectionsSessionAccountHolderX5c02a6a9Branch.BankConnectionsResourceAccountholder)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineFinancialConnectionsSessionAccountHolderX5c02a6a9 {
      val inspection = inspectInlineFinancialConnectionsSessionAccountHolderX5c02a6a9(raw)
      if (inspection.matchCount == 0) {
        throw InlineFinancialConnectionsSessionAccountHolderX5c02a6a9NoMatchException("InlineFinancialConnectionsSessionAccountHolderX5c02a6a9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineFinancialConnectionsSessionAccountHolderX5c02a6a9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineFinancialConnectionsSessionAccountHolderX5c02a6a9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFinancialConnectionsSessionAccountHolderX5c02a6a9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFinancialConnectionsSessionAccountHolderX5c02a6a9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineFinancialConnectionsSessionAccountHolderX5c02a6a9) {
      encoder.requireJsonEncoder("InlineFinancialConnectionsSessionAccountHolderX5c02a6a9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineFinancialConnectionsSessionAccountHolderX5c02a6a9(element: JsonElement): InlineFinancialConnectionsSessionAccountHolderX5c02a6a9Inspection {
  val raw = element as? JsonObject ?: return InlineFinancialConnectionsSessionAccountHolderX5c02a6a9Inspection(
    matchesBankConnectionsResourceAccountholder = false,
    failures = listOf("BankConnectionsResourceAccountholder: expected JSON object"),
  )
  val matchesBankConnectionsResourceAccountholder = raw["type"] != null
  return InlineFinancialConnectionsSessionAccountHolderX5c02a6a9Inspection(
    matchesBankConnectionsResourceAccountholder = matchesBankConnectionsResourceAccountholder,
    failures = buildList {
      if (!matchesBankConnectionsResourceAccountholder) add("BankConnectionsResourceAccountholder: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
