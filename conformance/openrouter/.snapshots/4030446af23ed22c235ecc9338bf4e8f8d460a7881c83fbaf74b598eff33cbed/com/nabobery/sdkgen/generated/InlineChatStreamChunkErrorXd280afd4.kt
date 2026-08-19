package com.nabobery.sdkgen.generated

import kotlin.Int
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
 * Error information
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatStreamChunk/properties/error
 */
@Serializable(with = InlineChatStreamChunkErrorXd280afd4.Serializer::class)
public class InlineChatStreamChunkErrorXd280afd4(
  /**
   * Error code
   */
  public val code: Int,
  /**
   * Error message
   */
  public val message: String,
  /**
   * Structured error metadata
   */
  public val metadata: InlineChatStreamChunkErrorMetadataX02b86fae? = null,
) {
  public class Builder {
    private var codeValue: Int? = null

    public var code: Int
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    /**
     * Structured error metadata
     */
    public var metadata: InlineChatStreamChunkErrorMetadataX02b86fae? = null

    public fun build(): InlineChatStreamChunkErrorXd280afd4 {
      check(codeValue != null) { "code is required" }
      check(messageValue != null) { "message is required" }
      return InlineChatStreamChunkErrorXd280afd4(
        code = code,
        message = message,
        metadata = metadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineChatStreamChunkErrorXd280afd4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineChatStreamChunkErrorXd280afd4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatStreamChunkErrorXd280afd4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatStreamChunkErrorXd280afd4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineChatStreamChunkErrorXd280afd4 must be a JSON object")
      val code = json.decodeRequired<Int>(rawObject, "code")
      val message = json.decodeRequired<String>(rawObject, "message")
      return InlineChatStreamChunkErrorXd280afd4(
        code = code,
        message = message,
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineChatStreamChunkErrorMetadataX02b86fae>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatStreamChunkErrorXd280afd4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineChatStreamChunkErrorXd280afd4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        put("message", value.message)
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineChatStreamChunkErrorXd280afd4(block: InlineChatStreamChunkErrorXd280afd4.Builder.() -> Unit): InlineChatStreamChunkErrorXd280afd4 = InlineChatStreamChunkErrorXd280afd4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineChatStreamChunkErrorXd280afd4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
