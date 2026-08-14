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

public enum class ExternalAccountBranch {
  BankAccount,
  Card,
}

public sealed class ExternalAccountDecodingException(
  message: String,
) : SerializationException(message)

public class ExternalAccountNoMatchException(
  message: String,
) : ExternalAccountDecodingException(message)

internal data class ExternalAccountInspection(
  public val matchesBankAccount: Boolean,
  public val matchesCard: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBankAccount, matchesCard).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/components/schemas/external_account.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/external_account
 */
@Serializable(with = ExternalAccount.Serializer::class)
public class ExternalAccount internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: ExternalAccountInspection,
) {
  public val bankAccount: BankAccountView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBankAccount) json.decodeFromJsonElement<BankAccountView>(raw) else null }

  public val card: CardView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCard) json.decodeFromJsonElement<CardView>(raw) else null }

  public val matchedBranches: Set<ExternalAccountBranch>
    get() = buildSet {
      if (inspection.matchesBankAccount) add(ExternalAccountBranch.BankAccount)
      if (inspection.matchesCard) add(ExternalAccountBranch.Card)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): ExternalAccount {
      val inspection = inspectExternalAccount(raw)
      if (inspection.matchCount == 0) {
        throw ExternalAccountNoMatchException("ExternalAccount matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return ExternalAccount(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<ExternalAccount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ExternalAccount {
      val jsonDecoder = decoder.requireJsonDecoder("ExternalAccount")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: ExternalAccount) {
      encoder.requireJsonEncoder("ExternalAccount").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectExternalAccount(element: JsonElement): ExternalAccountInspection {
  val raw = element as? JsonObject ?: return ExternalAccountInspection(
    matchesBankAccount = false,
    matchesCard = false,
    failures = listOf("BankAccount: expected JSON object", "Card: expected JSON object"),
  )
  val matchesBankAccount = raw["country"].isString() && raw["currency"].isString() && raw["id"].isString() && raw["last4"].isString() && raw["object"] != null && raw["status"].isString()
  val matchesCard = raw["brand"].isString() && raw["exp_month"] != null && raw["exp_year"] != null && raw["funding"].isString() && raw["id"].isString() && raw["last4"].isString() && raw["object"] != null
  return ExternalAccountInspection(
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
