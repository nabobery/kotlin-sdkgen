package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/UpdateWorkspaceResponse.
 */
@Serializable(with = UpdateWorkspaceResponse.Serializer::class)
public class UpdateWorkspaceResponse(
  public val `data`: Workspace,
) {
  public class Builder {
    private var dataValue: Workspace? = null

    public var `data`: Workspace
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): UpdateWorkspaceResponse {
      check(dataValue != null) { "data is required" }
      return UpdateWorkspaceResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UpdateWorkspaceResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<UpdateWorkspaceResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UpdateWorkspaceResponse {
      val jsonDecoder = decoder.requireJsonDecoder("UpdateWorkspaceResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("UpdateWorkspaceResponse must be a JSON object")
      val data = json.decodeRequired<Workspace>(raw, "data")
      return UpdateWorkspaceResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: UpdateWorkspaceResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("UpdateWorkspaceResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun updateWorkspaceResponse(block: UpdateWorkspaceResponse.Builder.() -> Unit): UpdateWorkspaceResponse =
  UpdateWorkspaceResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("UpdateWorkspaceResponse is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
