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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management
 */
@Serializable(with = InlineMessagesRequestContextManagementX29ec1928.Serializer::class)
public class InlineMessagesRequestContextManagementX29ec1928(
  edits: List<InlineMessagesRequestContextManagementEditsItemXe0d9d239>? = null,
) {
  public val edits: List<InlineMessagesRequestContextManagementEditsItemXe0d9d239>? =
      edits?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var editsValue: List<InlineMessagesRequestContextManagementEditsItemXe0d9d239>? = null

    public var edits: List<InlineMessagesRequestContextManagementEditsItemXe0d9d239>?
      get() = editsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        editsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineMessagesRequestContextManagementX29ec1928 = InlineMessagesRequestContextManagementX29ec1928(
      edits = edits,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestContextManagementX29ec1928 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestContextManagementX29ec1928> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestContextManagementX29ec1928 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestContextManagementX29ec1928")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestContextManagementX29ec1928 must be a JSON object")
      return InlineMessagesRequestContextManagementX29ec1928(
        edits = rawObject["edits"]?.let { json.decodeFromJsonElement<List<InlineMessagesRequestContextManagementEditsItemXe0d9d239>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestContextManagementX29ec1928) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestContextManagementX29ec1928")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.edits?.let { put("edits", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesRequestContextManagementX29ec1928(block: InlineMessagesRequestContextManagementX29ec1928.Builder.() -> Unit): InlineMessagesRequestContextManagementX29ec1928 = InlineMessagesRequestContextManagementX29ec1928.build(block)
