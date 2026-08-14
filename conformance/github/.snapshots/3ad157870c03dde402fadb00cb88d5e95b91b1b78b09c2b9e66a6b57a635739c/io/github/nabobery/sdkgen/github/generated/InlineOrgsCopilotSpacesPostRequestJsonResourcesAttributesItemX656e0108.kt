package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces/post/requestBody/content/application~1json/schema/p
 * roperties/resources_attributes/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces/post/requestBody/content/application~1json/schema/p
 * roperties/resources_attributes/items
 */
@Serializable(with = InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108.Serializer::class)
public class InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108(
  /**
   * Metadata specific to the resource type.
   */
  public val metadata:
      InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataX79024ce2? = null,
  /**
   * The type of resource.
   */
  public val resourceType:
      InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX4ef892dc? = null,
) {
  public class Builder {
    /**
     * Metadata specific to the resource type.
     */
    public var metadata:
        InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataX79024ce2? = null

    /**
     * The type of resource.
     */
    public var resourceType:
        InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX4ef892dc? = null

    public fun build(): InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108 = InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108(
      metadata = metadata,
      resourceType = resourceType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108 must be a JSON object")
      return InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108(
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataX79024ce2>(it) },
        resourceType = rawObject["resource_type"]?.let { json.decodeFromJsonElement<InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX4ef892dc>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.resourceType?.let { put("resource_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108(block: InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108.Builder.() -> Unit): InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108 = InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesItemX656e0108.build(block)
