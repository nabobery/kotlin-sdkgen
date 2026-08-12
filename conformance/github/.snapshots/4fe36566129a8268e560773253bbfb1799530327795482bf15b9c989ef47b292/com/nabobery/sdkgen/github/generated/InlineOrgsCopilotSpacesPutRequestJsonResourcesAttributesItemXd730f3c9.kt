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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}/put/requestBody/content/application
 * ~1json/schema/properties/resources_attributes/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}/put/requestBody/content/application
 * ~1json/schema/properties/resources_attributes/items
 */
@Serializable(with = InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9.Serializer::class)
public class InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9(
  /**
   * Metadata specific to the resource type.
   */
  public val metadata:
      InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX0cbe22f8? = null,
  /**
   * The type of resource.
   */
  public val resourceType:
      InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXa05ceb02? = null,
) {
  public class Builder {
    /**
     * Metadata specific to the resource type.
     */
    public var metadata:
        InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX0cbe22f8? = null

    /**
     * The type of resource.
     */
    public var resourceType:
        InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXa05ceb02? = null

    public fun build(): InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9 = InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9(
      metadata = metadata,
      resourceType = resourceType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9 must be a JSON object")
      return InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9(
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX0cbe22f8>(it) },
        resourceType = rawObject["resource_type"]?.let { json.decodeFromJsonElement<InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXa05ceb02>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.resourceType?.let { put("resource_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9(block: InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9.Builder.() -> Unit): InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9 = InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesItemXd730f3c9.build(block)
