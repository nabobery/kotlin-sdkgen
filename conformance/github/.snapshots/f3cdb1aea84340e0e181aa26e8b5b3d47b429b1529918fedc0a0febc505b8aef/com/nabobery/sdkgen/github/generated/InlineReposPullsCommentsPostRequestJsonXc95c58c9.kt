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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1comments/post/requestBody/content
 * /application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1comments/post/requestBody/content
 * /application~1json/schema
 */
@Serializable(with = InlineReposPullsCommentsPostRequestJsonXc95c58c9.Serializer::class)
public class InlineReposPullsCommentsPostRequestJsonXc95c58c9(
  /**
   * The text of the review comment.
   */
  public val body: String,
  /**
   * The SHA of the commit needing a comment. Not using the latest commit SHA may render your comment outdated if a
   * subsequent commit modifies the line you specify as the `position`.
   */
  public val commitId: String,
  /**
   * The relative path to the file that necessitates a comment.
   */
  public val path: String,
  /**
   * The ID of the review comment to reply to. To find the ID of a review comment with ["List review comments on a pull
   * request"](#list-review-comments-on-a-pull-request). When specified, all parameters other than `body` in the request
   * body are ignored.
   */
  public val inReplyTo: Int? = null,
  /**
   * **Required unless using `subject_type:file`**. The line of the blob in the pull request diff that the comment
   * applies to. For a multi-line comment, the last line of the range that your comment applies to.
   */
  public val line: Int? = null,
  /**
   * **This parameter is closing down. Use `line` instead**. The position in the diff where you want to add a review
   * comment. Note this value is not the same as the line number in the file. The position value equals the number of
   * lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@" line
   * is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines
   * of whitespace and additional hunks until the beginning of a new file.
   */
  public val position: Int? = null,
  /**
   * In a split diff view, the side of the diff that the pull request's changes appear on. Can be `LEFT` or `RIGHT`. Use
   * `LEFT` for deletions that appear in red. Use `RIGHT` for additions that appear in green or unchanged lines that
   * appear in white and are shown for context. For a multi-line comment, side represents whether the last line of the
   * comment range is a deletion or addition. For more information, see "[Diff view
   * options](https://docs.github.com/articles/about-comparing-branches-in-pull-requests#diff-view-options)" in the
   * GitHub Help documentation.
   */
  public val side: InlineReposPullsCommentsPostRequestJsonSideX0f7ffc73? = null,
  /**
   * **Required when using multi-line comments unless using `in_reply_to`**. The `start_line` is the first line in the
   * pull request diff that your multi-line comment applies to. To learn more about multi-line comments, see
   * "[Commenting on a pull
   * request](https://docs.github.com/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)" in
   * the GitHub Help documentation.
   */
  public val startLine: Int? = null,
  /**
   * **Required when using multi-line comments unless using `in_reply_to`**. The `start_side` is the starting side of
   * the diff that the comment applies to. Can be `LEFT` or `RIGHT`. To learn more about multi-line comments, see
   * "[Commenting on a pull
   * request](https://docs.github.com/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)" in
   * the GitHub Help documentation. See `side` in this table for additional context.
   */
  public val startSide: InlineReposPullsCommentsPostRequestJsonStartSideX76f5bc57? = null,
  /**
   * The level at which the comment is targeted.
   */
  public val subjectType: InlineReposPullsCommentsPostRequestJsonSubjectTypeXe50ad3ec? = null,
) {
  public class Builder {
    private var bodyValue: String? = null

    public var body: String
      get() = requireNotNull(bodyValue) { "body is required" }
      set(`value`) {
        bodyValue = value
      }

    private var commitIdValue: String? = null

    public var commitId: String
      get() = requireNotNull(commitIdValue) { "commitId is required" }
      set(`value`) {
        commitIdValue = value
      }

    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    /**
     * The ID of the review comment to reply to. To find the ID of a review comment with ["List review comments on a
     * pull request"](#list-review-comments-on-a-pull-request). When specified, all parameters other than `body` in the
     * request body are ignored.
     */
    public var inReplyTo: Int? = null

    /**
     * **Required unless using `subject_type:file`**. The line of the blob in the pull request diff that the comment
     * applies to. For a multi-line comment, the last line of the range that your comment applies to.
     */
    public var line: Int? = null

    /**
     * **This parameter is closing down. Use `line` instead**. The position in the diff where you want to add a review
     * comment. Note this value is not the same as the line number in the file. The position value equals the number of
     * lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@"
     * line is position 1, the next line is position 2, and so on. The position in the diff continues to increase
     * through lines of whitespace and additional hunks until the beginning of a new file.
     */
    public var position: Int? = null

    /**
     * In a split diff view, the side of the diff that the pull request's changes appear on. Can be `LEFT` or `RIGHT`.
     * Use `LEFT` for deletions that appear in red. Use `RIGHT` for additions that appear in green or unchanged lines
     * that appear in white and are shown for context. For a multi-line comment, side represents whether the last line
     * of the comment range is a deletion or addition. For more information, see "[Diff view
     * options](https://docs.github.com/articles/about-comparing-branches-in-pull-requests#diff-view-options)" in the
     * GitHub Help documentation.
     */
    public var side: InlineReposPullsCommentsPostRequestJsonSideX0f7ffc73? = null

    /**
     * **Required when using multi-line comments unless using `in_reply_to`**. The `start_line` is the first line in the
     * pull request diff that your multi-line comment applies to. To learn more about multi-line comments, see
     * "[Commenting on a pull
     * request](https://docs.github.com/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)"
     * in the GitHub Help documentation.
     */
    public var startLine: Int? = null

    /**
     * **Required when using multi-line comments unless using `in_reply_to`**. The `start_side` is the starting side of
     * the diff that the comment applies to. Can be `LEFT` or `RIGHT`. To learn more about multi-line comments, see
     * "[Commenting on a pull
     * request](https://docs.github.com/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)"
     * in the GitHub Help documentation. See `side` in this table for additional context.
     */
    public var startSide: InlineReposPullsCommentsPostRequestJsonStartSideX76f5bc57? = null

    /**
     * The level at which the comment is targeted.
     */
    public var subjectType: InlineReposPullsCommentsPostRequestJsonSubjectTypeXe50ad3ec? = null

    public fun build(): InlineReposPullsCommentsPostRequestJsonXc95c58c9 {
      check(bodyValue != null) { "body is required" }
      check(commitIdValue != null) { "commitId is required" }
      check(pathValue != null) { "path is required" }
      return InlineReposPullsCommentsPostRequestJsonXc95c58c9(
        body = body,
        commitId = commitId,
        path = path,
        inReplyTo = inReplyTo,
        line = line,
        position = position,
        side = side,
        startLine = startLine,
        startSide = startSide,
        subjectType = subjectType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPullsCommentsPostRequestJsonXc95c58c9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposPullsCommentsPostRequestJsonXc95c58c9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPullsCommentsPostRequestJsonXc95c58c9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPullsCommentsPostRequestJsonXc95c58c9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPullsCommentsPostRequestJsonXc95c58c9 must be a JSON object")
      val body = json.decodeRequired<String>(rawObject, "body")
      val commitId = json.decodeRequired<String>(rawObject, "commit_id")
      val path = json.decodeRequired<String>(rawObject, "path")
      return InlineReposPullsCommentsPostRequestJsonXc95c58c9(
        body = body,
        commitId = commitId,
        path = path,
        inReplyTo = rawObject["in_reply_to"]?.let { json.decodeFromJsonElement<Int>(it) },
        line = rawObject["line"]?.let { json.decodeFromJsonElement<Int>(it) },
        position = rawObject["position"]?.let { json.decodeFromJsonElement<Int>(it) },
        side = rawObject["side"]?.let { json.decodeFromJsonElement<InlineReposPullsCommentsPostRequestJsonSideX0f7ffc73>(it) },
        startLine = rawObject["start_line"]?.let { json.decodeFromJsonElement<Int>(it) },
        startSide = rawObject["start_side"]?.let { json.decodeFromJsonElement<InlineReposPullsCommentsPostRequestJsonStartSideX76f5bc57>(it) },
        subjectType = rawObject["subject_type"]?.let { json.decodeFromJsonElement<InlineReposPullsCommentsPostRequestJsonSubjectTypeXe50ad3ec>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsCommentsPostRequestJsonXc95c58c9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPullsCommentsPostRequestJsonXc95c58c9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("body", value.body)
        put("commit_id", value.commitId)
        put("path", value.path)
        value.inReplyTo?.let { put("in_reply_to", json.encodeToJsonElement(it)) }
        value.line?.let { put("line", json.encodeToJsonElement(it)) }
        value.position?.let { put("position", json.encodeToJsonElement(it)) }
        value.side?.let { put("side", json.encodeToJsonElement(it)) }
        value.startLine?.let { put("start_line", json.encodeToJsonElement(it)) }
        value.startSide?.let { put("start_side", json.encodeToJsonElement(it)) }
        value.subjectType?.let { put("subject_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPullsCommentsPostRequestJsonXc95c58c9(block: InlineReposPullsCommentsPostRequestJsonXc95c58c9.Builder.() -> Unit): InlineReposPullsCommentsPostRequestJsonXc95c58c9 = InlineReposPullsCommentsPostRequestJsonXc95c58c9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposPullsCommentsPostRequestJsonXc95c58c9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
