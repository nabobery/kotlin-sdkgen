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

public enum class InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fdBranch {
  InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1Xb3c87656,
  InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X4b16d038,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fdDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fdNoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fdDecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fdInspection(
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1Xb3c87656:
      Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X4b16d038:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1Xb3c87656, matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X4b16d038).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/default_settings/properties/billing_thresholds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/default_settings/properties/billing_thresholds
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fd.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fdInspection,
) {
  public val inlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1Xb3c87656:
      InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1Xb3c87656? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1Xb3c87656) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1Xb3c87656>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X4b16d038:
      InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X4b16d038? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X4b16d038) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X4b16d038>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fdBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1Xb3c87656) add(InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fdBranch.InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1Xb3c87656)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X4b16d038) add(InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fdBranch.InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X4b16d038)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fd {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fd(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fdNoMatchException("InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fd(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fd) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fd(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fdInspection {
  val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1Xb3c87656 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1Xb3c87656>()
  val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X4b16d038 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X4b16d038>()
  return InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fdInspection(
    matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1Xb3c87656 = matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1Xb3c87656,
    matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X4b16d038 = matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X4b16d038,
    failures = buildList {
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1Xb3c87656) add("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1Xb3c87656: value does not match InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1Xb3c87656")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X4b16d038) add("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X4b16d038: value does not match InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X4b16d038")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
