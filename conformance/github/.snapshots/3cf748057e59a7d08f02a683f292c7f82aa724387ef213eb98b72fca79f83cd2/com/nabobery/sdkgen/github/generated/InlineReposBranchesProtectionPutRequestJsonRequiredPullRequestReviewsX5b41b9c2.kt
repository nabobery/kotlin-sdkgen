package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * Require at least one approving review on a pull request, before merging. Set to `null` to disable.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection/put/requestBody/content/
 * application~1json/schema/properties/required_pull_request_reviews
 */
@Serializable(with = InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2.Serializer::class)
public class InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2(
  /**
   * Allow specific users, teams, or apps to bypass pull request requirements.
   */
  public val bypassPullRequestAllowances:
      InlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d? = null,
  /**
   * Set to `true` if you want to automatically dismiss approving reviews when someone pushes a new commit.
   */
  public val dismissStaleReviews: Boolean? = null,
  /**
   * Specify which users, teams, and apps can dismiss pull request reviews. Pass an empty `dismissal_restrictions`
   * object to disable. User and team `dismissal_restrictions` are only available for organization-owned repositories.
   * Omit this parameter for personal repositories.
   */
  public val dismissalRestrictions:
      InlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948? = null,
  /**
   * Blocks merging pull requests until [code owners](https://docs.github.com/articles/about-code-owners/) review them.
   */
  public val requireCodeOwnerReviews: Boolean? = null,
  /**
   * Whether the most recent push must be approved by someone other than the person who pushed it. Default: `false`.
   */
  public val requireLastPushApproval: Boolean? = null,
  /**
   * Specify the number of reviewers required to approve pull requests. Use a number between 1 and 6 or 0 to not require
   * reviewers.
   */
  public val requiredApprovingReviewCount: Int? = null,
) {
  public class Builder {
    /**
     * Allow specific users, teams, or apps to bypass pull request requirements.
     */
    public var bypassPullRequestAllowances:
        InlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d? = null

    /**
     * Set to `true` if you want to automatically dismiss approving reviews when someone pushes a new commit.
     */
    public var dismissStaleReviews: Boolean? = null

    /**
     * Specify which users, teams, and apps can dismiss pull request reviews. Pass an empty `dismissal_restrictions`
     * object to disable. User and team `dismissal_restrictions` are only available for organization-owned repositories.
     * Omit this parameter for personal repositories.
     */
    public var dismissalRestrictions:
        InlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948? = null

    /**
     * Blocks merging pull requests until [code owners](https://docs.github.com/articles/about-code-owners/) review
     * them.
     */
    public var requireCodeOwnerReviews: Boolean? = null

    /**
     * Whether the most recent push must be approved by someone other than the person who pushed it. Default: `false`.
     */
    public var requireLastPushApproval: Boolean? = null

    /**
     * Specify the number of reviewers required to approve pull requests. Use a number between 1 and 6 or 0 to not
     * require reviewers.
     */
    public var requiredApprovingReviewCount: Int? = null

    public fun build(): InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2 = InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2(
      bypassPullRequestAllowances = bypassPullRequestAllowances,
      dismissStaleReviews = dismissStaleReviews,
      dismissalRestrictions = dismissalRestrictions,
      requireCodeOwnerReviews = requireCodeOwnerReviews,
      requireLastPushApproval = requireLastPushApproval,
      requiredApprovingReviewCount = requiredApprovingReviewCount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2 must be a JSON object")
      return InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2(
        bypassPullRequestAllowances = rawObject["bypass_pull_request_allowances"]?.let { json.decodeFromJsonElement<InlineReposBranchesProtectionPutRequestJsonBypassPullRequestAllde0eX9270f48d>(it) },
        dismissStaleReviews = rawObject["dismiss_stale_reviews"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        dismissalRestrictions = rawObject["dismissal_restrictions"]?.let { json.decodeFromJsonElement<InlineReposBranchesProtectionPutRequestJsonDismissalRestrictionsX94601948>(it) },
        requireCodeOwnerReviews = rawObject["require_code_owner_reviews"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        requireLastPushApproval = rawObject["require_last_push_approval"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        requiredApprovingReviewCount = rawObject["required_approving_review_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bypassPullRequestAllowances?.let { put("bypass_pull_request_allowances", json.encodeToJsonElement(it)) }
        value.dismissStaleReviews?.let { put("dismiss_stale_reviews", json.encodeToJsonElement(it)) }
        value.dismissalRestrictions?.let { put("dismissal_restrictions", json.encodeToJsonElement(it)) }
        value.requireCodeOwnerReviews?.let { put("require_code_owner_reviews", json.encodeToJsonElement(it)) }
        value.requireLastPushApproval?.let { put("require_last_push_approval", json.encodeToJsonElement(it)) }
        value.requiredApprovingReviewCount?.let { put("required_approving_review_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2(block: InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2.Builder.() -> Unit): InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2 = InlineReposBranchesProtectionPutRequestJsonRequiredPullRequestReviewsX5b41b9c2.build(block)
