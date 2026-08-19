package com.nabobery.sdkgen.generated

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
 * A parameter that accepts one of a discrete set of string values.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/EnumCapability
 */
@Serializable(with = EnumCapability.Serializer::class)
public class EnumCapability(
  public val type: InlineEnumCapabilityTypeX71ff7c8a,
  values: List<String>,
) {
  public val values: List<String> = values.toList()

  public class Builder {
    private var typeValue: InlineEnumCapabilityTypeX71ff7c8a? = null

    public var type: InlineEnumCapabilityTypeX71ff7c8a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var valuesValue: List<String>? = null

    public var values: List<String>
      get() = requireNotNull(valuesValue) { "values is required" }.toList()
      set(`value`) {
        valuesValue = value.toList()
      }

    public fun build(): EnumCapability {
      check(typeValue != null) { "type is required" }
      check(valuesValue != null) { "values is required" }
      return EnumCapability(
        type = type,
        values = values,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): EnumCapability = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<EnumCapability> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): EnumCapability {
      val jsonDecoder = decoder.requireJsonDecoder("EnumCapability")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("EnumCapability must be a JSON object")
      val type = json.decodeRequired<InlineEnumCapabilityTypeX71ff7c8a>(rawObject, "type")
      val values = json.decodeRequired<List<String>>(rawObject, "values")
      return EnumCapability(
        type = type,
        values = values,
      )
    }

    override fun serialize(encoder: Encoder, `value`: EnumCapability) {
      val jsonEncoder = encoder.requireJsonEncoder("EnumCapability")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("values", json.encodeToJsonElement(value.values))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun enumCapability(block: EnumCapability.Builder.() -> Unit): EnumCapability = EnumCapability.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("EnumCapability is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
