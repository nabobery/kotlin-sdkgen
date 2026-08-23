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

public enum class InlineApiErrorsSourceXc1356764Branch {
  BankAccount,
  Card,
  Source,
}

public sealed class InlineApiErrorsSourceXc1356764DecodingException(
  message: String,
) : SerializationException(message)

public class InlineApiErrorsSourceXc1356764NoMatchException(
  message: String,
) : InlineApiErrorsSourceXc1356764DecodingException(message)

internal data class InlineApiErrorsSourceXc1356764Inspection(
  public val matchesBankAccount: Boolean,
  public val matchesCard: Boolean,
  public val matchesSource: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBankAccount, matchesCard, matchesSource).count { it }
}

/**
 * The [source object](https://docs.stripe.com/api/sources/object) for errors returned on a request involving a source.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/api_errors/properties/source
 */
@Serializable(with = InlineApiErrorsSourceXc1356764.Serializer::class)
public class InlineApiErrorsSourceXc1356764 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineApiErrorsSourceXc1356764Inspection,
) {
  public val bankAccount: BankAccountView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBankAccount) json.decodeFromJsonElement<BankAccountView>(raw) else null }

  public val card: CardView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCard) json.decodeFromJsonElement<CardView>(raw) else null }

  public val source: SourceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSource) json.decodeFromJsonElement<SourceView>(raw) else null }

  public val matchedBranches: Set<InlineApiErrorsSourceXc1356764Branch>
    get() = buildSet {
      if (inspection.matchesBankAccount) add(InlineApiErrorsSourceXc1356764Branch.BankAccount)
      if (inspection.matchesCard) add(InlineApiErrorsSourceXc1356764Branch.Card)
      if (inspection.matchesSource) add(InlineApiErrorsSourceXc1356764Branch.Source)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineApiErrorsSourceXc1356764 {
      val inspection = inspectInlineApiErrorsSourceXc1356764(raw)
      if (inspection.matchCount == 0) {
        throw InlineApiErrorsSourceXc1356764NoMatchException("InlineApiErrorsSourceXc1356764 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineApiErrorsSourceXc1356764(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineApiErrorsSourceXc1356764> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApiErrorsSourceXc1356764 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApiErrorsSourceXc1356764")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineApiErrorsSourceXc1356764) {
      encoder.requireJsonEncoder("InlineApiErrorsSourceXc1356764").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineApiErrorsSourceXc1356764(element: JsonElement): InlineApiErrorsSourceXc1356764Inspection {
  val raw = element as? JsonObject ?: return InlineApiErrorsSourceXc1356764Inspection(
    matchesBankAccount = false,
    matchesCard = false,
    matchesSource = false,
    failures = listOf("BankAccount: expected JSON object", "Card: expected JSON object", "Source: expected JSON object"),
  )
  val matchesBankAccount = raw["country"].isString() && raw["currency"].isString() && raw["id"].isString() && raw["last4"].isString() && raw["object"] != null && raw["status"].isString()
  val matchesCard = raw["brand"].isString() && raw["exp_month"] != null && raw["exp_year"] != null && raw["funding"].isString() && raw["id"].isString() && raw["last4"].isString() && raw["object"] != null
  val matchesSource = raw["client_secret"].isString() && raw["created"] != null && raw["flow"].isString() && raw["id"].isString() && raw["livemode"] != null && raw["object"] != null && raw["status"].isString() && raw["type"] != null
  return InlineApiErrorsSourceXc1356764Inspection(
    matchesBankAccount = matchesBankAccount,
    matchesCard = matchesCard,
    matchesSource = matchesSource,
    failures = buildList {
      if (!matchesBankAccount) add("BankAccount: required properties 'country', 'currency', 'id', 'last4', 'object', 'status' do not match their declared types")
      if (!matchesCard) add("Card: required properties 'brand', 'exp_month', 'exp_year', 'funding', 'id', 'last4', 'object' do not match their declared types")
      if (!matchesSource) add("Source: required properties 'client_secret', 'created', 'flow', 'id', 'livemode', 'object', 'status', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
