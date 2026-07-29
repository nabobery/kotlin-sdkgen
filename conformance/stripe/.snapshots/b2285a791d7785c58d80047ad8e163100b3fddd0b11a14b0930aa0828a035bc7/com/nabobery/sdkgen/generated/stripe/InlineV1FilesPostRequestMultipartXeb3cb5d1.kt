package com.nabobery.sdkgen.generated.stripe

import com.nabobery.sdkgen.runtime.SdkByteStream
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.json#/paths/~1v1~1files/post/requestBody/content/multipart~1form-data/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1files/post/requestBody/content/multipart~1form-data/schema
 */
@Serializable(with = InlineV1FilesPostRequestMultipartXeb3cb5d1.Serializer::class)
public class InlineV1FilesPostRequestMultipartXeb3cb5d1(
  /**
   * A file to upload. Make sure that the specifications follow RFC 2388, which defines file transfers for the
   * `multipart/form-data` protocol.
   */
  public val `file`: SdkByteStream,
  /**
   * The [purpose](https://docs.stripe.com/file-upload#uploading-a-file) of the uploaded file.
   */
  public val purpose: InlineV1FilesPostRequestMultipartPurposeX06371c52,
  expand: List<String>? = null,
  /**
   * Optional parameters that automatically create a [file link](https://api.stripe.com#file_links) for the newly
   * created file.
   */
  public val fileLinkData: InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var fileValue: SdkByteStream? = null

    public var `file`: SdkByteStream
      get() = requireNotNull(fileValue) { "file is required" }
      set(`value`) {
        fileValue = value
      }

    private var purposeValue: InlineV1FilesPostRequestMultipartPurposeX06371c52? = null

    public var purpose: InlineV1FilesPostRequestMultipartPurposeX06371c52
      get() = requireNotNull(purposeValue) { "purpose is required" }
      set(`value`) {
        purposeValue = value
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Optional parameters that automatically create a [file link](https://api.stripe.com#file_links) for the newly
     * created file.
     */
    public var fileLinkData: InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9? = null

    public fun build(): InlineV1FilesPostRequestMultipartXeb3cb5d1 {
      check(fileValue != null) { "file is required" }
      check(purposeValue != null) { "purpose is required" }
      return InlineV1FilesPostRequestMultipartXeb3cb5d1(
        file = file,
        purpose = purpose,
        expand = expand,
        fileLinkData = fileLinkData,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1FilesPostRequestMultipartXeb3cb5d1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1FilesPostRequestMultipartXeb3cb5d1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1FilesPostRequestMultipartXeb3cb5d1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1FilesPostRequestMultipartXeb3cb5d1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1FilesPostRequestMultipartXeb3cb5d1 must be a JSON object")
      val file = json.decodeRequired<SdkByteStream>(rawObject, "file")
      val purpose = json.decodeRequired<InlineV1FilesPostRequestMultipartPurposeX06371c52>(rawObject, "purpose")
      return InlineV1FilesPostRequestMultipartXeb3cb5d1(
        file = file,
        purpose = purpose,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        fileLinkData = rawObject["file_link_data"]?.let { json.decodeFromJsonElement<InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1FilesPostRequestMultipartXeb3cb5d1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1FilesPostRequestMultipartXeb3cb5d1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("file", json.encodeToJsonElement(value.file))
        put("purpose", json.encodeToJsonElement(value.purpose))
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.fileLinkData?.let { put("file_link_data", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1FilesPostRequestMultipartXeb3cb5d1(block: InlineV1FilesPostRequestMultipartXeb3cb5d1.Builder.() -> Unit): InlineV1FilesPostRequestMultipartXeb3cb5d1 = InlineV1FilesPostRequestMultipartXeb3cb5d1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1FilesPostRequestMultipartXeb3cb5d1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
