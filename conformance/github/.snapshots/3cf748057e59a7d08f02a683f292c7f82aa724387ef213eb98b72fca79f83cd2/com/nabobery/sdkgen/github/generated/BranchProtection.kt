package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
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
 * Branch Protection
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/branch-protection
 */
@Serializable(with = BranchProtection.Serializer::class)
public class BranchProtection(
  public val allowDeletions: InlineBranchProtectionAllowDeletionsXfef7a233? = null,
  public val allowForcePushes: InlineBranchProtectionAllowForcePushesXb3ef43c3? = null,
  /**
   * Whether users can pull changes from upstream when the branch is locked. Set to `true` to allow fork syncing. Set to
   * `false` to prevent fork syncing.
   */
  public val allowForkSyncing: InlineBranchProtectionAllowForkSyncingX9719e291? = null,
  public val blockCreations: InlineBranchProtectionBlockCreationsX43b33180? = null,
  public val enabled: Boolean? = null,
  public val enforceAdmins: ProtectedBranchAdminEnforced? = null,
  /**
   * Whether to set the branch as read-only. If this is true, users will not be able to push to the branch.
   */
  public val lockBranch: InlineBranchProtectionLockBranchX20503c45? = null,
  public val name: String? = null,
  public val protectionUrl: String? = null,
  public val requiredConversationResolution:
      InlineBranchProtectionRequiredConversationResolutionX71168573? = null,
  public val requiredLinearHistory: InlineBranchProtectionRequiredLinearHistoryXe31e3130? = null,
  public val requiredPullRequestReviews: ProtectedBranchPullRequestReview? = null,
  public val requiredSignatures: InlineBranchProtectionRequiredSignaturesX87f22270? = null,
  public val requiredStatusChecks: ProtectedBranchRequiredStatusCheck? = null,
  public val restrictions: BranchRestrictionPolicy? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var allowDeletions: InlineBranchProtectionAllowDeletionsXfef7a233? = null

    public var allowForcePushes: InlineBranchProtectionAllowForcePushesXb3ef43c3? = null

    /**
     * Whether users can pull changes from upstream when the branch is locked. Set to `true` to allow fork syncing. Set
     * to `false` to prevent fork syncing.
     */
    public var allowForkSyncing: InlineBranchProtectionAllowForkSyncingX9719e291? = null

    public var blockCreations: InlineBranchProtectionBlockCreationsX43b33180? = null

    public var enabled: Boolean? = null

    public var enforceAdmins: ProtectedBranchAdminEnforced? = null

    /**
     * Whether to set the branch as read-only. If this is true, users will not be able to push to the branch.
     */
    public var lockBranch: InlineBranchProtectionLockBranchX20503c45? = null

    public var name: String? = null

    public var protectionUrl: String? = null

    public var requiredConversationResolution:
        InlineBranchProtectionRequiredConversationResolutionX71168573? = null

    public var requiredLinearHistory: InlineBranchProtectionRequiredLinearHistoryXe31e3130? = null

    public var requiredPullRequestReviews: ProtectedBranchPullRequestReview? = null

    public var requiredSignatures: InlineBranchProtectionRequiredSignaturesX87f22270? = null

    public var requiredStatusChecks: ProtectedBranchRequiredStatusCheck? = null

    public var restrictions: BranchRestrictionPolicy? = null

    public var url: String? = null

    public fun build(): BranchProtection = BranchProtection(
      allowDeletions = allowDeletions,
      allowForcePushes = allowForcePushes,
      allowForkSyncing = allowForkSyncing,
      blockCreations = blockCreations,
      enabled = enabled,
      enforceAdmins = enforceAdmins,
      lockBranch = lockBranch,
      name = name,
      protectionUrl = protectionUrl,
      requiredConversationResolution = requiredConversationResolution,
      requiredLinearHistory = requiredLinearHistory,
      requiredPullRequestReviews = requiredPullRequestReviews,
      requiredSignatures = requiredSignatures,
      requiredStatusChecks = requiredStatusChecks,
      restrictions = restrictions,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BranchProtection = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BranchProtection> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BranchProtection {
      val jsonDecoder = decoder.requireJsonDecoder("BranchProtection")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BranchProtection must be a JSON object")
      return BranchProtection(
        allowDeletions = rawObject["allow_deletions"]?.let { json.decodeFromJsonElement<InlineBranchProtectionAllowDeletionsXfef7a233>(it) },
        allowForcePushes = rawObject["allow_force_pushes"]?.let { json.decodeFromJsonElement<InlineBranchProtectionAllowForcePushesXb3ef43c3>(it) },
        allowForkSyncing = rawObject["allow_fork_syncing"]?.let { json.decodeFromJsonElement<InlineBranchProtectionAllowForkSyncingX9719e291>(it) },
        blockCreations = rawObject["block_creations"]?.let { json.decodeFromJsonElement<InlineBranchProtectionBlockCreationsX43b33180>(it) },
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        enforceAdmins = rawObject["enforce_admins"]?.let { json.decodeFromJsonElement<ProtectedBranchAdminEnforced>(it) },
        lockBranch = rawObject["lock_branch"]?.let { json.decodeFromJsonElement<InlineBranchProtectionLockBranchX20503c45>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        protectionUrl = rawObject["protection_url"]?.let { json.decodeFromJsonElement<String>(it) },
        requiredConversationResolution = rawObject["required_conversation_resolution"]?.let { json.decodeFromJsonElement<InlineBranchProtectionRequiredConversationResolutionX71168573>(it) },
        requiredLinearHistory = rawObject["required_linear_history"]?.let { json.decodeFromJsonElement<InlineBranchProtectionRequiredLinearHistoryXe31e3130>(it) },
        requiredPullRequestReviews = rawObject["required_pull_request_reviews"]?.let { json.decodeFromJsonElement<ProtectedBranchPullRequestReview>(it) },
        requiredSignatures = rawObject["required_signatures"]?.let { json.decodeFromJsonElement<InlineBranchProtectionRequiredSignaturesX87f22270>(it) },
        requiredStatusChecks = rawObject["required_status_checks"]?.let { json.decodeFromJsonElement<ProtectedBranchRequiredStatusCheck>(it) },
        restrictions = rawObject["restrictions"]?.let { json.decodeFromJsonElement<BranchRestrictionPolicy>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BranchProtection) {
      val jsonEncoder = encoder.requireJsonEncoder("BranchProtection")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowDeletions?.let { put("allow_deletions", json.encodeToJsonElement(it)) }
        value.allowForcePushes?.let { put("allow_force_pushes", json.encodeToJsonElement(it)) }
        value.allowForkSyncing?.let { put("allow_fork_syncing", json.encodeToJsonElement(it)) }
        value.blockCreations?.let { put("block_creations", json.encodeToJsonElement(it)) }
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
        value.enforceAdmins?.let { put("enforce_admins", json.encodeToJsonElement(it)) }
        value.lockBranch?.let { put("lock_branch", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.protectionUrl?.let { put("protection_url", it) }
        value.requiredConversationResolution?.let { put("required_conversation_resolution", json.encodeToJsonElement(it)) }
        value.requiredLinearHistory?.let { put("required_linear_history", json.encodeToJsonElement(it)) }
        value.requiredPullRequestReviews?.let { put("required_pull_request_reviews", json.encodeToJsonElement(it)) }
        value.requiredSignatures?.let { put("required_signatures", json.encodeToJsonElement(it)) }
        value.requiredStatusChecks?.let { put("required_status_checks", json.encodeToJsonElement(it)) }
        value.restrictions?.let { put("restrictions", json.encodeToJsonElement(it)) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun branchProtection(block: BranchProtection.Builder.() -> Unit): BranchProtection = BranchProtection.build(block)
