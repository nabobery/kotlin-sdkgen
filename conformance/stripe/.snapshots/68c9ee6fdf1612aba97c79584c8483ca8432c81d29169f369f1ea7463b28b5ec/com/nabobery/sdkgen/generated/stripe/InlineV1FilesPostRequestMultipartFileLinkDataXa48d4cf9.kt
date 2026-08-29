package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Optional parameters that automatically create a [file link](https://api.stripe.com#file_links) for the newly created
 * file.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1files/post/requestBody/content/multipart~1form-data/schema/properties/file_
 * link_data
 */
@Serializable(with = InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9.Serializer::class)
public class InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9(
  public val create: Boolean,
  public val expiresAt: Int? = null,
  public val metadata: InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6? = null,
) {
  public class Builder {
    private var createValue: Boolean? = null

    public var create: Boolean
      get() = requireNotNull(createValue) { "create is required" }
      set(`value`) {
        createValue = value
      }

    public var expiresAt: Int? = null

    public var metadata: InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6? = null

    public fun build(): InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9 {
      check(createValue != null) { "create is required" }
      return InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9(
        create = create,
        expiresAt = expiresAt,
        metadata = metadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9 must be a JSON object")
      val create = json.decodeRequired<Boolean>(rawObject, "create")
      return InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9(
        create = create,
        expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<Int>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("create", json.encodeToJsonElement(value.create))
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9(block: InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9.Builder.() -> Unit): InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9 = InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1FilesPostRequestMultipartFileLinkDataXa48d4cf9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
