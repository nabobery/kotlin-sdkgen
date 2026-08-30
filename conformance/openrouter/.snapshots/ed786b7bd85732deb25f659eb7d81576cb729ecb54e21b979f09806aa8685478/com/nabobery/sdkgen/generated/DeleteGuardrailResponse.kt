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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/DeleteGuardrailResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/DeleteGuardrailResponse
 */
@Serializable(with = DeleteGuardrailResponse.Serializer::class)
public class DeleteGuardrailResponse(
  /**
   * Confirmation that the guardrail was deleted
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

    public fun build(): DeleteGuardrailResponse {
      check(deletedValue != null) { "deleted is required" }
      return DeleteGuardrailResponse(
        deleted = deleted,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DeleteGuardrailResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DeleteGuardrailResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DeleteGuardrailResponse {
      val jsonDecoder = decoder.requireJsonDecoder("DeleteGuardrailResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DeleteGuardrailResponse must be a JSON object")
      val deleted = json.decodeRequired<Boolean>(rawObject, "deleted")
      return DeleteGuardrailResponse(
        deleted = deleted,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DeleteGuardrailResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("DeleteGuardrailResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("deleted", json.encodeToJsonElement(value.deleted))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun deleteGuardrailResponse(block: DeleteGuardrailResponse.Builder.() -> Unit): DeleteGuardrailResponse = DeleteGuardrailResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DeleteGuardrailResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
