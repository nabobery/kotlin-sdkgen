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

public enum class InlineV1SubscriptionsPostRequestFormCancelAtX90e20647Branch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271,
}

public sealed class InlineV1SubscriptionsPostRequestFormCancelAtX90e20647DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormCancelAtX90e20647NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormCancelAtX90e20647DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormCancelAtX90e20647Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271).count { it }
}

/**
 * A timestamp at which the subscription should cancel. If set to a date before the current period ends, this will cause
 * a proration if prorations have been enabled using `proration_behavior`. If set during a future period, this will
 * always cause a proration for that period.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/cancel_at
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormCancelAtX90e20647.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormCancelAtX90e20647 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsPostRequestFormCancelAtX90e20647Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271:
      InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionsPostRequestFormCancelAtX90e20647Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormCancelAtX90e20647Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271) add(InlineV1SubscriptionsPostRequestFormCancelAtX90e20647Branch.InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormCancelAtX90e20647 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormCancelAtX90e20647(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormCancelAtX90e20647NoMatchException("InlineV1SubscriptionsPostRequestFormCancelAtX90e20647 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormCancelAtX90e20647(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormCancelAtX90e20647> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormCancelAtX90e20647 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormCancelAtX90e20647")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormCancelAtX90e20647) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormCancelAtX90e20647").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormCancelAtX90e20647(element: JsonElement): InlineV1SubscriptionsPostRequestFormCancelAtX90e20647Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271>()
  return InlineV1SubscriptionsPostRequestFormCancelAtX90e20647Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271 = matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271) add("InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271: value does not match InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X5949f271")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
