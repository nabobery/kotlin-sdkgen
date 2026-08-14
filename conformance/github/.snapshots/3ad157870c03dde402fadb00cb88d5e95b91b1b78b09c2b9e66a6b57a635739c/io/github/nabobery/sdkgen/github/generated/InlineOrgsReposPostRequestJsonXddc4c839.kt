package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1repos/post/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1repos/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineOrgsReposPostRequestJsonXddc4c839.Serializer::class)
public class InlineOrgsReposPostRequestJsonXddc4c839(
  /**
   * The name of the repository.
   */
  public val name: String,
  /**
   * Either `true` to allow auto-merge on pull requests, or `false` to disallow auto-merge.
   */
  public val allowAutoMerge: Boolean? = null,
  /**
   * Either `true` to allow merging pull requests with a merge commit, or `false` to prevent merging pull requests with
   * merge commits.
   */
  public val allowMergeCommit: Boolean? = null,
  /**
   * Either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging.
   */
  public val allowRebaseMerge: Boolean? = null,
  /**
   * Either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging.
   */
  public val allowSquashMerge: Boolean? = null,
  /**
   * Pass `true` to create an initial commit with empty README.
   */
  public val autoInit: Boolean? = null,
  /**
   * The custom properties for the new repository. The keys are the custom property names, and the values are the
   * corresponding custom property values.
   */
  public val customProperties: JsonObject? = null,
  /**
   * Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent
   * automatic deletion. **The authenticated user must be an organization owner to set this property to `true`.**
   */
  public val deleteBranchOnMerge: Boolean? = null,
  /**
   * A short description of the repository.
   */
  public val description: String? = null,
  /**
   * Desired language or platform [.gitignore template](https://github.com/github/gitignore) to apply. Use the name of
   * the template without the extension. For example, "Haskell".
   */
  public val gitignoreTemplate: String? = null,
  /**
   * Whether downloads are enabled.
   */
  public val hasDownloads: Boolean? = null,
  /**
   * Either `true` to enable issues for this repository or `false` to disable them.
   */
  public val hasIssues: Boolean? = null,
  /**
   * Either `true` to enable projects for this repository or `false` to disable them. **Note:** If you're creating a
   * repository in an organization that has disabled repository projects, the default is `false`, and if you pass
   * `true`, the API returns an error.
   */
  public val hasProjects: Boolean? = null,
  /**
   * Either `true` to enable the wiki for this repository or `false` to disable it.
   */
  public val hasWiki: Boolean? = null,
  /**
   * A URL with more information about the repository.
   */
  public val homepage: String? = null,
  /**
   * Either `true` to make this repo available as a template repository or `false` to prevent it.
   */
  public val isTemplate: Boolean? = null,
  /**
   * Choose an [open source license template](https://choosealicense.com/) that best suits your needs, and then use the
   * [license keyword](https://docs.github.com/articles/licensing-a-repository/#searching-github-by-license-type) as the
   * `license_template` string. For example, "mit" or "mpl-2.0".
   */
  public val licenseTemplate: String? = null,
  /**
   * The default value for a merge commit message.
   *
   * - `PR_TITLE` - default to the pull request's title.
   * - `PR_BODY` - default to the pull request's body.
   * - `BLANK` - default to a blank commit message.
   */
  public val mergeCommitMessage: InlineOrgsReposPostRequestJsonMergeCommitMessageXb26cc696? = null,
  /**
   * Required when using `merge_commit_message`.
   *
   * The default value for a merge commit title.
   *
   * - `PR_TITLE` - default to the pull request's title.
   * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from
   * branch-name).
   */
  public val mergeCommitTitle: InlineOrgsReposPostRequestJsonMergeCommitTitleXc6dcc5bf? = null,
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
      InlineOrgsReposPostRequestJsonSquashMergeCommitMessageX79090936? = null,
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
      InlineOrgsReposPostRequestJsonSquashMergeCommitTitleXe9629277? = null,
  /**
   * The id of the team that will be granted access to this repository. This is only valid when creating a repository in
   * an organization.
   */
  public val teamId: Int? = null,
  /**
   * Either `true` to allow squash-merge commits to use pull request title, or `false` to use commit message. **This
   * property is closing down. Please use `squash_merge_commit_title` instead.
   */
  public val useSquashPrTitleAsDefault: Boolean? = null,
  /**
   * The visibility of the repository.
   */
  public val visibility: InlineOrgsReposPostRequestJsonVisibilityXdf60cdd0? = null,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * Either `true` to allow auto-merge on pull requests, or `false` to disallow auto-merge.
     */
    public var allowAutoMerge: Boolean? = null

    /**
     * Either `true` to allow merging pull requests with a merge commit, or `false` to prevent merging pull requests
     * with merge commits.
     */
    public var allowMergeCommit: Boolean? = null

    /**
     * Either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging.
     */
    public var allowRebaseMerge: Boolean? = null

    /**
     * Either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging.
     */
    public var allowSquashMerge: Boolean? = null

    /**
     * Pass `true` to create an initial commit with empty README.
     */
    public var autoInit: Boolean? = null

    /**
     * The custom properties for the new repository. The keys are the custom property names, and the values are the
     * corresponding custom property values.
     */
    public var customProperties: JsonObject? = null

    /**
     * Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent
     * automatic deletion. **The authenticated user must be an organization owner to set this property to `true`.**
     */
    public var deleteBranchOnMerge: Boolean? = null

    /**
     * A short description of the repository.
     */
    public var description: String? = null

    /**
     * Desired language or platform [.gitignore template](https://github.com/github/gitignore) to apply. Use the name of
     * the template without the extension. For example, "Haskell".
     */
    public var gitignoreTemplate: String? = null

    /**
     * Whether downloads are enabled.
     */
    public var hasDownloads: Boolean? = null

    /**
     * Either `true` to enable issues for this repository or `false` to disable them.
     */
    public var hasIssues: Boolean? = null

    /**
     * Either `true` to enable projects for this repository or `false` to disable them. **Note:** If you're creating a
     * repository in an organization that has disabled repository projects, the default is `false`, and if you pass
     * `true`, the API returns an error.
     */
    public var hasProjects: Boolean? = null

    /**
     * Either `true` to enable the wiki for this repository or `false` to disable it.
     */
    public var hasWiki: Boolean? = null

    /**
     * A URL with more information about the repository.
     */
    public var homepage: String? = null

    /**
     * Either `true` to make this repo available as a template repository or `false` to prevent it.
     */
    public var isTemplate: Boolean? = null

    /**
     * Choose an [open source license template](https://choosealicense.com/) that best suits your needs, and then use
     * the [license keyword](https://docs.github.com/articles/licensing-a-repository/#searching-github-by-license-type)
     * as the `license_template` string. For example, "mit" or "mpl-2.0".
     */
    public var licenseTemplate: String? = null

    /**
     * The default value for a merge commit message.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `PR_BODY` - default to the pull request's body.
     * - `BLANK` - default to a blank commit message.
     */
    public var mergeCommitMessage: InlineOrgsReposPostRequestJsonMergeCommitMessageXb26cc696? = null

    /**
     * Required when using `merge_commit_message`.
     *
     * The default value for a merge commit title.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from
     * branch-name).
     */
    public var mergeCommitTitle: InlineOrgsReposPostRequestJsonMergeCommitTitleXc6dcc5bf? = null

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
        InlineOrgsReposPostRequestJsonSquashMergeCommitMessageX79090936? = null

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
        InlineOrgsReposPostRequestJsonSquashMergeCommitTitleXe9629277? = null

    /**
     * The id of the team that will be granted access to this repository. This is only valid when creating a repository
     * in an organization.
     */
    public var teamId: Int? = null

    /**
     * Either `true` to allow squash-merge commits to use pull request title, or `false` to use commit message. **This
     * property is closing down. Please use `squash_merge_commit_title` instead.
     */
    public var useSquashPrTitleAsDefault: Boolean? = null

    /**
     * The visibility of the repository.
     */
    public var visibility: InlineOrgsReposPostRequestJsonVisibilityXdf60cdd0? = null

    public fun build(): InlineOrgsReposPostRequestJsonXddc4c839 {
      check(nameValue != null) { "name is required" }
      return InlineOrgsReposPostRequestJsonXddc4c839(
        name = name,
        allowAutoMerge = allowAutoMerge,
        allowMergeCommit = allowMergeCommit,
        allowRebaseMerge = allowRebaseMerge,
        allowSquashMerge = allowSquashMerge,
        autoInit = autoInit,
        customProperties = customProperties,
        deleteBranchOnMerge = deleteBranchOnMerge,
        description = description,
        gitignoreTemplate = gitignoreTemplate,
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
        useSquashPrTitleAsDefault = useSquashPrTitleAsDefault,
        visibility = visibility,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsReposPostRequestJsonXddc4c839 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsReposPostRequestJsonXddc4c839> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsReposPostRequestJsonXddc4c839 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsReposPostRequestJsonXddc4c839")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsReposPostRequestJsonXddc4c839 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineOrgsReposPostRequestJsonXddc4c839(
        name = name,
        allowAutoMerge = rawObject["allow_auto_merge"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        allowMergeCommit = rawObject["allow_merge_commit"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        allowRebaseMerge = rawObject["allow_rebase_merge"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        allowSquashMerge = rawObject["allow_squash_merge"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        autoInit = rawObject["auto_init"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        customProperties = rawObject["custom_properties"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        deleteBranchOnMerge = rawObject["delete_branch_on_merge"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        gitignoreTemplate = rawObject["gitignore_template"]?.let { json.decodeFromJsonElement<String>(it) },
        hasDownloads = rawObject["has_downloads"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasIssues = rawObject["has_issues"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasProjects = rawObject["has_projects"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasWiki = rawObject["has_wiki"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        homepage = rawObject["homepage"]?.let { json.decodeFromJsonElement<String>(it) },
        isTemplate = rawObject["is_template"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        licenseTemplate = rawObject["license_template"]?.let { json.decodeFromJsonElement<String>(it) },
        mergeCommitMessage = rawObject["merge_commit_message"]?.let { json.decodeFromJsonElement<InlineOrgsReposPostRequestJsonMergeCommitMessageXb26cc696>(it) },
        mergeCommitTitle = rawObject["merge_commit_title"]?.let { json.decodeFromJsonElement<InlineOrgsReposPostRequestJsonMergeCommitTitleXc6dcc5bf>(it) },
        private = rawObject["private"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        squashMergeCommitMessage = rawObject["squash_merge_commit_message"]?.let { json.decodeFromJsonElement<InlineOrgsReposPostRequestJsonSquashMergeCommitMessageX79090936>(it) },
        squashMergeCommitTitle = rawObject["squash_merge_commit_title"]?.let { json.decodeFromJsonElement<InlineOrgsReposPostRequestJsonSquashMergeCommitTitleXe9629277>(it) },
        teamId = rawObject["team_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        useSquashPrTitleAsDefault = rawObject["use_squash_pr_title_as_default"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        visibility = rawObject["visibility"]?.let { json.decodeFromJsonElement<InlineOrgsReposPostRequestJsonVisibilityXdf60cdd0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsReposPostRequestJsonXddc4c839) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsReposPostRequestJsonXddc4c839")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        value.allowAutoMerge?.let { put("allow_auto_merge", json.encodeToJsonElement(it)) }
        value.allowMergeCommit?.let { put("allow_merge_commit", json.encodeToJsonElement(it)) }
        value.allowRebaseMerge?.let { put("allow_rebase_merge", json.encodeToJsonElement(it)) }
        value.allowSquashMerge?.let { put("allow_squash_merge", json.encodeToJsonElement(it)) }
        value.autoInit?.let { put("auto_init", json.encodeToJsonElement(it)) }
        value.customProperties?.let { put("custom_properties", json.encodeToJsonElement(it)) }
        value.deleteBranchOnMerge?.let { put("delete_branch_on_merge", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.gitignoreTemplate?.let { put("gitignore_template", it) }
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
        value.useSquashPrTitleAsDefault?.let { put("use_squash_pr_title_as_default", json.encodeToJsonElement(it)) }
        value.visibility?.let { put("visibility", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsReposPostRequestJsonXddc4c839(block: InlineOrgsReposPostRequestJsonXddc4c839.Builder.() -> Unit): InlineOrgsReposPostRequestJsonXddc4c839 = InlineOrgsReposPostRequestJsonXddc4c839.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsReposPostRequestJsonXddc4c839 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
