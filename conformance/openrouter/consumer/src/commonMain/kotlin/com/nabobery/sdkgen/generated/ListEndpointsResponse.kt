package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * List of available endpoints for a model
 */
@Serializable(with = ListEndpointsResponse.Serializer::class)
public class ListEndpointsResponse(
  public val architecture: InlineComponentsSchemasListEndpointsResponsePropertiesArchitecture,
  /**
   * Unix timestamp of when the model was created
   */
  public val created: Int,
  /**
   * Description of the model
   */
  public val description: String,
  endpoints: List<PublicEndpoint>,
  /**
   * Unique identifier for the model
   */
  public val id: String,
  /**
   * Display name of the model
   */
  public val name: String,
) {
  /**
   * List of available endpoints for this model
   */
  public val endpoints: List<PublicEndpoint> = endpoints.toList()

  public class Builder {
    private var architectureValue:
        InlineComponentsSchemasListEndpointsResponsePropertiesArchitecture? = null

    public var architecture: InlineComponentsSchemasListEndpointsResponsePropertiesArchitecture
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

    private var endpointsValue: List<PublicEndpoint>? = null

    public var endpoints: List<PublicEndpoint>
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

    public fun build(): ListEndpointsResponse {
      check(architectureValue != null) { "architecture is required" }
      check(createdValue != null) { "created is required" }
      check(descriptionValue != null) { "description is required" }
      check(endpointsValue != null) { "endpoints is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      return ListEndpointsResponse(
        architecture = architecture,
        created = created,
        description = description,
        endpoints = endpoints,
        id = id,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ListEndpointsResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ListEndpointsResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ListEndpointsResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ListEndpointsResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ListEndpointsResponse must be a JSON object")
      val architecture = json.decodeRequired<InlineComponentsSchemasListEndpointsResponsePropertiesArchitecture>(raw,
        "architecture")
      val created = json.decodeRequired<Int>(raw, "created")
      val description = json.decodeRequired<String>(raw, "description")
      val endpoints = json.decodeRequired<List<PublicEndpoint>>(raw, "endpoints")
      val id = json.decodeRequired<String>(raw, "id")
      val name = json.decodeRequired<String>(raw, "name")
      return ListEndpointsResponse(
        architecture = architecture,
        created = created,
        description = description,
        endpoints = endpoints,
        id = id,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ListEndpointsResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ListEndpointsResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("architecture", json.encodeToJsonElement(value.architecture))
        put("created", json.encodeToJsonElement(value.created))
        put("description", value.description)
        put("endpoints", json.encodeToJsonElement(value.endpoints))
        put("id", value.id)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun listEndpointsResponse(block: ListEndpointsResponse.Builder.() -> Unit): ListEndpointsResponse =
  ListEndpointsResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ListEndpointsResponse is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
