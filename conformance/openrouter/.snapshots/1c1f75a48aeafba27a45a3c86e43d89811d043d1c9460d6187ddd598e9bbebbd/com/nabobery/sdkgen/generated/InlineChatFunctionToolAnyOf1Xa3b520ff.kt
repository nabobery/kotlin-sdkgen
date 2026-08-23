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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatFunctionTool/anyOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatFunctionTool/anyOf/0
 */
@Serializable(with = InlineChatFunctionToolAnyOf1Xa3b520ff.Serializer::class)
public class InlineChatFunctionToolAnyOf1Xa3b520ff(
  /**
   * Function definition for tool calling
   */
  public val function: InlineChatFunctionToolAnyOf1FunctionX25ce1173,
  public val type: InlineChatFunctionToolAnyOf1TypeX2139398a,
  public val cacheControl: ChatContentCacheControl? = null,
) {
  public class Builder {
    private var functionValue: InlineChatFunctionToolAnyOf1FunctionX25ce1173? = null

    public var function: InlineChatFunctionToolAnyOf1FunctionX25ce1173
      get() = requireNotNull(functionValue) { "function is required" }
      set(`value`) {
        functionValue = value
      }

    private var typeValue: InlineChatFunctionToolAnyOf1TypeX2139398a? = null

    public var type: InlineChatFunctionToolAnyOf1TypeX2139398a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cacheControl: ChatContentCacheControl? = null

    public fun build(): InlineChatFunctionToolAnyOf1Xa3b520ff {
      check(functionValue != null) { "function is required" }
      check(typeValue != null) { "type is required" }
      return InlineChatFunctionToolAnyOf1Xa3b520ff(
        function = function,
        type = type,
        cacheControl = cacheControl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineChatFunctionToolAnyOf1Xa3b520ff = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineChatFunctionToolAnyOf1Xa3b520ff> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatFunctionToolAnyOf1Xa3b520ff {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatFunctionToolAnyOf1Xa3b520ff")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineChatFunctionToolAnyOf1Xa3b520ff must be a JSON object")
      val function = json.decodeRequired<InlineChatFunctionToolAnyOf1FunctionX25ce1173>(rawObject, "function")
      val type = json.decodeRequired<InlineChatFunctionToolAnyOf1TypeX2139398a>(rawObject, "type")
      return InlineChatFunctionToolAnyOf1Xa3b520ff(
        function = function,
        type = type,
        cacheControl = rawObject["cache_control"]?.let { json.decodeFromJsonElement<ChatContentCacheControl>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatFunctionToolAnyOf1Xa3b520ff) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineChatFunctionToolAnyOf1Xa3b520ff")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("function", json.encodeToJsonElement(value.function))
        put("type", json.encodeToJsonElement(value.type))
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineChatFunctionToolAnyOf1Xa3b520ff(block: InlineChatFunctionToolAnyOf1Xa3b520ff.Builder.() -> Unit): InlineChatFunctionToolAnyOf1Xa3b520ff = InlineChatFunctionToolAnyOf1Xa3b520ff.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineChatFunctionToolAnyOf1Xa3b520ff is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
