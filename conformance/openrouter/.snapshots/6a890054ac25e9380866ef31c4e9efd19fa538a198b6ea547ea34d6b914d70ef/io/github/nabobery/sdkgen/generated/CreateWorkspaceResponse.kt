package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/CreateWorkspaceResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CreateWorkspaceResponse
 */
@Serializable(with = CreateWorkspaceResponse.Serializer::class)
public class CreateWorkspaceResponse(
  public val `data`: Workspace,
) {
  public class Builder {
    private var dataValue: Workspace? = null

    public var `data`: Workspace
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): CreateWorkspaceResponse {
      check(dataValue != null) { "data is required" }
      return CreateWorkspaceResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CreateWorkspaceResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CreateWorkspaceResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CreateWorkspaceResponse {
      val jsonDecoder = decoder.requireJsonDecoder("CreateWorkspaceResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CreateWorkspaceResponse must be a JSON object")
      val data = json.decodeRequired<Workspace>(rawObject, "data")
      return CreateWorkspaceResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CreateWorkspaceResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("CreateWorkspaceResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun createWorkspaceResponse(block: CreateWorkspaceResponse.Builder.() -> Unit): CreateWorkspaceResponse = CreateWorkspaceResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CreateWorkspaceResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
