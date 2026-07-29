package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts
 */
@Serializable(with = InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677.Serializer::class)
public class InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677(
  public val automaticTransferRulesByCurrency:
      InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674? = null,
  public val minimumBalanceByCurrency:
      InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978? = null,
  public val schedule:
      InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2? = null,
  public val statementDescriptor: String? = null,
) {
  public class Builder {
    public var automaticTransferRulesByCurrency:
        InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674? = null

    public var minimumBalanceByCurrency:
        InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978? = null

    public var schedule: InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2? =
        null

    public var statementDescriptor: String? = null

    public fun build(): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677 = InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677(
      automaticTransferRulesByCurrency = automaticTransferRulesByCurrency,
      minimumBalanceByCurrency = minimumBalanceByCurrency,
      schedule = schedule,
      statementDescriptor = statementDescriptor,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677 must be a JSON object")
      return InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677(
        automaticTransferRulesByCurrency = rawObject["automatic_transfer_rules_by_currency"]?.let { json.decodeFromJsonElement<InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674>(it) },
        minimumBalanceByCurrency = rawObject["minimum_balance_by_currency"]?.let { json.decodeFromJsonElement<InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978>(it) },
        schedule = rawObject["schedule"]?.let { json.decodeFromJsonElement<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsScheduleX6017e5c2>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.automaticTransferRulesByCurrency?.let { put("automatic_transfer_rules_by_currency", json.encodeToJsonElement(it)) }
        value.minimumBalanceByCurrency?.let { put("minimum_balance_by_currency", json.encodeToJsonElement(it)) }
        value.schedule?.let { put("schedule", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677(block: InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677.Builder.() -> Unit): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677 = InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsX8d952677.build(block)
