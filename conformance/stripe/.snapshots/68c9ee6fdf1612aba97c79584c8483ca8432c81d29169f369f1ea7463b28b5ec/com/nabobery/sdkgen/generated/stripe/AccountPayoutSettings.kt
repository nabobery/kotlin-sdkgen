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
 * Source: sdkgen://source/openapi.json#/components/schemas/account_payout_settings
 */
@Serializable(with = AccountPayoutSettings.Serializer::class)
public class AccountPayoutSettings(
  /**
   * A Boolean indicating if Stripe should try to reclaim negative balances from an attached bank account. See
   * [Understanding Connect account balances](/connect/account-balances) for details. The default value is `false` when
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `application`, which includes Custom accounts, otherwise `true`.
   */
  public val debitNegativeBalances: Boolean,
  public val schedule: TransferSchedule,
  /**
   * The text that appears on the bank account statement for payouts. If not set, this defaults to the platform's bank
   * descriptor as set in the Dashboard.
   */
  public val statementDescriptor: String? = null,
) {
  public class Builder {
    private var debitNegativeBalancesValue: Boolean? = null

    public var debitNegativeBalances: Boolean
      get() = requireNotNull(debitNegativeBalancesValue) { "debitNegativeBalances is required" }
      set(`value`) {
        debitNegativeBalancesValue = value
      }

    private var scheduleValue: TransferSchedule? = null

    public var schedule: TransferSchedule
      get() = requireNotNull(scheduleValue) { "schedule is required" }
      set(`value`) {
        scheduleValue = value
      }

    /**
     * The text that appears on the bank account statement for payouts. If not set, this defaults to the platform's bank
     * descriptor as set in the Dashboard.
     */
    public var statementDescriptor: String? = null

    public fun build(): AccountPayoutSettings {
      check(debitNegativeBalancesValue != null) { "debitNegativeBalances is required" }
      check(scheduleValue != null) { "schedule is required" }
      return AccountPayoutSettings(
        debitNegativeBalances = debitNegativeBalances,
        schedule = schedule,
        statementDescriptor = statementDescriptor,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountPayoutSettings = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AccountPayoutSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountPayoutSettings {
      val jsonDecoder = decoder.requireJsonDecoder("AccountPayoutSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountPayoutSettings must be a JSON object")
      val debitNegativeBalances = json.decodeRequired<Boolean>(rawObject, "debit_negative_balances")
      val schedule = json.decodeRequired<TransferSchedule>(rawObject, "schedule")
      return AccountPayoutSettings(
        debitNegativeBalances = debitNegativeBalances,
        schedule = schedule,
        statementDescriptor = rawObject["statement_descriptor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountPayoutSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountPayoutSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("debit_negative_balances", json.encodeToJsonElement(value.debitNegativeBalances))
        put("schedule", json.encodeToJsonElement(value.schedule))
        value.statementDescriptor?.let { put("statement_descriptor", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountPayoutSettings(block: AccountPayoutSettings.Builder.() -> Unit): AccountPayoutSettings = AccountPayoutSettings.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AccountPayoutSettings is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
