package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1files/post/requestBody/content/multipart~1form-data/schema
 */
@Serializable(with = InlineFilesPostRequestMultipartX7e99eef0.Serializer::class)
public class InlineFilesPostRequestMultipartX7e99eef0(
  public val `file`: SdkByteStream,
) {
  public class Builder {
    private var fileValue: SdkByteStream? = null

    public var `file`: SdkByteStream
      get() = requireNotNull(fileValue) { "file is required" }
      set(`value`) {
        fileValue = value
      }

    public fun build(): InlineFilesPostRequestMultipartX7e99eef0 {
      check(fileValue != null) { "file is required" }
      return InlineFilesPostRequestMultipartX7e99eef0(
        file = file,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFilesPostRequestMultipartX7e99eef0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFilesPostRequestMultipartX7e99eef0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFilesPostRequestMultipartX7e99eef0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFilesPostRequestMultipartX7e99eef0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFilesPostRequestMultipartX7e99eef0 must be a JSON object")
      val file = json.decodeRequired<SdkByteStream>(rawObject, "file")
      return InlineFilesPostRequestMultipartX7e99eef0(
        file = file,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFilesPostRequestMultipartX7e99eef0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFilesPostRequestMultipartX7e99eef0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("file", json.encodeToJsonElement(value.file))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFilesPostRequestMultipartX7e99eef0(block: InlineFilesPostRequestMultipartX7e99eef0.Builder.() -> Unit): InlineFilesPostRequestMultipartX7e99eef0 = InlineFilesPostRequestMultipartX7e99eef0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineFilesPostRequestMultipartX7e99eef0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
