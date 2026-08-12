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
 * The description of the option, in raw text and HTML formats.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-single-select-options/properties/description
 */
@Serializable(with = InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c.Serializer::class)
public class InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c(
  public val html: String,
  public val raw: String,
) {
  public class Builder {
    private var htmlValue: String? = null

    public var html: String
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var rawValue: String? = null

    public var raw: String
      get() = requireNotNull(rawValue) { "raw is required" }
      set(`value`) {
        rawValue = value
      }

    public fun build(): InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c {
      check(htmlValue != null) { "html is required" }
      check(rawValue != null) { "raw is required" }
      return InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c(
        html = html,
        raw = raw,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c must be a JSON object")
      val html = json.decodeRequired<String>(rawObject, "html")
      val raw = json.decodeRequired<String>(rawObject, "raw")
      return InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c(
        html = html,
        raw = raw,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("html", value.html)
        put("raw", value.raw)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProjectsV2SingleSelectOptionsDescriptionX7d64281c(block: InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c.Builder.() -> Unit): InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c = InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
