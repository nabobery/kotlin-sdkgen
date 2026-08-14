package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * To share the contents of a `File` object with non-Stripe users, you can
 * create a `FileLink`. `FileLink`s contain a URL that you can use to
 * retrieve the contents of the file without authentication.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/file_link
 */
@Serializable(with = FileLink.Serializer::class)
public class FileLink(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Returns if the link is already expired.
   */
  public val expired: Boolean,
  /**
   * The file object this link points to.
   */
  public val `file`: InlineFileLinkFileX6b7dc052,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  metadata: Map<String, String>,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineFileLinkObjectValueXdf658912,
  /**
   * Time that the link expires.
   */
  public val expiresAt: Int? = null,
  /**
   * The publicly accessible URL to download the file.
   */
  public val url: String? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var expiredValue: Boolean? = null

    public var expired: Boolean
      get() = requireNotNull(expiredValue) { "expired is required" }
      set(`value`) {
        expiredValue = value
      }

    private var fileValue: InlineFileLinkFileX6b7dc052? = null

    public var `file`: InlineFileLinkFileX6b7dc052
      get() = requireNotNull(fileValue) { "file is required" }
      set(`value`) {
        fileValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toMap()
      set(`value`) {
        metadataValue = value.toMap()
      }

    private var objectValueValue: InlineFileLinkObjectValueXdf658912? = null

    public var objectValue: InlineFileLinkObjectValueXdf658912
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    /**
     * Time that the link expires.
     */
    public var expiresAt: Int? = null

    /**
     * The publicly accessible URL to download the file.
     */
    public var url: String? = null

    public fun build(): FileLink {
      check(createdValue != null) { "created is required" }
      check(expiredValue != null) { "expired is required" }
      check(fileValue != null) { "file is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return FileLink(
        created = created,
        expired = expired,
        file = file,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        expiresAt = expiresAt,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FileLink = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FileLink> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FileLink {
      val jsonDecoder = decoder.requireJsonDecoder("FileLink")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FileLink must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val expired = json.decodeRequired<Boolean>(rawObject, "expired")
      val file = json.decodeRequired<InlineFileLinkFileX6b7dc052>(rawObject, "file")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlineFileLinkObjectValueXdf658912>(rawObject, "object")
      return FileLink(
        created = created,
        expired = expired,
        file = file,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        expiresAt = rawObject["expires_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        url = rawObject["url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: FileLink) {
      val jsonEncoder = encoder.requireJsonEncoder("FileLink")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("expired", json.encodeToJsonElement(value.expired))
        put("file", json.encodeToJsonElement(value.file))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fileLink(block: FileLink.Builder.() -> Unit): FileLink = FileLink.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FileLink is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
