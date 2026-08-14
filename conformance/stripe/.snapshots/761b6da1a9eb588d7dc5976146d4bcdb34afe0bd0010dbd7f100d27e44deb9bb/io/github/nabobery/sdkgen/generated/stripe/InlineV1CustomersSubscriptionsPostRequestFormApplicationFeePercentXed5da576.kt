package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Double
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

public enum class InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576Branch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xd44b3a22,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xd44b3a22: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xd44b3a22).count { it }
}

/**
 * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
 * subscription invoice total that will be transferred to the application owner's Stripe account. The request must be
 * made by a platform account on a connected account in order to set an application fee percentage. For more
 * information, see the application fees
 * [documentation](https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/application_fee_percent
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576Inspection,
) {
  public val branch1: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Double>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xd44b3a22:
      InlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xd44b3a22? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xd44b3a22) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xd44b3a22>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576Branch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xd44b3a22) add(InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576Branch.InlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xd44b3a22)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576Inspection {
  val matchesBranch1 = element.isJsonDecodable<Double>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xd44b3a22 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xd44b3a22>()
  return InlineV1CustomersSubscriptionsPostRequestFormApplicationFeePercentXed5da576Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xd44b3a22 = matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xd44b3a22,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Double")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xd44b3a22) add("InlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xd44b3a22: value does not match InlineV1CustomersSubscriptionsPostRequestFormAnyOf2Xd44b3a22")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
