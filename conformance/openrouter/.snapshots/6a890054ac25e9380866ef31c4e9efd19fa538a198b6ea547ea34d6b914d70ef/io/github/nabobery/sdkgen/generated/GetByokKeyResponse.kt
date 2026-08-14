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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/GetBYOKKeyResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/GetBYOKKeyResponse
 */
@Serializable(with = GetByokKeyResponse.Serializer::class)
public class GetByokKeyResponse(
  public val `data`: ByokKey,
) {
  public class Builder {
    private var dataValue: ByokKey? = null

    public var `data`: ByokKey
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): GetByokKeyResponse {
      check(dataValue != null) { "data is required" }
      return GetByokKeyResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GetByokKeyResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GetByokKeyResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GetByokKeyResponse {
      val jsonDecoder = decoder.requireJsonDecoder("GetByokKeyResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GetByokKeyResponse must be a JSON object")
      val data = json.decodeRequired<ByokKey>(rawObject, "data")
      return GetByokKeyResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: GetByokKeyResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("GetByokKeyResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun getByokKeyResponse(block: GetByokKeyResponse.Builder.() -> Unit): GetByokKeyResponse = GetByokKeyResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GetByokKeyResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
