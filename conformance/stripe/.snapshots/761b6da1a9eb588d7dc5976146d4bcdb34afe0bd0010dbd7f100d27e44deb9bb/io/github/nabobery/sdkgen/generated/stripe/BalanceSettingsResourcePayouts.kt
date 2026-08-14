package io.github.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@ConsistentCopyVisibility
@Serializable
public data class BalanceSettingsResourcePayoutsView internal constructor(
  @SerialName("automatic_transfer_rules_by_currency")
  public val automaticTransferRulesByCurrency:
      Map<String, List<BalanceSettingsResourceAutomaticTransferRule>>? = null,
  @SerialName("minimum_balance_by_currency")
  public val minimumBalanceByCurrency: Map<String, Int>? = null,
  public val schedule: InlineBalanceSettingsResourcePayoutsScheduleX201b5df2? = null,
  @SerialName("statement_descriptor")
  public val statementDescriptor: String? = null,
  public val status: InlineBalanceSettingsResourcePayoutsStatusX07f9777d,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_settings_resource_payouts
 */
@Serializable(with = BalanceSettingsResourcePayouts.Serializer::class)
public class BalanceSettingsResourcePayouts(
  /**
   * Whether the funds in this account can be paid out.
   */
  public val status: InlineBalanceSettingsResourcePayoutsStatusX07f9777d,
  automaticTransferRulesByCurrency: Map<String, List<BalanceSettingsResourceAutomaticTransferRule>>? = null,
  minimumBalanceByCurrency: Map<String, Int>? = null,
  /**
   * Details on when funds from charges are available, and when they are paid out to an external account. See our
   * [Setting Bank and Debit Card Payouts](https://docs.stripe.com/connect/bank-transfers#payout-information)
   * documentation for details.
   */
  public val schedule: InlineBalanceSettingsResourcePayoutsScheduleX201b5df2? = null,
  /**
   * The text that appears on the bank account statement for payouts. If not set, this defaults to the platform's bank
   * descriptor as set in the Dashboard.
   */
  public val statementDescriptor: String? = null,
) {
  /**
   * Configures per-currency rules for automatically transferring funds from the payments balance to a FinancialAccount.
   */
  public val automaticTransferRulesByCurrency:
      Map<String, List<BalanceSettingsResourceAutomaticTransferRule>>? =
      automaticTransferRulesByCurrency?.let { collection0 -> collection0.entries.associate { (key1, mapValue1) -> key1 to mapValue1.toList() } }

  /**
   * The minimum balance amount to retain per currency after automatic payouts. Only funds that exceed these amounts are
   * paid out. Learn more about the [minimum balances for automatic
   * payouts](/payouts/minimum-balances-for-automatic-payouts).
   */
  public val minimumBalanceByCurrency: Map<String, Int>? =
      minimumBalanceByCurrency?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var statusValue: InlineBalanceSettingsResourcePayoutsStatusX07f9777d? = null

    public var status: InlineBalanceSettingsResourcePayoutsStatusX07f9777d
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var automaticTransferRulesByCurrencyValue:
        Map<String, List<BalanceSettingsResourceAutomaticTransferRule>>? = null

    /**
     * Configures per-currency rules for automatically transferring funds from the payments balance to a
     * FinancialAccount.
     */
    public var automaticTransferRulesByCurrency:
        Map<String, List<BalanceSettingsResourceAutomaticTransferRule>>?
      get() = automaticTransferRulesByCurrencyValue?.let { collection0 -> collection0.entries.associate { (key1, mapValue1) -> key1 to mapValue1.toList() } }
      set(`value`) {
        automaticTransferRulesByCurrencyValue = value?.let { collection0 -> collection0.entries.associate { (key1, mapValue1) -> key1 to mapValue1.toList() } }
      }

    private var minimumBalanceByCurrencyValue: Map<String, Int>? = null

    /**
     * The minimum balance amount to retain per currency after automatic payouts. Only funds that exceed these amounts
     * are paid out. Learn more about the [minimum balances for automatic
     * payouts](/payouts/minimum-balances-for-automatic-payouts).
     */
    public var minimumBalanceByCurrency: Map<String, Int>?
      get() = minimumBalanceByCurrencyValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        minimumBalanceByCurrencyValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Details on when funds from charges are available, and when they are paid out to an external account. See our
     * [Setting Bank and Debit Card Payouts](https://docs.stripe.com/connect/bank-transfers#payout-information)
     * documentation for details.
     */
    public var schedule: InlineBalanceSettingsResourcePayoutsScheduleX201b5df2? = null

    /**
     * The text that appears on the bank account statement for payouts. If not set, this defaults to the platform's bank
     * descriptor as set in the Dashboard.
     */
    public var statementDescriptor: String? = null

    public fun build(): BalanceSettingsResourcePayouts {
      check(statusValue != null) { "status is required" }
      return BalanceSettingsResourcePayouts(
        status = status,
        automaticTransferRulesByCurrency = automaticTransferRulesByCurrency,
        minimumBalanceByCurrency = minimumBalanceByCurrency,
        schedule = schedule,
        statementDescriptor = statementDescriptor,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BalanceSettingsResourcePayouts = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BalanceSettingsResourcePayouts> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BalanceSettingsResourcePayouts {
      val jsonDecoder = decoder.requireJsonDecoder("BalanceSettingsResourcePayouts")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BalanceSettingsResourcePayouts must be a JSON object")
      val status = json.decodeRequired<InlineBalanceSettingsResourcePayoutsStatusX07f9777d>(rawObject, "status")
      return BalanceSettingsResourcePayouts(
        status = status,
        automaticTransferRulesByCurrency = rawObject["automatic_transfer_rules_by_currency"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, List<BalanceSettingsResourceAutomaticTransferRule>>?>(element) },
        minimumBalanceByCurrency = rawObject["minimum_balance_by_currency"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, Int>?>(element) },
        schedule = rawObject["schedule"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBalanceSettingsResourcePayoutsScheduleX201b5df2?>(element) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BalanceSettingsResourcePayouts) {
      val jsonEncoder = encoder.requireJsonEncoder("BalanceSettingsResourcePayouts")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        value.automaticTransferRulesByCurrency?.let { put("automatic_transfer_rules_by_currency", json.encodeToJsonElement(it)) }
        value.minimumBalanceByCurrency?.let { put("minimum_balance_by_currency", json.encodeToJsonElement(it)) }
        value.schedule?.let { put("schedule", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun balanceSettingsResourcePayouts(block: BalanceSettingsResourcePayouts.Builder.() -> Unit): BalanceSettingsResourcePayouts = BalanceSettingsResourcePayouts.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BalanceSettingsResourcePayouts is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
