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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978Branch {
  Branch1,
  InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X13028417,
}

public sealed class InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978NoMatchException(
  message: String,
) : InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978DecodingException(message)

internal data class InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X13028417: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X13028417).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts/properties/minimum_balance_by_currency.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts/properties/minimum_balance_by_currency
 */
@Serializable(with = InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978.Serializer::class)
public class InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X13028417:
      InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X13028417? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X13028417) json.decodeFromJsonElement<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X13028417>(raw) else null }

  public val matchedBranches:
      Set<InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978Branch.Branch1)
      if (inspection.matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X13028417) add(InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978Branch.InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X13028417)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978 {
      val inspection = inspectInlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978NoMatchException("InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978) {
      encoder.requireJsonEncoder("InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978(element: JsonElement): InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X13028417 = element.isJsonDecodable<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X13028417>()
  return InlineV1BalanceSettingsPostRequestFormPaymentsMinimumBalanceByCurrencyX57974978Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X13028417 = matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X13028417,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X13028417) add("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X13028417: value does not match InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X13028417")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
