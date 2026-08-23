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

public enum class InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751Branch {
  InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe583e323,
  InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2X21ace90b,
}

public sealed class InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751Inspection(
  public val matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe583e323: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2X21ace90b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe583e323, matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2X21ace90b).count { it }
}

/**
 * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period. When
 * updating, pass an empty string to remove previously-defined thresholds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/billing_thresholds
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751Inspection,
) {
  public val inlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe583e323:
      InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe583e323? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe583e323) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe583e323>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2X21ace90b:
      InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2X21ace90b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2X21ace90b) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2X21ace90b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe583e323) add(InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751Branch.InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe583e323)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2X21ace90b) add(InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751Branch.InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2X21ace90b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751NoMatchException("InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751(element: JsonElement): InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751Inspection {
  val matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe583e323 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe583e323>()
  val matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2X21ace90b = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2X21ace90b>()
  return InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751Inspection(
    matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe583e323 = matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe583e323,
    matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2X21ace90b = matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2X21ace90b,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe583e323) add("InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe583e323: value does not match InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe583e323")
      if (!matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2X21ace90b) add("InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2X21ace90b: value does not match InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2X21ace90b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
