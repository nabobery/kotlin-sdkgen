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

public enum class InlineSubscriptionScheduleSubscriptionX1f6afdc9Branch {
  Branch1,
  Subscription,
}

public sealed class InlineSubscriptionScheduleSubscriptionX1f6afdc9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionScheduleSubscriptionX1f6afdc9NoMatchException(
  message: String,
) : InlineSubscriptionScheduleSubscriptionX1f6afdc9DecodingException(message)

internal data class InlineSubscriptionScheduleSubscriptionX1f6afdc9Inspection(
  public val matchesBranch1: Boolean,
  public val matchesSubscription: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesSubscription).count { it }
}

/**
 * ID of the subscription managed by the subscription schedule.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_schedule/properties/subscription
 */
@Serializable(with = InlineSubscriptionScheduleSubscriptionX1f6afdc9.Serializer::class)
public class InlineSubscriptionScheduleSubscriptionX1f6afdc9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionScheduleSubscriptionX1f6afdc9Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val subscription: Subscription? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscription) json.decodeFromJsonElement<Subscription>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionScheduleSubscriptionX1f6afdc9Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSubscriptionScheduleSubscriptionX1f6afdc9Branch.Branch1)
      if (inspection.matchesSubscription) add(InlineSubscriptionScheduleSubscriptionX1f6afdc9Branch.Subscription)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionScheduleSubscriptionX1f6afdc9 {
      val inspection = inspectInlineSubscriptionScheduleSubscriptionX1f6afdc9(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionScheduleSubscriptionX1f6afdc9NoMatchException("InlineSubscriptionScheduleSubscriptionX1f6afdc9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionScheduleSubscriptionX1f6afdc9(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionScheduleSubscriptionX1f6afdc9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionScheduleSubscriptionX1f6afdc9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionScheduleSubscriptionX1f6afdc9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionScheduleSubscriptionX1f6afdc9) {
      encoder.requireJsonEncoder("InlineSubscriptionScheduleSubscriptionX1f6afdc9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionScheduleSubscriptionX1f6afdc9(element: JsonElement): InlineSubscriptionScheduleSubscriptionX1f6afdc9Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesSubscription = element.isJsonDecodable<Subscription>()
  return InlineSubscriptionScheduleSubscriptionX1f6afdc9Inspection(
    matchesBranch1 = matchesBranch1,
    matchesSubscription = matchesSubscription,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesSubscription) add("Subscription: value does not match Subscription")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
