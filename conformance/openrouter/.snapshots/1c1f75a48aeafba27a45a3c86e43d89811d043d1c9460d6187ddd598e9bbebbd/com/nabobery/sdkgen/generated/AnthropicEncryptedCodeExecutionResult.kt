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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicEncryptedCodeExecutionResult.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicEncryptedCodeExecutionResult
 */
@Serializable(with = AnthropicEncryptedCodeExecutionResult.Serializer::class)
public class AnthropicEncryptedCodeExecutionResult(
  content: List<AnthropicCodeExecutionOutput>,
  public val encryptedStdout: String,
  public val returnCode: Int,
  public val stderr: String,
  public val type: InlineAnthropicEncryptedCodeExecutionResultTypeX48cf11a9,
) {
  public val content: List<AnthropicCodeExecutionOutput> = content.toList()

  public class Builder {
    private var contentValue: List<AnthropicCodeExecutionOutput>? = null

    public var content: List<AnthropicCodeExecutionOutput>
      get() = requireNotNull(contentValue) { "content is required" }.toList()
      set(`value`) {
        contentValue = value.toList()
      }

    private var encryptedStdoutValue: String? = null

    public var encryptedStdout: String
      get() = requireNotNull(encryptedStdoutValue) { "encryptedStdout is required" }
      set(`value`) {
        encryptedStdoutValue = value
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

    private var typeValue: InlineAnthropicEncryptedCodeExecutionResultTypeX48cf11a9? = null

    public var type: InlineAnthropicEncryptedCodeExecutionResultTypeX48cf11a9
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicEncryptedCodeExecutionResult {
      check(contentValue != null) { "content is required" }
      check(encryptedStdoutValue != null) { "encryptedStdout is required" }
      check(returnCodeValue != null) { "returnCode is required" }
      check(stderrValue != null) { "stderr is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicEncryptedCodeExecutionResult(
        content = content,
        encryptedStdout = encryptedStdout,
        returnCode = returnCode,
        stderr = stderr,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicEncryptedCodeExecutionResult = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicEncryptedCodeExecutionResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicEncryptedCodeExecutionResult {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicEncryptedCodeExecutionResult")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicEncryptedCodeExecutionResult must be a JSON object")
      val content = json.decodeRequired<List<AnthropicCodeExecutionOutput>>(rawObject, "content")
      val encryptedStdout = json.decodeRequired<String>(rawObject, "encrypted_stdout")
      val returnCode = json.decodeRequired<Int>(rawObject, "return_code")
      val stderr = json.decodeRequired<String>(rawObject, "stderr")
      val type = json.decodeRequired<InlineAnthropicEncryptedCodeExecutionResultTypeX48cf11a9>(rawObject, "type")
      return AnthropicEncryptedCodeExecutionResult(
        content = content,
        encryptedStdout = encryptedStdout,
        returnCode = returnCode,
        stderr = stderr,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicEncryptedCodeExecutionResult) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicEncryptedCodeExecutionResult")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
        put("encrypted_stdout", value.encryptedStdout)
        put("return_code", json.encodeToJsonElement(value.returnCode))
        put("stderr", value.stderr)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicEncryptedCodeExecutionResult(block: AnthropicEncryptedCodeExecutionResult.Builder.() -> Unit): AnthropicEncryptedCodeExecutionResult = AnthropicEncryptedCodeExecutionResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicEncryptedCodeExecutionResult is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
