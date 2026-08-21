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
 * The iteration title, in raw text and HTML formats.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-iteration-settings/properties/title
 */
@Serializable(with = InlineProjectsV2IterationSettingsTitleX0c435b6f.Serializer::class)
public class InlineProjectsV2IterationSettingsTitleX0c435b6f(
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

    public fun build(): InlineProjectsV2IterationSettingsTitleX0c435b6f {
      check(htmlValue != null) { "html is required" }
      check(rawValue != null) { "raw is required" }
      return InlineProjectsV2IterationSettingsTitleX0c435b6f(
        html = html,
        raw = raw,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProjectsV2IterationSettingsTitleX0c435b6f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineProjectsV2IterationSettingsTitleX0c435b6f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProjectsV2IterationSettingsTitleX0c435b6f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProjectsV2IterationSettingsTitleX0c435b6f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProjectsV2IterationSettingsTitleX0c435b6f must be a JSON object")
      val html = json.decodeRequired<String>(rawObject, "html")
      val raw = json.decodeRequired<String>(rawObject, "raw")
      return InlineProjectsV2IterationSettingsTitleX0c435b6f(
        html = html,
        raw = raw,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProjectsV2IterationSettingsTitleX0c435b6f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProjectsV2IterationSettingsTitleX0c435b6f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("html", value.html)
        put("raw", value.raw)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProjectsV2IterationSettingsTitleX0c435b6f(block: InlineProjectsV2IterationSettingsTitleX0c435b6f.Builder.() -> Unit): InlineProjectsV2IterationSettingsTitleX0c435b6f = InlineProjectsV2IterationSettingsTitleX0c435b6f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineProjectsV2IterationSettingsTitleX0c435b6f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
