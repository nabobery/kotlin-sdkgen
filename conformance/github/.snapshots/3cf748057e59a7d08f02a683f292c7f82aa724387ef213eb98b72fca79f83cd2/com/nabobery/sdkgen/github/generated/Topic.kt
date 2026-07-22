package com.nabobery.sdkgen.github.generated

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
 * A topic aggregates entities that are related to a subject.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/topic
 */
@Serializable(with = Topic.Serializer::class)
public class Topic(
  names: List<String>,
) {
  public val names: List<String> = names.toList()

  public class Builder {
    private var namesValue: List<String>? = null

    public var names: List<String>
      get() = requireNotNull(namesValue) { "names is required" }
      set(`value`) {
        namesValue = value
      }

    public fun build(): Topic {
      check(namesValue != null) { "names is required" }
      return Topic(
        names = names,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Topic = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Topic> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Topic {
      val jsonDecoder = decoder.requireJsonDecoder("Topic")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Topic must be a JSON object")
      val names = json.decodeRequired<List<String>>(rawObject, "names")
      return Topic(
        names = names,
      )
    }

    override fun serialize(encoder: Encoder, `value`: Topic) {
      val jsonEncoder = encoder.requireJsonEncoder("Topic")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("names", json.encodeToJsonElement(value.names))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun topic(block: Topic.Builder.() -> Unit): Topic = Topic.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Topic is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
