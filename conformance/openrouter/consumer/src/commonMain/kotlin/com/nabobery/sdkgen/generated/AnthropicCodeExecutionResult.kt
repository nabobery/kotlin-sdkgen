package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecutionResult.
 */
@Serializable(with = AnthropicCodeExecutionResult.Serializer::class)
public class AnthropicCodeExecutionResult(
  content: List<AnthropicCodeExecutionOutput>,
  public val returnCode: Int,
  public val stderr: String,
  public val stdout: String,
  public val type: InlineComponentsSchemasAnthropicCodeExecutionResultPropertiesType,
) {
  public val content: List<AnthropicCodeExecutionOutput> = content.toList()

  public class Builder {
    private var contentValue: List<AnthropicCodeExecutionOutput>? = null

    public var content: List<AnthropicCodeExecutionOutput>
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
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

    private var typeValue: InlineComponentsSchemasAnthropicCodeExecutionResultPropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicCodeExecutionResultPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicCodeExecutionResult {
      check(contentValue != null) { "content is required" }
      check(returnCodeValue != null) { "returnCode is required" }
      check(stderrValue != null) { "stderr is required" }
      check(stdoutValue != null) { "stdout is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicCodeExecutionResult(
        content = content,
        returnCode = returnCode,
        stderr = stderr,
        stdout = stdout,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicCodeExecutionResult = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicCodeExecutionResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicCodeExecutionResult {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicCodeExecutionResult")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicCodeExecutionResult must be a JSON object")
      val content = json.decodeRequired<List<AnthropicCodeExecutionOutput>>(raw, "content")
      val returnCode = json.decodeRequired<Int>(raw, "return_code")
      val stderr = json.decodeRequired<String>(raw, "stderr")
      val stdout = json.decodeRequired<String>(raw, "stdout")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicCodeExecutionResultPropertiesType>(raw, "type")
      return AnthropicCodeExecutionResult(
        content = content,
        returnCode = returnCode,
        stderr = stderr,
        stdout = stdout,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicCodeExecutionResult) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicCodeExecutionResult")
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

public fun anthropicCodeExecutionResult(block: AnthropicCodeExecutionResult.Builder.() ->
  Unit): AnthropicCodeExecutionResult = AnthropicCodeExecutionResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("AnthropicCodeExecutionResult is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
