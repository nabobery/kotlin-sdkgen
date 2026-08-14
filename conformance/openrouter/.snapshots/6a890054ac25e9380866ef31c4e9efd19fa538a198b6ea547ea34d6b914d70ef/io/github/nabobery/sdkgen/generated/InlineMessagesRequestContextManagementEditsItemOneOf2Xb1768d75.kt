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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/1
 */
@Serializable(with = InlineMessagesRequestContextManagementEditsItemOneOf2Xb1768d75.Serializer::class)
public class InlineMessagesRequestContextManagementEditsItemOneOf2Xb1768d75(
  public val type: InlineMessagesRequestContextManagementEditsItemOneOf2TypeX6dec7c82,
  public val keep: InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7? = null,
) {
  public class Builder {
    private var typeValue: InlineMessagesRequestContextManagementEditsItemOneOf2TypeX6dec7c82? =
        null

    public var type: InlineMessagesRequestContextManagementEditsItemOneOf2TypeX6dec7c82
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var keep: InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7? = null

    public fun build(): InlineMessagesRequestContextManagementEditsItemOneOf2Xb1768d75 {
      check(typeValue != null) { "type is required" }
      return InlineMessagesRequestContextManagementEditsItemOneOf2Xb1768d75(
        type = type,
        keep = keep,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestContextManagementEditsItemOneOf2Xb1768d75 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestContextManagementEditsItemOneOf2Xb1768d75> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestContextManagementEditsItemOneOf2Xb1768d75 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestContextManagementEditsItemOneOf2Xb1768d75")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestContextManagementEditsItemOneOf2Xb1768d75 must be a JSON object")
      val type = json.decodeRequired<InlineMessagesRequestContextManagementEditsItemOneOf2TypeX6dec7c82>(rawObject, "type")
      return InlineMessagesRequestContextManagementEditsItemOneOf2Xb1768d75(
        type = type,
        keep = rawObject["keep"]?.let { json.decodeFromJsonElement<InlineMessagesRequestContextManagementEditsItemOneOf2KeepX0aa820c7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestContextManagementEditsItemOneOf2Xb1768d75) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestContextManagementEditsItemOneOf2Xb1768d75")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.keep?.let { put("keep", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesRequestContextManagementEditsItemOneOf2Xb1768d75(block: InlineMessagesRequestContextManagementEditsItemOneOf2Xb1768d75.Builder.() -> Unit): InlineMessagesRequestContextManagementEditsItemOneOf2Xb1768d75 = InlineMessagesRequestContextManagementEditsItemOneOf2Xb1768d75.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestContextManagementEditsItemOneOf2Xb1768d75 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
