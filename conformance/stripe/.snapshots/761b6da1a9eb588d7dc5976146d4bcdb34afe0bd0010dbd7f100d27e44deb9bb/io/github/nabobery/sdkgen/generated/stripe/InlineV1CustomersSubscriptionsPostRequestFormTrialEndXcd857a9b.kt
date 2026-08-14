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

public enum class InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9bBranch {
  InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e,
  Branch2,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9bNoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9bDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9bInspection(
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e, matchesBranch2).count { it }
}

/**
 * Unix timestamp representing the end of the trial period the customer will get before being charged for the first
 * time. If set, trial_end will override the default trial period of the plan the customer is being subscribed to. The
 * special value `now` can be provided to end the customer's trial immediately. Can be at most two years from
 * `billing_cycle_anchor`. See [Using trial periods on
 * subscriptions](https://docs.stripe.com/billing/subscriptions/trials) to learn more.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/trial_end
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9b.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9bInspection,
) {
  public val inlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e:
      InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9bBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e) add(InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9bBranch.InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e)
      if (inspection.matchesBranch2) add(InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9bBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9b {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9bNoMatchException("InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9b) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9b(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9bInspection {
  val matchesInlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1CustomersSubscriptionsPostRequestFormTrialEndXcd857a9bInspection(
    matchesInlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e = matchesInlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e) add("InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e: value does not match InlineV1CustomersSubscriptionsPostRequestFormTrialEndAnyOf1X9c29495e")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
