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
 * Anthropic message with OpenRouter extensions
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam
 */
@Serializable(with = MessagesMessageParam.Serializer::class)
public class MessagesMessageParam(
  public val content: InlineMessagesMessageParamContentX36d98fda,
  public val role: InlineMessagesMessageParamRoleXb49c78b7,
) {
  public class Builder {
    private var contentValue: InlineMessagesMessageParamContentX36d98fda? = null

    public var content: InlineMessagesMessageParamContentX36d98fda
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var roleValue: InlineMessagesMessageParamRoleXb49c78b7? = null

    public var role: InlineMessagesMessageParamRoleXb49c78b7
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    public fun build(): MessagesMessageParam {
      check(contentValue != null) { "content is required" }
      check(roleValue != null) { "role is required" }
      return MessagesMessageParam(
        content = content,
        role = role,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesMessageParam = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MessagesMessageParam> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesMessageParam {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesMessageParam")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MessagesMessageParam must be a JSON object")
      val content = json.decodeRequired<InlineMessagesMessageParamContentX36d98fda>(rawObject, "content")
      val role = json.decodeRequired<InlineMessagesMessageParamRoleXb49c78b7>(rawObject, "role")
      return MessagesMessageParam(
        content = content,
        role = role,
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesMessageParam) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesMessageParam")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
        put("role", json.encodeToJsonElement(value.role))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun messagesMessageParam(block: MessagesMessageParam.Builder.() -> Unit): MessagesMessageParam = MessagesMessageParam.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MessagesMessageParam is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
