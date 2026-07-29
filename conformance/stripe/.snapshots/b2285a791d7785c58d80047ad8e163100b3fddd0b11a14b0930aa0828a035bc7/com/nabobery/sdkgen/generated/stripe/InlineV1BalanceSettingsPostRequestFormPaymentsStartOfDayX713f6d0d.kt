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

public enum class InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0dBranch {
  InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1,
  InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d,
}

public sealed class InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0dNoMatchException(
  message: String,
) : InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0dDecodingException(message)

internal data class InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0dInspection(
  public val matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1:
      Boolean,
  public val matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1, matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/settlement_timing/properties/start_of_day.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/settlement_timing/properties/start_of_day
 */
@Serializable(with = InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0d.Serializer::class)
public class InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0dInspection,
) {
  public val inlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1:
      InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1) json.decodeFromJsonElement<InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1>(raw) else null }

  public val inlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d:
      InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d) json.decodeFromJsonElement<InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d>(raw) else null }

  public val matchedBranches:
      Set<InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0dBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1) add(InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0dBranch.InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1)
      if (inspection.matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d) add(InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0dBranch.InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0d {
      val inspection = inspectInlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0dNoMatchException("InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0d(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0d) {
      encoder.requireJsonEncoder("InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0d(element: JsonElement): InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0dInspection {
  val matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1 = element.isJsonDecodable<InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1>()
  val matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d = element.isJsonDecodable<InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d>()
  return InlineV1BalanceSettingsPostRequestFormPaymentsStartOfDayX713f6d0dInspection(
    matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1 = matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1,
    matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d = matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d,
    failures = buildList {
      if (!matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1) add("InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1: value does not match InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1")
      if (!matchesInlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d) add("InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d: value does not match InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
