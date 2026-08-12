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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage
 */
@Serializable(with = EasyInputMessage.Serializer::class)
public class EasyInputMessage(
  public val role: InlineEasyInputMessageRoleXe94e4b94,
  public val content: InlineEasyInputMessageContentX288ec708? = null,
  /**
   * The phase of an assistant message. Use `commentary` for an intermediate assistant message and `final_answer` for
   * the final assistant message. For follow-up requests with models like `gpt-5.3-codex` and later, preserve and resend
   * phase on all assistant messages. Omitting it can degrade performance. Not used for user messages.
   */
  public val phase: InlineEasyInputMessagePhaseXdd562ead? = null,
  public val type: InlineEasyInputMessageTypeX812f8463? = null,
) {
  public class Builder {
    private var roleValue: InlineEasyInputMessageRoleXe94e4b94? = null

    public var role: InlineEasyInputMessageRoleXe94e4b94
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    public var content: InlineEasyInputMessageContentX288ec708? = null

    /**
     * The phase of an assistant message. Use `commentary` for an intermediate assistant message and `final_answer` for
     * the final assistant message. For follow-up requests with models like `gpt-5.3-codex` and later, preserve and
     * resend phase on all assistant messages. Omitting it can degrade performance. Not used for user messages.
     */
    public var phase: InlineEasyInputMessagePhaseXdd562ead? = null

    public var type: InlineEasyInputMessageTypeX812f8463? = null

    public fun build(): EasyInputMessage {
      check(roleValue != null) { "role is required" }
      return EasyInputMessage(
        role = role,
        content = content,
        phase = phase,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): EasyInputMessage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<EasyInputMessage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): EasyInputMessage {
      val jsonDecoder = decoder.requireJsonDecoder("EasyInputMessage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("EasyInputMessage must be a JSON object")
      val role = json.decodeRequired<InlineEasyInputMessageRoleXe94e4b94>(rawObject, "role")
      return EasyInputMessage(
        role = role,
        content = rawObject["content"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineEasyInputMessageContentX288ec708?>(element) },
        phase = rawObject["phase"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineEasyInputMessagePhaseXdd562ead?>(element) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineEasyInputMessageTypeX812f8463>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: EasyInputMessage) {
      val jsonEncoder = encoder.requireJsonEncoder("EasyInputMessage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("role", json.encodeToJsonElement(value.role))
        value.content?.let { put("content", json.encodeToJsonElement(it)) }
        value.phase?.let { put("phase", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun easyInputMessage(block: EasyInputMessage.Builder.() -> Unit): EasyInputMessage = EasyInputMessage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("EasyInputMessage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
