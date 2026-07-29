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

public enum class InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674Branch {
  Branch1,
  InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X8be783b2,
}

public sealed class InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674NoMatchException(
  message: String,
) : InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674DecodingException(message)

internal data class InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X8be783b2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X8be783b2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts/properties/automatic_transfer_rules_by_currency.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts/properties/automatic_transfer_rules_by_currency
 */
@Serializable(with = InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674.Serializer::class)
public class InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X8be783b2:
      InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X8be783b2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X8be783b2) json.decodeFromJsonElement<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X8be783b2>(raw) else null }

  public val matchedBranches:
      Set<InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674Branch.Branch1)
      if (inspection.matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X8be783b2) add(InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674Branch.InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X8be783b2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674 {
      val inspection = inspectInlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674NoMatchException("InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674) {
      encoder.requireJsonEncoder("InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674(element: JsonElement): InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X8be783b2 = element.isJsonDecodable<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X8be783b2>()
  return InlineV1BalanceSettingsPostRequestFormPaymentsAutomaticTransferRuldc17X65b5a674Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X8be783b2 = matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X8be783b2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X8be783b2) add("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X8be783b2: value does not match InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X8be783b2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
