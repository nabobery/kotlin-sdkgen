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

public enum class InlineCustomerCashBalanceXe45dcf30Branch {
  CashBalance,
}

public sealed class InlineCustomerCashBalanceXe45dcf30DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerCashBalanceXe45dcf30NoMatchException(
  message: String,
) : InlineCustomerCashBalanceXe45dcf30DecodingException(message)

internal data class InlineCustomerCashBalanceXe45dcf30Inspection(
  public val matchesCashBalance: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesCashBalance).count { it }
}

/**
 * The current funds being held by Stripe on behalf of the customer. You can apply these funds towards payment intents
 * when the source is "cash_balance". The `settings[reconciliation_mode]` field describes if these funds apply to these
 * payment intents manually or automatically.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer/properties/cash_balance
 */
@Serializable(with = InlineCustomerCashBalanceXe45dcf30.Serializer::class)
public class InlineCustomerCashBalanceXe45dcf30 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomerCashBalanceXe45dcf30Inspection,
) {
  public val cashBalance: CashBalanceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCashBalance) json.decodeFromJsonElement<CashBalanceView>(raw) else null }

  public val matchedBranches: Set<InlineCustomerCashBalanceXe45dcf30Branch>
    get() = buildSet {
      if (inspection.matchesCashBalance) add(InlineCustomerCashBalanceXe45dcf30Branch.CashBalance)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerCashBalanceXe45dcf30 {
      val inspection = inspectInlineCustomerCashBalanceXe45dcf30(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerCashBalanceXe45dcf30NoMatchException("InlineCustomerCashBalanceXe45dcf30 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerCashBalanceXe45dcf30(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCustomerCashBalanceXe45dcf30> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerCashBalanceXe45dcf30 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerCashBalanceXe45dcf30")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerCashBalanceXe45dcf30) {
      encoder.requireJsonEncoder("InlineCustomerCashBalanceXe45dcf30").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerCashBalanceXe45dcf30(element: JsonElement): InlineCustomerCashBalanceXe45dcf30Inspection {
  val raw = element as? JsonObject ?: return InlineCustomerCashBalanceXe45dcf30Inspection(
    matchesCashBalance = false,
    failures = listOf("CashBalance: expected JSON object"),
  )
  val matchesCashBalance = raw["customer"].isString() && raw["livemode"] != null && raw["object"] != null && raw["settings"] != null
  return InlineCustomerCashBalanceXe45dcf30Inspection(
    matchesCashBalance = matchesCashBalance,
    failures = buildList {
      if (!matchesCashBalance) add("CashBalance: required properties 'customer', 'livemode', 'object', 'settings' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
