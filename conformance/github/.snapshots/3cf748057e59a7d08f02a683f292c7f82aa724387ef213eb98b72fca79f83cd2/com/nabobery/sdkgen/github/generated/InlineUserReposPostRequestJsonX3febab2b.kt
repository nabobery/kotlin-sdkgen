package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * sdkgen://source/openapi.yaml#/paths/~1user~1repos/post/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1user~1repos/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineUserReposPostRequestJsonX3febab2b.Serializer::class)
public class InlineUserReposPostRequestJsonX3febab2b(
  /**
   * The name of the repository.
   */
  public val name: String,
  /**
   * Whether to allow Auto-merge to be used on pull requests.
   */
  public val allowAutoMerge: Boolean? = null,
  /**
   * Whether to allow merge commits for pull requests.
   */
  public val allowMergeCommit: Boolean? = null,
  /**
   * Whether to allow rebase merges for pull requests.
   */
  public val allowRebaseMerge: Boolean? = null,
  /**
   * Whether to allow squash merges for pull requests.
   */
  public val allowSquashMerge: Boolean? = null,
  /**
   * Whether the repository is initialized with a minimal README.
   */
  public val autoInit: Boolean? = null,
  /**
   * Whether to delete head branches when pull requests are merged
   */
  public val deleteBranchOnMerge: Boolean? = null,
  /**
   * A short description of the repository.
   */
  public val description: String? = null,
  /**
   * The desired language or platform to apply to the .gitignore.
   */
  public val gitignoreTemplate: String? = null,
  /**
   * Whether discussions are enabled.
   */
  public val hasDiscussions: Boolean? = null,
  /**
   * Whether downloads are enabled.
   */
  public val hasDownloads: Boolean? = null,
  /**
   * Whether issues are enabled.
   */
  public val hasIssues: Boolean? = null,
  /**
   * Whether projects are enabled.
   */
  public val hasProjects: Boolean? = null,
  /**
   * Whether the wiki is enabled.
   */
  public val hasWiki: Boolean? = null,
  /**
   * A URL with more information about the repository.
   */
  public val homepage: String? = null,
  /**
   * Whether this repository acts as a template that can be used to generate new repositories.
   */
  public val isTemplate: Boolean? = null,
  /**
   * The license keyword of the open source license for this repository.
   */
  public val licenseTemplate: String? = null,
  /**
   * The default value for a merge commit message.
   *
   * - `PR_TITLE` - default to the pull request's title.
   * - `PR_BODY` - default to the pull request's body.
   * - `BLANK` - default to a blank commit message.
   */
  public val mergeCommitMessage: InlineUserReposPostRequestJsonMergeCommitMessageX0c0cfebd? = null,
  /**
   * Required when using `merge_commit_message`.
   *
   * The default value for a merge commit title.
   *
   * - `PR_TITLE` - default to the pull request's title.
   * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from
   * branch-name).
   */
  public val mergeCommitTitle: InlineUserReposPostRequestJsonMergeCommitTitleXc266eebf? = null,
  /**
   * Whether the repository is private.
   */
  public val `private`: Boolean? = null,
  /**
   * The default value for a squash merge commit message:
   *
   * - `PR_BODY` - default to the pull request's body.
   * - `COMMIT_MESSAGES` - default to the branch's commit messages.
   * - `BLANK` - default to a blank commit message.
   */
  public val squashMergeCommitMessage:
      InlineUserReposPostRequestJsonSquashMergeCommitMessageXcdc7ea1a? = null,
  /**
   * Required when using `squash_merge_commit_message`.
   *
   * The default value for a squash merge commit title:
   *
   * - `PR_TITLE` - default to the pull request's title.
   * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more
   * than one commit).
   */
  public val squashMergeCommitTitle:
      InlineUserReposPostRequestJsonSquashMergeCommitTitleXb0d25741? = null,
  /**
   * The id of the team that will be granted access to this repository. This is only valid when creating a repository in
   * an organization.
   */
  public val teamId: Int? = null,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * Whether to allow Auto-merge to be used on pull requests.
     */
    public var allowAutoMerge: Boolean? = null

    /**
     * Whether to allow merge commits for pull requests.
     */
    public var allowMergeCommit: Boolean? = null

    /**
     * Whether to allow rebase merges for pull requests.
     */
    public var allowRebaseMerge: Boolean? = null

    /**
     * Whether to allow squash merges for pull requests.
     */
    public var allowSquashMerge: Boolean? = null

    /**
     * Whether the repository is initialized with a minimal README.
     */
    public var autoInit: Boolean? = null

    /**
     * Whether to delete head branches when pull requests are merged
     */
    public var deleteBranchOnMerge: Boolean? = null

    /**
     * A short description of the repository.
     */
    public var description: String? = null

    /**
     * The desired language or platform to apply to the .gitignore.
     */
    public var gitignoreTemplate: String? = null

    /**
     * Whether discussions are enabled.
     */
    public var hasDiscussions: Boolean? = null

    /**
     * Whether downloads are enabled.
     */
    public var hasDownloads: Boolean? = null

    /**
     * Whether issues are enabled.
     */
    public var hasIssues: Boolean? = null

    /**
     * Whether projects are enabled.
     */
    public var hasProjects: Boolean? = null

    /**
     * Whether the wiki is enabled.
     */
    public var hasWiki: Boolean? = null

    /**
     * A URL with more information about the repository.
     */
    public var homepage: String? = null

    /**
     * Whether this repository acts as a template that can be used to generate new repositories.
     */
    public var isTemplate: Boolean? = null

    /**
     * The license keyword of the open source license for this repository.
     */
    public var licenseTemplate: String? = null

    /**
     * The default value for a merge commit message.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `PR_BODY` - default to the pull request's body.
     * - `BLANK` - default to a blank commit message.
     */
    public var mergeCommitMessage: InlineUserReposPostRequestJsonMergeCommitMessageX0c0cfebd? = null

    /**
     * Required when using `merge_commit_message`.
     *
     * The default value for a merge commit title.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from
     * branch-name).
     */
    public var mergeCommitTitle: InlineUserReposPostRequestJsonMergeCommitTitleXc266eebf? = null

    /**
     * Whether the repository is private.
     */
    public var `private`: Boolean? = null

    /**
     * The default value for a squash merge commit message:
     *
     * - `PR_BODY` - default to the pull request's body.
     * - `COMMIT_MESSAGES` - default to the branch's commit messages.
     * - `BLANK` - default to a blank commit message.
     */
    public var squashMergeCommitMessage:
        InlineUserReposPostRequestJsonSquashMergeCommitMessageXcdc7ea1a? = null

    /**
     * Required when using `squash_merge_commit_message`.
     *
     * The default value for a squash merge commit title:
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when
     * more than one commit).
     */
    public var squashMergeCommitTitle:
        InlineUserReposPostRequestJsonSquashMergeCommitTitleXb0d25741? = null

    /**
     * The id of the team that will be granted access to this repository. This is only valid when creating a repository
     * in an organization.
     */
    public var teamId: Int? = null

    public fun build(): InlineUserReposPostRequestJsonX3febab2b {
      check(nameValue != null) { "name is required" }
      return InlineUserReposPostRequestJsonX3febab2b(
        name = name,
        allowAutoMerge = allowAutoMerge,
        allowMergeCommit = allowMergeCommit,
        allowRebaseMerge = allowRebaseMerge,
        allowSquashMerge = allowSquashMerge,
        autoInit = autoInit,
        deleteBranchOnMerge = deleteBranchOnMerge,
        description = description,
        gitignoreTemplate = gitignoreTemplate,
        hasDiscussions = hasDiscussions,
        hasDownloads = hasDownloads,
        hasIssues = hasIssues,
        hasProjects = hasProjects,
        hasWiki = hasWiki,
        homepage = homepage,
        isTemplate = isTemplate,
        licenseTemplate = licenseTemplate,
        mergeCommitMessage = mergeCommitMessage,
        mergeCommitTitle = mergeCommitTitle,
        private = private,
        squashMergeCommitMessage = squashMergeCommitMessage,
        squashMergeCommitTitle = squashMergeCommitTitle,
        teamId = teamId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserReposPostRequestJsonX3febab2b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUserReposPostRequestJsonX3febab2b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserReposPostRequestJsonX3febab2b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserReposPostRequestJsonX3febab2b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserReposPostRequestJsonX3febab2b must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineUserReposPostRequestJsonX3febab2b(
        name = name,
        allowAutoMerge = rawObject["allow_auto_merge"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        allowMergeCommit = rawObject["allow_merge_commit"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        allowRebaseMerge = rawObject["allow_rebase_merge"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        allowSquashMerge = rawObject["allow_squash_merge"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        autoInit = rawObject["auto_init"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        deleteBranchOnMerge = rawObject["delete_branch_on_merge"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        gitignoreTemplate = rawObject["gitignore_template"]?.let { json.decodeFromJsonElement<String>(it) },
        hasDiscussions = rawObject["has_discussions"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasDownloads = rawObject["has_downloads"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasIssues = rawObject["has_issues"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasProjects = rawObject["has_projects"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasWiki = rawObject["has_wiki"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        homepage = rawObject["homepage"]?.let { json.decodeFromJsonElement<String>(it) },
        isTemplate = rawObject["is_template"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        licenseTemplate = rawObject["license_template"]?.let { json.decodeFromJsonElement<String>(it) },
        mergeCommitMessage = rawObject["merge_commit_message"]?.let { json.decodeFromJsonElement<InlineUserReposPostRequestJsonMergeCommitMessageX0c0cfebd>(it) },
        mergeCommitTitle = rawObject["merge_commit_title"]?.let { json.decodeFromJsonElement<InlineUserReposPostRequestJsonMergeCommitTitleXc266eebf>(it) },
        private = rawObject["private"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        squashMergeCommitMessage = rawObject["squash_merge_commit_message"]?.let { json.decodeFromJsonElement<InlineUserReposPostRequestJsonSquashMergeCommitMessageXcdc7ea1a>(it) },
        squashMergeCommitTitle = rawObject["squash_merge_commit_title"]?.let { json.decodeFromJsonElement<InlineUserReposPostRequestJsonSquashMergeCommitTitleXb0d25741>(it) },
        teamId = rawObject["team_id"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserReposPostRequestJsonX3febab2b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserReposPostRequestJsonX3febab2b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        value.allowAutoMerge?.let { put("allow_auto_merge", json.encodeToJsonElement(it)) }
        value.allowMergeCommit?.let { put("allow_merge_commit", json.encodeToJsonElement(it)) }
        value.allowRebaseMerge?.let { put("allow_rebase_merge", json.encodeToJsonElement(it)) }
        value.allowSquashMerge?.let { put("allow_squash_merge", json.encodeToJsonElement(it)) }
        value.autoInit?.let { put("auto_init", json.encodeToJsonElement(it)) }
        value.deleteBranchOnMerge?.let { put("delete_branch_on_merge", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.gitignoreTemplate?.let { put("gitignore_template", it) }
        value.hasDiscussions?.let { put("has_discussions", json.encodeToJsonElement(it)) }
        value.hasDownloads?.let { put("has_downloads", json.encodeToJsonElement(it)) }
        value.hasIssues?.let { put("has_issues", json.encodeToJsonElement(it)) }
        value.hasProjects?.let { put("has_projects", json.encodeToJsonElement(it)) }
        value.hasWiki?.let { put("has_wiki", json.encodeToJsonElement(it)) }
        value.homepage?.let { put("homepage", it) }
        value.isTemplate?.let { put("is_template", json.encodeToJsonElement(it)) }
        value.licenseTemplate?.let { put("license_template", it) }
        value.mergeCommitMessage?.let { put("merge_commit_message", json.encodeToJsonElement(it)) }
        value.mergeCommitTitle?.let { put("merge_commit_title", json.encodeToJsonElement(it)) }
        value.private?.let { put("private", json.encodeToJsonElement(it)) }
        value.squashMergeCommitMessage?.let { put("squash_merge_commit_message", json.encodeToJsonElement(it)) }
        value.squashMergeCommitTitle?.let { put("squash_merge_commit_title", json.encodeToJsonElement(it)) }
        value.teamId?.let { put("team_id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserReposPostRequestJsonX3febab2b(block: InlineUserReposPostRequestJsonX3febab2b.Builder.() -> Unit): InlineUserReposPostRequestJsonX3febab2b = InlineUserReposPostRequestJsonX3febab2b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserReposPostRequestJsonX3febab2b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
