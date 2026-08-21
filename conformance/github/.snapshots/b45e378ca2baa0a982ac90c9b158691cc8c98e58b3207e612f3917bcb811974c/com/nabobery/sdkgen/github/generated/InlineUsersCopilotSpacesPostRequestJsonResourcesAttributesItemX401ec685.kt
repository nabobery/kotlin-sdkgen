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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces/post/requestBody/content/application~1json/sc
 * hema/properties/resources_attributes/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces/post/requestBody/content/application~1json/sc
 * hema/properties/resources_attributes/items
 */
@Serializable(with = InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685.Serializer::class)
public class InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685(
  /**
   * Metadata specific to the resource type.
   */
  public val metadata:
      InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6? = null,
  /**
   * The type of resource.
   */
  public val resourceType:
      InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX7cf9340e? = null,
) {
  public class Builder {
    /**
     * Metadata specific to the resource type.
     */
    public var metadata:
        InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6? = null

    /**
     * The type of resource.
     */
    public var resourceType:
        InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX7cf9340e? = null

    public fun build(): InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685 = InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685(
      metadata = metadata,
      resourceType = resourceType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685 must be a JSON object")
      return InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685(
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6>(it) },
        resourceType = rawObject["resource_type"]?.let { json.decodeFromJsonElement<InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX7cf9340e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.resourceType?.let { put("resource_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685(block: InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685.Builder.() -> Unit): InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685 = InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemX401ec685.build(block)
