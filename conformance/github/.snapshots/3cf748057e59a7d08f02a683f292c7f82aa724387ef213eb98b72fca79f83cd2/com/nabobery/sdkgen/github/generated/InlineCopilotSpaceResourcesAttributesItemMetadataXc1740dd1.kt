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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Metadata specific to the resource type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/copilot-space/properties/resources_attributes/items/properties/metad
 * ata
 */
@Serializable(with = InlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1.Serializer::class)
public class InlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1(
  /**
   * Chat attachment ID for uploaded files or media.
   */
  public val copilotChatAttachmentId: Int? = null,
  /**
   * File path for file resources.
   */
  public val filePath: String? = null,
  /**
   * Height for media content resources.
   */
  public val height: Int? = null,
  /**
   * Media type for media content resources.
   */
  public val mediaType: String? = null,
  /**
   * Name for the resource.
   */
  public val name: String? = null,
  /**
   * Issue or PR number.
   */
  public val number: Int? = null,
  /**
   * Repository ID for repository or file resources.
   */
  public val repositoryId: Int? = null,
  /**
   * Text content for free text resources.
   */
  public val text: String? = null,
  /**
   * URL for media content resources.
   */
  public val url: String? = null,
  /**
   * Width for media content resources.
   */
  public val width: Int? = null,
) {
  public class Builder {
    /**
     * Chat attachment ID for uploaded files or media.
     */
    public var copilotChatAttachmentId: Int? = null

    /**
     * File path for file resources.
     */
    public var filePath: String? = null

    /**
     * Height for media content resources.
     */
    public var height: Int? = null

    /**
     * Media type for media content resources.
     */
    public var mediaType: String? = null

    /**
     * Name for the resource.
     */
    public var name: String? = null

    /**
     * Issue or PR number.
     */
    public var number: Int? = null

    /**
     * Repository ID for repository or file resources.
     */
    public var repositoryId: Int? = null

    /**
     * Text content for free text resources.
     */
    public var text: String? = null

    /**
     * URL for media content resources.
     */
    public var url: String? = null

    /**
     * Width for media content resources.
     */
    public var width: Int? = null

    public fun build(): InlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1 = InlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1(
      copilotChatAttachmentId = copilotChatAttachmentId,
      filePath = filePath,
      height = height,
      mediaType = mediaType,
      name = name,
      number = number,
      repositoryId = repositoryId,
      text = text,
      url = url,
      width = width,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1 must be a JSON object")
      return InlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1(
        copilotChatAttachmentId = rawObject["copilot_chat_attachment_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        filePath = rawObject["file_path"]?.let { json.decodeFromJsonElement<String>(it) },
        height = rawObject["height"]?.let { json.decodeFromJsonElement<Int>(it) },
        mediaType = rawObject["media_type"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        number = rawObject["number"]?.let { json.decodeFromJsonElement<Int>(it) },
        repositoryId = rawObject["repository_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        text = rawObject["text"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        width = rawObject["width"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.copilotChatAttachmentId?.let { put("copilot_chat_attachment_id", json.encodeToJsonElement(it)) }
        value.filePath?.let { put("file_path", it) }
        value.height?.let { put("height", json.encodeToJsonElement(it)) }
        value.mediaType?.let { put("media_type", it) }
        value.name?.let { put("name", it) }
        value.number?.let { put("number", json.encodeToJsonElement(it)) }
        value.repositoryId?.let { put("repository_id", json.encodeToJsonElement(it)) }
        value.text?.let { put("text", it) }
        value.url?.let { put("url", it) }
        value.width?.let { put("width", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1(block: InlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1.Builder.() -> Unit): InlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1 = InlineCopilotSpaceResourcesAttributesItemMetadataXc1740dd1.build(block)
