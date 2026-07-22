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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces/post/requestBody/content/application~1json/sc
 * hema/properties/resources_attributes/items/properties/metadata
 */
@Serializable(with = InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6.Serializer::class)
public class InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6(
  /**
   * File path for file resources.
   */
  public val filePath: String? = null,
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
) {
  public class Builder {
    /**
     * File path for file resources.
     */
    public var filePath: String? = null

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

    public fun build(): InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6 = InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6(
      filePath = filePath,
      name = name,
      number = number,
      repositoryId = repositoryId,
      text = text,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6 must be a JSON object")
      return InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6(
        filePath = rawObject["file_path"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        number = rawObject["number"]?.let { json.decodeFromJsonElement<Int>(it) },
        repositoryId = rawObject["repository_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        text = rawObject["text"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.filePath?.let { put("file_path", it) }
        value.name?.let { put("name", it) }
        value.number?.let { put("number", json.encodeToJsonElement(it)) }
        value.repositoryId?.let { put("repository_id", json.encodeToJsonElement(it)) }
        value.text?.let { put("text", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6(block: InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6.Builder.() -> Unit): InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6 = InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesItemMetadataXb7cf7fb6.build(block)
