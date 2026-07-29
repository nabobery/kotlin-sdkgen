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

public enum class InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674Branch {
  InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc,
  Branch2,
}

public sealed class InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674NoMatchException(
  message: String,
) : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674DecodingException(message)

internal data class InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674Inspection(
  public val matchesInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc:
      Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/payouts/properties/schedule/properties/delay_days.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/payouts/properties/schedule/properties/delay_days
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674Inspection,
) {
  public val inlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc:
      InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc) add(InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674Branch.InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc)
      if (inspection.matchesBranch2) add(InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674 {
      val inspection = inspectInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674NoMatchException("InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674) {
      encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674(element: JsonElement): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674Inspection {
  val matchesInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc = element.isJsonDecodable<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysX5e3d3674Inspection(
    matchesInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc = matchesInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc) add("InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc: value does not match InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
