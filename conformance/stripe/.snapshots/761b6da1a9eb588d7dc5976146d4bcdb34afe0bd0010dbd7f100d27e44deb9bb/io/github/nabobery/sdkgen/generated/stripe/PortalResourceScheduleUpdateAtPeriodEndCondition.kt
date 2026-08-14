package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_resource_schedule_update_at_period_end_condition
 */
@Serializable(with = PortalResourceScheduleUpdateAtPeriodEndCondition.Serializer::class)
public class PortalResourceScheduleUpdateAtPeriodEndCondition(
  /**
   * The type of condition.
   */
  public val type: InlinePortalResourceScheduleUpdateAtPeriodEndConditionTypeX562f5972,
) {
  public class Builder {
    private var typeValue: InlinePortalResourceScheduleUpdateAtPeriodEndConditionTypeX562f5972? =
        null

    public var type: InlinePortalResourceScheduleUpdateAtPeriodEndConditionTypeX562f5972
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): PortalResourceScheduleUpdateAtPeriodEndCondition {
      check(typeValue != null) { "type is required" }
      return PortalResourceScheduleUpdateAtPeriodEndCondition(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalResourceScheduleUpdateAtPeriodEndCondition = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PortalResourceScheduleUpdateAtPeriodEndCondition> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalResourceScheduleUpdateAtPeriodEndCondition {
      val jsonDecoder = decoder.requireJsonDecoder("PortalResourceScheduleUpdateAtPeriodEndCondition")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalResourceScheduleUpdateAtPeriodEndCondition must be a JSON object")
      val type = json.decodeRequired<InlinePortalResourceScheduleUpdateAtPeriodEndConditionTypeX562f5972>(rawObject, "type")
      return PortalResourceScheduleUpdateAtPeriodEndCondition(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalResourceScheduleUpdateAtPeriodEndCondition) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalResourceScheduleUpdateAtPeriodEndCondition")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalResourceScheduleUpdateAtPeriodEndCondition(block: PortalResourceScheduleUpdateAtPeriodEndCondition.Builder.() -> Unit): PortalResourceScheduleUpdateAtPeriodEndCondition = PortalResourceScheduleUpdateAtPeriodEndCondition.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PortalResourceScheduleUpdateAtPeriodEndCondition is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
