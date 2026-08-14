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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/4.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/4
 */
@Serializable(with = InlineMessagesContentBlockDeltaEventDeltaOneOf5X8771449b.Serializer::class)
public class InlineMessagesContentBlockDeltaEventDeltaOneOf5X8771449b(
  public val citation: InlineMessagesContentBlockDeltaEventDeltaOneOf5CitationX6739e8d6,
  public val type: InlineMessagesContentBlockDeltaEventDeltaOneOf5TypeX4cdcd54b,
) {
  public class Builder {
    private var citationValue: InlineMessagesContentBlockDeltaEventDeltaOneOf5CitationX6739e8d6? =
        null

    public var citation: InlineMessagesContentBlockDeltaEventDeltaOneOf5CitationX6739e8d6
      get() = requireNotNull(citationValue) { "citation is required" }
      set(`value`) {
        citationValue = value
      }

    private var typeValue: InlineMessagesContentBlockDeltaEventDeltaOneOf5TypeX4cdcd54b? = null

    public var type: InlineMessagesContentBlockDeltaEventDeltaOneOf5TypeX4cdcd54b
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineMessagesContentBlockDeltaEventDeltaOneOf5X8771449b {
      check(citationValue != null) { "citation is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesContentBlockDeltaEventDeltaOneOf5X8771449b(
        citation = citation,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesContentBlockDeltaEventDeltaOneOf5X8771449b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesContentBlockDeltaEventDeltaOneOf5X8771449b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesContentBlockDeltaEventDeltaOneOf5X8771449b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesContentBlockDeltaEventDeltaOneOf5X8771449b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesContentBlockDeltaEventDeltaOneOf5X8771449b must be a JSON object")
      val citation = json.decodeRequired<InlineMessagesContentBlockDeltaEventDeltaOneOf5CitationX6739e8d6>(rawObject, "citation")
      val type = json.decodeRequired<InlineMessagesContentBlockDeltaEventDeltaOneOf5TypeX4cdcd54b>(rawObject, "type")
      return InlineMessagesContentBlockDeltaEventDeltaOneOf5X8771449b(
        citation = citation,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesContentBlockDeltaEventDeltaOneOf5X8771449b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesContentBlockDeltaEventDeltaOneOf5X8771449b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("citation", json.encodeToJsonElement(value.citation))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesContentBlockDeltaEventDeltaOneOf5X8771449b(block: InlineMessagesContentBlockDeltaEventDeltaOneOf5X8771449b.Builder.() -> Unit): InlineMessagesContentBlockDeltaEventDeltaOneOf5X8771449b = InlineMessagesContentBlockDeltaEventDeltaOneOf5X8771449b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesContentBlockDeltaEventDeltaOneOf5X8771449b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
