package com.nabobery.sdkgen.github.generated

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
 * Low-level Git commit operations within a repository
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/git-commit
 */
@Serializable(with = GitCommit.Serializer::class)
public class GitCommit(
  /**
   * Identifying information for the git-user
   */
  public val author: InlineGitCommitAuthorX3bda232a,
  /**
   * Identifying information for the git-user
   */
  public val committer: InlineGitCommitCommitterXef5e96b3,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * Message describing the purpose of the commit
   */
  public val message: String,
  public val nodeId: String,
  parents: List<InlineGitCommitParentsItemXaab14117>,
  /**
   * SHA for the commit
   */
  public val sha: String,
  public val tree: InlineGitCommitTreeX9a0eb92f,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val verification: InlineGitCommitVerificationX5402b658,
) {
  public val parents: List<InlineGitCommitParentsItemXaab14117> = parents.toList()

  public class Builder {
    private var authorValue: InlineGitCommitAuthorX3bda232a? = null

    public var author: InlineGitCommitAuthorX3bda232a
      get() = requireNotNull(authorValue) { "author is required" }
      set(`value`) {
        authorValue = value
      }

    private var committerValue: InlineGitCommitCommitterXef5e96b3? = null

    public var committer: InlineGitCommitCommitterXef5e96b3
      get() = requireNotNull(committerValue) { "committer is required" }
      set(`value`) {
        committerValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var parentsValue: List<InlineGitCommitParentsItemXaab14117>? = null

    public var parents: List<InlineGitCommitParentsItemXaab14117>
      get() = requireNotNull(parentsValue) { "parents is required" }.toList()
      set(`value`) {
        parentsValue = value.toList()
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var treeValue: InlineGitCommitTreeX9a0eb92f? = null

    public var tree: InlineGitCommitTreeX9a0eb92f
      get() = requireNotNull(treeValue) { "tree is required" }
      set(`value`) {
        treeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var verificationValue: InlineGitCommitVerificationX5402b658? = null

    public var verification: InlineGitCommitVerificationX5402b658
      get() = requireNotNull(verificationValue) { "verification is required" }
      set(`value`) {
        verificationValue = value
      }

    public fun build(): GitCommit {
      check(authorValue != null) { "author is required" }
      check(committerValue != null) { "committer is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(messageValue != null) { "message is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(parentsValue != null) { "parents is required" }
      check(shaValue != null) { "sha is required" }
      check(treeValue != null) { "tree is required" }
      check(urlValue != null) { "url is required" }
      check(verificationValue != null) { "verification is required" }
      return GitCommit(
        author = author,
        committer = committer,
        htmlUrl = htmlUrl,
        message = message,
        nodeId = nodeId,
        parents = parents,
        sha = sha,
        tree = tree,
        url = url,
        verification = verification,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GitCommit = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GitCommit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GitCommit {
      val jsonDecoder = decoder.requireJsonDecoder("GitCommit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GitCommit must be a JSON object")
      val author = json.decodeRequired<InlineGitCommitAuthorX3bda232a>(rawObject, "author")
      val committer = json.decodeRequired<InlineGitCommitCommitterXef5e96b3>(rawObject, "committer")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val message = json.decodeRequired<String>(rawObject, "message")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val parents = json.decodeRequired<List<InlineGitCommitParentsItemXaab14117>>(rawObject, "parents")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val tree = json.decodeRequired<InlineGitCommitTreeX9a0eb92f>(rawObject, "tree")
      val url = json.decodeRequired<String>(rawObject, "url")
      val verification = json.decodeRequired<InlineGitCommitVerificationX5402b658>(rawObject, "verification")
      return GitCommit(
        author = author,
        committer = committer,
        htmlUrl = htmlUrl,
        message = message,
        nodeId = nodeId,
        parents = parents,
        sha = sha,
        tree = tree,
        url = url,
        verification = verification,
      )
    }

    override fun serialize(encoder: Encoder, `value`: GitCommit) {
      val jsonEncoder = encoder.requireJsonEncoder("GitCommit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("author", json.encodeToJsonElement(value.author))
        put("committer", json.encodeToJsonElement(value.committer))
        put("html_url", value.htmlUrl)
        put("message", value.message)
        put("node_id", value.nodeId)
        put("parents", json.encodeToJsonElement(value.parents))
        put("sha", value.sha)
        put("tree", json.encodeToJsonElement(value.tree))
        put("url", value.url)
        put("verification", json.encodeToJsonElement(value.verification))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gitCommit(block: GitCommit.Builder.() -> Unit): GitCommit = GitCommit.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GitCommit is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
