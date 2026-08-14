package io.github.nabobery.sdkgen.github.generated

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
 * Hypermedia Link with Type
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/link-with-type
 */
@Serializable(with = LinkWithType.Serializer::class)
public class LinkWithType(
  public val href: String,
  public val type: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): LinkWithType {
      check(hrefValue != null) { "href is required" }
      check(typeValue != null) { "type is required" }
      return LinkWithType(
        href = href,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LinkWithType = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<LinkWithType> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LinkWithType {
      val jsonDecoder = decoder.requireJsonDecoder("LinkWithType")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LinkWithType must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      val type = json.decodeRequired<String>(rawObject, "type")
      return LinkWithType(
        href = href,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: LinkWithType) {
      val jsonEncoder = encoder.requireJsonEncoder("LinkWithType")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
        put("type", value.type)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun linkWithType(block: LinkWithType.Builder.() -> Unit): LinkWithType = LinkWithType.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("LinkWithType is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
