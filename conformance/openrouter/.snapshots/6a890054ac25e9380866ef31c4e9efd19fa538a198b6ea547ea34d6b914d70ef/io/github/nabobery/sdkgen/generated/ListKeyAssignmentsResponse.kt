package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ListKeyAssignmentsResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ListKeyAssignmentsResponse
 */
@Serializable(with = ListKeyAssignmentsResponse.Serializer::class)
public class ListKeyAssignmentsResponse(
  `data`: List<KeyAssignment>,
  /**
   * Total number of key assignments for this guardrail
   */
  public val totalCount: Int,
) {
  /**
   * List of key assignments
   */
  public val `data`: List<KeyAssignment> = data.toList()

  public class Builder {
    private var dataValue: List<KeyAssignment>? = null

    public var `data`: List<KeyAssignment>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): ListKeyAssignmentsResponse {
      check(dataValue != null) { "data is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return ListKeyAssignmentsResponse(
        data = data,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ListKeyAssignmentsResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ListKeyAssignmentsResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ListKeyAssignmentsResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ListKeyAssignmentsResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ListKeyAssignmentsResponse must be a JSON object")
      val data = json.decodeRequired<List<KeyAssignment>>(rawObject, "data")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return ListKeyAssignmentsResponse(
        data = data,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ListKeyAssignmentsResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ListKeyAssignmentsResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun listKeyAssignmentsResponse(block: ListKeyAssignmentsResponse.Builder.() -> Unit): ListKeyAssignmentsResponse = ListKeyAssignmentsResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ListKeyAssignmentsResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
