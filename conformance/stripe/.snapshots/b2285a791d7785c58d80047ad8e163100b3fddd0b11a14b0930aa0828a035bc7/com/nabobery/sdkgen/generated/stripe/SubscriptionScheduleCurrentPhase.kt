package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class SubscriptionScheduleCurrentPhaseView(
  @SerialName("end_date")
  public val endDate: Int,
  @SerialName("start_date")
  public val startDate: Int,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_schedule_current_phase
 */
@Serializable(with = SubscriptionScheduleCurrentPhase.Serializer::class)
public class SubscriptionScheduleCurrentPhase(
  /**
   * The end of this phase of the subscription schedule.
   */
  public val endDate: Int,
  /**
   * The start of this phase of the subscription schedule.
   */
  public val startDate: Int,
) {
  public class Builder {
    private var endDateValue: Int? = null

    public var endDate: Int
      get() = requireNotNull(endDateValue) { "endDate is required" }
      set(`value`) {
        endDateValue = value
      }

    private var startDateValue: Int? = null

    public var startDate: Int
      get() = requireNotNull(startDateValue) { "startDate is required" }
      set(`value`) {
        startDateValue = value
      }

    public fun build(): SubscriptionScheduleCurrentPhase {
      check(endDateValue != null) { "endDate is required" }
      check(startDateValue != null) { "startDate is required" }
      return SubscriptionScheduleCurrentPhase(
        endDate = endDate,
        startDate = startDate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionScheduleCurrentPhase = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SubscriptionScheduleCurrentPhase> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionScheduleCurrentPhase {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionScheduleCurrentPhase")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionScheduleCurrentPhase must be a JSON object")
      val endDate = json.decodeRequired<Int>(rawObject, "end_date")
      val startDate = json.decodeRequired<Int>(rawObject, "start_date")
      return SubscriptionScheduleCurrentPhase(
        endDate = endDate,
        startDate = startDate,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionScheduleCurrentPhase) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionScheduleCurrentPhase")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end_date", json.encodeToJsonElement(value.endDate))
        put("start_date", json.encodeToJsonElement(value.startDate))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionScheduleCurrentPhase(block: SubscriptionScheduleCurrentPhase.Builder.() -> Unit): SubscriptionScheduleCurrentPhase = SubscriptionScheduleCurrentPhase.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionScheduleCurrentPhase is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
