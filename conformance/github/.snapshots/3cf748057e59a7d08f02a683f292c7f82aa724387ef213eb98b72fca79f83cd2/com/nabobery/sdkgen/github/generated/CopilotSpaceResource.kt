package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A resource attached to a Copilot Space.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-space-resource
 */
@Serializable(with = CopilotSpaceResource.Serializer::class)
public class CopilotSpaceResource(
  /**
   * The date and time the resource was created.
   */
  public val createdAt: String,
  /**
   * The unique identifier of the resource.
   */
  public val id: Int,
  /**
   * Resource-specific metadata. The keys and values depend on the resource type.
   */
  public val metadata: JsonObject,
  /**
   * The type of the resource.
   */
  public val resourceType: InlineCopilotSpaceResourceResourceTypeX117bcc1c,
  /**
   * The date and time the resource was last updated.
   */
  public val updatedAt: String,
  /**
   * The ID of the associated chat attachment, if any.
   */
  public val copilotChatAttachmentId: Int? = null,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var metadataValue: JsonObject? = null

    public var metadata: JsonObject
      get() = requireNotNull(metadataValue) { "metadata is required" }
      set(`value`) {
        metadataValue = value
      }

    private var resourceTypeValue: InlineCopilotSpaceResourceResourceTypeX117bcc1c? = null

    public var resourceType: InlineCopilotSpaceResourceResourceTypeX117bcc1c
      get() = requireNotNull(resourceTypeValue) { "resourceType is required" }
      set(`value`) {
        resourceTypeValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    /**
     * The ID of the associated chat attachment, if any.
     */
    public var copilotChatAttachmentId: Int? = null

    public fun build(): CopilotSpaceResource {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(metadataValue != null) { "metadata is required" }
      check(resourceTypeValue != null) { "resourceType is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      return CopilotSpaceResource(
        createdAt = createdAt,
        id = id,
        metadata = metadata,
        resourceType = resourceType,
        updatedAt = updatedAt,
        copilotChatAttachmentId = copilotChatAttachmentId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CopilotSpaceResource = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CopilotSpaceResource> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CopilotSpaceResource {
      val jsonDecoder = decoder.requireJsonDecoder("CopilotSpaceResource")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CopilotSpaceResource must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val metadata = json.decodeRequired<JsonObject>(rawObject, "metadata")
      val resourceType = json.decodeRequired<InlineCopilotSpaceResourceResourceTypeX117bcc1c>(rawObject, "resource_type")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      return CopilotSpaceResource(
        createdAt = createdAt,
        id = id,
        metadata = metadata,
        resourceType = resourceType,
        updatedAt = updatedAt,
        copilotChatAttachmentId = rawObject["copilot_chat_attachment_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CopilotSpaceResource) {
      val jsonEncoder = encoder.requireJsonEncoder("CopilotSpaceResource")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("id", json.encodeToJsonElement(value.id))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("resource_type", json.encodeToJsonElement(value.resourceType))
        put("updated_at", value.updatedAt)
        value.copilotChatAttachmentId?.let { put("copilot_chat_attachment_id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun copilotSpaceResource(block: CopilotSpaceResource.Builder.() -> Unit): CopilotSpaceResource = CopilotSpaceResource.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CopilotSpaceResource is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
