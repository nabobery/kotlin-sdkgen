package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/DeleteWorkspaceResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/DeleteWorkspaceResponse
 */
@Serializable(with = DeleteWorkspaceResponse.Serializer::class)
public class DeleteWorkspaceResponse(
  /**
   * Confirmation that the workspace was deleted
   */
  public val deleted: Boolean,
) {
  public class Builder {
    private var deletedValue: Boolean? = null

    public var deleted: Boolean
      get() = requireNotNull(deletedValue) { "deleted is required" }
      set(`value`) {
        deletedValue = value
      }

    public fun build(): DeleteWorkspaceResponse {
      check(deletedValue != null) { "deleted is required" }
      return DeleteWorkspaceResponse(
        deleted = deleted,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DeleteWorkspaceResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DeleteWorkspaceResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DeleteWorkspaceResponse {
      val jsonDecoder = decoder.requireJsonDecoder("DeleteWorkspaceResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DeleteWorkspaceResponse must be a JSON object")
      val deleted = json.decodeRequired<Boolean>(rawObject, "deleted")
      return DeleteWorkspaceResponse(
        deleted = deleted,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DeleteWorkspaceResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("DeleteWorkspaceResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("deleted", json.encodeToJsonElement(value.deleted))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun deleteWorkspaceResponse(block: DeleteWorkspaceResponse.Builder.() -> Unit): DeleteWorkspaceResponse = DeleteWorkspaceResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DeleteWorkspaceResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
