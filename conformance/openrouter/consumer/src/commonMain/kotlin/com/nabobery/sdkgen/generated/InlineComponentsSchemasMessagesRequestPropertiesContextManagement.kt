package com.nabobery.sdkgen.generated

import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesContextManagement.Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesContextManagement(
  public val edits:
      List<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItems>? = null,
) {
  public class Builder {
    public var edits:
        List<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItems>?
        = null

    public fun build(): InlineComponentsSchemasMessagesRequestPropertiesContextManagement =
      InlineComponentsSchemasMessagesRequestPropertiesContextManagement(
      edits = edits,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesContextManagement =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesContextManagement> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesContextManagement {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesContextManagement")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesContextManagement must be a " +
          "JSON object")
      return InlineComponentsSchemasMessagesRequestPropertiesContextManagement(
        edits = raw["edits"]?.let { json
          .decodeFromJsonElement<List<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItems>>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesContextManagement) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesContextManagement")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.edits?.let { put("edits", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesRequestPropertiesContextManagement(block: InlineComponentsSchemasMessagesRequestPropertiesContextManagement.Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesContextManagement = InlineComponentsSchemasMessagesRequestPropertiesContextManagement.build(block)
