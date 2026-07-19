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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/CreateBYOKKeyResponse.
 */
@Serializable(with = CreateByokKeyResponse.Serializer::class)
public class CreateByokKeyResponse(
  public val `data`: ByokKey,
) {
  public class Builder {
    private var dataValue: ByokKey? = null

    public var `data`: ByokKey
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): CreateByokKeyResponse {
      check(dataValue != null) { "data is required" }
      return CreateByokKeyResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CreateByokKeyResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CreateByokKeyResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CreateByokKeyResponse {
      val jsonDecoder = decoder.requireJsonDecoder("CreateByokKeyResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("CreateByokKeyResponse must be a JSON object")
      val data = json.decodeRequired<ByokKey>(raw, "data")
      return CreateByokKeyResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CreateByokKeyResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("CreateByokKeyResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun createByokKeyResponse(block: CreateByokKeyResponse.Builder.() -> Unit): CreateByokKeyResponse =
  CreateByokKeyResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CreateByokKeyResponse is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
