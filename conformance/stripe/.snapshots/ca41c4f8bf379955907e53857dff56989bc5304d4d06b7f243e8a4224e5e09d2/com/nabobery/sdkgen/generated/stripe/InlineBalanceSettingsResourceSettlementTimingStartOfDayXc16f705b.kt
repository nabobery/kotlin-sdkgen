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

public enum class InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705bBranch {
  BalanceSettingsResourceStartOfDay,
}

public sealed class InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705bNoMatchException(
  message: String,
) : InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705bDecodingException(message)

internal data class InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705bInspection(
  public val matchesBalanceSettingsResourceStartOfDay: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBalanceSettingsResourceStartOfDay).count { it }
}

/**
 * Customized start of day configuration for automatic payouts to group and send payments in local timezones with a
 * customized day starting time. For details, see our [Customized start of day](/connect/customized-start-of-day)
 * documentation.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/balance_settings_resource_settlement_timing/properties/start_of_day
 */
@Serializable(with = InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705b.Serializer::class)
public class InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705bInspection,
) {
  public val balanceSettingsResourceStartOfDay: BalanceSettingsResourceStartOfDayView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBalanceSettingsResourceStartOfDay) json.decodeFromJsonElement<BalanceSettingsResourceStartOfDayView>(raw) else null }

  public val matchedBranches:
      Set<InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705bBranch>
    get() = buildSet {
      if (inspection.matchesBalanceSettingsResourceStartOfDay) add(InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705bBranch.BalanceSettingsResourceStartOfDay)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705b {
      val inspection = inspectInlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705b(raw)
      if (inspection.matchCount == 0) {
        throw InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705bNoMatchException("InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705b) {
      encoder.requireJsonEncoder("InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705b(element: JsonElement): InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705bInspection {
  val raw = element as? JsonObject ?: return InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705bInspection(
    matchesBalanceSettingsResourceStartOfDay = false,
    failures = listOf("BalanceSettingsResourceStartOfDay: expected JSON object"),
  )
  val matchesBalanceSettingsResourceStartOfDay = raw["hour"] != null && raw["minutes"] != null && raw["timezone"].isString()
  return InlineBalanceSettingsResourceSettlementTimingStartOfDayXc16f705bInspection(
    matchesBalanceSettingsResourceStartOfDay = matchesBalanceSettingsResourceStartOfDay,
    failures = buildList {
      if (!matchesBalanceSettingsResourceStartOfDay) add("BalanceSettingsResourceStartOfDay: required properties 'hour', 'minutes', 'timezone' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
