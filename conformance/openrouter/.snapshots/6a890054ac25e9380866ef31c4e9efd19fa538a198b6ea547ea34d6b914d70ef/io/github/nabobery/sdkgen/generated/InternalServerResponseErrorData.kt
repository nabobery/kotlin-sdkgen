package io.github.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Error data for InternalServerResponse
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InternalServerResponseErrorData
 */
@Serializable(with = InternalServerResponseErrorData.Serializer::class)
public class InternalServerResponseErrorData(
  public val code: Int,
  public val message: String,
  metadata: Map<String, JsonElement?>? = null,
) {
  public val metadata: Map<String, JsonElement?>? =
      metadata?.let { collection0 -> collection0.toMap() }

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

    private var metadataValue: Map<String, JsonElement?>? = null

    public var metadata: Map<String, JsonElement?>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InternalServerResponseErrorData {
      check(codeValue != null) { "code is required" }
      check(messageValue != null) { "message is required" }
      return InternalServerResponseErrorData(
        code = code,
        message = message,
        metadata = metadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InternalServerResponseErrorData = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InternalServerResponseErrorData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InternalServerResponseErrorData {
      val jsonDecoder = decoder.requireJsonDecoder("InternalServerResponseErrorData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InternalServerResponseErrorData must be a JSON object")
      val code = json.decodeRequired<Int>(rawObject, "code")
      val message = json.decodeRequired<String>(rawObject, "message")
      return InternalServerResponseErrorData(
        code = code,
        message = message,
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, JsonElement?>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InternalServerResponseErrorData) {
      val jsonEncoder = encoder.requireJsonEncoder("InternalServerResponseErrorData")
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

public fun internalServerResponseErrorData(block: InternalServerResponseErrorData.Builder.() -> Unit): InternalServerResponseErrorData = InternalServerResponseErrorData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InternalServerResponseErrorData is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
