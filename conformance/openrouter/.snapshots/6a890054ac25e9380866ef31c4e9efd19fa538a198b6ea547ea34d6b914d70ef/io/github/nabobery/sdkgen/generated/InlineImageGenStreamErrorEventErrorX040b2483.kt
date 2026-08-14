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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Provider error details
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenStreamErrorEvent/properties/error
 */
@Serializable(with = InlineImageGenStreamErrorEventErrorX040b2483.Serializer::class)
public class InlineImageGenStreamErrorEventErrorX040b2483(
  /**
   * Provider error message
   */
  public val message: String,
  /**
   * Provider error code, when supplied
   */
  public val code: String? = null,
  /**
   * Request parameter associated with the error, when supplied
   */
  public val `param`: String? = null,
  /**
   * Provider error type, when supplied
   */
  public val type: String? = null,
) {
  public class Builder {
    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    /**
     * Provider error code, when supplied
     */
    public var code: String? = null

    /**
     * Request parameter associated with the error, when supplied
     */
    public var `param`: String? = null

    /**
     * Provider error type, when supplied
     */
    public var type: String? = null

    public fun build(): InlineImageGenStreamErrorEventErrorX040b2483 {
      check(messageValue != null) { "message is required" }
      return InlineImageGenStreamErrorEventErrorX040b2483(
        message = message,
        code = code,
        param = param,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineImageGenStreamErrorEventErrorX040b2483 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineImageGenStreamErrorEventErrorX040b2483> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineImageGenStreamErrorEventErrorX040b2483 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineImageGenStreamErrorEventErrorX040b2483")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineImageGenStreamErrorEventErrorX040b2483 must be a JSON object")
      val message = json.decodeRequired<String>(rawObject, "message")
      return InlineImageGenStreamErrorEventErrorX040b2483(
        message = message,
        code = rawObject["code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        param = rawObject["param"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        type = rawObject["type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineImageGenStreamErrorEventErrorX040b2483) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineImageGenStreamErrorEventErrorX040b2483")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("message", value.message)
        value.code?.let { put("code", it) }
        value.param?.let { put("param", it) }
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineImageGenStreamErrorEventErrorX040b2483(block: InlineImageGenStreamErrorEventErrorX040b2483.Builder.() -> Unit): InlineImageGenStreamErrorEventErrorX040b2483 = InlineImageGenStreamErrorEventErrorX040b2483.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineImageGenStreamErrorEventErrorX040b2483 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
