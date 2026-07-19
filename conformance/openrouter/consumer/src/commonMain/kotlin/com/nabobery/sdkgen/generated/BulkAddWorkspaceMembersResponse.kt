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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/BulkAddWorkspaceMembersResponse.
 */
@Serializable(with = BulkAddWorkspaceMembersResponse.Serializer::class)
public class BulkAddWorkspaceMembersResponse(
  /**
   * Number of workspace memberships created or updated
   */
  public val addedCount: Int,
  `data`: List<WorkspaceMember>,
) {
  /**
   * List of added workspace memberships
   */
  public val `data`: List<WorkspaceMember> = data.toList()

  public class Builder {
    private var addedCountValue: Int? = null

    public var addedCount: Int
      get() = requireNotNull(addedCountValue) { "addedCount is required" }
      set(`value`) {
        addedCountValue = value
      }

    private var dataValue: List<WorkspaceMember>? = null

    public var `data`: List<WorkspaceMember>
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): BulkAddWorkspaceMembersResponse {
      check(addedCountValue != null) { "addedCount is required" }
      check(dataValue != null) { "data is required" }
      return BulkAddWorkspaceMembersResponse(
        addedCount = addedCount,
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BulkAddWorkspaceMembersResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BulkAddWorkspaceMembersResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BulkAddWorkspaceMembersResponse {
      val jsonDecoder = decoder.requireJsonDecoder("BulkAddWorkspaceMembersResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("BulkAddWorkspaceMembersResponse must be a JSON object")
      val addedCount = json.decodeRequired<Int>(raw, "added_count")
      val data = json.decodeRequired<List<WorkspaceMember>>(raw, "data")
      return BulkAddWorkspaceMembersResponse(
        addedCount = addedCount,
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BulkAddWorkspaceMembersResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("BulkAddWorkspaceMembersResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("added_count", json.encodeToJsonElement(value.addedCount))
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bulkAddWorkspaceMembersResponse(block: BulkAddWorkspaceMembersResponse.Builder.() ->
  Unit): BulkAddWorkspaceMembersResponse = BulkAddWorkspaceMembersResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("BulkAddWorkspaceMembersResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
