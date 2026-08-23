package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
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
import kotlinx.serialization.json.put

/**
 * Basic Error
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/basic-error
 */
@Serializable(with = BasicError.Serializer::class)
public class BasicError(
  public val documentationUrl: String? = null,
  public val message: String? = null,
  public val status: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var documentationUrl: String? = null

    public var message: String? = null

    public var status: String? = null

    public var url: String? = null

    public fun build(): BasicError = BasicError(
      documentationUrl = documentationUrl,
      message = message,
      status = status,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BasicError = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BasicError> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BasicError {
      val jsonDecoder = decoder.requireJsonDecoder("BasicError")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BasicError must be a JSON object")
      return BasicError(
        documentationUrl = rawObject["documentation_url"]?.let { json.decodeFromJsonElement<String>(it) },
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BasicError) {
      val jsonEncoder = encoder.requireJsonEncoder("BasicError")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.documentationUrl?.let { put("documentation_url", it) }
        value.message?.let { put("message", it) }
        value.status?.let { put("status", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun basicError(block: BasicError.Builder.() -> Unit): BasicError = BasicError.build(block)
