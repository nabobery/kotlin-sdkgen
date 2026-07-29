package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A CodeQL database.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-codeql-database
 */
@Serializable(with = CodeScanningCodeqlDatabase.Serializer::class)
public class CodeScanningCodeqlDatabase(
  /**
   * The MIME type of the CodeQL database file.
   */
  public val contentType: String,
  /**
   * The date and time at which the CodeQL database was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * The ID of the CodeQL database.
   */
  public val id: Int,
  /**
   * The language of the CodeQL database.
   */
  public val language: String,
  /**
   * The name of the CodeQL database.
   */
  public val name: String,
  /**
   * The size of the CodeQL database file in bytes.
   */
  public val size: Int,
  /**
   * The date and time at which the CodeQL database was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  public val uploader: SimpleUser,
  /**
   * The URL at which to download the CodeQL database. The `Accept` header must be set to the value of the
   * `content_type` property.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  /**
   * The commit SHA of the repository at the time the CodeQL database was created.
   */
  public val commitOid: String? = null,
) {
  public class Builder {
    private var contentTypeValue: String? = null

    public var contentType: String
      get() = requireNotNull(contentTypeValue) { "contentType is required" }
      set(`value`) {
        contentTypeValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var languageValue: String? = null

    public var language: String
      get() = requireNotNull(languageValue) { "language is required" }
      set(`value`) {
        languageValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var sizeValue: Int? = null

    public var size: Int
      get() = requireNotNull(sizeValue) { "size is required" }
      set(`value`) {
        sizeValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var uploaderValue: SimpleUser? = null

    public var uploader: SimpleUser
      get() = requireNotNull(uploaderValue) { "uploader is required" }
      set(`value`) {
        uploaderValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    /**
     * The commit SHA of the repository at the time the CodeQL database was created.
     */
    public var commitOid: String? = null

    public fun build(): CodeScanningCodeqlDatabase {
      check(contentTypeValue != null) { "contentType is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(languageValue != null) { "language is required" }
      check(nameValue != null) { "name is required" }
      check(sizeValue != null) { "size is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(uploaderValue != null) { "uploader is required" }
      check(urlValue != null) { "url is required" }
      return CodeScanningCodeqlDatabase(
        contentType = contentType,
        createdAt = createdAt,
        id = id,
        language = language,
        name = name,
        size = size,
        updatedAt = updatedAt,
        uploader = uploader,
        url = url,
        commitOid = commitOid,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningCodeqlDatabase = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeScanningCodeqlDatabase> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningCodeqlDatabase {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningCodeqlDatabase")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningCodeqlDatabase must be a JSON object")
      val contentType = json.decodeRequired<String>(rawObject, "content_type")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val language = json.decodeRequired<String>(rawObject, "language")
      val name = json.decodeRequired<String>(rawObject, "name")
      val size = json.decodeRequired<Int>(rawObject, "size")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val uploader = json.decodeRequired<SimpleUser>(rawObject, "uploader")
      val url = json.decodeRequired<String>(rawObject, "url")
      return CodeScanningCodeqlDatabase(
        contentType = contentType,
        createdAt = createdAt,
        id = id,
        language = language,
        name = name,
        size = size,
        updatedAt = updatedAt,
        uploader = uploader,
        url = url,
        commitOid = rawObject["commit_oid"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningCodeqlDatabase) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningCodeqlDatabase")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content_type", value.contentType)
        put("created_at", value.createdAt)
        put("id", json.encodeToJsonElement(value.id))
        put("language", value.language)
        put("name", value.name)
        put("size", json.encodeToJsonElement(value.size))
        put("updated_at", value.updatedAt)
        put("uploader", json.encodeToJsonElement(value.uploader))
        put("url", value.url)
        value.commitOid?.let { put("commit_oid", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningCodeqlDatabase(block: CodeScanningCodeqlDatabase.Builder.() -> Unit): CodeScanningCodeqlDatabase = CodeScanningCodeqlDatabase.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodeScanningCodeqlDatabase is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
