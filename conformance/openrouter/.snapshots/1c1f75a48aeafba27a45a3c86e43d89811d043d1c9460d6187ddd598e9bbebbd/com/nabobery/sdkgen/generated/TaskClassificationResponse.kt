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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/TaskClassificationResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/TaskClassificationResponse
 */
@Serializable(with = TaskClassificationResponse.Serializer::class)
public class TaskClassificationResponse(
  public val `data`: InlineTaskClassificationResponseDataX0cad7694,
) {
  public class Builder {
    private var dataValue: InlineTaskClassificationResponseDataX0cad7694? = null

    public var `data`: InlineTaskClassificationResponseDataX0cad7694
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): TaskClassificationResponse {
      check(dataValue != null) { "data is required" }
      return TaskClassificationResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaskClassificationResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaskClassificationResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaskClassificationResponse {
      val jsonDecoder = decoder.requireJsonDecoder("TaskClassificationResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaskClassificationResponse must be a JSON object")
      val data = json.decodeRequired<InlineTaskClassificationResponseDataX0cad7694>(rawObject, "data")
      return TaskClassificationResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaskClassificationResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("TaskClassificationResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taskClassificationResponse(block: TaskClassificationResponse.Builder.() -> Unit): TaskClassificationResponse = TaskClassificationResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaskClassificationResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
