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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineSubscriptionScheduleCurrentPhaseX57fffd12Branch {
  SubscriptionScheduleCurrentPhase,
}

public sealed class InlineSubscriptionScheduleCurrentPhaseX57fffd12DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionScheduleCurrentPhaseX57fffd12NoMatchException(
  message: String,
) : InlineSubscriptionScheduleCurrentPhaseX57fffd12DecodingException(message)

internal data class InlineSubscriptionScheduleCurrentPhaseX57fffd12Inspection(
  public val matchesSubscriptionScheduleCurrentPhase: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSubscriptionScheduleCurrentPhase).count { it }
}

/**
 * Object representing the start and end dates for the current phase of the subscription schedule, if it is `active`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_schedule/properties/current_phase
 */
@Serializable(with = InlineSubscriptionScheduleCurrentPhaseX57fffd12.Serializer::class)
public class InlineSubscriptionScheduleCurrentPhaseX57fffd12 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionScheduleCurrentPhaseX57fffd12Inspection,
) {
  public val subscriptionScheduleCurrentPhase: SubscriptionScheduleCurrentPhaseView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscriptionScheduleCurrentPhase) json.decodeFromJsonElement<SubscriptionScheduleCurrentPhaseView>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionScheduleCurrentPhaseX57fffd12Branch>
    get() = buildSet {
      if (inspection.matchesSubscriptionScheduleCurrentPhase) add(InlineSubscriptionScheduleCurrentPhaseX57fffd12Branch.SubscriptionScheduleCurrentPhase)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionScheduleCurrentPhaseX57fffd12 {
      val inspection = inspectInlineSubscriptionScheduleCurrentPhaseX57fffd12(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionScheduleCurrentPhaseX57fffd12NoMatchException("InlineSubscriptionScheduleCurrentPhaseX57fffd12 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionScheduleCurrentPhaseX57fffd12(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionScheduleCurrentPhaseX57fffd12> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionScheduleCurrentPhaseX57fffd12 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionScheduleCurrentPhaseX57fffd12")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionScheduleCurrentPhaseX57fffd12) {
      encoder.requireJsonEncoder("InlineSubscriptionScheduleCurrentPhaseX57fffd12").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionScheduleCurrentPhaseX57fffd12(element: JsonElement): InlineSubscriptionScheduleCurrentPhaseX57fffd12Inspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionScheduleCurrentPhaseX57fffd12Inspection(
    matchesSubscriptionScheduleCurrentPhase = false,
    failures = listOf("SubscriptionScheduleCurrentPhase: expected JSON object"),
  )
  val matchesSubscriptionScheduleCurrentPhase = raw["end_date"] != null && raw["start_date"] != null
  return InlineSubscriptionScheduleCurrentPhaseX57fffd12Inspection(
    matchesSubscriptionScheduleCurrentPhase = matchesSubscriptionScheduleCurrentPhase,
    failures = buildList {
      if (!matchesSubscriptionScheduleCurrentPhase) add("SubscriptionScheduleCurrentPhase: required properties 'end_date', 'start_date' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
