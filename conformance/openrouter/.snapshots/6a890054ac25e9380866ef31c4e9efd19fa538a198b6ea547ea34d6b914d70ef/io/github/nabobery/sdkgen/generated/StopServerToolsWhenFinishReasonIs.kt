package io.github.nabobery.sdkgen.generated

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
 * Stop when the upstream model emits this finish reason (e.g. `length`).
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/StopServerToolsWhenFinishReasonIs
 */
@Serializable(with = StopServerToolsWhenFinishReasonIs.Serializer::class)
public class StopServerToolsWhenFinishReasonIs(
  public val reason: String,
  public val type: InlineStopServerToolsWhenFinishReasonIsTypeX4550df21,
) {
  public class Builder {
    private var reasonValue: String? = null

    public var reason: String
      get() = requireNotNull(reasonValue) { "reason is required" }
      set(`value`) {
        reasonValue = value
      }

    private var typeValue: InlineStopServerToolsWhenFinishReasonIsTypeX4550df21? = null

    public var type: InlineStopServerToolsWhenFinishReasonIsTypeX4550df21
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): StopServerToolsWhenFinishReasonIs {
      check(reasonValue != null) { "reason is required" }
      check(typeValue != null) { "type is required" }
      return StopServerToolsWhenFinishReasonIs(
        reason = reason,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): StopServerToolsWhenFinishReasonIs = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<StopServerToolsWhenFinishReasonIs> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): StopServerToolsWhenFinishReasonIs {
      val jsonDecoder = decoder.requireJsonDecoder("StopServerToolsWhenFinishReasonIs")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("StopServerToolsWhenFinishReasonIs must be a JSON object")
      val reason = json.decodeRequired<String>(rawObject, "reason")
      val type = json.decodeRequired<InlineStopServerToolsWhenFinishReasonIsTypeX4550df21>(rawObject, "type")
      return StopServerToolsWhenFinishReasonIs(
        reason = reason,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: StopServerToolsWhenFinishReasonIs) {
      val jsonEncoder = encoder.requireJsonEncoder("StopServerToolsWhenFinishReasonIs")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("reason", value.reason)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun stopServerToolsWhenFinishReasonIs(block: StopServerToolsWhenFinishReasonIs.Builder.() -> Unit): StopServerToolsWhenFinishReasonIs = StopServerToolsWhenFinishReasonIs.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("StopServerToolsWhenFinishReasonIs is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
