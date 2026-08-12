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

public enum class InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7eBranch {
  TreasuryFinancialAccountsResourcePlatformRestrictions,
}

public sealed class InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7eNoMatchException(
  message: String,
) : InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7eDecodingException(message)

internal data class InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7eInspection(
  public val matchesTreasuryFinancialAccountsResourcePlatformRestrictions: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTreasuryFinancialAccountsResourcePlatformRestrictions).count { it }
}

/**
 * The set of functionalities that the platform can restrict on the FinancialAccount.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.financial_account/properties/platform_restrictions
 */
@Serializable(with = InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7e.Serializer::class)
public class InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7eInspection,
) {
  public val treasuryFinancialAccountsResourcePlatformRestrictions:
      TreasuryFinancialAccountsResourcePlatformRestrictionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryFinancialAccountsResourcePlatformRestrictions) json.decodeFromJsonElement<TreasuryFinancialAccountsResourcePlatformRestrictionsView>(raw) else null }

  public val matchedBranches: Set<InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7eBranch>
    get() = buildSet {
      if (inspection.matchesTreasuryFinancialAccountsResourcePlatformRestrictions) add(InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7eBranch.TreasuryFinancialAccountsResourcePlatformRestrictions)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7e {
      val inspection = inspectInlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7e(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7eNoMatchException("InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7e) {
      encoder.requireJsonEncoder("InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7e(element: JsonElement): InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7eInspection {
  val raw = element as? JsonObject ?: return InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7eInspection(
    matchesTreasuryFinancialAccountsResourcePlatformRestrictions = false,
    failures = listOf("TreasuryFinancialAccountsResourcePlatformRestrictions: expected JSON object"),
  )
  val matchesTreasuryFinancialAccountsResourcePlatformRestrictions = true
  return InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7eInspection(
    matchesTreasuryFinancialAccountsResourcePlatformRestrictions = matchesTreasuryFinancialAccountsResourcePlatformRestrictions,
    failures = buildList {
      if (!matchesTreasuryFinancialAccountsResourcePlatformRestrictions) add("TreasuryFinancialAccountsResourcePlatformRestrictions: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
