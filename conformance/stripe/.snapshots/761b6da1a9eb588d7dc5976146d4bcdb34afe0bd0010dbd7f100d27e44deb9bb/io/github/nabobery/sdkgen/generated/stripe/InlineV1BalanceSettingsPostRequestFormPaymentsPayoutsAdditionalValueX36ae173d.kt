package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173dBranch {
  Branch1,
  InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X107e7ebb,
}

public sealed class InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173dNoMatchException(
  message: String,
) : InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173dDecodingException(message)

internal data class InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X107e7ebb: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X107e7ebb).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts/properties/minimum_balance_by_currency/anyOf/0/additionalProperties.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts/properties/minimum_balance_by_currency/anyOf/0/additionalProperties
 */
@Serializable(with = InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173d.Serializer::class)
public class InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173dInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X107e7ebb:
      InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X107e7ebb? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X107e7ebb) json.decodeFromJsonElement<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X107e7ebb>(raw) else null }

  public val matchedBranches:
      Set<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173dBranch.Branch1)
      if (inspection.matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X107e7ebb) add(InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173dBranch.InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X107e7ebb)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173d {
      val inspection = inspectInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173dNoMatchException("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173d) {
      encoder.requireJsonEncoder("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173d(element: JsonElement): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173dInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X107e7ebb = element.isJsonDecodable<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X107e7ebb>()
  return InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAdditionalValueX36ae173dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X107e7ebb = matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X107e7ebb,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X107e7ebb) add("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X107e7ebb: value does not match InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X107e7ebb")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
