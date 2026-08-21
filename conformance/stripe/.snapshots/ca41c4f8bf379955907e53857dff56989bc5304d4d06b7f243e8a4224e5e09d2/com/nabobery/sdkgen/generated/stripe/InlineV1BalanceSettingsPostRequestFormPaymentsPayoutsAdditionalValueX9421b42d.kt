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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42dBranch {
  Branch1,
  InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34,
}

public sealed class InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42dNoMatchException(
  message: String,
) : InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42dDecodingException(message)

internal data class InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts/properties/automatic_transfer_rules_by_currency/anyOf/0/additionalPro
 * perties.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts/properties/automatic_transfer_rules_by_currency/anyOf/0/additionalPro
 * perties
 */
@Serializable(with = InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42d.Serializer::class)
public class InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42dInspection,
) {
  public val branch1: List<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7>>(raw) else null }

  public val inlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34:
      InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34) json.decodeFromJsonElement<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34>(raw) else null }

  public val matchedBranches:
      Set<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42dBranch.Branch1)
      if (inspection.matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34) add(InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42dBranch.InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42d {
      val inspection = inspectInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42dNoMatchException("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42d) {
      encoder.requireJsonEncoder("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42d(element: JsonElement): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42dInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34 = element.isJsonDecodable<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34>()
  return InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX9421b42dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34 = matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34) add("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34: value does not match InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X0bfb8f34")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
