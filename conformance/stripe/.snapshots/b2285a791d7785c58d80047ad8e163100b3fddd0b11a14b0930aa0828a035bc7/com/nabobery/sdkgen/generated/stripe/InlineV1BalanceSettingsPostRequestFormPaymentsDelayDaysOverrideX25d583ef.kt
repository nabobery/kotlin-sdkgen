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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583efBranch {
  Branch1,
  InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X70c04a25,
}

public sealed class InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583efDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583efNoMatchException(
  message: String,
) : InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583efDecodingException(message)

internal data class InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583efInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X70c04a25:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X70c04a25).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/settlement_timing/properties/delay_days_override.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/settlement_timing/properties/delay_days_override
 */
@Serializable(with = InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583ef.Serializer::class)
public class InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583ef internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583efInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X70c04a25:
      InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X70c04a25? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X70c04a25) json.decodeFromJsonElement<InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X70c04a25>(raw) else null }

  public val matchedBranches:
      Set<InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583efBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583efBranch.Branch1)
      if (inspection.matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X70c04a25) add(InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583efBranch.InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X70c04a25)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583ef {
      val inspection = inspectInlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583ef(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583efNoMatchException("InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583ef matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583ef(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583ef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583ef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583ef")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583ef) {
      encoder.requireJsonEncoder("InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583ef").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583ef(element: JsonElement): InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583efInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X70c04a25 = element.isJsonDecodable<InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X70c04a25>()
  return InlineV1BalanceSettingsPostRequestFormPaymentsDelayDaysOverrideX25d583efInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X70c04a25 = matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X70c04a25,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X70c04a25) add("InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X70c04a25: value does not match InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X70c04a25")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
