package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * An output message item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputMessageItem
 */
@Serializable(with = OutputMessageItem.Serializer::class)
public class OutputMessageItem(
  content: List<InlineOutputMessageContentItemX9f591485>,
  public val id: String,
  public val role: InlineOutputMessageRoleXe91a3401,
  public val type: InlineOutputMessageTypeXba66a1d6,
  /**
   * The phase of an assistant message. Use `commentary` for an intermediate assistant message and `final_answer` for
   * the final assistant message. For follow-up requests with models like `gpt-5.3-codex` and later, preserve and resend
   * phase on all assistant messages. Omitting it can degrade performance. Not used for user messages.
   */
  public val phase: InlineOutputMessagePhaseXbea80b9f? = null,
  public val status: InlineOutputMessageStatusXf8c6547b? = null,
) {
  public val content: List<InlineOutputMessageContentItemX9f591485> = content.toList()

  public class Builder {
    private var contentValue: List<InlineOutputMessageContentItemX9f591485>? = null

    public var content: List<InlineOutputMessageContentItemX9f591485>
      get() = requireNotNull(contentValue) { "content is required" }.toList()
      set(`value`) {
        contentValue = value.toList()
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var roleValue: InlineOutputMessageRoleXe91a3401? = null

    public var role: InlineOutputMessageRoleXe91a3401
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    private var typeValue: InlineOutputMessageTypeXba66a1d6? = null

    public var type: InlineOutputMessageTypeXba66a1d6
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The phase of an assistant message. Use `commentary` for an intermediate assistant message and `final_answer` for
     * the final assistant message. For follow-up requests with models like `gpt-5.3-codex` and later, preserve and
     * resend phase on all assistant messages. Omitting it can degrade performance. Not used for user messages.
     */
    public var phase: InlineOutputMessagePhaseXbea80b9f? = null

    public var status: InlineOutputMessageStatusXf8c6547b? = null

    public fun build(): OutputMessageItem {
      check(contentValue != null) { "content is required" }
      check(idValue != null) { "id is required" }
      check(roleValue != null) { "role is required" }
      check(typeValue != null) { "type is required" }
      return OutputMessageItem(
        content = content,
        id = id,
        role = role,
        type = type,
        phase = phase,
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputMessageItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputMessageItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputMessageItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputMessageItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputMessageItem must be a JSON object")
      val content = json.decodeRequired<List<InlineOutputMessageContentItemX9f591485>>(rawObject, "content")
      val id = json.decodeRequired<String>(rawObject, "id")
      val role = json.decodeRequired<InlineOutputMessageRoleXe91a3401>(rawObject, "role")
      val type = json.decodeRequired<InlineOutputMessageTypeXba66a1d6>(rawObject, "type")
      return OutputMessageItem(
        content = content,
        id = id,
        role = role,
        type = type,
        phase = rawObject["phase"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineOutputMessagePhaseXbea80b9f?>(element) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineOutputMessageStatusXf8c6547b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputMessageItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputMessageItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
        put("id", value.id)
        put("role", json.encodeToJsonElement(value.role))
        put("type", json.encodeToJsonElement(value.type))
        value.phase?.let { put("phase", json.encodeToJsonElement(it)) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputMessageItem(block: OutputMessageItem.Builder.() -> Unit): OutputMessageItem = OutputMessageItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputMessageItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
