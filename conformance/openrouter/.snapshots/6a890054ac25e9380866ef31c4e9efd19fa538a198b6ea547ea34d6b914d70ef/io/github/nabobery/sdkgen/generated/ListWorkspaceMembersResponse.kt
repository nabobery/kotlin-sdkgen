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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ListWorkspaceMembersResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ListWorkspaceMembersResponse
 */
@Serializable(with = ListWorkspaceMembersResponse.Serializer::class)
public class ListWorkspaceMembersResponse(
  `data`: List<WorkspaceMember>,
  /**
   * Total number of members in the workspace
   */
  public val totalCount: Int,
) {
  /**
   * List of workspace members
   */
  public val `data`: List<WorkspaceMember> = data.toList()

  public class Builder {
    private var dataValue: List<WorkspaceMember>? = null

    public var `data`: List<WorkspaceMember>
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

    public fun build(): ListWorkspaceMembersResponse {
      check(dataValue != null) { "data is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return ListWorkspaceMembersResponse(
        data = data,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ListWorkspaceMembersResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ListWorkspaceMembersResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ListWorkspaceMembersResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ListWorkspaceMembersResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ListWorkspaceMembersResponse must be a JSON object")
      val data = json.decodeRequired<List<WorkspaceMember>>(rawObject, "data")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return ListWorkspaceMembersResponse(
        data = data,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ListWorkspaceMembersResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ListWorkspaceMembersResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun listWorkspaceMembersResponse(block: ListWorkspaceMembersResponse.Builder.() -> Unit): ListWorkspaceMembersResponse = ListWorkspaceMembersResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ListWorkspaceMembersResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
