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

public enum class InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79Branch {
  InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X069e56b3,
  InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X02aed328,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79NoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79DecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79Inspection(
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X069e56b3:
      Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X02aed328:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X069e56b3, matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X02aed328).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/default_settings/properties/billing_thresholds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/default_settings/properties/billing_thresholds
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79Inspection,
) {
  public val inlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X069e56b3:
      InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X069e56b3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X069e56b3) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X069e56b3>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X02aed328:
      InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X02aed328? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X02aed328) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X02aed328>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X069e56b3) add(InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79Branch.InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X069e56b3)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X02aed328) add(InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79Branch.InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X02aed328)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79 {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79NoMatchException("InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79Inspection {
  val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X069e56b3 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X069e56b3>()
  val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X02aed328 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X02aed328>()
  return InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79Inspection(
    matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X069e56b3 = matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X069e56b3,
    matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X02aed328 = matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X02aed328,
    failures = buildList {
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X069e56b3) add("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X069e56b3: value does not match InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X069e56b3")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X02aed328) add("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X02aed328: value does not match InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X02aed328")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
