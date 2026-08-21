package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionCreateResult.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionCreateResult
 */
@Serializable(with = AnthropicTextEditorCodeExecutionCreateResult.Serializer::class)
public class AnthropicTextEditorCodeExecutionCreateResult(
  public val isFileUpdate: Boolean,
  public val type: InlineAnthropicTextEditorCodeExecutionCreateResultTypeXc7ea1ee3,
) {
  public class Builder {
    private var isFileUpdateValue: Boolean? = null

    public var isFileUpdate: Boolean
      get() = requireNotNull(isFileUpdateValue) { "isFileUpdate is required" }
      set(`value`) {
        isFileUpdateValue = value
      }

    private var typeValue: InlineAnthropicTextEditorCodeExecutionCreateResultTypeXc7ea1ee3? = null

    public var type: InlineAnthropicTextEditorCodeExecutionCreateResultTypeXc7ea1ee3
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicTextEditorCodeExecutionCreateResult {
      check(isFileUpdateValue != null) { "isFileUpdate is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicTextEditorCodeExecutionCreateResult(
        isFileUpdate = isFileUpdate,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicTextEditorCodeExecutionCreateResult = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicTextEditorCodeExecutionCreateResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicTextEditorCodeExecutionCreateResult {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicTextEditorCodeExecutionCreateResult")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicTextEditorCodeExecutionCreateResult must be a JSON object")
      val isFileUpdate = json.decodeRequired<Boolean>(rawObject, "is_file_update")
      val type = json.decodeRequired<InlineAnthropicTextEditorCodeExecutionCreateResultTypeXc7ea1ee3>(rawObject, "type")
      return AnthropicTextEditorCodeExecutionCreateResult(
        isFileUpdate = isFileUpdate,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicTextEditorCodeExecutionCreateResult) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicTextEditorCodeExecutionCreateResult")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("is_file_update", json.encodeToJsonElement(value.isFileUpdate))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicTextEditorCodeExecutionCreateResult(block: AnthropicTextEditorCodeExecutionCreateResult.Builder.() -> Unit): AnthropicTextEditorCodeExecutionCreateResult = AnthropicTextEditorCodeExecutionCreateResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicTextEditorCodeExecutionCreateResult is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
