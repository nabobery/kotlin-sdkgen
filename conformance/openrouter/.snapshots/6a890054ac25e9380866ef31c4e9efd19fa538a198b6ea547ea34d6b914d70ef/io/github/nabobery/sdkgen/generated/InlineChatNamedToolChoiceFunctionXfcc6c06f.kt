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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatNamedToolChoice/properties/function.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatNamedToolChoice/properties/function
 */
@Serializable(with = InlineChatNamedToolChoiceFunctionXfcc6c06f.Serializer::class)
public class InlineChatNamedToolChoiceFunctionXfcc6c06f(
  /**
   * Function name to call
   */
  public val name: String,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineChatNamedToolChoiceFunctionXfcc6c06f {
      check(nameValue != null) { "name is required" }
      return InlineChatNamedToolChoiceFunctionXfcc6c06f(
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineChatNamedToolChoiceFunctionXfcc6c06f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineChatNamedToolChoiceFunctionXfcc6c06f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatNamedToolChoiceFunctionXfcc6c06f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatNamedToolChoiceFunctionXfcc6c06f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineChatNamedToolChoiceFunctionXfcc6c06f must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineChatNamedToolChoiceFunctionXfcc6c06f(
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatNamedToolChoiceFunctionXfcc6c06f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineChatNamedToolChoiceFunctionXfcc6c06f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineChatNamedToolChoiceFunctionXfcc6c06f(block: InlineChatNamedToolChoiceFunctionXfcc6c06f.Builder.() -> Unit): InlineChatNamedToolChoiceFunctionXfcc6c06f = InlineChatNamedToolChoiceFunctionXfcc6c06f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineChatNamedToolChoiceFunctionXfcc6c06f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
