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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ListMemberAssignmentsResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ListMemberAssignmentsResponse
 */
@Serializable(with = ListMemberAssignmentsResponse.Serializer::class)
public class ListMemberAssignmentsResponse(
  `data`: List<MemberAssignment>,
  /**
   * Total number of member assignments
   */
  public val totalCount: Int,
) {
  /**
   * List of member assignments
   */
  public val `data`: List<MemberAssignment> = data.toList()

  public class Builder {
    private var dataValue: List<MemberAssignment>? = null

    public var `data`: List<MemberAssignment>
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

    public fun build(): ListMemberAssignmentsResponse {
      check(dataValue != null) { "data is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return ListMemberAssignmentsResponse(
        data = data,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ListMemberAssignmentsResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ListMemberAssignmentsResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ListMemberAssignmentsResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ListMemberAssignmentsResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ListMemberAssignmentsResponse must be a JSON object")
      val data = json.decodeRequired<List<MemberAssignment>>(rawObject, "data")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return ListMemberAssignmentsResponse(
        data = data,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ListMemberAssignmentsResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ListMemberAssignmentsResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun listMemberAssignmentsResponse(block: ListMemberAssignmentsResponse.Builder.() -> Unit): ListMemberAssignmentsResponse = ListMemberAssignmentsResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ListMemberAssignmentsResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
