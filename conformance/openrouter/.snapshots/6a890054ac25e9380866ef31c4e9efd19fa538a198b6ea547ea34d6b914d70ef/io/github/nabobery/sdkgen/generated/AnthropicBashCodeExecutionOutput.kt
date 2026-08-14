package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionOutput.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionOutput
 */
@Serializable(with = AnthropicBashCodeExecutionOutput.Serializer::class)
public class AnthropicBashCodeExecutionOutput(
  public val fileId: String,
  public val type: InlineAnthropicBashCodeExecutionOutputTypeXcef98e7a,
) {
  public class Builder {
    private var fileIdValue: String? = null

    public var fileId: String
      get() = requireNotNull(fileIdValue) { "fileId is required" }
      set(`value`) {
        fileIdValue = value
      }

    private var typeValue: InlineAnthropicBashCodeExecutionOutputTypeXcef98e7a? = null

    public var type: InlineAnthropicBashCodeExecutionOutputTypeXcef98e7a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicBashCodeExecutionOutput {
      check(fileIdValue != null) { "fileId is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicBashCodeExecutionOutput(
        fileId = fileId,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicBashCodeExecutionOutput = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicBashCodeExecutionOutput> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicBashCodeExecutionOutput {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicBashCodeExecutionOutput")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicBashCodeExecutionOutput must be a JSON object")
      val fileId = json.decodeRequired<String>(rawObject, "file_id")
      val type = json.decodeRequired<InlineAnthropicBashCodeExecutionOutputTypeXcef98e7a>(rawObject, "type")
      return AnthropicBashCodeExecutionOutput(
        fileId = fileId,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicBashCodeExecutionOutput) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicBashCodeExecutionOutput")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("file_id", value.fileId)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicBashCodeExecutionOutput(block: AnthropicBashCodeExecutionOutput.Builder.() -> Unit): AnthropicBashCodeExecutionOutput = AnthropicBashCodeExecutionOutput.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicBashCodeExecutionOutput is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
