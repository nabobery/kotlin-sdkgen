package io.github.nabobery.sdkgen.github.generated

import kotlin.Double
import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Code Search Result Item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-search-result-item
 */
@Serializable(with = CodeSearchResultItem.Serializer::class)
public class CodeSearchResultItem(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val gitUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val name: String,
  public val path: String,
  public val repository: MinimalRepository,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val score: Double,
  public val sha: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val fileSize: Int? = null,
  public val language: String? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val lastModifiedAt: String? = null,
  lineNumbers: List<String>? = null,
  textMatches: List<InlineSearchResultTextMatchesItemXe380e62a>? = null,
) {
  public val lineNumbers: List<String>? = lineNumbers?.let { collection0 -> collection0.toList() }

  public val textMatches: List<InlineSearchResultTextMatchesItemXe380e62a>? =
      textMatches?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var gitUrlValue: String? = null

    public var gitUrl: String
      get() = requireNotNull(gitUrlValue) { "gitUrl is required" }
      set(`value`) {
        gitUrlValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    private var repositoryValue: MinimalRepository? = null

    public var repository: MinimalRepository
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    private var scoreValue: Double? = null

    public var score: Double
      get() = requireNotNull(scoreValue) { "score is required" }
      set(`value`) {
        scoreValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public var fileSize: Int? = null

    public var language: String? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var lastModifiedAt: String? = null

    private var lineNumbersValue: List<String>? = null

    public var lineNumbers: List<String>?
      get() = lineNumbersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        lineNumbersValue = value?.let { collection0 -> collection0.toList() }
      }

    private var textMatchesValue: List<InlineSearchResultTextMatchesItemXe380e62a>? = null

    public var textMatches: List<InlineSearchResultTextMatchesItemXe380e62a>?
      get() = textMatchesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        textMatchesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): CodeSearchResultItem {
      check(gitUrlValue != null) { "gitUrl is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(nameValue != null) { "name is required" }
      check(pathValue != null) { "path is required" }
      check(repositoryValue != null) { "repository is required" }
      check(scoreValue != null) { "score is required" }
      check(shaValue != null) { "sha is required" }
      check(urlValue != null) { "url is required" }
      return CodeSearchResultItem(
        gitUrl = gitUrl,
        htmlUrl = htmlUrl,
        name = name,
        path = path,
        repository = repository,
        score = score,
        sha = sha,
        url = url,
        fileSize = fileSize,
        language = language,
        lastModifiedAt = lastModifiedAt,
        lineNumbers = lineNumbers,
        textMatches = textMatches,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeSearchResultItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodeSearchResultItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeSearchResultItem {
      val jsonDecoder = decoder.requireJsonDecoder("CodeSearchResultItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeSearchResultItem must be a JSON object")
      val gitUrl = json.decodeRequired<String>(rawObject, "git_url")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val name = json.decodeRequired<String>(rawObject, "name")
      val path = json.decodeRequired<String>(rawObject, "path")
      val repository = json.decodeRequired<MinimalRepository>(rawObject, "repository")
      val score = json.decodeRequired<Double>(rawObject, "score")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val url = json.decodeRequired<String>(rawObject, "url")
      return CodeSearchResultItem(
        gitUrl = gitUrl,
        htmlUrl = htmlUrl,
        name = name,
        path = path,
        repository = repository,
        score = score,
        sha = sha,
        url = url,
        fileSize = rawObject["file_size"]?.let { json.decodeFromJsonElement<Int>(it) },
        language = rawObject["language"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        lastModifiedAt = rawObject["last_modified_at"]?.let { json.decodeFromJsonElement<String>(it) },
        lineNumbers = rawObject["line_numbers"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        textMatches = rawObject["text_matches"]?.let { json.decodeFromJsonElement<List<InlineSearchResultTextMatchesItemXe380e62a>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeSearchResultItem) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeSearchResultItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("git_url", value.gitUrl)
        put("html_url", value.htmlUrl)
        put("name", value.name)
        put("path", value.path)
        put("repository", json.encodeToJsonElement(value.repository))
        put("score", json.encodeToJsonElement(value.score))
        put("sha", value.sha)
        put("url", value.url)
        value.fileSize?.let { put("file_size", json.encodeToJsonElement(it)) }
        value.language?.let { put("language", it) }
        value.lastModifiedAt?.let { put("last_modified_at", it) }
        value.lineNumbers?.let { put("line_numbers", json.encodeToJsonElement(it)) }
        value.textMatches?.let { put("text_matches", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeSearchResultItem(block: CodeSearchResultItem.Builder.() -> Unit): CodeSearchResultItem = CodeSearchResultItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodeSearchResultItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
