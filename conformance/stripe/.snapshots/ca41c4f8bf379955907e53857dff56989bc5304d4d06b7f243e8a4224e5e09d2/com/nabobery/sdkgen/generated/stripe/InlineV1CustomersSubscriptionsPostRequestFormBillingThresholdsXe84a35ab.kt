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

public enum class InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35abBranch {
  InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e,
  InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X47f888f1,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35abDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35abNoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35abDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35abInspection(
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e:
      Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X47f888f1:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e, matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X47f888f1).count { it }
}

/**
 * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period. When
 * updating, pass an empty string to remove previously-defined thresholds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/billing_thresholds
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35ab.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35ab internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35abInspection,
) {
  public val inlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e:
      InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X47f888f1:
      InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X47f888f1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X47f888f1) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X47f888f1>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35abBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e) add(InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35abBranch.InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X47f888f1) add(InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35abBranch.InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X47f888f1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35ab {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35ab(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35abNoMatchException("InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35ab matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35ab(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35ab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35ab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35ab")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35ab) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35ab").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35ab(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35abInspection {
  val matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X47f888f1 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X47f888f1>()
  return InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXe84a35abInspection(
    matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e = matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e,
    matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X47f888f1 = matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X47f888f1,
    failures = buildList {
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e) add("InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e: value does not match InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xdbb8858e")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X47f888f1) add("InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X47f888f1: value does not match InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X47f888f1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
