package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Hypermedia Link
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/link
 */
@Serializable(with = Link.Serializer::class)
public class Link(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): Link {
      check(hrefValue != null) { "href is required" }
      return Link(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Link = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Link> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Link {
      val jsonDecoder = decoder.requireJsonDecoder("Link")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Link must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return Link(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: Link) {
      val jsonEncoder = encoder.requireJsonEncoder("Link")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun link(block: Link.Builder.() -> Unit): Link = Link.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Link is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
