package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Long
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls/post/requestBody/content/application~1json/schema
 * .
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposPullsPostRequestJsonXa1499a02.Serializer::class)
public class InlineReposPullsPostRequestJsonXa1499a02(
  /**
   * The name of the branch you want the changes pulled into. This should be an existing branch on the current
   * repository. You cannot submit a pull request to one repository that requests a merge to a base of another
   * repository.
   */
  public val base: String,
  /**
   * The name of the branch where your changes are implemented. For cross-repository pull requests in the same network,
   * namespace `head` with a user like this: `username:branch`.
   */
  public val head: String,
  /**
   * The contents of the pull request.
   */
  public val body: String? = null,
  /**
   * Indicates whether the pull request is a draft. See "[Draft Pull
   * Requests](https://docs.github.com/articles/about-pull-requests#draft-pull-requests)" in the GitHub Help
   * documentation to learn more.
   */
  public val draft: Boolean? = null,
  /**
   * The name of the repository where the changes in the pull request were made. This field is required for
   * cross-repository pull requests if both repositories are owned by the same organization.
   *
   * Wire format: `repo.nwo`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val headRepo: String? = null,
  /**
   * An issue in the repository to convert to a pull request. The issue title, body, and comments will become the title,
   * body, and comments on the new pull request. Required unless `title` is specified.
   */
  public val issue: Long? = null,
  /**
   * Indicates whether [maintainers can
   * modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull
   * request.
   */
  public val maintainerCanModify: Boolean? = null,
  /**
   * The title of the new pull request. Required unless `issue` is specified.
   */
  public val title: String? = null,
) {
  public class Builder {
    private var baseValue: String? = null

    public var base: String
      get() = requireNotNull(baseValue) { "base is required" }
      set(`value`) {
        baseValue = value
      }

    private var headValue: String? = null

    public var head: String
      get() = requireNotNull(headValue) { "head is required" }
      set(`value`) {
        headValue = value
      }

    /**
     * The contents of the pull request.
     */
    public var body: String? = null

    /**
     * Indicates whether the pull request is a draft. See "[Draft Pull
     * Requests](https://docs.github.com/articles/about-pull-requests#draft-pull-requests)" in the GitHub Help
     * documentation to learn more.
     */
    public var draft: Boolean? = null

    /**
     * The name of the repository where the changes in the pull request were made. This field is required for
     * cross-repository pull requests if both repositories are owned by the same organization.
     *
     * Wire format: `repo.nwo`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var headRepo: String? = null

    /**
     * An issue in the repository to convert to a pull request. The issue title, body, and comments will become the
     * title, body, and comments on the new pull request. Required unless `title` is specified.
     */
    public var issue: Long? = null

    /**
     * Indicates whether [maintainers can
     * modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull
     * request.
     */
    public var maintainerCanModify: Boolean? = null

    /**
     * The title of the new pull request. Required unless `issue` is specified.
     */
    public var title: String? = null

    public fun build(): InlineReposPullsPostRequestJsonXa1499a02 {
      check(baseValue != null) { "base is required" }
      check(headValue != null) { "head is required" }
      return InlineReposPullsPostRequestJsonXa1499a02(
        base = base,
        head = head,
        body = body,
        draft = draft,
        headRepo = headRepo,
        issue = issue,
        maintainerCanModify = maintainerCanModify,
        title = title,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPullsPostRequestJsonXa1499a02 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposPullsPostRequestJsonXa1499a02> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPullsPostRequestJsonXa1499a02 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPullsPostRequestJsonXa1499a02")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPullsPostRequestJsonXa1499a02 must be a JSON object")
      val base = json.decodeRequired<String>(rawObject, "base")
      val head = json.decodeRequired<String>(rawObject, "head")
      return InlineReposPullsPostRequestJsonXa1499a02(
        base = base,
        head = head,
        body = rawObject["body"]?.let { json.decodeFromJsonElement<String>(it) },
        draft = rawObject["draft"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        headRepo = rawObject["head_repo"]?.let { json.decodeFromJsonElement<String>(it) },
        issue = rawObject["issue"]?.let { json.decodeFromJsonElement<Long>(it) },
        maintainerCanModify = rawObject["maintainer_can_modify"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        title = rawObject["title"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsPostRequestJsonXa1499a02) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPullsPostRequestJsonXa1499a02")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("base", value.base)
        put("head", value.head)
        value.body?.let { put("body", it) }
        value.draft?.let { put("draft", json.encodeToJsonElement(it)) }
        value.headRepo?.let { put("head_repo", it) }
        value.issue?.let { put("issue", json.encodeToJsonElement(it)) }
        value.maintainerCanModify?.let { put("maintainer_can_modify", json.encodeToJsonElement(it)) }
        value.title?.let { put("title", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPullsPostRequestJsonXa1499a02(block: InlineReposPullsPostRequestJsonXa1499a02.Builder.() -> Unit): InlineReposPullsPostRequestJsonXa1499a02 = InlineReposPullsPostRequestJsonXa1499a02.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposPullsPostRequestJsonXa1499a02 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
