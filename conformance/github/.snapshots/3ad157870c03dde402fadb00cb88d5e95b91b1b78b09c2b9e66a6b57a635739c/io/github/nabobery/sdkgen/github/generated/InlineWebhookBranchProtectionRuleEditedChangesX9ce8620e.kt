package io.github.nabobery.sdkgen.github.generated

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
 * If the action was `edited`, the changes to the rule.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes
 */
@Serializable(with = InlineWebhookBranchProtectionRuleEditedChangesX9ce8620e.Serializer::class)
public class InlineWebhookBranchProtectionRuleEditedChangesX9ce8620e(
  public val adminEnforced:
      InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9? = null,
  public val authorizedActorNames:
      InlineWebhookBranchProtectionRuleEditedChangesAuthorizedActorNamesX03a55565? = null,
  public val authorizedActorsOnly:
      InlineWebhookBranchProtectionRuleEditedChangesAuthorizedActorsOnlyXbcfe2352? = null,
  public val authorizedDismissalActorsOnly:
      InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4? = null,
  public val linearHistoryRequirementEnforcementLevel:
      InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee? = null,
  public val lockAllowsForkSync:
      InlineWebhookBranchProtectionRuleEditedChangesLockAllowsForkSyncX88c08f20? = null,
  public val lockBranchEnforcementLevel:
      InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5? = null,
  public val pullRequestReviewsEnforcementLevel:
      InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05? = null,
  public val requireLastPushApproval:
      InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3? = null,
  public val requiredStatusChecks:
      InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0? = null,
  public val requiredStatusChecksEnforcementLevel:
      InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae? = null,
) {
  public class Builder {
    public var adminEnforced: InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9?
        = null

    public var authorizedActorNames:
        InlineWebhookBranchProtectionRuleEditedChangesAuthorizedActorNamesX03a55565? = null

    public var authorizedActorsOnly:
        InlineWebhookBranchProtectionRuleEditedChangesAuthorizedActorsOnlyXbcfe2352? = null

    public var authorizedDismissalActorsOnly:
        InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4? = null

    public var linearHistoryRequirementEnforcementLevel:
        InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee? = null

    public var lockAllowsForkSync:
        InlineWebhookBranchProtectionRuleEditedChangesLockAllowsForkSyncX88c08f20? = null

    public var lockBranchEnforcementLevel:
        InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5? = null

    public var pullRequestReviewsEnforcementLevel:
        InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05? = null

    public var requireLastPushApproval:
        InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3? = null

    public var requiredStatusChecks:
        InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0? = null

    public var requiredStatusChecksEnforcementLevel:
        InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae? = null

    public fun build(): InlineWebhookBranchProtectionRuleEditedChangesX9ce8620e = InlineWebhookBranchProtectionRuleEditedChangesX9ce8620e(
      adminEnforced = adminEnforced,
      authorizedActorNames = authorizedActorNames,
      authorizedActorsOnly = authorizedActorsOnly,
      authorizedDismissalActorsOnly = authorizedDismissalActorsOnly,
      linearHistoryRequirementEnforcementLevel = linearHistoryRequirementEnforcementLevel,
      lockAllowsForkSync = lockAllowsForkSync,
      lockBranchEnforcementLevel = lockBranchEnforcementLevel,
      pullRequestReviewsEnforcementLevel = pullRequestReviewsEnforcementLevel,
      requireLastPushApproval = requireLastPushApproval,
      requiredStatusChecks = requiredStatusChecks,
      requiredStatusChecksEnforcementLevel = requiredStatusChecksEnforcementLevel,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookBranchProtectionRuleEditedChangesX9ce8620e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookBranchProtectionRuleEditedChangesX9ce8620e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookBranchProtectionRuleEditedChangesX9ce8620e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookBranchProtectionRuleEditedChangesX9ce8620e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookBranchProtectionRuleEditedChangesX9ce8620e must be a JSON object")
      return InlineWebhookBranchProtectionRuleEditedChangesX9ce8620e(
        adminEnforced = rawObject["admin_enforced"]?.let { json.decodeFromJsonElement<InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9>(it) },
        authorizedActorNames = rawObject["authorized_actor_names"]?.let { json.decodeFromJsonElement<InlineWebhookBranchProtectionRuleEditedChangesAuthorizedActorNamesX03a55565>(it) },
        authorizedActorsOnly = rawObject["authorized_actors_only"]?.let { json.decodeFromJsonElement<InlineWebhookBranchProtectionRuleEditedChangesAuthorizedActorsOnlyXbcfe2352>(it) },
        authorizedDismissalActorsOnly = rawObject["authorized_dismissal_actors_only"]?.let { json.decodeFromJsonElement<InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4>(it) },
        linearHistoryRequirementEnforcementLevel = rawObject["linear_history_requirement_enforcement_level"]?.let { json.decodeFromJsonElement<InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee>(it) },
        lockAllowsForkSync = rawObject["lock_allows_fork_sync"]?.let { json.decodeFromJsonElement<InlineWebhookBranchProtectionRuleEditedChangesLockAllowsForkSyncX88c08f20>(it) },
        lockBranchEnforcementLevel = rawObject["lock_branch_enforcement_level"]?.let { json.decodeFromJsonElement<InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5>(it) },
        pullRequestReviewsEnforcementLevel = rawObject["pull_request_reviews_enforcement_level"]?.let { json.decodeFromJsonElement<InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05>(it) },
        requireLastPushApproval = rawObject["require_last_push_approval"]?.let { json.decodeFromJsonElement<InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3>(it) },
        requiredStatusChecks = rawObject["required_status_checks"]?.let { json.decodeFromJsonElement<InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0>(it) },
        requiredStatusChecksEnforcementLevel = rawObject["required_status_checks_enforcement_level"]?.let { json.decodeFromJsonElement<InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookBranchProtectionRuleEditedChangesX9ce8620e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookBranchProtectionRuleEditedChangesX9ce8620e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.adminEnforced?.let { put("admin_enforced", json.encodeToJsonElement(it)) }
        value.authorizedActorNames?.let { put("authorized_actor_names", json.encodeToJsonElement(it)) }
        value.authorizedActorsOnly?.let { put("authorized_actors_only", json.encodeToJsonElement(it)) }
        value.authorizedDismissalActorsOnly?.let { put("authorized_dismissal_actors_only", json.encodeToJsonElement(it)) }
        value.linearHistoryRequirementEnforcementLevel?.let { put("linear_history_requirement_enforcement_level", json.encodeToJsonElement(it)) }
        value.lockAllowsForkSync?.let { put("lock_allows_fork_sync", json.encodeToJsonElement(it)) }
        value.lockBranchEnforcementLevel?.let { put("lock_branch_enforcement_level", json.encodeToJsonElement(it)) }
        value.pullRequestReviewsEnforcementLevel?.let { put("pull_request_reviews_enforcement_level", json.encodeToJsonElement(it)) }
        value.requireLastPushApproval?.let { put("require_last_push_approval", json.encodeToJsonElement(it)) }
        value.requiredStatusChecks?.let { put("required_status_checks", json.encodeToJsonElement(it)) }
        value.requiredStatusChecksEnforcementLevel?.let { put("required_status_checks_enforcement_level", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookBranchProtectionRuleEditedChangesX9ce8620e(block: InlineWebhookBranchProtectionRuleEditedChangesX9ce8620e.Builder.() -> Unit): InlineWebhookBranchProtectionRuleEditedChangesX9ce8620e = InlineWebhookBranchProtectionRuleEditedChangesX9ce8620e.build(block)
