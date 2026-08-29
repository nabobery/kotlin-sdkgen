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

public enum class InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016Branch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf2Xc8788065,
}

public sealed class InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf2Xc8788065: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf2Xc8788065).count { it }
}

/**
 * Sets the billing schedules for the subscription.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/billing_schedules
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016Inspection,
) {
  public val branch1: List<InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153>?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153>>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf2Xc8788065:
      InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf2Xc8788065? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf2Xc8788065) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf2Xc8788065>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf2Xc8788065) add(InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016Branch.InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf2Xc8788065)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016NoMatchException("InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016(element: JsonElement): InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemX9f56b153>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf2Xc8788065 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf2Xc8788065>()
  return InlineV1SubscriptionsPostRequestFormBillingSchedulesX8af8c016Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf2Xc8788065 = matchesInlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf2Xc8788065,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf2Xc8788065) add("InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf2Xc8788065: value does not match InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf2Xc8788065")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
