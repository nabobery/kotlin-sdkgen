package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_resource_schedule_update_at_period_end
 */
@Serializable(with = PortalResourceScheduleUpdateAtPeriodEnd.Serializer::class)
public class PortalResourceScheduleUpdateAtPeriodEnd(
  conditions: List<PortalResourceScheduleUpdateAtPeriodEndCondition>,
) {
  /**
   * List of conditions. When any condition is true, an update will be scheduled at the end of the current period.
   */
  public val conditions: List<PortalResourceScheduleUpdateAtPeriodEndCondition> =
      conditions.toList()

  public class Builder {
    private var conditionsValue: List<PortalResourceScheduleUpdateAtPeriodEndCondition>? = null

    public var conditions: List<PortalResourceScheduleUpdateAtPeriodEndCondition>
      get() = requireNotNull(conditionsValue) { "conditions is required" }.toList()
      set(`value`) {
        conditionsValue = value.toList()
      }

    public fun build(): PortalResourceScheduleUpdateAtPeriodEnd {
      check(conditionsValue != null) { "conditions is required" }
      return PortalResourceScheduleUpdateAtPeriodEnd(
        conditions = conditions,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalResourceScheduleUpdateAtPeriodEnd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PortalResourceScheduleUpdateAtPeriodEnd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalResourceScheduleUpdateAtPeriodEnd {
      val jsonDecoder = decoder.requireJsonDecoder("PortalResourceScheduleUpdateAtPeriodEnd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalResourceScheduleUpdateAtPeriodEnd must be a JSON object")
      val conditions = json.decodeRequired<List<PortalResourceScheduleUpdateAtPeriodEndCondition>>(rawObject, "conditions")
      return PortalResourceScheduleUpdateAtPeriodEnd(
        conditions = conditions,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalResourceScheduleUpdateAtPeriodEnd) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalResourceScheduleUpdateAtPeriodEnd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("conditions", json.encodeToJsonElement(value.conditions))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalResourceScheduleUpdateAtPeriodEnd(block: PortalResourceScheduleUpdateAtPeriodEnd.Builder.() -> Unit): PortalResourceScheduleUpdateAtPeriodEnd = PortalResourceScheduleUpdateAtPeriodEnd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PortalResourceScheduleUpdateAtPeriodEnd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
