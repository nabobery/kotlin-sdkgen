package com.nabobery.sdkgen.github.generated

import kotlin.Double
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
 * Represents a 'commit' secret scanning location type. This location type shows that a secret was detected inside a
 * commit to a repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-location-commit
 */
@Serializable(with = SecretScanningLocationCommit.Serializer::class)
public class SecretScanningLocationCommit(
  /**
   * SHA-1 hash ID of the associated blob
   */
  public val blobSha: String,
  /**
   * The API URL to get the associated blob resource
   */
  public val blobUrl: String,
  /**
   * SHA-1 hash ID of the associated commit
   */
  public val commitSha: String,
  /**
   * The API URL to get the associated commit resource
   */
  public val commitUrl: String,
  /**
   * The column at which the secret ends within the end line when the file is interpreted as 8BIT ASCII
   */
  public val endColumn: Double,
  /**
   * Line number at which the secret ends in the file
   */
  public val endLine: Double,
  /**
   * The file path in the repository
   */
  public val path: String,
  /**
   * The column at which the secret starts within the start line when the file is interpreted as 8BIT ASCII
   */
  public val startColumn: Double,
  /**
   * Line number at which the secret starts in the file
   */
  public val startLine: Double,
  /**
   * The GitHub URL to get the associated commit resource.
   */
  public val htmlUrl: String? = null,
) {
  public class Builder {
    private var blobShaValue: String? = null

    public var blobSha: String
      get() = requireNotNull(blobShaValue) { "blobSha is required" }
      set(`value`) {
        blobShaValue = value
      }

    private var blobUrlValue: String? = null

    public var blobUrl: String
      get() = requireNotNull(blobUrlValue) { "blobUrl is required" }
      set(`value`) {
        blobUrlValue = value
      }

    private var commitShaValue: String? = null

    public var commitSha: String
      get() = requireNotNull(commitShaValue) { "commitSha is required" }
      set(`value`) {
        commitShaValue = value
      }

    private var commitUrlValue: String? = null

    public var commitUrl: String
      get() = requireNotNull(commitUrlValue) { "commitUrl is required" }
      set(`value`) {
        commitUrlValue = value
      }

    private var endColumnValue: Double? = null

    public var endColumn: Double
      get() = requireNotNull(endColumnValue) { "endColumn is required" }
      set(`value`) {
        endColumnValue = value
      }

    private var endLineValue: Double? = null

    public var endLine: Double
      get() = requireNotNull(endLineValue) { "endLine is required" }
      set(`value`) {
        endLineValue = value
      }

    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    private var startColumnValue: Double? = null

    public var startColumn: Double
      get() = requireNotNull(startColumnValue) { "startColumn is required" }
      set(`value`) {
        startColumnValue = value
      }

    private var startLineValue: Double? = null

    public var startLine: Double
      get() = requireNotNull(startLineValue) { "startLine is required" }
      set(`value`) {
        startLineValue = value
      }

    /**
     * The GitHub URL to get the associated commit resource.
     */
    public var htmlUrl: String? = null

    public fun build(): SecretScanningLocationCommit {
      check(blobShaValue != null) { "blobSha is required" }
      check(blobUrlValue != null) { "blobUrl is required" }
      check(commitShaValue != null) { "commitSha is required" }
      check(commitUrlValue != null) { "commitUrl is required" }
      check(endColumnValue != null) { "endColumn is required" }
      check(endLineValue != null) { "endLine is required" }
      check(pathValue != null) { "path is required" }
      check(startColumnValue != null) { "startColumn is required" }
      check(startLineValue != null) { "startLine is required" }
      return SecretScanningLocationCommit(
        blobSha = blobSha,
        blobUrl = blobUrl,
        commitSha = commitSha,
        commitUrl = commitUrl,
        endColumn = endColumn,
        endLine = endLine,
        path = path,
        startColumn = startColumn,
        startLine = startLine,
        htmlUrl = htmlUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningLocationCommit = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SecretScanningLocationCommit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningLocationCommit {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningLocationCommit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningLocationCommit must be a JSON object")
      val blobSha = json.decodeRequired<String>(rawObject, "blob_sha")
      val blobUrl = json.decodeRequired<String>(rawObject, "blob_url")
      val commitSha = json.decodeRequired<String>(rawObject, "commit_sha")
      val commitUrl = json.decodeRequired<String>(rawObject, "commit_url")
      val endColumn = json.decodeRequired<Double>(rawObject, "end_column")
      val endLine = json.decodeRequired<Double>(rawObject, "end_line")
      val path = json.decodeRequired<String>(rawObject, "path")
      val startColumn = json.decodeRequired<Double>(rawObject, "start_column")
      val startLine = json.decodeRequired<Double>(rawObject, "start_line")
      return SecretScanningLocationCommit(
        blobSha = blobSha,
        blobUrl = blobUrl,
        commitSha = commitSha,
        commitUrl = commitUrl,
        endColumn = endColumn,
        endLine = endLine,
        path = path,
        startColumn = startColumn,
        startLine = startLine,
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningLocationCommit) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningLocationCommit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("blob_sha", value.blobSha)
        put("blob_url", value.blobUrl)
        put("commit_sha", value.commitSha)
        put("commit_url", value.commitUrl)
        put("end_column", json.encodeToJsonElement(value.endColumn))
        put("end_line", json.encodeToJsonElement(value.endLine))
        put("path", value.path)
        put("start_column", json.encodeToJsonElement(value.startColumn))
        put("start_line", json.encodeToJsonElement(value.startLine))
        value.htmlUrl?.let { put("html_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningLocationCommit(block: SecretScanningLocationCommit.Builder.() -> Unit): SecretScanningLocationCommit = SecretScanningLocationCommit.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SecretScanningLocationCommit is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
