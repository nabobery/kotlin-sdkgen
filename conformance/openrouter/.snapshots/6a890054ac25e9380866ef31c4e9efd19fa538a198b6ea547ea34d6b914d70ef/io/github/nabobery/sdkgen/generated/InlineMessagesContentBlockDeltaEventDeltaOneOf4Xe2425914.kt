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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/3.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/3
 */
@Serializable(with = InlineMessagesContentBlockDeltaEventDeltaOneOf4Xe2425914.Serializer::class)
public class InlineMessagesContentBlockDeltaEventDeltaOneOf4Xe2425914(
  public val signature: String,
  public val type: InlineMessagesContentBlockDeltaEventDeltaOneOf4TypeX2a2b8615,
) {
  public class Builder {
    private var signatureValue: String? = null

    public var signature: String
      get() = requireNotNull(signatureValue) { "signature is required" }
      set(`value`) {
        signatureValue = value
      }

    private var typeValue: InlineMessagesContentBlockDeltaEventDeltaOneOf4TypeX2a2b8615? = null

    public var type: InlineMessagesContentBlockDeltaEventDeltaOneOf4TypeX2a2b8615
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineMessagesContentBlockDeltaEventDeltaOneOf4Xe2425914 {
      check(signatureValue != null) { "signature is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesContentBlockDeltaEventDeltaOneOf4Xe2425914(
        signature = signature,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesContentBlockDeltaEventDeltaOneOf4Xe2425914 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesContentBlockDeltaEventDeltaOneOf4Xe2425914> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesContentBlockDeltaEventDeltaOneOf4Xe2425914 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesContentBlockDeltaEventDeltaOneOf4Xe2425914")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesContentBlockDeltaEventDeltaOneOf4Xe2425914 must be a JSON object")
      val signature = json.decodeRequired<String>(rawObject, "signature")
      val type = json.decodeRequired<InlineMessagesContentBlockDeltaEventDeltaOneOf4TypeX2a2b8615>(rawObject, "type")
      return InlineMessagesContentBlockDeltaEventDeltaOneOf4Xe2425914(
        signature = signature,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesContentBlockDeltaEventDeltaOneOf4Xe2425914) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesContentBlockDeltaEventDeltaOneOf4Xe2425914")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("signature", value.signature)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesContentBlockDeltaEventDeltaOneOf4Xe2425914(block: InlineMessagesContentBlockDeltaEventDeltaOneOf4Xe2425914.Builder.() -> Unit): InlineMessagesContentBlockDeltaEventDeltaOneOf4Xe2425914 = InlineMessagesContentBlockDeltaEventDeltaOneOf4Xe2425914.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesContentBlockDeltaEventDeltaOneOf4Xe2425914 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
