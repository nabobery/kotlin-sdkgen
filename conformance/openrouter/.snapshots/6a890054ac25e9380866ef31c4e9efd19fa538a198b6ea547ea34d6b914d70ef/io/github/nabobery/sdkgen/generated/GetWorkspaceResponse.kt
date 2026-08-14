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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/GetWorkspaceResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/GetWorkspaceResponse
 */
@Serializable(with = GetWorkspaceResponse.Serializer::class)
public class GetWorkspaceResponse(
  public val `data`: Workspace,
) {
  public class Builder {
    private var dataValue: Workspace? = null

    public var `data`: Workspace
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): GetWorkspaceResponse {
      check(dataValue != null) { "data is required" }
      return GetWorkspaceResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GetWorkspaceResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GetWorkspaceResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GetWorkspaceResponse {
      val jsonDecoder = decoder.requireJsonDecoder("GetWorkspaceResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GetWorkspaceResponse must be a JSON object")
      val data = json.decodeRequired<Workspace>(rawObject, "data")
      return GetWorkspaceResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: GetWorkspaceResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("GetWorkspaceResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun getWorkspaceResponse(block: GetWorkspaceResponse.Builder.() -> Unit): GetWorkspaceResponse = GetWorkspaceResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GetWorkspaceResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
