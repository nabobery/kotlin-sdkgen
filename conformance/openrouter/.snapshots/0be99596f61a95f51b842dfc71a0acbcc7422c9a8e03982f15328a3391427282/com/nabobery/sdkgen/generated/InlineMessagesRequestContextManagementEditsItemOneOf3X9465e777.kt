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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/2.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/2
 */
@Serializable(with = InlineMessagesRequestContextManagementEditsItemOneOf3X9465e777.Serializer::class)
public class InlineMessagesRequestContextManagementEditsItemOneOf3X9465e777(
  public val type: InlineMessagesRequestContextManagementEditsItemOneOf3TypeX7840e478,
  public val instructions: String? = null,
  public val pauseAfterCompaction: Boolean? = null,
  public val trigger: InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a? = null,
) {
  public class Builder {
    private var typeValue: InlineMessagesRequestContextManagementEditsItemOneOf3TypeX7840e478? =
        null

    public var type: InlineMessagesRequestContextManagementEditsItemOneOf3TypeX7840e478
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var instructions: String? = null

    public var pauseAfterCompaction: Boolean? = null

    public var trigger: InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a? =
        null

    public fun build(): InlineMessagesRequestContextManagementEditsItemOneOf3X9465e777 {
      check(typeValue != null) { "type is required" }
      return InlineMessagesRequestContextManagementEditsItemOneOf3X9465e777(
        type = type,
        instructions = instructions,
        pauseAfterCompaction = pauseAfterCompaction,
        trigger = trigger,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestContextManagementEditsItemOneOf3X9465e777 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestContextManagementEditsItemOneOf3X9465e777> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestContextManagementEditsItemOneOf3X9465e777 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestContextManagementEditsItemOneOf3X9465e777")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestContextManagementEditsItemOneOf3X9465e777 must be a JSON object")
      val type = json.decodeRequired<InlineMessagesRequestContextManagementEditsItemOneOf3TypeX7840e478>(rawObject, "type")
      return InlineMessagesRequestContextManagementEditsItemOneOf3X9465e777(
        type = type,
        instructions = rawObject["instructions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        pauseAfterCompaction = rawObject["pause_after_compaction"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        trigger = rawObject["trigger"]?.let { json.decodeFromJsonElement<InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestContextManagementEditsItemOneOf3X9465e777) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestContextManagementEditsItemOneOf3X9465e777")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.instructions?.let { put("instructions", it) }
        value.pauseAfterCompaction?.let { put("pause_after_compaction", json.encodeToJsonElement(it)) }
        value.trigger?.let { put("trigger", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesRequestContextManagementEditsItemOneOf3X9465e777(block: InlineMessagesRequestContextManagementEditsItemOneOf3X9465e777.Builder.() -> Unit): InlineMessagesRequestContextManagementEditsItemOneOf3X9465e777 = InlineMessagesRequestContextManagementEditsItemOneOf3X9465e777.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestContextManagementEditsItemOneOf3X9465e777 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
