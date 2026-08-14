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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/UpsertWorkspaceBudgetResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/UpsertWorkspaceBudgetResponse
 */
@Serializable(with = UpsertWorkspaceBudgetResponse.Serializer::class)
public class UpsertWorkspaceBudgetResponse(
  public val `data`: WorkspaceBudget,
) {
  public class Builder {
    private var dataValue: WorkspaceBudget? = null

    public var `data`: WorkspaceBudget
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): UpsertWorkspaceBudgetResponse {
      check(dataValue != null) { "data is required" }
      return UpsertWorkspaceBudgetResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UpsertWorkspaceBudgetResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<UpsertWorkspaceBudgetResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UpsertWorkspaceBudgetResponse {
      val jsonDecoder = decoder.requireJsonDecoder("UpsertWorkspaceBudgetResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("UpsertWorkspaceBudgetResponse must be a JSON object")
      val data = json.decodeRequired<WorkspaceBudget>(rawObject, "data")
      return UpsertWorkspaceBudgetResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: UpsertWorkspaceBudgetResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("UpsertWorkspaceBudgetResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun upsertWorkspaceBudgetResponse(block: UpsertWorkspaceBudgetResponse.Builder.() -> Unit): UpsertWorkspaceBudgetResponse = UpsertWorkspaceBudgetResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("UpsertWorkspaceBudgetResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
