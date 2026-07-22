package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Gist Simple
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/gist-simple
 */
@Serializable(with = GistSimple.Serializer::class)
public class GistSimple(
  public val comments: Int? = null,
  public val commentsEnabled: Boolean? = null,
  public val commentsUrl: String? = null,
  public val commitsUrl: String? = null,
  public val createdAt: String? = null,
  public val description: String? = null,
  public val files: Map<String, InlineGistSimpleFilesAdditionalValueX30d0d80a?>? = null,
  /**
   * Gist
   */
  public val forkOf: InlineGistSimpleForkOfXa36bf454? = null,
  public val forks: List<InlineGistSimpleForksItemXe5a796ed>? = null,
  public val forksUrl: String? = null,
  public val gitPullUrl: String? = null,
  public val gitPushUrl: String? = null,
  public val history: List<GistHistory>? = null,
  public val htmlUrl: String? = null,
  public val id: String? = null,
  public val nodeId: String? = null,
  public val owner: SimpleUser? = null,
  public val `public`: Boolean? = null,
  public val truncated: Boolean? = null,
  public val updatedAt: String? = null,
  public val url: String? = null,
  public val user: String? = null,
) {
  public class Builder {
    public var comments: Int? = null

    public var commentsEnabled: Boolean? = null

    public var commentsUrl: String? = null

    public var commitsUrl: String? = null

    public var createdAt: String? = null

    public var description: String? = null

    public var files: Map<String, InlineGistSimpleFilesAdditionalValueX30d0d80a?>? = null

    /**
     * Gist
     */
    public var forkOf: InlineGistSimpleForkOfXa36bf454? = null

    public var forks: List<InlineGistSimpleForksItemXe5a796ed>? = null

    public var forksUrl: String? = null

    public var gitPullUrl: String? = null

    public var gitPushUrl: String? = null

    public var history: List<GistHistory>? = null

    public var htmlUrl: String? = null

    public var id: String? = null

    public var nodeId: String? = null

    public var owner: SimpleUser? = null

    public var `public`: Boolean? = null

    public var truncated: Boolean? = null

    public var updatedAt: String? = null

    public var url: String? = null

    public var user: String? = null

    public fun build(): GistSimple = GistSimple(
      comments = comments,
      commentsEnabled = commentsEnabled,
      commentsUrl = commentsUrl,
      commitsUrl = commitsUrl,
      createdAt = createdAt,
      description = description,
      files = files,
      forkOf = forkOf,
      forks = forks,
      forksUrl = forksUrl,
      gitPullUrl = gitPullUrl,
      gitPushUrl = gitPushUrl,
      history = history,
      htmlUrl = htmlUrl,
      id = id,
      nodeId = nodeId,
      owner = owner,
      public = public,
      truncated = truncated,
      updatedAt = updatedAt,
      url = url,
      user = user,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GistSimple = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<GistSimple> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GistSimple {
      val jsonDecoder = decoder.requireJsonDecoder("GistSimple")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GistSimple must be a JSON object")
      return GistSimple(
        comments = rawObject["comments"]?.let { json.decodeFromJsonElement<Int>(it) },
        commentsEnabled = rawObject["comments_enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        commentsUrl = rawObject["comments_url"]?.let { json.decodeFromJsonElement<String>(it) },
        commitsUrl = rawObject["commits_url"]?.let { json.decodeFromJsonElement<String>(it) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        files = rawObject["files"]?.let { json.decodeFromJsonElement<Map<String, InlineGistSimpleFilesAdditionalValueX30d0d80a?>>(it) },
        forkOf = rawObject["fork_of"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGistSimpleForkOfXa36bf454?>(element) },
        forks = rawObject["forks"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineGistSimpleForksItemXe5a796ed>?>(element) },
        forksUrl = rawObject["forks_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gitPullUrl = rawObject["git_pull_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gitPushUrl = rawObject["git_push_url"]?.let { json.decodeFromJsonElement<String>(it) },
        history = rawObject["history"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<GistHistory>?>(element) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
        public = rawObject["public"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        truncated = rawObject["truncated"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        user = rawObject["user"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GistSimple) {
      val jsonEncoder = encoder.requireJsonEncoder("GistSimple")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.comments?.let { put("comments", json.encodeToJsonElement(it)) }
        value.commentsEnabled?.let { put("comments_enabled", json.encodeToJsonElement(it)) }
        value.commentsUrl?.let { put("comments_url", it) }
        value.commitsUrl?.let { put("commits_url", it) }
        value.createdAt?.let { put("created_at", it) }
        value.description?.let { put("description", it) }
        value.files?.let { put("files", json.encodeToJsonElement(it)) }
        value.forkOf?.let { put("fork_of", json.encodeToJsonElement(it)) }
        value.forks?.let { put("forks", json.encodeToJsonElement(it)) }
        value.forksUrl?.let { put("forks_url", it) }
        value.gitPullUrl?.let { put("git_pull_url", it) }
        value.gitPushUrl?.let { put("git_push_url", it) }
        value.history?.let { put("history", json.encodeToJsonElement(it)) }
        value.htmlUrl?.let { put("html_url", it) }
        value.id?.let { put("id", it) }
        value.nodeId?.let { put("node_id", it) }
        value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
        value.public?.let { put("public", json.encodeToJsonElement(it)) }
        value.truncated?.let { put("truncated", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
        value.url?.let { put("url", it) }
        value.user?.let { put("user", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gistSimple(block: GistSimple.Builder.() -> Unit): GistSimple = GistSimple.build(block)
