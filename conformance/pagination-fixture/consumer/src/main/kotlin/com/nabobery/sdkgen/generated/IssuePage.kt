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
 * Generated model for sdkgen://pagination-fixture/openapi.yaml#/components/schemas/IssuePage.
 *
 * Source: sdkgen://pagination-fixture/openapi.yaml#/components/schemas/IssuePage
 */
@Serializable(with = IssuePage.Serializer::class)
public class IssuePage(
  items: List<Issue>,
) {
  public val items: List<Issue> = items.toList()

  public class Builder {
    private var itemsValue: List<Issue>? = null

    public var items: List<Issue>
      get() = requireNotNull(itemsValue) { "items is required" }.toList()
      set(`value`) {
        itemsValue = value.toList()
      }

    public fun build(): IssuePage {
      check(itemsValue != null) { "items is required" }
      return IssuePage(
        items = items,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuePage = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuePage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuePage {
      val jsonDecoder = decoder.requireJsonDecoder("IssuePage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuePage must be a JSON object")
      val items = json.decodeRequired<List<Issue>>(rawObject, "items")
      return IssuePage(
        items = items,
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuePage) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuePage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("items", json.encodeToJsonElement(value.items))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuePage(block: IssuePage.Builder.() -> Unit): IssuePage = IssuePage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuePage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
