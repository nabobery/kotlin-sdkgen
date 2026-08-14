package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1resources/post/requestBody/c
 * ontent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1resources/post/requestBody/c
 * ontent/application~1json/schema
 */
@Serializable(with = InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b.Serializer::class)
public class InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b(
  /**
   * Resource-specific metadata.
   */
  public val metadata: JsonObject,
  /**
   * The type of resource to create.
   */
  public val resourceType: InlineUsersCopilotSpacesResourcesPostRequestJsonResourceTypeXaaeef13c,
) {
  public class Builder {
    private var metadataValue: JsonObject? = null

    public var metadata: JsonObject
      get() = requireNotNull(metadataValue) { "metadata is required" }
      set(`value`) {
        metadataValue = value
      }

    private var resourceTypeValue:
        InlineUsersCopilotSpacesResourcesPostRequestJsonResourceTypeXaaeef13c? = null

    public var resourceType: InlineUsersCopilotSpacesResourcesPostRequestJsonResourceTypeXaaeef13c
      get() = requireNotNull(resourceTypeValue) { "resourceType is required" }
      set(`value`) {
        resourceTypeValue = value
      }

    public fun build(): InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b {
      check(metadataValue != null) { "metadata is required" }
      check(resourceTypeValue != null) { "resourceType is required" }
      return InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b(
        metadata = metadata,
        resourceType = resourceType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b must be a JSON object")
      val metadata = json.decodeRequired<JsonObject>(rawObject, "metadata")
      val resourceType = json.decodeRequired<InlineUsersCopilotSpacesResourcesPostRequestJsonResourceTypeXaaeef13c>(rawObject, "resource_type")
      return InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b(
        metadata = metadata,
        resourceType = resourceType,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("resource_type", json.encodeToJsonElement(value.resourceType))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b(block: InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b.Builder.() -> Unit): InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b = InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
