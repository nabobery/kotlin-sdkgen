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
 * An OpenRouter-managed, auto-provisioned ephemeral container.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContainerAutoEnvironment
 */
@Serializable(with = ContainerAutoEnvironment.Serializer::class)
public class ContainerAutoEnvironment(
  public val type: InlineContainerAutoEnvironmentTypeXd0cb6a1c,
) {
  public class Builder {
    private var typeValue: InlineContainerAutoEnvironmentTypeXd0cb6a1c? = null

    public var type: InlineContainerAutoEnvironmentTypeXd0cb6a1c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ContainerAutoEnvironment {
      check(typeValue != null) { "type is required" }
      return ContainerAutoEnvironment(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContainerAutoEnvironment = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ContainerAutoEnvironment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContainerAutoEnvironment {
      val jsonDecoder = decoder.requireJsonDecoder("ContainerAutoEnvironment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ContainerAutoEnvironment must be a JSON object")
      val type = json.decodeRequired<InlineContainerAutoEnvironmentTypeXd0cb6a1c>(rawObject, "type")
      return ContainerAutoEnvironment(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContainerAutoEnvironment) {
      val jsonEncoder = encoder.requireJsonEncoder("ContainerAutoEnvironment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun containerAutoEnvironment(block: ContainerAutoEnvironment.Builder.() -> Unit): ContainerAutoEnvironment = ContainerAutoEnvironment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ContainerAutoEnvironment is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
