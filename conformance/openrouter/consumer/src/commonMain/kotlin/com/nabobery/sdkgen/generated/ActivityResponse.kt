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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ActivityResponse.
 */
@Serializable(with = ActivityResponse.Serializer::class)
public class ActivityResponse(
  `data`: List<ActivityItem>,
) {
  /**
   * List of activity items
   */
  public val `data`: List<ActivityItem> = data.toList()

  public class Builder {
    private var dataValue: List<ActivityItem>? = null

    public var `data`: List<ActivityItem>
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): ActivityResponse {
      check(dataValue != null) { "data is required" }
      return ActivityResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActivityResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ActivityResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActivityResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ActivityResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ActivityResponse must be a JSON object")
      val data = json.decodeRequired<List<ActivityItem>>(raw, "data")
      return ActivityResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActivityResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ActivityResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun activityResponse(block: ActivityResponse.Builder.() -> Unit): ActivityResponse = ActivityResponse
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActivityResponse is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
