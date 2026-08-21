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

public enum class InlineBalanceSettingsResourcePayoutsScheduleX201b5df2Branch {
  BalanceSettingsResourcePayoutSchedule,
}

public sealed class InlineBalanceSettingsResourcePayoutsScheduleX201b5df2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBalanceSettingsResourcePayoutsScheduleX201b5df2NoMatchException(
  message: String,
) : InlineBalanceSettingsResourcePayoutsScheduleX201b5df2DecodingException(message)

internal data class InlineBalanceSettingsResourcePayoutsScheduleX201b5df2Inspection(
  public val matchesBalanceSettingsResourcePayoutSchedule: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBalanceSettingsResourcePayoutSchedule).count { it }
}

/**
 * Details on when funds from charges are available, and when they are paid out to an external account. See our [Setting
 * Bank and Debit Card Payouts](https://docs.stripe.com/connect/bank-transfers#payout-information) documentation for
 * details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_settings_resource_payouts/properties/schedule
 */
@Serializable(with = InlineBalanceSettingsResourcePayoutsScheduleX201b5df2.Serializer::class)
public class InlineBalanceSettingsResourcePayoutsScheduleX201b5df2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBalanceSettingsResourcePayoutsScheduleX201b5df2Inspection,
) {
  public val balanceSettingsResourcePayoutSchedule: BalanceSettingsResourcePayoutScheduleView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBalanceSettingsResourcePayoutSchedule) json.decodeFromJsonElement<BalanceSettingsResourcePayoutScheduleView>(raw) else null }

  public val matchedBranches: Set<InlineBalanceSettingsResourcePayoutsScheduleX201b5df2Branch>
    get() = buildSet {
      if (inspection.matchesBalanceSettingsResourcePayoutSchedule) add(InlineBalanceSettingsResourcePayoutsScheduleX201b5df2Branch.BalanceSettingsResourcePayoutSchedule)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBalanceSettingsResourcePayoutsScheduleX201b5df2 {
      val inspection = inspectInlineBalanceSettingsResourcePayoutsScheduleX201b5df2(raw)
      if (inspection.matchCount == 0) {
        throw InlineBalanceSettingsResourcePayoutsScheduleX201b5df2NoMatchException("InlineBalanceSettingsResourcePayoutsScheduleX201b5df2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBalanceSettingsResourcePayoutsScheduleX201b5df2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBalanceSettingsResourcePayoutsScheduleX201b5df2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBalanceSettingsResourcePayoutsScheduleX201b5df2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBalanceSettingsResourcePayoutsScheduleX201b5df2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBalanceSettingsResourcePayoutsScheduleX201b5df2) {
      encoder.requireJsonEncoder("InlineBalanceSettingsResourcePayoutsScheduleX201b5df2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBalanceSettingsResourcePayoutsScheduleX201b5df2(element: JsonElement): InlineBalanceSettingsResourcePayoutsScheduleX201b5df2Inspection {
  val raw = element as? JsonObject ?: return InlineBalanceSettingsResourcePayoutsScheduleX201b5df2Inspection(
    matchesBalanceSettingsResourcePayoutSchedule = false,
    failures = listOf("BalanceSettingsResourcePayoutSchedule: expected JSON object"),
  )
  val matchesBalanceSettingsResourcePayoutSchedule = true
  return InlineBalanceSettingsResourcePayoutsScheduleX201b5df2Inspection(
    matchesBalanceSettingsResourcePayoutSchedule = matchesBalanceSettingsResourcePayoutSchedule,
    failures = buildList {
      if (!matchesBalanceSettingsResourcePayoutSchedule) add("BalanceSettingsResourcePayoutSchedule: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
