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

public enum class InlineCustomerSourcesDataItemXd8d0d900Branch {
  BankAccount,
  Card,
  Source,
}

public sealed class InlineCustomerSourcesDataItemXd8d0d900DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerSourcesDataItemXd8d0d900NoMatchException(
  message: String,
) : InlineCustomerSourcesDataItemXd8d0d900DecodingException(message)

internal data class InlineCustomerSourcesDataItemXd8d0d900Inspection(
  public val matchesBankAccount: Boolean,
  public val matchesCard: Boolean,
  public val matchesSource: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBankAccount, matchesCard, matchesSource).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/customer/properties/sources/properties/data/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer/properties/sources/properties/data/items
 */
@Serializable(with = InlineCustomerSourcesDataItemXd8d0d900.Serializer::class)
public class InlineCustomerSourcesDataItemXd8d0d900 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomerSourcesDataItemXd8d0d900Inspection,
) {
  public val bankAccount: BankAccountView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBankAccount) json.decodeFromJsonElement<BankAccountView>(raw) else null }

  public val card: CardView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCard) json.decodeFromJsonElement<CardView>(raw) else null }

  public val source: SourceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSource) json.decodeFromJsonElement<SourceView>(raw) else null }

  public val matchedBranches: Set<InlineCustomerSourcesDataItemXd8d0d900Branch>
    get() = buildSet {
      if (inspection.matchesBankAccount) add(InlineCustomerSourcesDataItemXd8d0d900Branch.BankAccount)
      if (inspection.matchesCard) add(InlineCustomerSourcesDataItemXd8d0d900Branch.Card)
      if (inspection.matchesSource) add(InlineCustomerSourcesDataItemXd8d0d900Branch.Source)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerSourcesDataItemXd8d0d900 {
      val inspection = inspectInlineCustomerSourcesDataItemXd8d0d900(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerSourcesDataItemXd8d0d900NoMatchException("InlineCustomerSourcesDataItemXd8d0d900 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerSourcesDataItemXd8d0d900(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerSourcesDataItemXd8d0d900> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerSourcesDataItemXd8d0d900 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerSourcesDataItemXd8d0d900")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerSourcesDataItemXd8d0d900) {
      encoder.requireJsonEncoder("InlineCustomerSourcesDataItemXd8d0d900").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerSourcesDataItemXd8d0d900(element: JsonElement): InlineCustomerSourcesDataItemXd8d0d900Inspection {
  val raw = element as? JsonObject ?: return InlineCustomerSourcesDataItemXd8d0d900Inspection(
    matchesBankAccount = false,
    matchesCard = false,
    matchesSource = false,
    failures = listOf("BankAccount: expected JSON object", "Card: expected JSON object", "Source: expected JSON object"),
  )
  val matchesBankAccount = raw["country"].isString() && raw["currency"].isString() && raw["id"].isString() && raw["last4"].isString() && raw["object"] != null && raw["status"].isString()
  val matchesCard = raw["brand"].isString() && raw["exp_month"] != null && raw["exp_year"] != null && raw["funding"].isString() && raw["id"].isString() && raw["last4"].isString() && raw["object"] != null
  val matchesSource = raw["client_secret"].isString() && raw["created"] != null && raw["flow"].isString() && raw["id"].isString() && raw["livemode"] != null && raw["object"] != null && raw["status"].isString() && raw["type"] != null
  return InlineCustomerSourcesDataItemXd8d0d900Inspection(
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
