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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/CreateGuardrailResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CreateGuardrailResponse
 */
@Serializable(with = CreateGuardrailResponse.Serializer::class)
public class CreateGuardrailResponse(
  public val `data`: Guardrail,
) {
  public class Builder {
    private var dataValue: Guardrail? = null

    public var `data`: Guardrail
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): CreateGuardrailResponse {
      check(dataValue != null) { "data is required" }
      return CreateGuardrailResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CreateGuardrailResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CreateGuardrailResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CreateGuardrailResponse {
      val jsonDecoder = decoder.requireJsonDecoder("CreateGuardrailResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CreateGuardrailResponse must be a JSON object")
      val data = json.decodeRequired<Guardrail>(rawObject, "data")
      return CreateGuardrailResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CreateGuardrailResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("CreateGuardrailResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun createGuardrailResponse(block: CreateGuardrailResponse.Builder.() -> Unit): CreateGuardrailResponse = CreateGuardrailResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CreateGuardrailResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
