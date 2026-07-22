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
 * The display name of the option, in raw text and HTML formats.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-single-select-options/properties/name
 */
@Serializable(with = InlineProjectsV2SingleSelectOptionsNameX047fb272.Serializer::class)
public class InlineProjectsV2SingleSelectOptionsNameX047fb272(
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

    public fun build(): InlineProjectsV2SingleSelectOptionsNameX047fb272 {
      check(htmlValue != null) { "html is required" }
      check(rawValue != null) { "raw is required" }
      return InlineProjectsV2SingleSelectOptionsNameX047fb272(
        html = html,
        raw = raw,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProjectsV2SingleSelectOptionsNameX047fb272 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineProjectsV2SingleSelectOptionsNameX047fb272> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProjectsV2SingleSelectOptionsNameX047fb272 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProjectsV2SingleSelectOptionsNameX047fb272")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProjectsV2SingleSelectOptionsNameX047fb272 must be a JSON object")
      val html = json.decodeRequired<String>(rawObject, "html")
      val raw = json.decodeRequired<String>(rawObject, "raw")
      return InlineProjectsV2SingleSelectOptionsNameX047fb272(
        html = html,
        raw = raw,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProjectsV2SingleSelectOptionsNameX047fb272) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProjectsV2SingleSelectOptionsNameX047fb272")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("html", value.html)
        put("raw", value.raw)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProjectsV2SingleSelectOptionsNameX047fb272(block: InlineProjectsV2SingleSelectOptionsNameX047fb272.Builder.() -> Unit): InlineProjectsV2SingleSelectOptionsNameX047fb272 = InlineProjectsV2SingleSelectOptionsNameX047fb272.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineProjectsV2SingleSelectOptionsNameX047fb272 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
