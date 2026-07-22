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
 * Represents a 'wiki_commit' secret scanning location type. This location type shows that a secret was detected inside
 * a commit to a repository wiki.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-location-wiki-commit
 */
@Serializable(with = SecretScanningLocationWikiCommit.Serializer::class)
public class SecretScanningLocationWikiCommit(
  /**
   * SHA-1 hash ID of the associated blob
   */
  public val blobSha: String,
  /**
   * SHA-1 hash ID of the associated commit
   */
  public val commitSha: String,
  /**
   * The GitHub URL to get the associated wiki commit
   */
  public val commitUrl: String,
  /**
   * The column at which the secret ends within the end line when the file is interpreted as 8-bit ASCII.
   */
  public val endColumn: Double,
  /**
   * Line number at which the secret ends in the file
   */
  public val endLine: Double,
  /**
   * The GitHub URL to get the associated wiki page
   */
  public val pageUrl: String,
  /**
   * The file path of the wiki page
   */
  public val path: String,
  /**
   * The column at which the secret starts within the start line when the file is interpreted as 8-bit ASCII.
   */
  public val startColumn: Double,
  /**
   * Line number at which the secret starts in the file
   */
  public val startLine: Double,
) {
  public class Builder {
    private var blobShaValue: String? = null

    public var blobSha: String
      get() = requireNotNull(blobShaValue) { "blobSha is required" }
      set(`value`) {
        blobShaValue = value
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

    private var pageUrlValue: String? = null

    public var pageUrl: String
      get() = requireNotNull(pageUrlValue) { "pageUrl is required" }
      set(`value`) {
        pageUrlValue = value
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

    public fun build(): SecretScanningLocationWikiCommit {
      check(blobShaValue != null) { "blobSha is required" }
      check(commitShaValue != null) { "commitSha is required" }
      check(commitUrlValue != null) { "commitUrl is required" }
      check(endColumnValue != null) { "endColumn is required" }
      check(endLineValue != null) { "endLine is required" }
      check(pageUrlValue != null) { "pageUrl is required" }
      check(pathValue != null) { "path is required" }
      check(startColumnValue != null) { "startColumn is required" }
      check(startLineValue != null) { "startLine is required" }
      return SecretScanningLocationWikiCommit(
        blobSha = blobSha,
        commitSha = commitSha,
        commitUrl = commitUrl,
        endColumn = endColumn,
        endLine = endLine,
        pageUrl = pageUrl,
        path = path,
        startColumn = startColumn,
        startLine = startLine,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningLocationWikiCommit = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SecretScanningLocationWikiCommit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningLocationWikiCommit {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningLocationWikiCommit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningLocationWikiCommit must be a JSON object")
      val blobSha = json.decodeRequired<String>(rawObject, "blob_sha")
      val commitSha = json.decodeRequired<String>(rawObject, "commit_sha")
      val commitUrl = json.decodeRequired<String>(rawObject, "commit_url")
      val endColumn = json.decodeRequired<Double>(rawObject, "end_column")
      val endLine = json.decodeRequired<Double>(rawObject, "end_line")
      val pageUrl = json.decodeRequired<String>(rawObject, "page_url")
      val path = json.decodeRequired<String>(rawObject, "path")
      val startColumn = json.decodeRequired<Double>(rawObject, "start_column")
      val startLine = json.decodeRequired<Double>(rawObject, "start_line")
      return SecretScanningLocationWikiCommit(
        blobSha = blobSha,
        commitSha = commitSha,
        commitUrl = commitUrl,
        endColumn = endColumn,
        endLine = endLine,
        pageUrl = pageUrl,
        path = path,
        startColumn = startColumn,
        startLine = startLine,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningLocationWikiCommit) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningLocationWikiCommit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("blob_sha", value.blobSha)
        put("commit_sha", value.commitSha)
        put("commit_url", value.commitUrl)
        put("end_column", json.encodeToJsonElement(value.endColumn))
        put("end_line", json.encodeToJsonElement(value.endLine))
        put("page_url", value.pageUrl)
        put("path", value.path)
        put("start_column", json.encodeToJsonElement(value.startColumn))
        put("start_line", json.encodeToJsonElement(value.startLine))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningLocationWikiCommit(block: SecretScanningLocationWikiCommit.Builder.() -> Unit): SecretScanningLocationWikiCommit = SecretScanningLocationWikiCommit.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SecretScanningLocationWikiCommit is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
