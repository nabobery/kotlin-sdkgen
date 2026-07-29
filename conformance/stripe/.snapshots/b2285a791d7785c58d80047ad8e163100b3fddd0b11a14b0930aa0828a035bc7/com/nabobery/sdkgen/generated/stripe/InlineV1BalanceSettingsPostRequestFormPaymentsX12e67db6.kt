package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Settings that apply to the [Payments Balance](https://docs.stripe.com/api/balance).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments
 */
@Serializable(with = InlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6.Serializer::class)
public class InlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6(
  public val debitNegativeBalances: Boolean? = null,
  public val payouts: InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677? = null,
  public val settlementTiming:
      InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d? = null,
) {
  public class Builder {
    public var debitNegativeBalances: Boolean? = null

    public var payouts: InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677? = null

    public var settlementTiming:
        InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d? = null

    public fun build(): InlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6 = InlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6(
      debitNegativeBalances = debitNegativeBalances,
      payouts = payouts,
      settlementTiming = settlementTiming,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6 must be a JSON object")
      return InlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6(
        debitNegativeBalances = rawObject["debit_negative_balances"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        payouts = rawObject["payouts"]?.let { json.decodeFromJsonElement<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677>(it) },
        settlementTiming = rawObject["settlement_timing"]?.let { json.decodeFromJsonElement<InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingX8c4c446d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.debitNegativeBalances?.let { put("debit_negative_balances", json.encodeToJsonElement(it)) }
        value.payouts?.let { put("payouts", json.encodeToJsonElement(it)) }
        value.settlementTiming?.let { put("settlement_timing", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6(block: InlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6.Builder.() -> Unit): InlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6 = InlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6.build(block)
