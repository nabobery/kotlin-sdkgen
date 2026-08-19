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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/UpdateBYOKKeyResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/UpdateBYOKKeyResponse
 */
@Serializable(with = UpdateByokKeyResponse.Serializer::class)
public class UpdateByokKeyResponse(
  public val `data`: ByokKey,
) {
  public class Builder {
    private var dataValue: ByokKey? = null

    public var `data`: ByokKey
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): UpdateByokKeyResponse {
      check(dataValue != null) { "data is required" }
      return UpdateByokKeyResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UpdateByokKeyResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<UpdateByokKeyResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UpdateByokKeyResponse {
      val jsonDecoder = decoder.requireJsonDecoder("UpdateByokKeyResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("UpdateByokKeyResponse must be a JSON object")
      val data = json.decodeRequired<ByokKey>(rawObject, "data")
      return UpdateByokKeyResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: UpdateByokKeyResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("UpdateByokKeyResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun updateByokKeyResponse(block: UpdateByokKeyResponse.Builder.() -> Unit): UpdateByokKeyResponse = UpdateByokKeyResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("UpdateByokKeyResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
