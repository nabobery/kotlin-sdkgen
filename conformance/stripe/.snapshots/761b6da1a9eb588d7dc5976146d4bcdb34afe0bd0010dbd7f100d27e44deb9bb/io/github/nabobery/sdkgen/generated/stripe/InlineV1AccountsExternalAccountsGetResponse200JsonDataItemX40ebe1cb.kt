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

public enum class InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cbBranch {
  BankAccount,
  Card,
}

public sealed class InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cbDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cbNoMatchException(
  message: String,
) : InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cbDecodingException(message)

internal data class InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cbInspection(
  public val matchesBankAccount: Boolean,
  public val matchesCard: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBankAccount, matchesCard).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts/get/responses/200/content/applicatio
 * n~1json/schema/properties/data/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts/get/responses/200/content/applicatio
 * n~1json/schema/properties/data/items
 */
@Serializable(with = InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cb.Serializer::class)
public class InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cb internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cbInspection,
) {
  public val bankAccount: BankAccountView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBankAccount) json.decodeFromJsonElement<BankAccountView>(raw) else null }

  public val card: CardView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCard) json.decodeFromJsonElement<CardView>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cbBranch>
    get() = buildSet {
      if (inspection.matchesBankAccount) add(InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cbBranch.BankAccount)
      if (inspection.matchesCard) add(InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cbBranch.Card)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cb {
      val inspection = inspectInlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cb(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cbNoMatchException("InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cb matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cb(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cb")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cb) {
      encoder.requireJsonEncoder("InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cb").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cb(element: JsonElement): InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cbInspection {
  val raw = element as? JsonObject ?: return InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cbInspection(
    matchesBankAccount = false,
    matchesCard = false,
    failures = listOf("BankAccount: expected JSON object", "Card: expected JSON object"),
  )
  val matchesBankAccount = raw["country"].isString() && raw["currency"].isString() && raw["id"].isString() && raw["last4"].isString() && raw["object"] != null && raw["status"].isString()
  val matchesCard = raw["brand"].isString() && raw["exp_month"] != null && raw["exp_year"] != null && raw["funding"].isString() && raw["id"].isString() && raw["last4"].isString() && raw["object"] != null
  return InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cbInspection(
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
