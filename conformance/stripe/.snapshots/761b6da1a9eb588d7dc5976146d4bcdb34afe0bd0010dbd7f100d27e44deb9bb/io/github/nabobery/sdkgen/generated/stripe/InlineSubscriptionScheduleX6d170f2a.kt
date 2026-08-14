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

public enum class InlineSubscriptionScheduleX6d170f2aBranch {
  Branch1,
  SubscriptionSchedule,
}

public sealed class InlineSubscriptionScheduleX6d170f2aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionScheduleX6d170f2aNoMatchException(
  message: String,
) : InlineSubscriptionScheduleX6d170f2aDecodingException(message)

internal data class InlineSubscriptionScheduleX6d170f2aInspection(
  public val matchesBranch1: Boolean,
  public val matchesSubscriptionSchedule: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesSubscriptionSchedule).count { it }
}

/**
 * The schedule attached to the subscription
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/schedule
 */
@Serializable(with = InlineSubscriptionScheduleX6d170f2a.Serializer::class)
public class InlineSubscriptionScheduleX6d170f2a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionScheduleX6d170f2aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val subscriptionSchedule: SubscriptionSchedule? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscriptionSchedule) json.decodeFromJsonElement<SubscriptionSchedule>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionScheduleX6d170f2aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSubscriptionScheduleX6d170f2aBranch.Branch1)
      if (inspection.matchesSubscriptionSchedule) add(InlineSubscriptionScheduleX6d170f2aBranch.SubscriptionSchedule)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionScheduleX6d170f2a {
      val inspection = inspectInlineSubscriptionScheduleX6d170f2a(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionScheduleX6d170f2aNoMatchException("InlineSubscriptionScheduleX6d170f2a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionScheduleX6d170f2a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionScheduleX6d170f2a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionScheduleX6d170f2a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionScheduleX6d170f2a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionScheduleX6d170f2a) {
      encoder.requireJsonEncoder("InlineSubscriptionScheduleX6d170f2a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionScheduleX6d170f2a(element: JsonElement): InlineSubscriptionScheduleX6d170f2aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesSubscriptionSchedule = element.isJsonDecodable<SubscriptionSchedule>()
  return InlineSubscriptionScheduleX6d170f2aInspection(
    matchesBranch1 = matchesBranch1,
    matchesSubscriptionSchedule = matchesSubscriptionSchedule,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesSubscriptionSchedule) add("SubscriptionSchedule: value does not match SubscriptionSchedule")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
