package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ListWorkspaceBudgetsResponse.
 */
@Serializable(with = ListWorkspaceBudgetsResponse.Serializer::class)
public class ListWorkspaceBudgetsResponse(
  `data`: List<WorkspaceBudget>,
) {
  /**
   * List of budgets configured for the workspace
   */
  public val `data`: List<WorkspaceBudget> = data.toList()

  public class Builder {
    private var dataValue: List<WorkspaceBudget>? = null

    public var `data`: List<WorkspaceBudget>
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): ListWorkspaceBudgetsResponse {
      check(dataValue != null) { "data is required" }
      return ListWorkspaceBudgetsResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ListWorkspaceBudgetsResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ListWorkspaceBudgetsResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ListWorkspaceBudgetsResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ListWorkspaceBudgetsResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ListWorkspaceBudgetsResponse must be a JSON object")
      val data = json.decodeRequired<List<WorkspaceBudget>>(raw, "data")
      return ListWorkspaceBudgetsResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ListWorkspaceBudgetsResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ListWorkspaceBudgetsResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun listWorkspaceBudgetsResponse(block: ListWorkspaceBudgetsResponse.Builder.() ->
  Unit): ListWorkspaceBudgetsResponse = ListWorkspaceBudgetsResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("ListWorkspaceBudgetsResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
