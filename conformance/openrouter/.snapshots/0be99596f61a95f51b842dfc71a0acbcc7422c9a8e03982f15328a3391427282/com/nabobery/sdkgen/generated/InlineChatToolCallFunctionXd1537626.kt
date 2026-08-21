package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatToolCall/properties/function.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatToolCall/properties/function
 */
@Serializable(with = InlineChatToolCallFunctionXd1537626.Serializer::class)
public class InlineChatToolCallFunctionXd1537626(
  /**
   * Function arguments as JSON string
   */
  public val arguments: String,
  /**
   * Function name to call
   */
  public val name: String,
) {
  public class Builder {
    private var argumentsValue: String? = null

    public var arguments: String
      get() = requireNotNull(argumentsValue) { "arguments is required" }
      set(`value`) {
        argumentsValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineChatToolCallFunctionXd1537626 {
      check(argumentsValue != null) { "arguments is required" }
      check(nameValue != null) { "name is required" }
      return InlineChatToolCallFunctionXd1537626(
        arguments = arguments,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineChatToolCallFunctionXd1537626 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineChatToolCallFunctionXd1537626> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatToolCallFunctionXd1537626 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatToolCallFunctionXd1537626")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineChatToolCallFunctionXd1537626 must be a JSON object")
      val arguments = json.decodeRequired<String>(rawObject, "arguments")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineChatToolCallFunctionXd1537626(
        arguments = arguments,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatToolCallFunctionXd1537626) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineChatToolCallFunctionXd1537626")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("arguments", value.arguments)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineChatToolCallFunctionXd1537626(block: InlineChatToolCallFunctionXd1537626.Builder.() -> Unit): InlineChatToolCallFunctionXd1537626 = InlineChatToolCallFunctionXd1537626.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineChatToolCallFunctionXd1537626 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
