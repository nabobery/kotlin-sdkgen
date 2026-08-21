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

public enum class InlineV1CustomersCardsPostResponse200JsonXa7937916Branch {
  Card,
  BankAccount,
  Source,
}

public sealed class InlineV1CustomersCardsPostResponse200JsonXa7937916DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersCardsPostResponse200JsonXa7937916NoMatchException(
  message: String,
) : InlineV1CustomersCardsPostResponse200JsonXa7937916DecodingException(message)

internal data class InlineV1CustomersCardsPostResponse200JsonXa7937916Inspection(
  public val matchesCard: Boolean,
  public val matchesBankAccount: Boolean,
  public val matchesSource: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesCard, matchesBankAccount, matchesSource).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cards~1{id}/post/responses/200/content/application~1
 * json/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cards~1{id}/post/responses/200/content/application~1
 * json/schema
 */
@Serializable(with = InlineV1CustomersCardsPostResponse200JsonXa7937916.Serializer::class)
public class InlineV1CustomersCardsPostResponse200JsonXa7937916 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersCardsPostResponse200JsonXa7937916Inspection,
) {
  public val card: CardView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCard) json.decodeFromJsonElement<CardView>(raw) else null }

  public val bankAccount: BankAccountView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBankAccount) json.decodeFromJsonElement<BankAccountView>(raw) else null }

  public val source: SourceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSource) json.decodeFromJsonElement<SourceView>(raw) else null }

  public val matchedBranches: Set<InlineV1CustomersCardsPostResponse200JsonXa7937916Branch>
    get() = buildSet {
      if (inspection.matchesCard) add(InlineV1CustomersCardsPostResponse200JsonXa7937916Branch.Card)
      if (inspection.matchesBankAccount) add(InlineV1CustomersCardsPostResponse200JsonXa7937916Branch.BankAccount)
      if (inspection.matchesSource) add(InlineV1CustomersCardsPostResponse200JsonXa7937916Branch.Source)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersCardsPostResponse200JsonXa7937916 {
      val inspection = inspectInlineV1CustomersCardsPostResponse200JsonXa7937916(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersCardsPostResponse200JsonXa7937916NoMatchException("InlineV1CustomersCardsPostResponse200JsonXa7937916 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersCardsPostResponse200JsonXa7937916(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersCardsPostResponse200JsonXa7937916> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersCardsPostResponse200JsonXa7937916 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersCardsPostResponse200JsonXa7937916")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersCardsPostResponse200JsonXa7937916) {
      encoder.requireJsonEncoder("InlineV1CustomersCardsPostResponse200JsonXa7937916").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersCardsPostResponse200JsonXa7937916(element: JsonElement): InlineV1CustomersCardsPostResponse200JsonXa7937916Inspection {
  val raw = element as? JsonObject ?: return InlineV1CustomersCardsPostResponse200JsonXa7937916Inspection(
    matchesCard = false,
    matchesBankAccount = false,
    matchesSource = false,
    failures = listOf("Card: expected JSON object", "BankAccount: expected JSON object", "Source: expected JSON object"),
  )
  val matchesCard = raw["brand"].isString() && raw["exp_month"] != null && raw["exp_year"] != null && raw["funding"].isString() && raw["id"].isString() && raw["last4"].isString() && raw["object"] != null
  val matchesBankAccount = raw["country"].isString() && raw["currency"].isString() && raw["id"].isString() && raw["last4"].isString() && raw["object"] != null && raw["status"].isString()
  val matchesSource = raw["client_secret"].isString() && raw["created"] != null && raw["flow"].isString() && raw["id"].isString() && raw["livemode"] != null && raw["object"] != null && raw["status"].isString() && raw["type"] != null
  return InlineV1CustomersCardsPostResponse200JsonXa7937916Inspection(
    matchesCard = matchesCard,
    matchesBankAccount = matchesBankAccount,
    matchesSource = matchesSource,
    failures = buildList {
      if (!matchesCard) add("Card: required properties 'brand', 'exp_month', 'exp_year', 'funding', 'id', 'last4', 'object' do not match their declared types")
      if (!matchesBankAccount) add("BankAccount: required properties 'country', 'currency', 'id', 'last4', 'object', 'status' do not match their declared types")
      if (!matchesSource) add("Source: required properties 'client_secret', 'created', 'flow', 'id', 'livemode', 'object', 'status', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
