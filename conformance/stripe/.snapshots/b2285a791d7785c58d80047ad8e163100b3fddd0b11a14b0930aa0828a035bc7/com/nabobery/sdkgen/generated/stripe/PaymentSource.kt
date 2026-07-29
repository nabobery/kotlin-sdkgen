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

public enum class PaymentSourceBranch {
  Account,
  BankAccount,
  Card,
  Source,
}

public sealed class PaymentSourceDecodingException(
  message: String,
) : SerializationException(message)

public class PaymentSourceNoMatchException(
  message: String,
) : PaymentSourceDecodingException(message)

internal data class PaymentSourceInspection(
  public val matchesAccount: Boolean,
  public val matchesBankAccount: Boolean,
  public val matchesCard: Boolean,
  public val matchesSource: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAccount, matchesBankAccount, matchesCard, matchesSource).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/components/schemas/payment_source.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_source
 */
@Serializable(with = PaymentSource.Serializer::class)
public class PaymentSource internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: PaymentSourceInspection,
) {
  public val account: AccountView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccount) json.decodeFromJsonElement<AccountView>(raw) else null }

  public val bankAccount: BankAccountView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBankAccount) json.decodeFromJsonElement<BankAccountView>(raw) else null }

  public val card: CardView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCard) json.decodeFromJsonElement<CardView>(raw) else null }

  public val source: SourceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSource) json.decodeFromJsonElement<SourceView>(raw) else null }

  public val matchedBranches: Set<PaymentSourceBranch>
    get() = buildSet {
      if (inspection.matchesAccount) add(PaymentSourceBranch.Account)
      if (inspection.matchesBankAccount) add(PaymentSourceBranch.BankAccount)
      if (inspection.matchesCard) add(PaymentSourceBranch.Card)
      if (inspection.matchesSource) add(PaymentSourceBranch.Source)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): PaymentSource {
      val inspection = inspectPaymentSource(raw)
      if (inspection.matchCount == 0) {
        throw PaymentSourceNoMatchException("PaymentSource matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return PaymentSource(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<PaymentSource> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentSource {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentSource")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: PaymentSource) {
      encoder.requireJsonEncoder("PaymentSource").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectPaymentSource(element: JsonElement): PaymentSourceInspection {
  val raw = element as? JsonObject ?: return PaymentSourceInspection(
    matchesAccount = false,
    matchesBankAccount = false,
    matchesCard = false,
    matchesSource = false,
    failures = listOf("Account: expected JSON object", "BankAccount: expected JSON object", "Card: expected JSON object", "Source: expected JSON object"),
  )
  val matchesAccount = raw["id"].isString() && raw["object"] != null
  val matchesBankAccount = raw["country"].isString() && raw["currency"].isString() && raw["id"].isString() && raw["last4"].isString() && raw["object"] != null && raw["status"].isString()
  val matchesCard = raw["brand"].isString() && raw["exp_month"] != null && raw["exp_year"] != null && raw["funding"].isString() && raw["id"].isString() && raw["last4"].isString() && raw["object"] != null
  val matchesSource = raw["client_secret"].isString() && raw["created"] != null && raw["flow"].isString() && raw["id"].isString() && raw["livemode"] != null && raw["object"] != null && raw["status"].isString() && raw["type"] != null
  return PaymentSourceInspection(
    matchesAccount = matchesAccount,
    matchesBankAccount = matchesBankAccount,
    matchesCard = matchesCard,
    matchesSource = matchesSource,
    failures = buildList {
      if (!matchesAccount) add("Account: required properties 'id', 'object' do not match their declared types")
      if (!matchesBankAccount) add("BankAccount: required properties 'country', 'currency', 'id', 'last4', 'object', 'status' do not match their declared types")
      if (!matchesCard) add("Card: required properties 'brand', 'exp_month', 'exp_year', 'funding', 'id', 'last4', 'object' do not match their declared types")
      if (!matchesSource) add("Source: required properties 'client_secret', 'created', 'flow', 'id', 'livemode', 'object', 'status', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
