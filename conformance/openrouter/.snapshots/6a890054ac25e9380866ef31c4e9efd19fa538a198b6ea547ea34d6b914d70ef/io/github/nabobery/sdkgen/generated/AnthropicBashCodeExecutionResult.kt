package io.github.nabobery.sdkgen.generated

import kotlin.Int
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionResult.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionResult
 */
@Serializable(with = AnthropicBashCodeExecutionResult.Serializer::class)
public class AnthropicBashCodeExecutionResult(
  content: List<AnthropicBashCodeExecutionOutput>,
  public val returnCode: Int,
  public val stderr: String,
  public val stdout: String,
  public val type: InlineAnthropicBashCodeExecutionResultTypeX90a92e2d,
) {
  public val content: List<AnthropicBashCodeExecutionOutput> = content.toList()

  public class Builder {
    private var contentValue: List<AnthropicBashCodeExecutionOutput>? = null

    public var content: List<AnthropicBashCodeExecutionOutput>
      get() = requireNotNull(contentValue) { "content is required" }.toList()
      set(`value`) {
        contentValue = value.toList()
      }

    private var returnCodeValue: Int? = null

    public var returnCode: Int
      get() = requireNotNull(returnCodeValue) { "returnCode is required" }
      set(`value`) {
        returnCodeValue = value
      }

    private var stderrValue: String? = null

    public var stderr: String
      get() = requireNotNull(stderrValue) { "stderr is required" }
      set(`value`) {
        stderrValue = value
      }

    private var stdoutValue: String? = null

    public var stdout: String
      get() = requireNotNull(stdoutValue) { "stdout is required" }
      set(`value`) {
        stdoutValue = value
      }

    private var typeValue: InlineAnthropicBashCodeExecutionResultTypeX90a92e2d? = null

    public var type: InlineAnthropicBashCodeExecutionResultTypeX90a92e2d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicBashCodeExecutionResult {
      check(contentValue != null) { "content is required" }
      check(returnCodeValue != null) { "returnCode is required" }
      check(stderrValue != null) { "stderr is required" }
      check(stdoutValue != null) { "stdout is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicBashCodeExecutionResult(
        content = content,
        returnCode = returnCode,
        stderr = stderr,
        stdout = stdout,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicBashCodeExecutionResult = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicBashCodeExecutionResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicBashCodeExecutionResult {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicBashCodeExecutionResult")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicBashCodeExecutionResult must be a JSON object")
      val content = json.decodeRequired<List<AnthropicBashCodeExecutionOutput>>(rawObject, "content")
      val returnCode = json.decodeRequired<Int>(rawObject, "return_code")
      val stderr = json.decodeRequired<String>(rawObject, "stderr")
      val stdout = json.decodeRequired<String>(rawObject, "stdout")
      val type = json.decodeRequired<InlineAnthropicBashCodeExecutionResultTypeX90a92e2d>(rawObject, "type")
      return AnthropicBashCodeExecutionResult(
        content = content,
        returnCode = returnCode,
        stderr = stderr,
        stdout = stdout,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicBashCodeExecutionResult) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicBashCodeExecutionResult")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
        put("return_code", json.encodeToJsonElement(value.returnCode))
        put("stderr", value.stderr)
        put("stdout", value.stdout)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicBashCodeExecutionResult(block: AnthropicBashCodeExecutionResult.Builder.() -> Unit): AnthropicBashCodeExecutionResult = AnthropicBashCodeExecutionResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicBashCodeExecutionResult is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
