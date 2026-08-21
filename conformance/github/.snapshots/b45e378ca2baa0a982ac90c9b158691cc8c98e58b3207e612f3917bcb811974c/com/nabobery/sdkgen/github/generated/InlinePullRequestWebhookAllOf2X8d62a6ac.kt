package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pull-request-webhook/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-webhook/allOf/1
 */
@Serializable(with = InlinePullRequestWebhookAllOf2X8d62a6ac.Serializer::class)
public class InlinePullRequestWebhookAllOf2X8d62a6ac(
  /**
   * Whether to allow auto-merge for pull requests.
   */
  public val allowAutoMerge: Boolean? = null,
  /**
   * Whether to allow updating the pull request's branch.
   */
  public val allowUpdateBranch: Boolean? = null,
  /**
   * Whether to delete head branches when pull requests are merged.
   */
  public val deleteBranchOnMerge: Boolean? = null,
  /**
   * The default value for a merge commit message.
   * - `PR_TITLE` - default to the pull request's title.
   * - `PR_BODY` - default to the pull request's body.
   * - `BLANK` - default to a blank commit message.
   */
  public val mergeCommitMessage: InlinePullRequestWebhookAllOf2MergeCommitMessageXb67203a2? = null,
  /**
   * The default value for a merge commit title.
   * - `PR_TITLE` - default to the pull request's title.
   * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., "Merge pull request #123 from
   * branch-name").
   */
  public val mergeCommitTitle: InlinePullRequestWebhookAllOf2MergeCommitTitleX7c86a41e? = null,
  /**
   * The default value for a squash merge commit message:
   * - `PR_BODY` - default to the pull request's body.
   * - `COMMIT_MESSAGES` - default to the branch's commit messages.
   * - `BLANK` - default to a blank commit message.
   */
  public val squashMergeCommitMessage:
      InlinePullRequestWebhookAllOf2SquashMergeCommitMessageX5317a2ac? = null,
  /**
   * The default value for a squash merge commit title:
   * - `PR_TITLE` - default to the pull request's title.
   * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more
   * than one commit).
   */
  public val squashMergeCommitTitle:
      InlinePullRequestWebhookAllOf2SquashMergeCommitTitleXb2d28f88? = null,
  /**
   * Whether a squash merge commit can use the pull request title as default. **This property is closing down. Please
   * use `squash_merge_commit_title` instead.**
   */
  public val useSquashPrTitleAsDefault: Boolean? = null,
) {
  public class Builder {
    /**
     * Whether to allow auto-merge for pull requests.
     */
    public var allowAutoMerge: Boolean? = null

    /**
     * Whether to allow updating the pull request's branch.
     */
    public var allowUpdateBranch: Boolean? = null

    /**
     * Whether to delete head branches when pull requests are merged.
     */
    public var deleteBranchOnMerge: Boolean? = null

    /**
     * The default value for a merge commit message.
     * - `PR_TITLE` - default to the pull request's title.
     * - `PR_BODY` - default to the pull request's body.
     * - `BLANK` - default to a blank commit message.
     */
    public var mergeCommitMessage: InlinePullRequestWebhookAllOf2MergeCommitMessageXb67203a2? = null

    /**
     * The default value for a merge commit title.
     * - `PR_TITLE` - default to the pull request's title.
     * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., "Merge pull request #123 from
     * branch-name").
     */
    public var mergeCommitTitle: InlinePullRequestWebhookAllOf2MergeCommitTitleX7c86a41e? = null

    /**
     * The default value for a squash merge commit message:
     * - `PR_BODY` - default to the pull request's body.
     * - `COMMIT_MESSAGES` - default to the branch's commit messages.
     * - `BLANK` - default to a blank commit message.
     */
    public var squashMergeCommitMessage:
        InlinePullRequestWebhookAllOf2SquashMergeCommitMessageX5317a2ac? = null

    /**
     * The default value for a squash merge commit title:
     * - `PR_TITLE` - default to the pull request's title.
     * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when
     * more than one commit).
     */
    public var squashMergeCommitTitle:
        InlinePullRequestWebhookAllOf2SquashMergeCommitTitleXb2d28f88? = null

    /**
     * Whether a squash merge commit can use the pull request title as default. **This property is closing down. Please
     * use `squash_merge_commit_title` instead.**
     */
    public var useSquashPrTitleAsDefault: Boolean? = null

    public fun build(): InlinePullRequestWebhookAllOf2X8d62a6ac = InlinePullRequestWebhookAllOf2X8d62a6ac(
      allowAutoMerge = allowAutoMerge,
      allowUpdateBranch = allowUpdateBranch,
      deleteBranchOnMerge = deleteBranchOnMerge,
      mergeCommitMessage = mergeCommitMessage,
      mergeCommitTitle = mergeCommitTitle,
      squashMergeCommitMessage = squashMergeCommitMessage,
      squashMergeCommitTitle = squashMergeCommitTitle,
      useSquashPrTitleAsDefault = useSquashPrTitleAsDefault,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestWebhookAllOf2X8d62a6ac = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePullRequestWebhookAllOf2X8d62a6ac> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestWebhookAllOf2X8d62a6ac {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestWebhookAllOf2X8d62a6ac")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestWebhookAllOf2X8d62a6ac must be a JSON object")
      return InlinePullRequestWebhookAllOf2X8d62a6ac(
        allowAutoMerge = rawObject["allow_auto_merge"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        allowUpdateBranch = rawObject["allow_update_branch"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        deleteBranchOnMerge = rawObject["delete_branch_on_merge"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        mergeCommitMessage = rawObject["merge_commit_message"]?.let { json.decodeFromJsonElement<InlinePullRequestWebhookAllOf2MergeCommitMessageXb67203a2>(it) },
        mergeCommitTitle = rawObject["merge_commit_title"]?.let { json.decodeFromJsonElement<InlinePullRequestWebhookAllOf2MergeCommitTitleX7c86a41e>(it) },
        squashMergeCommitMessage = rawObject["squash_merge_commit_message"]?.let { json.decodeFromJsonElement<InlinePullRequestWebhookAllOf2SquashMergeCommitMessageX5317a2ac>(it) },
        squashMergeCommitTitle = rawObject["squash_merge_commit_title"]?.let { json.decodeFromJsonElement<InlinePullRequestWebhookAllOf2SquashMergeCommitTitleXb2d28f88>(it) },
        useSquashPrTitleAsDefault = rawObject["use_squash_pr_title_as_default"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestWebhookAllOf2X8d62a6ac) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestWebhookAllOf2X8d62a6ac")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowAutoMerge?.let { put("allow_auto_merge", json.encodeToJsonElement(it)) }
        value.allowUpdateBranch?.let { put("allow_update_branch", json.encodeToJsonElement(it)) }
        value.deleteBranchOnMerge?.let { put("delete_branch_on_merge", json.encodeToJsonElement(it)) }
        value.mergeCommitMessage?.let { put("merge_commit_message", json.encodeToJsonElement(it)) }
        value.mergeCommitTitle?.let { put("merge_commit_title", json.encodeToJsonElement(it)) }
        value.squashMergeCommitMessage?.let { put("squash_merge_commit_message", json.encodeToJsonElement(it)) }
        value.squashMergeCommitTitle?.let { put("squash_merge_commit_title", json.encodeToJsonElement(it)) }
        value.useSquashPrTitleAsDefault?.let { put("use_squash_pr_title_as_default", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePullRequestWebhookAllOf2X8d62a6ac(block: InlinePullRequestWebhookAllOf2X8d62a6ac.Builder.() -> Unit): InlinePullRequestWebhookAllOf2X8d62a6ac = InlinePullRequestWebhookAllOf2X8d62a6ac.build(block)
