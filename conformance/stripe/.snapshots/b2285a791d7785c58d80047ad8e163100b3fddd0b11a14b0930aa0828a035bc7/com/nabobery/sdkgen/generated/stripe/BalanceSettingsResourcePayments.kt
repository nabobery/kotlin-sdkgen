package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_settings_resource_payments
 */
@Serializable(with = BalanceSettingsResourcePayments.Serializer::class)
public class BalanceSettingsResourcePayments(
  public val settlementTiming: BalanceSettingsResourceSettlementTiming,
  /**
   * A Boolean indicating if Stripe should try to reclaim negative balances from an attached bank account. See
   * [Understanding Connect account balances](/connect/account-balances) for details. The default value is `false` when
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `application`, which includes Custom accounts, otherwise `true`.
   */
  public val debitNegativeBalances: Boolean? = null,
  /**
   * Settings specific to the account's payouts.
   */
  public val payouts: InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccb? = null,
) {
  public class Builder {
    private var settlementTimingValue: BalanceSettingsResourceSettlementTiming? = null

    public var settlementTiming: BalanceSettingsResourceSettlementTiming
      get() = requireNotNull(settlementTimingValue) { "settlementTiming is required" }
      set(`value`) {
        settlementTimingValue = value
      }

    /**
     * A Boolean indicating if Stripe should try to reclaim negative balances from an attached bank account. See
     * [Understanding Connect account balances](/connect/account-balances) for details. The default value is `false`
     * when [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection)
     * is `application`, which includes Custom accounts, otherwise `true`.
     */
    public var debitNegativeBalances: Boolean? = null

    /**
     * Settings specific to the account's payouts.
     */
    public var payouts: InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccb? = null

    public fun build(): BalanceSettingsResourcePayments {
      check(settlementTimingValue != null) { "settlementTiming is required" }
      return BalanceSettingsResourcePayments(
        settlementTiming = settlementTiming,
        debitNegativeBalances = debitNegativeBalances,
        payouts = payouts,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BalanceSettingsResourcePayments = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BalanceSettingsResourcePayments> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BalanceSettingsResourcePayments {
      val jsonDecoder = decoder.requireJsonDecoder("BalanceSettingsResourcePayments")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BalanceSettingsResourcePayments must be a JSON object")
      val settlementTiming = json.decodeRequired<BalanceSettingsResourceSettlementTiming>(rawObject, "settlement_timing")
      return BalanceSettingsResourcePayments(
        settlementTiming = settlementTiming,
        debitNegativeBalances = rawObject["debit_negative_balances"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        payouts = rawObject["payouts"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccb?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BalanceSettingsResourcePayments) {
      val jsonEncoder = encoder.requireJsonEncoder("BalanceSettingsResourcePayments")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("settlement_timing", json.encodeToJsonElement(value.settlementTiming))
        value.debitNegativeBalances?.let { put("debit_negative_balances", json.encodeToJsonElement(it)) }
        value.payouts?.let { put("payouts", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun balanceSettingsResourcePayments(block: BalanceSettingsResourcePayments.Builder.() -> Unit): BalanceSettingsResourcePayments = BalanceSettingsResourcePayments.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BalanceSettingsResourcePayments is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
