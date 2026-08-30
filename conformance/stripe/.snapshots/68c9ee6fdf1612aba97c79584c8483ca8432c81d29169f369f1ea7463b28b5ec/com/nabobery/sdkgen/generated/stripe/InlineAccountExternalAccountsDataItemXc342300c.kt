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

public enum class InlineAccountExternalAccountsDataItemXc342300cBranch {
  BankAccount,
  Card,
}

public sealed class InlineAccountExternalAccountsDataItemXc342300cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineAccountExternalAccountsDataItemXc342300cNoMatchException(
  message: String,
) : InlineAccountExternalAccountsDataItemXc342300cDecodingException(message)

internal data class InlineAccountExternalAccountsDataItemXc342300cInspection(
  public val matchesBankAccount: Boolean,
  public val matchesCard: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBankAccount, matchesCard).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/account/properties/external_accounts/properties/data/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account/properties/external_accounts/properties/data/items
 */
@Serializable(with = InlineAccountExternalAccountsDataItemXc342300c.Serializer::class)
public class InlineAccountExternalAccountsDataItemXc342300c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineAccountExternalAccountsDataItemXc342300cInspection,
) {
  public val bankAccount: BankAccountView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBankAccount) json.decodeFromJsonElement<BankAccountView>(raw) else null }

  public val card: CardView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCard) json.decodeFromJsonElement<CardView>(raw) else null }

  public val matchedBranches: Set<InlineAccountExternalAccountsDataItemXc342300cBranch>
    get() = buildSet {
      if (inspection.matchesBankAccount) add(InlineAccountExternalAccountsDataItemXc342300cBranch.BankAccount)
      if (inspection.matchesCard) add(InlineAccountExternalAccountsDataItemXc342300cBranch.Card)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineAccountExternalAccountsDataItemXc342300c {
      val inspection = inspectInlineAccountExternalAccountsDataItemXc342300c(raw)
      if (inspection.matchCount == 0) {
        throw InlineAccountExternalAccountsDataItemXc342300cNoMatchException("InlineAccountExternalAccountsDataItemXc342300c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineAccountExternalAccountsDataItemXc342300c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineAccountExternalAccountsDataItemXc342300c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAccountExternalAccountsDataItemXc342300c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAccountExternalAccountsDataItemXc342300c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineAccountExternalAccountsDataItemXc342300c) {
      encoder.requireJsonEncoder("InlineAccountExternalAccountsDataItemXc342300c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineAccountExternalAccountsDataItemXc342300c(element: JsonElement): InlineAccountExternalAccountsDataItemXc342300cInspection {
  val raw = element as? JsonObject ?: return InlineAccountExternalAccountsDataItemXc342300cInspection(
    matchesBankAccount = false,
    matchesCard = false,
    failures = listOf("BankAccount: expected JSON object", "Card: expected JSON object"),
  )
  val matchesBankAccount = raw["country"].isString() && raw["currency"].isString() && raw["id"].isString() && raw["last4"].isString() && raw["object"] != null && raw["status"].isString()
  val matchesCard = raw["brand"].isString() && raw["exp_month"] != null && raw["exp_year"] != null && raw["funding"].isString() && raw["id"].isString() && raw["last4"].isString() && raw["object"] != null
  return InlineAccountExternalAccountsDataItemXc342300cInspection(
    matchesBankAccount = matchesBankAccount,
    matchesCard = matchesCard,
    failures = buildList {
      if (!matchesBankAccount) add("BankAccount: required properties 'country', 'currency', 'id', 'last4', 'object', 'status' do not match their declared types")
      if (!matchesCard) add("Card: required properties 'brand', 'exp_month', 'exp_year', 'funding', 'id', 'last4', 'object' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
