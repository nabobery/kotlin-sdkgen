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

public enum class InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39Branch {
  InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1,
  Branch2,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39Inspection(
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1, matchesBranch2).count { it }
}

/**
 * Unix timestamp representing the end of the trial period the customer will get before being charged for the first
 * time. This will always overwrite any trials that might apply via a subscribed plan. If set, trial_end will override
 * the default trial period of the plan the customer is being subscribed to. The special value `now` can be provided to
 * end the customer's trial immediately. Can be at most two years from `billing_cycle_anchor`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/trial_end
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39Inspection,
) {
  public val inlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1:
      InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1) add(InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39Branch.InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1)
      if (inspection.matchesBranch2) add(InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39Inspection {
  val matchesInlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1CustomersSubscriptionsPostRequestFormTrialEndX27c8cb39Inspection(
    matchesInlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1 = matchesInlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1) add("InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1: value does not match InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X11b2aee1")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
