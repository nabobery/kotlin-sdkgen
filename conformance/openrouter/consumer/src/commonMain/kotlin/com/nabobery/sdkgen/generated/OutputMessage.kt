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

@Serializable
public data class OutputMessageView(
  public val content: List<InlineComponentsSchemasOutputMessagePropertiesContentItems>,
  public val id: String,
  public val phase: InlineComponentsSchemasOutputMessagePropertiesPhase? = null,
  public val role: InlineComponentsSchemasOutputMessagePropertiesRole,
  public val status: InlineComponentsSchemasOutputMessagePropertiesStatus? = null,
  public val type: InlineComponentsSchemasOutputMessagePropertiesType,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OutputMessage.
 */
@Serializable(with = OutputMessage.Serializer::class)
public class OutputMessage(
  content: List<InlineComponentsSchemasOutputMessagePropertiesContentItems>,
  public val id: String,
  public val role: InlineComponentsSchemasOutputMessagePropertiesRole,
  public val type: InlineComponentsSchemasOutputMessagePropertiesType,
  /**
   * The phase of an assistant message. Use `commentary` for an intermediate assistant message and `final_answer` for
   * the final assistant message. For follow-up requests with models like `gpt-5.3-codex` and later, preserve and resend
   * phase on all assistant messages. Omitting it can degrade performance. Not used for user messages.
   */
  public val phase: InlineComponentsSchemasOutputMessagePropertiesPhase? = null,
  public val status: InlineComponentsSchemasOutputMessagePropertiesStatus? = null,
) {
  public val content: List<InlineComponentsSchemasOutputMessagePropertiesContentItems> =
      content.toList()

  public class Builder {
    private var contentValue: List<InlineComponentsSchemasOutputMessagePropertiesContentItems>? =
        null

    public var content: List<InlineComponentsSchemasOutputMessagePropertiesContentItems>
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var roleValue: InlineComponentsSchemasOutputMessagePropertiesRole? = null

    public var role: InlineComponentsSchemasOutputMessagePropertiesRole
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    private var typeValue: InlineComponentsSchemasOutputMessagePropertiesType? = null

    public var type: InlineComponentsSchemasOutputMessagePropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The phase of an assistant message. Use `commentary` for an intermediate assistant message and `final_answer` for
     * the final assistant message. For follow-up requests with models like `gpt-5.3-codex` and later, preserve and
     * resend phase on all assistant messages. Omitting it can degrade performance. Not used for user messages.
     */
    public var phase: InlineComponentsSchemasOutputMessagePropertiesPhase? = null

    public var status: InlineComponentsSchemasOutputMessagePropertiesStatus? = null

    public fun build(): OutputMessage {
      check(contentValue != null) { "content is required" }
      check(idValue != null) { "id is required" }
      check(roleValue != null) { "role is required" }
      check(typeValue != null) { "type is required" }
      return OutputMessage(
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
    public fun build(block: Builder.() -> Unit): OutputMessage = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OutputMessage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputMessage {
      val jsonDecoder = decoder.requireJsonDecoder("OutputMessage")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OutputMessage must be a JSON object")
      val content = json.decodeRequired<List<InlineComponentsSchemasOutputMessagePropertiesContentItems>>(raw,
        "content")
      val id = json.decodeRequired<String>(raw, "id")
      val role = json.decodeRequired<InlineComponentsSchemasOutputMessagePropertiesRole>(raw, "role")
      val type = json.decodeRequired<InlineComponentsSchemasOutputMessagePropertiesType>(raw, "type")
      return OutputMessage(
        content = content,
        id = id,
        role = role,
        type = type,
        phase = raw["phase"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasOutputMessagePropertiesPhase?>(element) },
        status = raw["status"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasOutputMessagePropertiesStatus>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputMessage) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputMessage")
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

public fun outputMessage(block: OutputMessage.Builder.() -> Unit): OutputMessage = OutputMessage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputMessage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
