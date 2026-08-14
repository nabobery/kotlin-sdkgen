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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1resources/post/requestBody/content
 * /application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1resources/post/requestBody/content
 * /application~1json/schema
 */
@Serializable(with = InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85.Serializer::class)
public class InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85(
  /**
   * Resource-specific metadata.
   */
  public val metadata: JsonObject,
  /**
   * The type of resource to create.
   */
  public val resourceType: InlineOrgsCopilotSpacesResourcesPostRequestJsonResourceTypeX581d61ab,
) {
  public class Builder {
    private var metadataValue: JsonObject? = null

    public var metadata: JsonObject
      get() = requireNotNull(metadataValue) { "metadata is required" }
      set(`value`) {
        metadataValue = value
      }

    private var resourceTypeValue:
        InlineOrgsCopilotSpacesResourcesPostRequestJsonResourceTypeX581d61ab? = null

    public var resourceType: InlineOrgsCopilotSpacesResourcesPostRequestJsonResourceTypeX581d61ab
      get() = requireNotNull(resourceTypeValue) { "resourceType is required" }
      set(`value`) {
        resourceTypeValue = value
      }

    public fun build(): InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85 {
      check(metadataValue != null) { "metadata is required" }
      check(resourceTypeValue != null) { "resourceType is required" }
      return InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85(
        metadata = metadata,
        resourceType = resourceType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85 must be a JSON object")
      val metadata = json.decodeRequired<JsonObject>(rawObject, "metadata")
      val resourceType = json.decodeRequired<InlineOrgsCopilotSpacesResourcesPostRequestJsonResourceTypeX581d61ab>(rawObject, "resource_type")
      return InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85(
        metadata = metadata,
        resourceType = resourceType,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("resource_type", json.encodeToJsonElement(value.resourceType))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85(block: InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85.Builder.() -> Unit): InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85 = InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
