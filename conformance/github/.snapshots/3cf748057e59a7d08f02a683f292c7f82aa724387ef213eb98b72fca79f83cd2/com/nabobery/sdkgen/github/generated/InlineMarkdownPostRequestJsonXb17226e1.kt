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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/paths/~1markdown/post/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1markdown/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineMarkdownPostRequestJsonXb17226e1.Serializer::class)
public class InlineMarkdownPostRequestJsonXb17226e1(
  /**
   * The Markdown text to render in HTML.
   */
  public val text: String,
  /**
   * The repository context to use when creating references in `gfm` mode.  For example, setting `context` to
   * `octo-org/octo-repo` will change the text `#42` into an HTML link to issue 42 in the `octo-org/octo-repo`
   * repository.
   */
  public val context: String? = null,
  /**
   * The rendering mode.
   */
  public val mode: InlineMarkdownPostRequestJsonModeXbd7bd11d? = null,
) {
  public class Builder {
    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    /**
     * The repository context to use when creating references in `gfm` mode.  For example, setting `context` to
     * `octo-org/octo-repo` will change the text `#42` into an HTML link to issue 42 in the `octo-org/octo-repo`
     * repository.
     */
    public var context: String? = null

    /**
     * The rendering mode.
     */
    public var mode: InlineMarkdownPostRequestJsonModeXbd7bd11d? = null

    public fun build(): InlineMarkdownPostRequestJsonXb17226e1 {
      check(textValue != null) { "text is required" }
      return InlineMarkdownPostRequestJsonXb17226e1(
        text = text,
        context = context,
        mode = mode,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMarkdownPostRequestJsonXb17226e1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineMarkdownPostRequestJsonXb17226e1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMarkdownPostRequestJsonXb17226e1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMarkdownPostRequestJsonXb17226e1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMarkdownPostRequestJsonXb17226e1 must be a JSON object")
      val text = json.decodeRequired<String>(rawObject, "text")
      return InlineMarkdownPostRequestJsonXb17226e1(
        text = text,
        context = rawObject["context"]?.let { json.decodeFromJsonElement<String>(it) },
        mode = rawObject["mode"]?.let { json.decodeFromJsonElement<InlineMarkdownPostRequestJsonModeXbd7bd11d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMarkdownPostRequestJsonXb17226e1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMarkdownPostRequestJsonXb17226e1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("text", value.text)
        value.context?.let { put("context", it) }
        value.mode?.let { put("mode", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMarkdownPostRequestJsonXb17226e1(block: InlineMarkdownPostRequestJsonXb17226e1.Builder.() -> Unit): InlineMarkdownPostRequestJsonXb17226e1 = InlineMarkdownPostRequestJsonXb17226e1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMarkdownPostRequestJsonXb17226e1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
