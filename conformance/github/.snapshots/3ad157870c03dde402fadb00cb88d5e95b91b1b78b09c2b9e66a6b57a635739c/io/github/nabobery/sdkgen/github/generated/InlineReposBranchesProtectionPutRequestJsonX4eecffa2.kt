package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection/put/requestBody/content/
 * application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection/put/requestBody/content/
 * application~1json/schema
 */
@Serializable(with = InlineReposBranchesProtectionPutRequestJsonX4eecffa2.Serializer::class)
public class InlineReposBranchesProtectionPutRequestJsonX4eecffa2 internal constructor(
  /**
   * Enforce all configured restrictions for administrators. Set to `true` to enforce required status checks for
   * repository administrators. Set to `null` to disable.
   */
  public val enforceAdmins: Boolean?,
  /**
   * Require at least one approving review on a pull request, before merging. Set to `null` to disable.
   */
  public val requiredPullRequestReviews:
      InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2?,
  /**
   * Require status checks to pass before merging. Set to `null` to disable.
   */
  public val requiredStatusChecks:
      InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9?,
  /**
   * Restrict who can push to the protected branch. User, app, and team `restrictions` are only available for
   * organization-owned repositories. Set to `null` to disable.
   */
  public val restrictions: InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83?,
  private val allowDeletionsState: FieldState<Boolean>,
  private val allowForcePushesState: FieldState<Boolean?>,
  private val allowForkSyncingState: FieldState<Boolean>,
  private val blockCreationsState: FieldState<Boolean>,
  private val lockBranchState: FieldState<Boolean>,
  private val requiredConversationResolutionState: FieldState<Boolean>,
  private val requiredLinearHistoryState: FieldState<Boolean>,
) {
  /**
   * Allows deletion of the protected branch by anyone with write access to the repository. Set to `false` to prevent
   * deletion of the protected branch. Default: `false`. For more information, see "[Enabling force pushes to a
   * protected
   * branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)" in
   * the GitHub Help documentation.
   */
  public val allowDeletions: Boolean?
    get() = allowDeletionsState.valueOrNull()

  /**
   * Permits force pushes to the protected branch by anyone with write access to the repository. Set to `true` to allow
   * force pushes. Set to `false` or `null` to block force pushes. Default: `false`. For more information, see
   * "[Enabling force pushes to a protected
   * branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)" in
   * the GitHub Help documentation."
   */
  public val allowForcePushes: Boolean?
    get() = allowForcePushesState.valueOrNull()

  /**
   * Whether users can pull changes from upstream when the branch is locked. Set to `true` to allow fork syncing. Set to
   * `false` to prevent fork syncing. Default: `false`.
   */
  public val allowForkSyncing: Boolean?
    get() = allowForkSyncingState.valueOrNull()

  /**
   * If set to `true`, the `restrictions` branch protection settings which limits who can push will also block pushes
   * which create new branches, unless the push is initiated by a user, team, or app which has the ability to push. Set
   * to `true` to restrict new branch creation. Default: `false`.
   */
  public val blockCreations: Boolean?
    get() = blockCreationsState.valueOrNull()

  /**
   * Whether to set the branch as read-only. If this is true, users will not be able to push to the branch. Default:
   * `false`.
   */
  public val lockBranch: Boolean?
    get() = lockBranchState.valueOrNull()

  /**
   * Requires all conversations on code to be resolved before a pull request can be merged into a branch that matches
   * this rule. Set to `false` to disable. Default: `false`.
   */
  public val requiredConversationResolution: Boolean?
    get() = requiredConversationResolutionState.valueOrNull()

  /**
   * Enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch. Set to `true`
   * to enforce a linear commit history. Set to `false` to disable a linear commit Git history. Your repository must
   * allow squash merging or rebase merging before you can enable a linear commit history. Default: `false`. For more
   * information, see "[Requiring a linear commit
   * history](https://docs.github.com/github/administering-a-repository/requiring-a-linear-commit-history)" in the
   * GitHub Help documentation.
   */
  public val requiredLinearHistory: Boolean?
    get() = requiredLinearHistoryState.valueOrNull()

  public constructor(
    enforceAdmins: Boolean?,
    requiredPullRequestReviews: InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2?,
    requiredStatusChecks: InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9?,
    restrictions: InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83?,
  ) : this(enforceAdmins = enforceAdmins,
  requiredPullRequestReviews = requiredPullRequestReviews,
  requiredStatusChecks = requiredStatusChecks,
  restrictions = restrictions,
  allowDeletionsState = FieldState.Absent,
  allowForcePushesState = FieldState.Absent,
  allowForkSyncingState = FieldState.Absent,
  blockCreationsState = FieldState.Absent,
  lockBranchState = FieldState.Absent,
  requiredConversationResolutionState = FieldState.Absent,
  requiredLinearHistoryState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `allow_deletions`.
   */
  public fun allowDeletionsPresence(): FieldPresence = allowDeletionsState.presence

  /**
   * Returns the wire presence of `allow_force_pushes`.
   */
  public fun allowForcePushesPresence(): FieldPresence = allowForcePushesState.presence

  /**
   * Returns the wire presence of `allow_fork_syncing`.
   */
  public fun allowForkSyncingPresence(): FieldPresence = allowForkSyncingState.presence

  /**
   * Returns the wire presence of `block_creations`.
   */
  public fun blockCreationsPresence(): FieldPresence = blockCreationsState.presence

  /**
   * Returns the wire presence of `lock_branch`.
   */
  public fun lockBranchPresence(): FieldPresence = lockBranchState.presence

  /**
   * Returns the wire presence of `required_conversation_resolution`.
   */
  public fun requiredConversationResolutionPresence(): FieldPresence = requiredConversationResolutionState.presence

  /**
   * Returns the wire presence of `required_linear_history`.
   */
  public fun requiredLinearHistoryPresence(): FieldPresence = requiredLinearHistoryState.presence

  public class Builder {
    private var enforceAdminsState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Enforce all configured restrictions for administrators. Set to `true` to enforce required status checks for
     * repository administrators. Set to `null` to disable.
     * Required nullable field; assigning `null` records present-null.
     */
    public var enforceAdmins: Boolean?
      get() = enforceAdminsState.valueOrNull()
      set(`value`) {
        enforceAdminsState = value.toNullableFieldState()
      }

    private var requiredPullRequestReviewsState:
        FieldState<InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2?>
        = FieldState.Absent

    /**
     * Require at least one approving review on a pull request, before merging. Set to `null` to disable.
     * Required nullable field; assigning `null` records present-null.
     */
    public var requiredPullRequestReviews:
        InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2?
      get() = requiredPullRequestReviewsState.valueOrNull()
      set(`value`) {
        requiredPullRequestReviewsState = value.toNullableFieldState()
      }

    private var requiredStatusChecksState:
        FieldState<InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9?> =
        FieldState.Absent

    /**
     * Require status checks to pass before merging. Set to `null` to disable.
     * Required nullable field; assigning `null` records present-null.
     */
    public var requiredStatusChecks:
        InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9?
      get() = requiredStatusChecksState.valueOrNull()
      set(`value`) {
        requiredStatusChecksState = value.toNullableFieldState()
      }

    private var restrictionsState:
        FieldState<InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83?> =
        FieldState.Absent

    /**
     * Restrict who can push to the protected branch. User, app, and team `restrictions` are only available for
     * organization-owned repositories. Set to `null` to disable.
     * Required nullable field; assigning `null` records present-null.
     */
    public var restrictions: InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83?
      get() = restrictionsState.valueOrNull()
      set(`value`) {
        restrictionsState = value.toNullableFieldState()
      }

    private var allowDeletionsState: FieldState<Boolean> = FieldState.Absent

    /**
     * Allows deletion of the protected branch by anyone with write access to the repository. Set to `false` to prevent
     * deletion of the protected branch. Default: `false`. For more information, see "[Enabling force pushes to a
     * protected
     * branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)"
     * in the GitHub Help documentation.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var allowDeletions: Boolean?
      get() = allowDeletionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "allowDeletions is not nullable; call unsetAllowDeletions() to omit it" }
        allowDeletionsState = FieldState.Value(present)
      }

    private var allowForcePushesState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Permits force pushes to the protected branch by anyone with write access to the repository. Set to `true` to
     * allow force pushes. Set to `false` or `null` to block force pushes. Default: `false`. For more information, see
     * "[Enabling force pushes to a protected
     * branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)"
     * in the GitHub Help documentation."
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var allowForcePushes: Boolean?
      get() = allowForcePushesState.valueOrNull()
      set(`value`) {
        allowForcePushesState = value.toNullableFieldState()
      }

    private var allowForkSyncingState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether users can pull changes from upstream when the branch is locked. Set to `true` to allow fork syncing. Set
     * to `false` to prevent fork syncing. Default: `false`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var allowForkSyncing: Boolean?
      get() = allowForkSyncingState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "allowForkSyncing is not nullable; call unsetAllowForkSyncing() to omit it" }
        allowForkSyncingState = FieldState.Value(present)
      }

    private var blockCreationsState: FieldState<Boolean> = FieldState.Absent

    /**
     * If set to `true`, the `restrictions` branch protection settings which limits who can push will also block pushes
     * which create new branches, unless the push is initiated by a user, team, or app which has the ability to push.
     * Set to `true` to restrict new branch creation. Default: `false`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var blockCreations: Boolean?
      get() = blockCreationsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "blockCreations is not nullable; call unsetBlockCreations() to omit it" }
        blockCreationsState = FieldState.Value(present)
      }

    private var lockBranchState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether to set the branch as read-only. If this is true, users will not be able to push to the branch. Default:
     * `false`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var lockBranch: Boolean?
      get() = lockBranchState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "lockBranch is not nullable; call unsetLockBranch() to omit it" }
        lockBranchState = FieldState.Value(present)
      }

    private var requiredConversationResolutionState: FieldState<Boolean> = FieldState.Absent

    /**
     * Requires all conversations on code to be resolved before a pull request can be merged into a branch that matches
     * this rule. Set to `false` to disable. Default: `false`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var requiredConversationResolution: Boolean?
      get() = requiredConversationResolutionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "requiredConversationResolution is not nullable; call unsetRequiredConversationResolution() to omit it" }
        requiredConversationResolutionState = FieldState.Value(present)
      }

    private var requiredLinearHistoryState: FieldState<Boolean> = FieldState.Absent

    /**
     * Enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch. Set to `true`
     * to enforce a linear commit history. Set to `false` to disable a linear commit Git history. Your repository must
     * allow squash merging or rebase merging before you can enable a linear commit history. Default: `false`. For more
     * information, see "[Requiring a linear commit
     * history](https://docs.github.com/github/administering-a-repository/requiring-a-linear-commit-history)" in the
     * GitHub Help documentation.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var requiredLinearHistory: Boolean?
      get() = requiredLinearHistoryState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "requiredLinearHistory is not nullable; call unsetRequiredLinearHistory() to omit it" }
        requiredLinearHistoryState = FieldState.Value(present)
      }

    /**
     * Omits `allow_deletions` from serialized output.
     */
    public fun unsetAllowDeletions() {
      allowDeletionsState = FieldState.Absent
    }

    /**
     * Omits `allow_force_pushes` from serialized output.
     */
    public fun unsetAllowForcePushes() {
      allowForcePushesState = FieldState.Absent
    }

    /**
     * Omits `allow_fork_syncing` from serialized output.
     */
    public fun unsetAllowForkSyncing() {
      allowForkSyncingState = FieldState.Absent
    }

    /**
     * Omits `block_creations` from serialized output.
     */
    public fun unsetBlockCreations() {
      blockCreationsState = FieldState.Absent
    }

    /**
     * Omits `lock_branch` from serialized output.
     */
    public fun unsetLockBranch() {
      lockBranchState = FieldState.Absent
    }

    /**
     * Omits `required_conversation_resolution` from serialized output.
     */
    public fun unsetRequiredConversationResolution() {
      requiredConversationResolutionState = FieldState.Absent
    }

    /**
     * Omits `required_linear_history` from serialized output.
     */
    public fun unsetRequiredLinearHistory() {
      requiredLinearHistoryState = FieldState.Absent
    }

    public fun build(): InlineReposBranchesProtectionPutRequestJsonX4eecffa2 {
      check(enforceAdminsState !== FieldState.Absent) { "enforceAdmins is required, even when null" }
      check(requiredPullRequestReviewsState !== FieldState.Absent) { "requiredPullRequestReviews is required, even when null" }
      check(requiredStatusChecksState !== FieldState.Absent) { "requiredStatusChecks is required, even when null" }
      check(restrictionsState !== FieldState.Absent) { "restrictions is required, even when null" }
      return InlineReposBranchesProtectionPutRequestJsonX4eecffa2(
        enforceAdmins = enforceAdminsState.valueOrNull(),
        requiredPullRequestReviews = requiredPullRequestReviewsState.valueOrNull(),
        requiredStatusChecks = requiredStatusChecksState.valueOrNull(),
        restrictions = restrictionsState.valueOrNull(),
        allowDeletionsState = allowDeletionsState,
        allowForcePushesState = allowForcePushesState,
        allowForkSyncingState = allowForkSyncingState,
        blockCreationsState = blockCreationsState,
        lockBranchState = lockBranchState,
        requiredConversationResolutionState = requiredConversationResolutionState,
        requiredLinearHistoryState = requiredLinearHistoryState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtectionPutRequestJsonX4eecffa2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposBranchesProtectionPutRequestJsonX4eecffa2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtectionPutRequestJsonX4eecffa2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtectionPutRequestJsonX4eecffa2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtectionPutRequestJsonX4eecffa2 must be a JSON object")
      if (!rawObject.containsKey("enforce_admins")) {
        throw SerializationException("InlineReposBranchesProtectionPutRequestJsonX4eecffa2 is missing required property 'enforce_admins'")
      }
      val enforceAdmins = rawObject["enforce_admins"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(requireNotNull(element)) }
      if (!rawObject.containsKey("required_pull_request_reviews")) {
        throw SerializationException("InlineReposBranchesProtectionPutRequestJsonX4eecffa2 is missing required property 'required_pull_request_reviews'")
      }
      val requiredPullRequestReviews = rawObject["required_pull_request_reviews"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2?>(requireNotNull(element)) }
      if (!rawObject.containsKey("required_status_checks")) {
        throw SerializationException("InlineReposBranchesProtectionPutRequestJsonX4eecffa2 is missing required property 'required_status_checks'")
      }
      val requiredStatusChecks = rawObject["required_status_checks"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9?>(requireNotNull(element)) }
      if (!rawObject.containsKey("restrictions")) {
        throw SerializationException("InlineReposBranchesProtectionPutRequestJsonX4eecffa2 is missing required property 'restrictions'")
      }
      val restrictions = rawObject["restrictions"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83?>(requireNotNull(element)) }
      return InlineReposBranchesProtectionPutRequestJsonX4eecffa2(
        enforceAdmins = enforceAdmins,
        requiredPullRequestReviews = requiredPullRequestReviews,
        requiredStatusChecks = requiredStatusChecks,
        restrictions = restrictions,
        allowDeletionsState = json.decodeOptional(rawObject, "allow_deletions", nullable = false),
        allowForcePushesState = json.decodeOptional(rawObject, "allow_force_pushes", nullable = true),
        allowForkSyncingState = json.decodeOptional(rawObject, "allow_fork_syncing", nullable = false),
        blockCreationsState = json.decodeOptional(rawObject, "block_creations", nullable = false),
        lockBranchState = json.decodeOptional(rawObject, "lock_branch", nullable = false),
        requiredConversationResolutionState = json.decodeOptional(rawObject, "required_conversation_resolution", nullable = false),
        requiredLinearHistoryState = json.decodeOptional(rawObject, "required_linear_history", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtectionPutRequestJsonX4eecffa2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtectionPutRequestJsonX4eecffa2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enforce_admins", value.enforceAdmins?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("required_pull_request_reviews", value.requiredPullRequestReviews?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("required_status_checks", value.requiredStatusChecks?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("restrictions", value.restrictions?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("allow_deletions", value.allowDeletionsState, json::encodeToJsonElement)
        putState("allow_force_pushes", value.allowForcePushesState, json::encodeToJsonElement)
        putState("allow_fork_syncing", value.allowForkSyncingState, json::encodeToJsonElement)
        putState("block_creations", value.blockCreationsState, json::encodeToJsonElement)
        putState("lock_branch", value.lockBranchState, json::encodeToJsonElement)
        putState("required_conversation_resolution", value.requiredConversationResolutionState, json::encodeToJsonElement)
        putState("required_linear_history", value.requiredLinearHistoryState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtectionPutRequestJsonX4eecffa2(block: InlineReposBranchesProtectionPutRequestJsonX4eecffa2.Builder.() -> Unit): InlineReposBranchesProtectionPutRequestJsonX4eecffa2 = InlineReposBranchesProtectionPutRequestJsonX4eecffa2.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposBranchesProtectionPutRequestJsonX4eecffa2 property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
