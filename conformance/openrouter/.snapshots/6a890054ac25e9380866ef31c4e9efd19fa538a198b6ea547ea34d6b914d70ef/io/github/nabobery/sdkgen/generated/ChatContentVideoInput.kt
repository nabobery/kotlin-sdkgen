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
 * Video input object
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatContentVideoInput
 */
@Serializable(with = ChatContentVideoInput.Serializer::class)
public class ChatContentVideoInput(
  /**
   * URL of the video (data: URLs supported)
   */
  public val url: String,
) {
  public class Builder {
    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): ChatContentVideoInput {
      check(urlValue != null) { "url is required" }
      return ChatContentVideoInput(
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatContentVideoInput = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatContentVideoInput> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatContentVideoInput {
      val jsonDecoder = decoder.requireJsonDecoder("ChatContentVideoInput")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatContentVideoInput must be a JSON object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return ChatContentVideoInput(
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatContentVideoInput) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatContentVideoInput")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatContentVideoInput(block: ChatContentVideoInput.Builder.() -> Unit): ChatContentVideoInput = ChatContentVideoInput.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatContentVideoInput is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
