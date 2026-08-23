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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesResult/allOf/1/properties/context_management.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesResult/allOf/1/properties/context_management
 */
@Serializable(with = InlineMessagesResultAllOf2ContextManagementXf21391be.Serializer::class)
public class InlineMessagesResultAllOf2ContextManagementXf21391be(
  appliedEdits: List<InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489>,
) {
  public val appliedEdits:
      List<InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489> =
      appliedEdits.toList()

  public class Builder {
    private var appliedEditsValue:
        List<InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489>? = null

    public var appliedEdits:
        List<InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489>
      get() = requireNotNull(appliedEditsValue) { "appliedEdits is required" }.toList()
      set(`value`) {
        appliedEditsValue = value.toList()
      }

    public fun build(): InlineMessagesResultAllOf2ContextManagementXf21391be {
      check(appliedEditsValue != null) { "appliedEdits is required" }
      return InlineMessagesResultAllOf2ContextManagementXf21391be(
        appliedEdits = appliedEdits,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesResultAllOf2ContextManagementXf21391be = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesResultAllOf2ContextManagementXf21391be> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesResultAllOf2ContextManagementXf21391be {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesResultAllOf2ContextManagementXf21391be")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesResultAllOf2ContextManagementXf21391be must be a JSON object")
      val appliedEdits = json.decodeRequired<List<InlineMessagesResultAllOf2ContextManagementAppliedEditsItemX09c2e489>>(rawObject, "applied_edits")
      return InlineMessagesResultAllOf2ContextManagementXf21391be(
        appliedEdits = appliedEdits,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesResultAllOf2ContextManagementXf21391be) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesResultAllOf2ContextManagementXf21391be")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("applied_edits", json.encodeToJsonElement(value.appliedEdits))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesResultAllOf2ContextManagementXf21391be(block: InlineMessagesResultAllOf2ContextManagementXf21391be.Builder.() -> Unit): InlineMessagesResultAllOf2ContextManagementXf21391be = InlineMessagesResultAllOf2ContextManagementXf21391be.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesResultAllOf2ContextManagementXf21391be is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
