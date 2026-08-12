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

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3Branch {
  InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217,
  InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X419083fd,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3NoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3DecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3Inspection(
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X419083fd: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217, matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X419083fd).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/billing_thresholds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/billing_thresholds
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3Inspection,
) {
  public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X419083fd:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X419083fd? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X419083fd) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X419083fd>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3Branch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X419083fd) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3Branch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X419083fd)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3 {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3NoMatchException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3Inspection {
  val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217>()
  val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X419083fd = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X419083fd>()
  return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3Inspection(
    matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217 = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217,
    matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X419083fd = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X419083fd,
    failures = buildList {
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217) add("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X9a9c0217")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X419083fd) add("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X419083fd: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X419083fd")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
