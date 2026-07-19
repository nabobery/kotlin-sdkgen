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
 * Reference to a previously created container to reuse.
 */
@Serializable(with = ContainerReferenceEnvironment.Serializer::class)
public class ContainerReferenceEnvironment(
  /**
   * Identifier of an existing container to reuse (max 20 characters).
   */
  public val containerId: String,
  public val type: InlineComponentsSchemasContainerReferenceEnvironmentPropertiesType,
) {
  public class Builder {
    private var containerIdValue: String? = null

    public var containerId: String
      get() = requireNotNull(containerIdValue) { "containerId is required" }
      set(`value`) {
        containerIdValue = value
      }

    private var typeValue: InlineComponentsSchemasContainerReferenceEnvironmentPropertiesType? =
        null

    public var type: InlineComponentsSchemasContainerReferenceEnvironmentPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ContainerReferenceEnvironment {
      check(containerIdValue != null) { "containerId is required" }
      check(typeValue != null) { "type is required" }
      return ContainerReferenceEnvironment(
        containerId = containerId,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContainerReferenceEnvironment = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ContainerReferenceEnvironment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContainerReferenceEnvironment {
      val jsonDecoder = decoder.requireJsonDecoder("ContainerReferenceEnvironment")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ContainerReferenceEnvironment must be a JSON object")
      val containerId = json.decodeRequired<String>(raw, "container_id")
      val type = json.decodeRequired<InlineComponentsSchemasContainerReferenceEnvironmentPropertiesType>(raw, "type")
      return ContainerReferenceEnvironment(
        containerId = containerId,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContainerReferenceEnvironment) {
      val jsonEncoder = encoder.requireJsonEncoder("ContainerReferenceEnvironment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("container_id", value.containerId)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun containerReferenceEnvironment(block: ContainerReferenceEnvironment.Builder.() ->
  Unit): ContainerReferenceEnvironment = ContainerReferenceEnvironment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("ContainerReferenceEnvironment is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
