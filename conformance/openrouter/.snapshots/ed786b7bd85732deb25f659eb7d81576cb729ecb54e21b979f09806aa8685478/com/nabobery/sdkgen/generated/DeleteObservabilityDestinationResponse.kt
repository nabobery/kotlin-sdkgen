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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/DeleteObservabilityDestinationResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/DeleteObservabilityDestinationResponse
 */
@Serializable(with = DeleteObservabilityDestinationResponse.Serializer::class)
public class DeleteObservabilityDestinationResponse(
  /**
   * Always `true` on success.
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

    public fun build(): DeleteObservabilityDestinationResponse {
      check(deletedValue != null) { "deleted is required" }
      return DeleteObservabilityDestinationResponse(
        deleted = deleted,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DeleteObservabilityDestinationResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DeleteObservabilityDestinationResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DeleteObservabilityDestinationResponse {
      val jsonDecoder = decoder.requireJsonDecoder("DeleteObservabilityDestinationResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DeleteObservabilityDestinationResponse must be a JSON object")
      val deleted = json.decodeRequired<Boolean>(rawObject, "deleted")
      return DeleteObservabilityDestinationResponse(
        deleted = deleted,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DeleteObservabilityDestinationResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("DeleteObservabilityDestinationResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("deleted", json.encodeToJsonElement(value.deleted))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun deleteObservabilityDestinationResponse(block: DeleteObservabilityDestinationResponse.Builder.() -> Unit): DeleteObservabilityDestinationResponse = DeleteObservabilityDestinationResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DeleteObservabilityDestinationResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
