package com.nabobery.sdkgen.generated

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
 * A supported-or-not flag. Present means the parameter is accepted.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BooleanCapability
 */
@Serializable(with = BooleanCapability.Serializer::class)
public class BooleanCapability(
  public val type: InlineBooleanCapabilityTypeX1c71ccb2,
) {
  public class Builder {
    private var typeValue: InlineBooleanCapabilityTypeX1c71ccb2? = null

    public var type: InlineBooleanCapabilityTypeX1c71ccb2
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): BooleanCapability {
      check(typeValue != null) { "type is required" }
      return BooleanCapability(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BooleanCapability = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BooleanCapability> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BooleanCapability {
      val jsonDecoder = decoder.requireJsonDecoder("BooleanCapability")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BooleanCapability must be a JSON object")
      val type = json.decodeRequired<InlineBooleanCapabilityTypeX1c71ccb2>(rawObject, "type")
      return BooleanCapability(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BooleanCapability) {
      val jsonEncoder = encoder.requireJsonEncoder("BooleanCapability")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun booleanCapability(block: BooleanCapability.Builder.() -> Unit): BooleanCapability = BooleanCapability.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BooleanCapability is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
