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
 * /oneOf/1/properties/keep/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/1/properties/keep/anyOf/1
 */
@Serializable(with = InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977.Serializer::class)
public class InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977(
  public val type: InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2TypeXfc61dd48,
) {
  public class Builder {
    private var typeValue:
        InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2TypeXfc61dd48? = null

    public var type: InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2TypeXfc61dd48
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977 {
      check(typeValue != null) { "type is required" }
      return InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977 must be a JSON object")
      val type = json.decodeRequired<InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2TypeXfc61dd48>(rawObject, "type")
      return InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977(block: InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977.Builder.() -> Unit): InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977 = InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2Xa8d91977 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
