package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * A single image model in the discovery listing.
 */
@Serializable(with = ImageModelListItem.Serializer::class)
public class ImageModelListItem(
  public val architecture: ImageModelArchitecture,
  /**
   * Unix timestamp (seconds) of when the model was created
   */
  public val created: Int,
  public val description: String,
  /**
   * Relative URL to the full per-endpoint records for this model
   */
  public val endpoints: String,
  /**
   * Model slug
   */
  public val id: String,
  /**
   * Display name
   */
  public val name: String,
  public val supportedParameters: Map<String, CapabilityDescriptor>,
  /**
   * Whether any endpoint of this model supports native SSE streaming on the dedicated Image API (i.e. `stream: true` in
   * the request). OR across endpoints.
   */
  public val supportsStreaming: Boolean,
) {
  public class Builder {
    private var architectureValue: ImageModelArchitecture? = null

    public var architecture: ImageModelArchitecture
      get() = requireNotNull(architectureValue) { "architecture is required" }
      set(`value`) {
        architectureValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var endpointsValue: String? = null

    public var endpoints: String
      get() = requireNotNull(endpointsValue) { "endpoints is required" }
      set(`value`) {
        endpointsValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var supportedParametersValue: Map<String, CapabilityDescriptor>? = null

    public var supportedParameters: Map<String, CapabilityDescriptor>
      get() = requireNotNull(supportedParametersValue) { "supportedParameters is required" }
      set(`value`) {
        supportedParametersValue = value
      }

    private var supportsStreamingValue: Boolean? = null

    public var supportsStreaming: Boolean
      get() = requireNotNull(supportsStreamingValue) { "supportsStreaming is required" }
      set(`value`) {
        supportsStreamingValue = value
      }

    public fun build(): ImageModelListItem {
      check(architectureValue != null) { "architecture is required" }
      check(createdValue != null) { "created is required" }
      check(descriptionValue != null) { "description is required" }
      check(endpointsValue != null) { "endpoints is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(supportedParametersValue != null) { "supportedParameters is required" }
      check(supportsStreamingValue != null) { "supportsStreaming is required" }
      return ImageModelListItem(
        architecture = architecture,
        created = created,
        description = description,
        endpoints = endpoints,
        id = id,
        name = name,
        supportedParameters = supportedParameters,
        supportsStreaming = supportsStreaming,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageModelListItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ImageModelListItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageModelListItem {
      val jsonDecoder = decoder.requireJsonDecoder("ImageModelListItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ImageModelListItem must be a JSON object")
      val architecture = json.decodeRequired<ImageModelArchitecture>(raw, "architecture")
      val created = json.decodeRequired<Int>(raw, "created")
      val description = json.decodeRequired<String>(raw, "description")
      val endpoints = json.decodeRequired<String>(raw, "endpoints")
      val id = json.decodeRequired<String>(raw, "id")
      val name = json.decodeRequired<String>(raw, "name")
      val supportedParameters = json.decodeRequired<Map<String, CapabilityDescriptor>>(raw, "supported_parameters")
      val supportsStreaming = json.decodeRequired<Boolean>(raw, "supports_streaming")
      return ImageModelListItem(
        architecture = architecture,
        created = created,
        description = description,
        endpoints = endpoints,
        id = id,
        name = name,
        supportedParameters = supportedParameters,
        supportsStreaming = supportsStreaming,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageModelListItem) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageModelListItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("architecture", json.encodeToJsonElement(value.architecture))
        put("created", json.encodeToJsonElement(value.created))
        put("description", value.description)
        put("endpoints", value.endpoints)
        put("id", value.id)
        put("name", value.name)
        put("supported_parameters", json.encodeToJsonElement(value.supportedParameters))
        put("supports_streaming", json.encodeToJsonElement(value.supportsStreaming))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imageModelListItem(block: ImageModelListItem.Builder.() -> Unit): ImageModelListItem = ImageModelListItem
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImageModelListItem is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
