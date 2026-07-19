package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ListGuardrailsResponse.
 */
@Serializable(with = ListGuardrailsResponse.Serializer::class)
public class ListGuardrailsResponse(
  `data`: List<Guardrail>,
  /**
   * Total number of guardrails
   */
  public val totalCount: Int,
) {
  /**
   * List of guardrails
   */
  public val `data`: List<Guardrail> = data.toList()

  public class Builder {
    private var dataValue: List<Guardrail>? = null

    public var `data`: List<Guardrail>
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): ListGuardrailsResponse {
      check(dataValue != null) { "data is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return ListGuardrailsResponse(
        data = data,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ListGuardrailsResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ListGuardrailsResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ListGuardrailsResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ListGuardrailsResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ListGuardrailsResponse must be a JSON object")
      val data = json.decodeRequired<List<Guardrail>>(raw, "data")
      val totalCount = json.decodeRequired<Int>(raw, "total_count")
      return ListGuardrailsResponse(
        data = data,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ListGuardrailsResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ListGuardrailsResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun listGuardrailsResponse(block: ListGuardrailsResponse.Builder.() -> Unit): ListGuardrailsResponse =
  ListGuardrailsResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ListGuardrailsResponse is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
