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

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1Branch {
  InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392,
  InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1NoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1DecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1Inspection(
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392:
      Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392, matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/items/items/properties/billing_thresholds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/items/items/properties/billing_thresholds
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1Inspection,
) {
  public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1Branch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1Branch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1 {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1NoMatchException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1Inspection {
  val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392>()
  val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939>()
  return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1Inspection(
    matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392 = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392,
    matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939 = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939,
    failures = buildList {
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392) add("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1Xdf7f9392")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939) add("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X82869939")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
