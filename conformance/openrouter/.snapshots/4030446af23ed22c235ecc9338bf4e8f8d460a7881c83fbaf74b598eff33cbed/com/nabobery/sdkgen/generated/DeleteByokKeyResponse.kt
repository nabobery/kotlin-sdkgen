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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/DeleteBYOKKeyResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/DeleteBYOKKeyResponse
 */
@Serializable(with = DeleteByokKeyResponse.Serializer::class)
public class DeleteByokKeyResponse(
  /**
   * Confirmation that the BYOK credential was deleted.
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

    public fun build(): DeleteByokKeyResponse {
      check(deletedValue != null) { "deleted is required" }
      return DeleteByokKeyResponse(
        deleted = deleted,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DeleteByokKeyResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DeleteByokKeyResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DeleteByokKeyResponse {
      val jsonDecoder = decoder.requireJsonDecoder("DeleteByokKeyResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DeleteByokKeyResponse must be a JSON object")
      val deleted = json.decodeRequired<Boolean>(rawObject, "deleted")
      return DeleteByokKeyResponse(
        deleted = deleted,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DeleteByokKeyResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("DeleteByokKeyResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("deleted", json.encodeToJsonElement(value.deleted))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun deleteByokKeyResponse(block: DeleteByokKeyResponse.Builder.() -> Unit): DeleteByokKeyResponse = DeleteByokKeyResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DeleteByokKeyResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
