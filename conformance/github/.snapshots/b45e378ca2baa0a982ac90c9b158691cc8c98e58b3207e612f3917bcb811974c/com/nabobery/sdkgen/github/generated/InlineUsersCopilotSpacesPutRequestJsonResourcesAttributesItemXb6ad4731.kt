package com.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}/put/requestBody/content/appli
 * cation~1json/schema/properties/resources_attributes/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}/put/requestBody/content/appli
 * cation~1json/schema/properties/resources_attributes/items
 */
@Serializable(with = InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731.Serializer::class)
public class InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731(
  /**
   * Metadata specific to the resource type.
   */
  public val metadata:
      InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31? = null,
  /**
   * The type of resource.
   */
  public val resourceType:
      InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXd138b36b? = null,
) {
  public class Builder {
    /**
     * Metadata specific to the resource type.
     */
    public var metadata:
        InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31? = null

    /**
     * The type of resource.
     */
    public var resourceType:
        InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXd138b36b? = null

    public fun build(): InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731 = InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731(
      metadata = metadata,
      resourceType = resourceType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731 must be a JSON object")
      return InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731(
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31>(it) },
        resourceType = rawObject["resource_type"]?.let { json.decodeFromJsonElement<InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXd138b36b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.resourceType?.let { put("resource_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731(block: InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731.Builder.() -> Unit): InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731 = InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemXb6ad4731.build(block)
