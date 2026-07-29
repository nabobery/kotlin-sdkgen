package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class FileView(
  public val created: Int,
  @SerialName("expires_at")
  public val expiresAt: Int? = null,
  public val filename: String? = null,
  public val id: String,
  public val links: InlineFileLinksXa77d205a? = null,
  @SerialName("object")
  public val objectValue: InlineFileObjectValueX810b8265,
  public val purpose: InlineFilePurposeX13abeddc,
  public val size: Int,
  public val title: String? = null,
  public val type: String? = null,
  public val url: String? = null,
)

/**
 * This object represents files hosted on Stripe's servers. You can upload
 * files with the [create file](https://api.stripe.com#create_file) request
 * (for example, when uploading dispute evidence). Stripe also
 * creates files independently (for example, the results of a [Sigma scheduled
 * query](#scheduled_queries)).
 *
 * Related guide: [File upload guide](https://docs.stripe.com/file-upload)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/file
 */
@Serializable(with = File.Serializer::class)
public class File(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineFileObjectValueX810b8265,
  /**
   * The [purpose](https://docs.stripe.com/file-upload#uploading-a-file) of the uploaded file.
   */
  public val purpose: InlineFilePurposeX13abeddc,
  /**
   * The size of the file object in bytes.
   */
  public val size: Int,
  /**
   * The file expires and isn't available at this time in epoch seconds.
   */
  public val expiresAt: Int? = null,
  /**
   * The suitable name for saving the file to a filesystem.
   */
  public val filename: String? = null,
  /**
   * A list of [file links](https://api.stripe.com#file_links) that point at this file.
   */
  public val links: InlineFileLinksXa77d205a? = null,
  /**
   * A suitable title for the document.
   */
  public val title: String? = null,
  /**
   * The returned file type (for example, `csv`, `pdf`, `jpg`, or `png`).
   */
  public val type: String? = null,
  /**
   * Use your live secret API key to download the file from this URL.
   */
  public val url: String? = null,
) {
  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var objectValueValue: InlineFileObjectValueX810b8265? = null

    public var objectValue: InlineFileObjectValueX810b8265
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var purposeValue: InlineFilePurposeX13abeddc? = null

    public var purpose: InlineFilePurposeX13abeddc
      get() = requireNotNull(purposeValue) { "purpose is required" }
      set(`value`) {
        purposeValue = value
      }

    private var sizeValue: Int? = null

    public var size: Int
      get() = requireNotNull(sizeValue) { "size is required" }
      set(`value`) {
        sizeValue = value
      }

    /**
     * The file expires and isn't available at this time in epoch seconds.
     */
    public var expiresAt: Int? = null

    /**
     * The suitable name for saving the file to a filesystem.
     */
    public var filename: String? = null

    /**
     * A list of [file links](https://api.stripe.com#file_links) that point at this file.
     */
    public var links: InlineFileLinksXa77d205a? = null

    /**
     * A suitable title for the document.
     */
    public var title: String? = null

    /**
     * The returned file type (for example, `csv`, `pdf`, `jpg`, or `png`).
     */
    public var type: String? = null

    /**
     * Use your live secret API key to download the file from this URL.
     */
    public var url: String? = null

    public fun build(): File {
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(purposeValue != null) { "purpose is required" }
      check(sizeValue != null) { "size is required" }
      return File(
        created = created,
        id = id,
        objectValue = objectValue,
        purpose = purpose,
        size = size,
        expiresAt = expiresAt,
        filename = filename,
        links = links,
        title = title,
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): File = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<File> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): File {
      val jsonDecoder = decoder.requireJsonDecoder("File")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("File must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlineFileObjectValueX810b8265>(rawObject, "object")
      val purpose = json.decodeRequired<InlineFilePurposeX13abeddc>(rawObject, "purpose")
      val size = json.decodeRequired<Int>(rawObject, "size")
      return File(
        created = created,
        id = id,
        objectValue = objectValue,
        purpose = purpose,
        size = size,
        expiresAt = rawObject["expires_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        filename = rawObject["filename"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        links = rawObject["links"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineFileLinksXa77d205a?>(element) },
        title = rawObject["title"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        type = rawObject["type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        url = rawObject["url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: File) {
      val jsonEncoder = encoder.requireJsonEncoder("File")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("purpose", json.encodeToJsonElement(value.purpose))
        put("size", json.encodeToJsonElement(value.size))
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.filename?.let { put("filename", it) }
        value.links?.let { put("links", json.encodeToJsonElement(it)) }
        value.title?.let { put("title", it) }
        value.type?.let { put("type", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun `file`(block: File.Builder.() -> Unit): File = File.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("File is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
