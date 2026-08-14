package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Function call details
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatStreamToolCall/properties/function
 */
@Serializable(with = InlineChatStreamToolCallFunctionX01cca6f3.Serializer::class)
public class InlineChatStreamToolCallFunctionX01cca6f3(
  /**
   * Function arguments as JSON string
   */
  public val arguments: String? = null,
  /**
   * Function name
   */
  public val name: String? = null,
) {
  public class Builder {
    /**
     * Function arguments as JSON string
     */
    public var arguments: String? = null

    /**
     * Function name
     */
    public var name: String? = null

    public fun build(): InlineChatStreamToolCallFunctionX01cca6f3 = InlineChatStreamToolCallFunctionX01cca6f3(
      arguments = arguments,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineChatStreamToolCallFunctionX01cca6f3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineChatStreamToolCallFunctionX01cca6f3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatStreamToolCallFunctionX01cca6f3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatStreamToolCallFunctionX01cca6f3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineChatStreamToolCallFunctionX01cca6f3 must be a JSON object")
      return InlineChatStreamToolCallFunctionX01cca6f3(
        arguments = rawObject["arguments"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatStreamToolCallFunctionX01cca6f3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineChatStreamToolCallFunctionX01cca6f3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.arguments?.let { put("arguments", it) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineChatStreamToolCallFunctionX01cca6f3(block: InlineChatStreamToolCallFunctionX01cca6f3.Builder.() -> Unit): InlineChatStreamToolCallFunctionX01cca6f3 = InlineChatStreamToolCallFunctionX01cca6f3.build(block)
