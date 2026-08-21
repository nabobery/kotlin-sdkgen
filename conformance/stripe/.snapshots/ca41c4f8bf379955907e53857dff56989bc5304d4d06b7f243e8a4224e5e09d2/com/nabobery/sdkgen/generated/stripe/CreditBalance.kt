package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_balance
 */
@Serializable(with = CreditBalance.Serializer::class)
public class CreditBalance(
  public val availableBalance: BillingCreditGrantsResourceAmount,
  public val ledgerBalance: BillingCreditGrantsResourceAmount,
) {
  public class Builder {
    private var availableBalanceValue: BillingCreditGrantsResourceAmount? = null

    public var availableBalance: BillingCreditGrantsResourceAmount
      get() = requireNotNull(availableBalanceValue) { "availableBalance is required" }
      set(`value`) {
        availableBalanceValue = value
      }

    private var ledgerBalanceValue: BillingCreditGrantsResourceAmount? = null

    public var ledgerBalance: BillingCreditGrantsResourceAmount
      get() = requireNotNull(ledgerBalanceValue) { "ledgerBalance is required" }
      set(`value`) {
        ledgerBalanceValue = value
      }

    public fun build(): CreditBalance {
      check(availableBalanceValue != null) { "availableBalance is required" }
      check(ledgerBalanceValue != null) { "ledgerBalance is required" }
      return CreditBalance(
        availableBalance = availableBalance,
        ledgerBalance = ledgerBalance,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CreditBalance = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CreditBalance> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CreditBalance {
      val jsonDecoder = decoder.requireJsonDecoder("CreditBalance")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CreditBalance must be a JSON object")
      val availableBalance = json.decodeRequired<BillingCreditGrantsResourceAmount>(rawObject, "available_balance")
      val ledgerBalance = json.decodeRequired<BillingCreditGrantsResourceAmount>(rawObject, "ledger_balance")
      return CreditBalance(
        availableBalance = availableBalance,
        ledgerBalance = ledgerBalance,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CreditBalance) {
      val jsonEncoder = encoder.requireJsonEncoder("CreditBalance")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("available_balance", json.encodeToJsonElement(value.availableBalance))
        put("ledger_balance", json.encodeToJsonElement(value.ledgerBalance))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun creditBalance(block: CreditBalance.Builder.() -> Unit): CreditBalance = CreditBalance.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CreditBalance is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
