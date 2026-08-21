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

public enum class InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2aBranch {
  Branch1,
  InlineV1PaymentLinksPostRequestFormSubscriptionDataAnyOf2X6970009c,
}

public sealed class InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2aNoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2aDecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2aInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataAnyOf2X6970009c: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataAnyOf2X6970009c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/subscription_data/properties/trial_period_days.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/subscription_data/properties/trial_period_days
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2a.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2aInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormSubscriptionDataAnyOf2X6970009c:
      InlineV1PaymentLinksPostRequestFormSubscriptionDataAnyOf2X6970009c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataAnyOf2X6970009c) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormSubscriptionDataAnyOf2X6970009c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2aBranch.Branch1)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataAnyOf2X6970009c) add(InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2aBranch.InlineV1PaymentLinksPostRequestFormSubscriptionDataAnyOf2X6970009c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2a {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2aNoMatchException("InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2a) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2a(element: JsonElement): InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2aInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataAnyOf2X6970009c = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormSubscriptionDataAnyOf2X6970009c>()
  return InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2aInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataAnyOf2X6970009c = matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataAnyOf2X6970009c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataAnyOf2X6970009c) add("InlineV1PaymentLinksPostRequestFormSubscriptionDataAnyOf2X6970009c: value does not match InlineV1PaymentLinksPostRequestFormSubscriptionDataAnyOf2X6970009c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
