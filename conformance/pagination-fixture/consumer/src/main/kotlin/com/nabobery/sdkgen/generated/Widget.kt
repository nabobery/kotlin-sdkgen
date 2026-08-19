package com.nabobery.sdkgen.generated

import kotlin.Long
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
 * Generated model for sdkgen://pagination-fixture/openapi.yaml#/components/schemas/Widget.
 *
 * Source: sdkgen://pagination-fixture/openapi.yaml#/components/schemas/Widget
 */
@Serializable(with = Widget.Serializer::class)
public class Widget(
  public val id: Long,
  public val name: String,
) {
  public class Builder {
    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): Widget {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      return Widget(
        id = id,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Widget = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Widget> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Widget {
      val jsonDecoder = decoder.requireJsonDecoder("Widget")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Widget must be a JSON object")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      return Widget(
        id = id,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: Widget) {
      val jsonEncoder = encoder.requireJsonEncoder("Widget")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun widget(block: Widget.Builder.() -> Unit): Widget = Widget.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Widget is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
