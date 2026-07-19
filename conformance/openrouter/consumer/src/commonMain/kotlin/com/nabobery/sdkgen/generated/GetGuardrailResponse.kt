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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/GetGuardrailResponse.
 */
@Serializable(with = GetGuardrailResponse.Serializer::class)
public class GetGuardrailResponse(
  public val `data`: Guardrail,
) {
  public class Builder {
    private var dataValue: Guardrail? = null

    public var `data`: Guardrail
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): GetGuardrailResponse {
      check(dataValue != null) { "data is required" }
      return GetGuardrailResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GetGuardrailResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<GetGuardrailResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GetGuardrailResponse {
      val jsonDecoder = decoder.requireJsonDecoder("GetGuardrailResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("GetGuardrailResponse must be a JSON object")
      val data = json.decodeRequired<Guardrail>(raw, "data")
      return GetGuardrailResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: GetGuardrailResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("GetGuardrailResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun getGuardrailResponse(block: GetGuardrailResponse.Builder.() -> Unit): GetGuardrailResponse =
  GetGuardrailResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GetGuardrailResponse is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
