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

public enum class InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9Branch {
  InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a,
  Branch2,
}

public sealed class InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9Inspection(
  public val matchesInlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a, matchesBranch2).count { it }
}

/**
 * Unix timestamp representing the end of the trial period the customer will get before being charged for the first
 * time. This will always overwrite any trials that might apply via a subscribed plan. If set, `trial_end` will override
 * the default trial period of the plan the customer is being subscribed to. The `billing_cycle_anchor` will be updated
 * to the `trial_end` value. The special value `now` can be provided to end the customer's trial immediately. Can be at
 * most two years from `billing_cycle_anchor`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/trial_end
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9Inspection,
) {
  public val inlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a:
      InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a) add(InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9Branch.InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a)
      if (inspection.matchesBranch2) add(InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9NoMatchException("InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9(element: JsonElement): InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9Inspection {
  val matchesInlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1SubscriptionsPostRequestFormTrialEndX463bdfa9Inspection(
    matchesInlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a = matchesInlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a) add("InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a: value does not match InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1Xb56dd88a")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
