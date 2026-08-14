package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}/put/requestBody/content/appli
 * cation~1json/schema/properties/resources_attributes/items/properties/metadata
 */
@Serializable(with = InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31.Serializer::class)
public class InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31(
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

    public fun build(): InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31 = InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31(
      filePath = filePath,
      name = name,
      number = number,
      repositoryId = repositoryId,
      text = text,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31 must be a JSON object")
      return InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31(
        filePath = rawObject["file_path"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        number = rawObject["number"]?.let { json.decodeFromJsonElement<Int>(it) },
        repositoryId = rawObject["repository_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        text = rawObject["text"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31")
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

public fun inlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31(block: InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31.Builder.() -> Unit): InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31 = InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesItemMetadataX20e0ce31.build(block)
