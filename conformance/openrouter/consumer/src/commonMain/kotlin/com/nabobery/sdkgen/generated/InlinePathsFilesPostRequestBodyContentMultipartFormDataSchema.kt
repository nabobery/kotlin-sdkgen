package com.nabobery.sdkgen.generated

import com.nabobery.sdkgen.runtime.SdkByteStream
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
 * Generated model for sdkgen://source/openapi.yaml#/paths/~1files/post/requestBody/content/multipart~1form-data/schema.
 */
@Serializable(with = InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema.Serializer::class)
public class InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema(
  public val `file`: SdkByteStream,
) {
  public class Builder {
    private var fileValue: SdkByteStream? = null

    public var `file`: SdkByteStream
      get() = requireNotNull(fileValue) { "file is required" }
      set(`value`) {
        fileValue = value
      }

    public fun build(): InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema {
      check(fileValue != null) { "file is required" }
      return InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema(
        file = file,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema must be a JSON " +
          "object")
      val file = json.decodeRequired<SdkByteStream>(raw, "file")
      return InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema(
        file = file,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("file", json.encodeToJsonElement(value.file))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsFilesPostRequestBodyContentMultipartFormDataSchema(block: InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema.Builder.() -> Unit): InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema = InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
