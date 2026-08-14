package io.github.nabobery.sdkgen.github.generated

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
 * Branch protections protect branches
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/protected-branch
 */
@Serializable(with = ProtectedBranch.Serializer::class)
public class ProtectedBranch(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val allowDeletions: InlineProtectedBranchAllowDeletionsXa195c4c6? = null,
  public val allowForcePushes: InlineProtectedBranchAllowForcePushesXd32d1771? = null,
  /**
   * Whether users can pull changes from upstream when the branch is locked. Set to `true` to allow fork syncing. Set to
   * `false` to prevent fork syncing.
   */
  public val allowForkSyncing: InlineProtectedBranchAllowForkSyncingX83be2f7f? = null,
  public val blockCreations: InlineProtectedBranchBlockCreationsXc4ebf038? = null,
  public val enforceAdmins: InlineProtectedBranchEnforceAdminsXcc585717? = null,
  /**
   * Whether to set the branch as read-only. If this is true, users will not be able to push to the branch.
   */
  public val lockBranch: InlineProtectedBranchLockBranchX8388bfb5? = null,
  public val requiredConversationResolution:
      InlineProtectedBranchRequiredConversationResolutionXb679ea1a? = null,
  public val requiredLinearHistory: InlineProtectedBranchRequiredLinearHistoryXac821782? = null,
  public val requiredPullRequestReviews:
      InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc? = null,
  public val requiredSignatures: InlineProtectedBranchRequiredSignaturesX2ad00b0f? = null,
  public val requiredStatusChecks: StatusCheckPolicy? = null,
  public val restrictions: BranchRestrictionPolicy? = null,
) {
  public class Builder {
    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public var allowDeletions: InlineProtectedBranchAllowDeletionsXa195c4c6? = null

    public var allowForcePushes: InlineProtectedBranchAllowForcePushesXd32d1771? = null

    /**
     * Whether users can pull changes from upstream when the branch is locked. Set to `true` to allow fork syncing. Set
     * to `false` to prevent fork syncing.
     */
    public var allowForkSyncing: InlineProtectedBranchAllowForkSyncingX83be2f7f? = null

    public var blockCreations: InlineProtectedBranchBlockCreationsXc4ebf038? = null

    public var enforceAdmins: InlineProtectedBranchEnforceAdminsXcc585717? = null

    /**
     * Whether to set the branch as read-only. If this is true, users will not be able to push to the branch.
     */
    public var lockBranch: InlineProtectedBranchLockBranchX8388bfb5? = null

    public var requiredConversationResolution:
        InlineProtectedBranchRequiredConversationResolutionXb679ea1a? = null

    public var requiredLinearHistory: InlineProtectedBranchRequiredLinearHistoryXac821782? = null

    public var requiredPullRequestReviews: InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc?
        = null

    public var requiredSignatures: InlineProtectedBranchRequiredSignaturesX2ad00b0f? = null

    public var requiredStatusChecks: StatusCheckPolicy? = null

    public var restrictions: BranchRestrictionPolicy? = null

    public fun build(): ProtectedBranch {
      check(urlValue != null) { "url is required" }
      return ProtectedBranch(
        url = url,
        allowDeletions = allowDeletions,
        allowForcePushes = allowForcePushes,
        allowForkSyncing = allowForkSyncing,
        blockCreations = blockCreations,
        enforceAdmins = enforceAdmins,
        lockBranch = lockBranch,
        requiredConversationResolution = requiredConversationResolution,
        requiredLinearHistory = requiredLinearHistory,
        requiredPullRequestReviews = requiredPullRequestReviews,
        requiredSignatures = requiredSignatures,
        requiredStatusChecks = requiredStatusChecks,
        restrictions = restrictions,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProtectedBranch = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ProtectedBranch> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProtectedBranch {
      val jsonDecoder = decoder.requireJsonDecoder("ProtectedBranch")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProtectedBranch must be a JSON object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return ProtectedBranch(
        url = url,
        allowDeletions = rawObject["allow_deletions"]?.let { json.decodeFromJsonElement<InlineProtectedBranchAllowDeletionsXa195c4c6>(it) },
        allowForcePushes = rawObject["allow_force_pushes"]?.let { json.decodeFromJsonElement<InlineProtectedBranchAllowForcePushesXd32d1771>(it) },
        allowForkSyncing = rawObject["allow_fork_syncing"]?.let { json.decodeFromJsonElement<InlineProtectedBranchAllowForkSyncingX83be2f7f>(it) },
        blockCreations = rawObject["block_creations"]?.let { json.decodeFromJsonElement<InlineProtectedBranchBlockCreationsXc4ebf038>(it) },
        enforceAdmins = rawObject["enforce_admins"]?.let { json.decodeFromJsonElement<InlineProtectedBranchEnforceAdminsXcc585717>(it) },
        lockBranch = rawObject["lock_branch"]?.let { json.decodeFromJsonElement<InlineProtectedBranchLockBranchX8388bfb5>(it) },
        requiredConversationResolution = rawObject["required_conversation_resolution"]?.let { json.decodeFromJsonElement<InlineProtectedBranchRequiredConversationResolutionXb679ea1a>(it) },
        requiredLinearHistory = rawObject["required_linear_history"]?.let { json.decodeFromJsonElement<InlineProtectedBranchRequiredLinearHistoryXac821782>(it) },
        requiredPullRequestReviews = rawObject["required_pull_request_reviews"]?.let { json.decodeFromJsonElement<InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc>(it) },
        requiredSignatures = rawObject["required_signatures"]?.let { json.decodeFromJsonElement<InlineProtectedBranchRequiredSignaturesX2ad00b0f>(it) },
        requiredStatusChecks = rawObject["required_status_checks"]?.let { json.decodeFromJsonElement<StatusCheckPolicy>(it) },
        restrictions = rawObject["restrictions"]?.let { json.decodeFromJsonElement<BranchRestrictionPolicy>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProtectedBranch) {
      val jsonEncoder = encoder.requireJsonEncoder("ProtectedBranch")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
        value.allowDeletions?.let { put("allow_deletions", json.encodeToJsonElement(it)) }
        value.allowForcePushes?.let { put("allow_force_pushes", json.encodeToJsonElement(it)) }
        value.allowForkSyncing?.let { put("allow_fork_syncing", json.encodeToJsonElement(it)) }
        value.blockCreations?.let { put("block_creations", json.encodeToJsonElement(it)) }
        value.enforceAdmins?.let { put("enforce_admins", json.encodeToJsonElement(it)) }
        value.lockBranch?.let { put("lock_branch", json.encodeToJsonElement(it)) }
        value.requiredConversationResolution?.let { put("required_conversation_resolution", json.encodeToJsonElement(it)) }
        value.requiredLinearHistory?.let { put("required_linear_history", json.encodeToJsonElement(it)) }
        value.requiredPullRequestReviews?.let { put("required_pull_request_reviews", json.encodeToJsonElement(it)) }
        value.requiredSignatures?.let { put("required_signatures", json.encodeToJsonElement(it)) }
        value.requiredStatusChecks?.let { put("required_status_checks", json.encodeToJsonElement(it)) }
        value.restrictions?.let { put("restrictions", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun protectedBranch(block: ProtectedBranch.Builder.() -> Unit): ProtectedBranch = ProtectedBranch.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ProtectedBranch is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
