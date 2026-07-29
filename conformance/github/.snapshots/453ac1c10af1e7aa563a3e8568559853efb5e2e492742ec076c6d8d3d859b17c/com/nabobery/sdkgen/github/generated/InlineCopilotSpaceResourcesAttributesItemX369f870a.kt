package com.nabobery.sdkgen.github.generated

import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/copilot-space/properties/resources_attributes/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-space/properties/resources_attributes/items
 */
@Serializable(with = InlineCopilotSpaceResourcesAttributesItemX369f870a.Serializer::class)
public class InlineCopilotSpaceResourcesAttributesItemX369f870a(
  /**
   * The unique identifier of the chat attachment for uploaded files or media content.
   */
  public val copilotChatAttachmentId: Long? = null,
  /**
   * The date and time the resource was created.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String? = null,
  /**
   * The unique identifier of the resource.
   */
  public val id: Long? = null,
  /**
   * Metadata specific to the resource type.
   */
  public val metadata: InlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1? = null,
  /**
   * The type of resource.
   */
  public val resourceType: InlineCopilotSpaceResourcesAttributesItemResourceTypeX439922fd? = null,
  /**
   * The date and time the resource was last updated.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String? = null,
) {
  public class Builder {
    /**
     * The unique identifier of the chat attachment for uploaded files or media content.
     */
    public var copilotChatAttachmentId: Long? = null

    /**
     * The date and time the resource was created.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var createdAt: String? = null

    /**
     * The unique identifier of the resource.
     */
    public var id: Long? = null

    /**
     * Metadata specific to the resource type.
     */
    public var metadata: InlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1? = null

    /**
     * The type of resource.
     */
    public var resourceType: InlineCopilotSpaceResourcesAttributesItemResourceTypeX439922fd? = null

    /**
     * The date and time the resource was last updated.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    public fun build(): InlineCopilotSpaceResourcesAttributesItemX369f870a = InlineCopilotSpaceResourcesAttributesItemX369f870a(
      copilotChatAttachmentId = copilotChatAttachmentId,
      createdAt = createdAt,
      id = id,
      metadata = metadata,
      resourceType = resourceType,
      updatedAt = updatedAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCopilotSpaceResourcesAttributesItemX369f870a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineCopilotSpaceResourcesAttributesItemX369f870a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCopilotSpaceResourcesAttributesItemX369f870a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCopilotSpaceResourcesAttributesItemX369f870a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCopilotSpaceResourcesAttributesItemX369f870a must be a JSON object")
      return InlineCopilotSpaceResourcesAttributesItemX369f870a(
        copilotChatAttachmentId = rawObject["copilot_chat_attachment_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Long?>(element) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1>(it) },
        resourceType = rawObject["resource_type"]?.let { json.decodeFromJsonElement<InlineCopilotSpaceResourcesAttributesItemResourceTypeX439922fd>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCopilotSpaceResourcesAttributesItemX369f870a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCopilotSpaceResourcesAttributesItemX369f870a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.copilotChatAttachmentId?.let { put("copilot_chat_attachment_id", json.encodeToJsonElement(it)) }
        value.createdAt?.let { put("created_at", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.resourceType?.let { put("resource_type", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCopilotSpaceResourcesAttributesItemX369f870a(block: InlineCopilotSpaceResourcesAttributesItemX369f870a.Builder.() -> Unit): InlineCopilotSpaceResourcesAttributesItemX369f870a = InlineCopilotSpaceResourcesAttributesItemX369f870a.build(block)
