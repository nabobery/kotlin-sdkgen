package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The branch protection rule. Includes a `name` and all the [branch protection
 * settings](https://docs.github.com/github/administering-a-repository/defining-the-mergeability-of-pull-requests/about-
 * protected-branches#about-branch-protection-settings) applied to branches that match the name. Binary settings are
 * boolean. Multi-level configurations are one of `off`, `non_admins`, or `everyone`. Actor and build lists are arrays
 * of strings.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule
 */
@Serializable(with = WebhooksRule.Serializer::class)
public class WebhooksRule(
  public val adminEnforced: Boolean,
  public val allowDeletionsEnforcementLevel:
      InlineWebhooksRuleAllowDeletionsEnforcementLevelX99572629,
  public val allowForcePushesEnforcementLevel:
      InlineWebhooksRuleAllowForcePushesEnforcementLevelXe32e4a30,
  authorizedActorNames: List<String>,
  public val authorizedActorsOnly: Boolean,
  public val authorizedDismissalActorsOnly: Boolean,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val dismissStaleReviewsOnPush: Boolean,
  public val id: Int,
  public val ignoreApprovalsFromContributors: Boolean,
  public val linearHistoryRequirementEnforcementLevel:
      InlineWebhooksRuleLinearHistoryRequirementEnforcementLevelX3ee3cf86,
  /**
   * The enforcement level of the branch lock setting. `off` means the branch is not locked, `non_admins` means the
   * branch is read-only for non_admins, and `everyone` means the branch is read-only for everyone.
   */
  public val lockBranchEnforcementLevel: InlineWebhooksRuleLockBranchEnforcementLevelX3c9f0e75,
  public val mergeQueueEnforcementLevel: InlineWebhooksRuleMergeQueueEnforcementLevelX1982c05f,
  public val name: String,
  public val pullRequestReviewsEnforcementLevel:
      InlineWebhooksRulePullRequestReviewsEnforcementLevelXc5c26ba2,
  public val repositoryId: Int,
  public val requireCodeOwnerReview: Boolean,
  public val requiredApprovingReviewCount: Int,
  public val requiredConversationResolutionLevel:
      InlineWebhooksRuleRequiredConversationResolutionLevelX5ae1cf17,
  public val requiredDeploymentsEnforcementLevel:
      InlineWebhooksRuleRequiredDeploymentsEnforcementLevelX84123001,
  requiredStatusChecks: List<String>,
  public val requiredStatusChecksEnforcementLevel:
      InlineWebhooksRuleRequiredStatusChecksEnforcementLevelXa6dbcfee,
  public val signatureRequirementEnforcementLevel:
      InlineWebhooksRuleSignatureRequirementEnforcementLevelXd1ee5593,
  public val strictRequiredStatusChecksPolicy: Boolean,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  public val createProtected: Boolean? = null,
  /**
   * Whether users can pull changes from upstream when the branch is locked. Set to `true` to allow users to pull
   * changes from upstream when the branch is locked. This setting is only applicable for forks.
   */
  public val lockAllowsForkSync: Boolean? = null,
  /**
   * Whether the most recent push must be approved by someone other than the person who pushed it
   */
  public val requireLastPushApproval: Boolean? = null,
) {
  public val authorizedActorNames: List<String> = authorizedActorNames.toList()

  public val requiredStatusChecks: List<String> = requiredStatusChecks.toList()

  public class Builder {
    private var adminEnforcedValue: Boolean? = null

    public var adminEnforced: Boolean
      get() = requireNotNull(adminEnforcedValue) { "adminEnforced is required" }
      set(`value`) {
        adminEnforcedValue = value
      }

    private var allowDeletionsEnforcementLevelValue:
        InlineWebhooksRuleAllowDeletionsEnforcementLevelX99572629? = null

    public var allowDeletionsEnforcementLevel:
        InlineWebhooksRuleAllowDeletionsEnforcementLevelX99572629
      get() = requireNotNull(allowDeletionsEnforcementLevelValue) { "allowDeletionsEnforcementLevel is required" }
      set(`value`) {
        allowDeletionsEnforcementLevelValue = value
      }

    private var allowForcePushesEnforcementLevelValue:
        InlineWebhooksRuleAllowForcePushesEnforcementLevelXe32e4a30? = null

    public var allowForcePushesEnforcementLevel:
        InlineWebhooksRuleAllowForcePushesEnforcementLevelXe32e4a30
      get() = requireNotNull(allowForcePushesEnforcementLevelValue) { "allowForcePushesEnforcementLevel is required" }
      set(`value`) {
        allowForcePushesEnforcementLevelValue = value
      }

    private var authorizedActorNamesValue: List<String>? = null

    public var authorizedActorNames: List<String>
      get() = requireNotNull(authorizedActorNamesValue) { "authorizedActorNames is required" }.toList()
      set(`value`) {
        authorizedActorNamesValue = value.toList()
      }

    private var authorizedActorsOnlyValue: Boolean? = null

    public var authorizedActorsOnly: Boolean
      get() = requireNotNull(authorizedActorsOnlyValue) { "authorizedActorsOnly is required" }
      set(`value`) {
        authorizedActorsOnlyValue = value
      }

    private var authorizedDismissalActorsOnlyValue: Boolean? = null

    public var authorizedDismissalActorsOnly: Boolean
      get() = requireNotNull(authorizedDismissalActorsOnlyValue) { "authorizedDismissalActorsOnly is required" }
      set(`value`) {
        authorizedDismissalActorsOnlyValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var dismissStaleReviewsOnPushValue: Boolean? = null

    public var dismissStaleReviewsOnPush: Boolean
      get() = requireNotNull(dismissStaleReviewsOnPushValue) { "dismissStaleReviewsOnPush is required" }
      set(`value`) {
        dismissStaleReviewsOnPushValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var ignoreApprovalsFromContributorsValue: Boolean? = null

    public var ignoreApprovalsFromContributors: Boolean
      get() = requireNotNull(ignoreApprovalsFromContributorsValue) { "ignoreApprovalsFromContributors is required" }
      set(`value`) {
        ignoreApprovalsFromContributorsValue = value
      }

    private var linearHistoryRequirementEnforcementLevelValue:
        InlineWebhooksRuleLinearHistoryRequirementEnforcementLevelX3ee3cf86? = null

    public var linearHistoryRequirementEnforcementLevel:
        InlineWebhooksRuleLinearHistoryRequirementEnforcementLevelX3ee3cf86
      get() = requireNotNull(linearHistoryRequirementEnforcementLevelValue) { "linearHistoryRequirementEnforcementLevel is required" }
      set(`value`) {
        linearHistoryRequirementEnforcementLevelValue = value
      }

    private var lockBranchEnforcementLevelValue:
        InlineWebhooksRuleLockBranchEnforcementLevelX3c9f0e75? = null

    public var lockBranchEnforcementLevel: InlineWebhooksRuleLockBranchEnforcementLevelX3c9f0e75
      get() = requireNotNull(lockBranchEnforcementLevelValue) { "lockBranchEnforcementLevel is required" }
      set(`value`) {
        lockBranchEnforcementLevelValue = value
      }

    private var mergeQueueEnforcementLevelValue:
        InlineWebhooksRuleMergeQueueEnforcementLevelX1982c05f? = null

    public var mergeQueueEnforcementLevel: InlineWebhooksRuleMergeQueueEnforcementLevelX1982c05f
      get() = requireNotNull(mergeQueueEnforcementLevelValue) { "mergeQueueEnforcementLevel is required" }
      set(`value`) {
        mergeQueueEnforcementLevelValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var pullRequestReviewsEnforcementLevelValue:
        InlineWebhooksRulePullRequestReviewsEnforcementLevelXc5c26ba2? = null

    public var pullRequestReviewsEnforcementLevel:
        InlineWebhooksRulePullRequestReviewsEnforcementLevelXc5c26ba2
      get() = requireNotNull(pullRequestReviewsEnforcementLevelValue) { "pullRequestReviewsEnforcementLevel is required" }
      set(`value`) {
        pullRequestReviewsEnforcementLevelValue = value
      }

    private var repositoryIdValue: Int? = null

    public var repositoryId: Int
      get() = requireNotNull(repositoryIdValue) { "repositoryId is required" }
      set(`value`) {
        repositoryIdValue = value
      }

    private var requireCodeOwnerReviewValue: Boolean? = null

    public var requireCodeOwnerReview: Boolean
      get() = requireNotNull(requireCodeOwnerReviewValue) { "requireCodeOwnerReview is required" }
      set(`value`) {
        requireCodeOwnerReviewValue = value
      }

    private var requiredApprovingReviewCountValue: Int? = null

    public var requiredApprovingReviewCount: Int
      get() = requireNotNull(requiredApprovingReviewCountValue) { "requiredApprovingReviewCount is required" }
      set(`value`) {
        requiredApprovingReviewCountValue = value
      }

    private var requiredConversationResolutionLevelValue:
        InlineWebhooksRuleRequiredConversationResolutionLevelX5ae1cf17? = null

    public var requiredConversationResolutionLevel:
        InlineWebhooksRuleRequiredConversationResolutionLevelX5ae1cf17
      get() = requireNotNull(requiredConversationResolutionLevelValue) { "requiredConversationResolutionLevel is required" }
      set(`value`) {
        requiredConversationResolutionLevelValue = value
      }

    private var requiredDeploymentsEnforcementLevelValue:
        InlineWebhooksRuleRequiredDeploymentsEnforcementLevelX84123001? = null

    public var requiredDeploymentsEnforcementLevel:
        InlineWebhooksRuleRequiredDeploymentsEnforcementLevelX84123001
      get() = requireNotNull(requiredDeploymentsEnforcementLevelValue) { "requiredDeploymentsEnforcementLevel is required" }
      set(`value`) {
        requiredDeploymentsEnforcementLevelValue = value
      }

    private var requiredStatusChecksValue: List<String>? = null

    public var requiredStatusChecks: List<String>
      get() = requireNotNull(requiredStatusChecksValue) { "requiredStatusChecks is required" }.toList()
      set(`value`) {
        requiredStatusChecksValue = value.toList()
      }

    private var requiredStatusChecksEnforcementLevelValue:
        InlineWebhooksRuleRequiredStatusChecksEnforcementLevelXa6dbcfee? = null

    public var requiredStatusChecksEnforcementLevel:
        InlineWebhooksRuleRequiredStatusChecksEnforcementLevelXa6dbcfee
      get() = requireNotNull(requiredStatusChecksEnforcementLevelValue) { "requiredStatusChecksEnforcementLevel is required" }
      set(`value`) {
        requiredStatusChecksEnforcementLevelValue = value
      }

    private var signatureRequirementEnforcementLevelValue:
        InlineWebhooksRuleSignatureRequirementEnforcementLevelXd1ee5593? = null

    public var signatureRequirementEnforcementLevel:
        InlineWebhooksRuleSignatureRequirementEnforcementLevelXd1ee5593
      get() = requireNotNull(signatureRequirementEnforcementLevelValue) { "signatureRequirementEnforcementLevel is required" }
      set(`value`) {
        signatureRequirementEnforcementLevelValue = value
      }

    private var strictRequiredStatusChecksPolicyValue: Boolean? = null

    public var strictRequiredStatusChecksPolicy: Boolean
      get() = requireNotNull(strictRequiredStatusChecksPolicyValue) { "strictRequiredStatusChecksPolicy is required" }
      set(`value`) {
        strictRequiredStatusChecksPolicyValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    public var createProtected: Boolean? = null

    /**
     * Whether users can pull changes from upstream when the branch is locked. Set to `true` to allow users to pull
     * changes from upstream when the branch is locked. This setting is only applicable for forks.
     */
    public var lockAllowsForkSync: Boolean? = null

    /**
     * Whether the most recent push must be approved by someone other than the person who pushed it
     */
    public var requireLastPushApproval: Boolean? = null

    public fun build(): WebhooksRule {
      check(adminEnforcedValue != null) { "adminEnforced is required" }
      check(allowDeletionsEnforcementLevelValue != null) { "allowDeletionsEnforcementLevel is required" }
      check(allowForcePushesEnforcementLevelValue != null) { "allowForcePushesEnforcementLevel is required" }
      check(authorizedActorNamesValue != null) { "authorizedActorNames is required" }
      check(authorizedActorsOnlyValue != null) { "authorizedActorsOnly is required" }
      check(authorizedDismissalActorsOnlyValue != null) { "authorizedDismissalActorsOnly is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(dismissStaleReviewsOnPushValue != null) { "dismissStaleReviewsOnPush is required" }
      check(idValue != null) { "id is required" }
      check(ignoreApprovalsFromContributorsValue != null) { "ignoreApprovalsFromContributors is required" }
      check(linearHistoryRequirementEnforcementLevelValue != null) { "linearHistoryRequirementEnforcementLevel is required" }
      check(lockBranchEnforcementLevelValue != null) { "lockBranchEnforcementLevel is required" }
      check(mergeQueueEnforcementLevelValue != null) { "mergeQueueEnforcementLevel is required" }
      check(nameValue != null) { "name is required" }
      check(pullRequestReviewsEnforcementLevelValue != null) { "pullRequestReviewsEnforcementLevel is required" }
      check(repositoryIdValue != null) { "repositoryId is required" }
      check(requireCodeOwnerReviewValue != null) { "requireCodeOwnerReview is required" }
      check(requiredApprovingReviewCountValue != null) { "requiredApprovingReviewCount is required" }
      check(requiredConversationResolutionLevelValue != null) { "requiredConversationResolutionLevel is required" }
      check(requiredDeploymentsEnforcementLevelValue != null) { "requiredDeploymentsEnforcementLevel is required" }
      check(requiredStatusChecksValue != null) { "requiredStatusChecks is required" }
      check(requiredStatusChecksEnforcementLevelValue != null) { "requiredStatusChecksEnforcementLevel is required" }
      check(signatureRequirementEnforcementLevelValue != null) { "signatureRequirementEnforcementLevel is required" }
      check(strictRequiredStatusChecksPolicyValue != null) { "strictRequiredStatusChecksPolicy is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      return WebhooksRule(
        adminEnforced = adminEnforced,
        allowDeletionsEnforcementLevel = allowDeletionsEnforcementLevel,
        allowForcePushesEnforcementLevel = allowForcePushesEnforcementLevel,
        authorizedActorNames = authorizedActorNames,
        authorizedActorsOnly = authorizedActorsOnly,
        authorizedDismissalActorsOnly = authorizedDismissalActorsOnly,
        createdAt = createdAt,
        dismissStaleReviewsOnPush = dismissStaleReviewsOnPush,
        id = id,
        ignoreApprovalsFromContributors = ignoreApprovalsFromContributors,
        linearHistoryRequirementEnforcementLevel = linearHistoryRequirementEnforcementLevel,
        lockBranchEnforcementLevel = lockBranchEnforcementLevel,
        mergeQueueEnforcementLevel = mergeQueueEnforcementLevel,
        name = name,
        pullRequestReviewsEnforcementLevel = pullRequestReviewsEnforcementLevel,
        repositoryId = repositoryId,
        requireCodeOwnerReview = requireCodeOwnerReview,
        requiredApprovingReviewCount = requiredApprovingReviewCount,
        requiredConversationResolutionLevel = requiredConversationResolutionLevel,
        requiredDeploymentsEnforcementLevel = requiredDeploymentsEnforcementLevel,
        requiredStatusChecks = requiredStatusChecks,
        requiredStatusChecksEnforcementLevel = requiredStatusChecksEnforcementLevel,
        signatureRequirementEnforcementLevel = signatureRequirementEnforcementLevel,
        strictRequiredStatusChecksPolicy = strictRequiredStatusChecksPolicy,
        updatedAt = updatedAt,
        createProtected = createProtected,
        lockAllowsForkSync = lockAllowsForkSync,
        requireLastPushApproval = requireLastPushApproval,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhooksRule = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhooksRule> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhooksRule {
      val jsonDecoder = decoder.requireJsonDecoder("WebhooksRule")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhooksRule must be a JSON object")
      val adminEnforced = json.decodeRequired<Boolean>(rawObject, "admin_enforced")
      val allowDeletionsEnforcementLevel = json.decodeRequired<InlineWebhooksRuleAllowDeletionsEnforcementLevelX99572629>(rawObject, "allow_deletions_enforcement_level")
      val allowForcePushesEnforcementLevel = json.decodeRequired<InlineWebhooksRuleAllowForcePushesEnforcementLevelXe32e4a30>(rawObject, "allow_force_pushes_enforcement_level")
      val authorizedActorNames = json.decodeRequired<List<String>>(rawObject, "authorized_actor_names")
      val authorizedActorsOnly = json.decodeRequired<Boolean>(rawObject, "authorized_actors_only")
      val authorizedDismissalActorsOnly = json.decodeRequired<Boolean>(rawObject, "authorized_dismissal_actors_only")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val dismissStaleReviewsOnPush = json.decodeRequired<Boolean>(rawObject, "dismiss_stale_reviews_on_push")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val ignoreApprovalsFromContributors = json.decodeRequired<Boolean>(rawObject, "ignore_approvals_from_contributors")
      val linearHistoryRequirementEnforcementLevel = json.decodeRequired<InlineWebhooksRuleLinearHistoryRequirementEnforcementLevelX3ee3cf86>(rawObject, "linear_history_requirement_enforcement_level")
      val lockBranchEnforcementLevel = json.decodeRequired<InlineWebhooksRuleLockBranchEnforcementLevelX3c9f0e75>(rawObject, "lock_branch_enforcement_level")
      val mergeQueueEnforcementLevel = json.decodeRequired<InlineWebhooksRuleMergeQueueEnforcementLevelX1982c05f>(rawObject, "merge_queue_enforcement_level")
      val name = json.decodeRequired<String>(rawObject, "name")
      val pullRequestReviewsEnforcementLevel = json.decodeRequired<InlineWebhooksRulePullRequestReviewsEnforcementLevelXc5c26ba2>(rawObject, "pull_request_reviews_enforcement_level")
      val repositoryId = json.decodeRequired<Int>(rawObject, "repository_id")
      val requireCodeOwnerReview = json.decodeRequired<Boolean>(rawObject, "require_code_owner_review")
      val requiredApprovingReviewCount = json.decodeRequired<Int>(rawObject, "required_approving_review_count")
      val requiredConversationResolutionLevel = json.decodeRequired<InlineWebhooksRuleRequiredConversationResolutionLevelX5ae1cf17>(rawObject, "required_conversation_resolution_level")
      val requiredDeploymentsEnforcementLevel = json.decodeRequired<InlineWebhooksRuleRequiredDeploymentsEnforcementLevelX84123001>(rawObject, "required_deployments_enforcement_level")
      val requiredStatusChecks = json.decodeRequired<List<String>>(rawObject, "required_status_checks")
      val requiredStatusChecksEnforcementLevel = json.decodeRequired<InlineWebhooksRuleRequiredStatusChecksEnforcementLevelXa6dbcfee>(rawObject, "required_status_checks_enforcement_level")
      val signatureRequirementEnforcementLevel = json.decodeRequired<InlineWebhooksRuleSignatureRequirementEnforcementLevelXd1ee5593>(rawObject, "signature_requirement_enforcement_level")
      val strictRequiredStatusChecksPolicy = json.decodeRequired<Boolean>(rawObject, "strict_required_status_checks_policy")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      return WebhooksRule(
        adminEnforced = adminEnforced,
        allowDeletionsEnforcementLevel = allowDeletionsEnforcementLevel,
        allowForcePushesEnforcementLevel = allowForcePushesEnforcementLevel,
        authorizedActorNames = authorizedActorNames,
        authorizedActorsOnly = authorizedActorsOnly,
        authorizedDismissalActorsOnly = authorizedDismissalActorsOnly,
        createdAt = createdAt,
        dismissStaleReviewsOnPush = dismissStaleReviewsOnPush,
        id = id,
        ignoreApprovalsFromContributors = ignoreApprovalsFromContributors,
        linearHistoryRequirementEnforcementLevel = linearHistoryRequirementEnforcementLevel,
        lockBranchEnforcementLevel = lockBranchEnforcementLevel,
        mergeQueueEnforcementLevel = mergeQueueEnforcementLevel,
        name = name,
        pullRequestReviewsEnforcementLevel = pullRequestReviewsEnforcementLevel,
        repositoryId = repositoryId,
        requireCodeOwnerReview = requireCodeOwnerReview,
        requiredApprovingReviewCount = requiredApprovingReviewCount,
        requiredConversationResolutionLevel = requiredConversationResolutionLevel,
        requiredDeploymentsEnforcementLevel = requiredDeploymentsEnforcementLevel,
        requiredStatusChecks = requiredStatusChecks,
        requiredStatusChecksEnforcementLevel = requiredStatusChecksEnforcementLevel,
        signatureRequirementEnforcementLevel = signatureRequirementEnforcementLevel,
        strictRequiredStatusChecksPolicy = strictRequiredStatusChecksPolicy,
        updatedAt = updatedAt,
        createProtected = rawObject["create_protected"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        lockAllowsForkSync = rawObject["lock_allows_fork_sync"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        requireLastPushApproval = rawObject["require_last_push_approval"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhooksRule) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhooksRule")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("admin_enforced", json.encodeToJsonElement(value.adminEnforced))
        put("allow_deletions_enforcement_level", json.encodeToJsonElement(value.allowDeletionsEnforcementLevel))
        put("allow_force_pushes_enforcement_level", json.encodeToJsonElement(value.allowForcePushesEnforcementLevel))
        put("authorized_actor_names", json.encodeToJsonElement(value.authorizedActorNames))
        put("authorized_actors_only", json.encodeToJsonElement(value.authorizedActorsOnly))
        put("authorized_dismissal_actors_only", json.encodeToJsonElement(value.authorizedDismissalActorsOnly))
        put("created_at", value.createdAt)
        put("dismiss_stale_reviews_on_push", json.encodeToJsonElement(value.dismissStaleReviewsOnPush))
        put("id", json.encodeToJsonElement(value.id))
        put("ignore_approvals_from_contributors", json.encodeToJsonElement(value.ignoreApprovalsFromContributors))
        put("linear_history_requirement_enforcement_level", json.encodeToJsonElement(value.linearHistoryRequirementEnforcementLevel))
        put("lock_branch_enforcement_level", json.encodeToJsonElement(value.lockBranchEnforcementLevel))
        put("merge_queue_enforcement_level", json.encodeToJsonElement(value.mergeQueueEnforcementLevel))
        put("name", value.name)
        put("pull_request_reviews_enforcement_level", json.encodeToJsonElement(value.pullRequestReviewsEnforcementLevel))
        put("repository_id", json.encodeToJsonElement(value.repositoryId))
        put("require_code_owner_review", json.encodeToJsonElement(value.requireCodeOwnerReview))
        put("required_approving_review_count", json.encodeToJsonElement(value.requiredApprovingReviewCount))
        put("required_conversation_resolution_level", json.encodeToJsonElement(value.requiredConversationResolutionLevel))
        put("required_deployments_enforcement_level", json.encodeToJsonElement(value.requiredDeploymentsEnforcementLevel))
        put("required_status_checks", json.encodeToJsonElement(value.requiredStatusChecks))
        put("required_status_checks_enforcement_level", json.encodeToJsonElement(value.requiredStatusChecksEnforcementLevel))
        put("signature_requirement_enforcement_level", json.encodeToJsonElement(value.signatureRequirementEnforcementLevel))
        put("strict_required_status_checks_policy", json.encodeToJsonElement(value.strictRequiredStatusChecksPolicy))
        put("updated_at", value.updatedAt)
        value.createProtected?.let { put("create_protected", json.encodeToJsonElement(it)) }
        value.lockAllowsForkSync?.let { put("lock_allows_fork_sync", json.encodeToJsonElement(it)) }
        value.requireLastPushApproval?.let { put("require_last_push_approval", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhooksRule(block: WebhooksRule.Builder.() -> Unit): WebhooksRule = WebhooksRule.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhooksRule is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
