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
 * Code quality finding message
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-quality-finding-message
 */
@Serializable(with = CodeQualityFindingMessage.Serializer::class)
public class CodeQualityFindingMessage(
  /**
   * The message text of the code quality finding in markdown format.
   */
  public val markdown: String,
  /**
   * The message text of the code quality finding.
   */
  public val text: String,
) {
  public class Builder {
    private var markdownValue: String? = null

    public var markdown: String
      get() = requireNotNull(markdownValue) { "markdown is required" }
      set(`value`) {
        markdownValue = value
      }

    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    public fun build(): CodeQualityFindingMessage {
      check(markdownValue != null) { "markdown is required" }
      check(textValue != null) { "text is required" }
      return CodeQualityFindingMessage(
        markdown = markdown,
        text = text,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeQualityFindingMessage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodeQualityFindingMessage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeQualityFindingMessage {
      val jsonDecoder = decoder.requireJsonDecoder("CodeQualityFindingMessage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeQualityFindingMessage must be a JSON object")
      val markdown = json.decodeRequired<String>(rawObject, "markdown")
      val text = json.decodeRequired<String>(rawObject, "text")
      return CodeQualityFindingMessage(
        markdown = markdown,
        text = text,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeQualityFindingMessage) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeQualityFindingMessage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("markdown", value.markdown)
        put("text", value.text)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeQualityFindingMessage(block: CodeQualityFindingMessage.Builder.() -> Unit): CodeQualityFindingMessage = CodeQualityFindingMessage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodeQualityFindingMessage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
