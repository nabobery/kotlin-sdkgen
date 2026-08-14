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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatBlockedDetail.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatBlockedDetail
 */
@Serializable(with = ChatBlockedDetail.Serializer::class)
public class ChatBlockedDetail(
  public val reason: String,
) {
  public class Builder {
    private var reasonValue: String? = null

    public var reason: String
      get() = requireNotNull(reasonValue) { "reason is required" }
      set(`value`) {
        reasonValue = value
      }

    public fun build(): ChatBlockedDetail {
      check(reasonValue != null) { "reason is required" }
      return ChatBlockedDetail(
        reason = reason,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatBlockedDetail = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatBlockedDetail> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatBlockedDetail {
      val jsonDecoder = decoder.requireJsonDecoder("ChatBlockedDetail")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatBlockedDetail must be a JSON object")
      val reason = json.decodeRequired<String>(rawObject, "reason")
      return ChatBlockedDetail(
        reason = reason,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatBlockedDetail) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatBlockedDetail")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("reason", value.reason)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatBlockedDetail(block: ChatBlockedDetail.Builder.() -> Unit): ChatBlockedDetail = ChatBlockedDetail.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatBlockedDetail is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
