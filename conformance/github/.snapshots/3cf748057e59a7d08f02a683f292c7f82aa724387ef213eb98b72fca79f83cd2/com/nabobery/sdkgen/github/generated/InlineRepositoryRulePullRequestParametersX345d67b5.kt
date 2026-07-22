package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-pull-request/properties/parameters.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-pull-request/properties/parameters
 */
@Serializable(with = InlineRepositoryRulePullRequestParametersX345d67b5.Serializer::class)
public class InlineRepositoryRulePullRequestParametersX345d67b5(
  /**
   * New, reviewable commits pushed will dismiss previous pull request review approvals.
   */
  public val dismissStaleReviewsOnPush: Boolean,
  /**
   * Require an approving review in pull requests that modify files that have a designated code owner.
   */
  public val requireCodeOwnerReview: Boolean,
  /**
   * Whether the most recent reviewable push must be approved by someone other than the person who pushed it.
   */
  public val requireLastPushApproval: Boolean,
  /**
   * The number of approving reviews that are required before a pull request can be merged.
   */
  public val requiredApprovingReviewCount: Int,
  /**
   * All conversations on code must be resolved before a pull request can be merged.
   */
  public val requiredReviewThreadResolution: Boolean,
  /**
   * Array of allowed merge methods. Allowed values include `merge`, `squash`, and `rebase`. At least one option must be
   * enabled.
   */
  public val allowedMergeMethods:
      List<InlineRepositoryRulePullRequestParametersAllowedMergeMethodsItemX5d1c7941>? = null,
  public val dismissalRestriction: RepositoryRuleParamsDismissalRestriction? = null,
  /**
   * > [!NOTE]
   * > `required_reviewers` is in beta and subject to change.
   *
   * A collection of reviewers and associated file patterns. Each reviewer has a list of file patterns which determine
   * the files that reviewer is required to review.
   */
  public val requiredReviewers: List<RepositoryRuleParamsRequiredReviewerConfiguration>? = null,
) {
  public class Builder {
    private var dismissStaleReviewsOnPushValue: Boolean? = null

    public var dismissStaleReviewsOnPush: Boolean
      get() = requireNotNull(dismissStaleReviewsOnPushValue) { "dismissStaleReviewsOnPush is required" }
      set(`value`) {
        dismissStaleReviewsOnPushValue = value
      }

    private var requireCodeOwnerReviewValue: Boolean? = null

    public var requireCodeOwnerReview: Boolean
      get() = requireNotNull(requireCodeOwnerReviewValue) { "requireCodeOwnerReview is required" }
      set(`value`) {
        requireCodeOwnerReviewValue = value
      }

    private var requireLastPushApprovalValue: Boolean? = null

    public var requireLastPushApproval: Boolean
      get() = requireNotNull(requireLastPushApprovalValue) { "requireLastPushApproval is required" }
      set(`value`) {
        requireLastPushApprovalValue = value
      }

    private var requiredApprovingReviewCountValue: Int? = null

    public var requiredApprovingReviewCount: Int
      get() = requireNotNull(requiredApprovingReviewCountValue) { "requiredApprovingReviewCount is required" }
      set(`value`) {
        requiredApprovingReviewCountValue = value
      }

    private var requiredReviewThreadResolutionValue: Boolean? = null

    public var requiredReviewThreadResolution: Boolean
      get() = requireNotNull(requiredReviewThreadResolutionValue) { "requiredReviewThreadResolution is required" }
      set(`value`) {
        requiredReviewThreadResolutionValue = value
      }

    /**
     * Array of allowed merge methods. Allowed values include `merge`, `squash`, and `rebase`. At least one option must
     * be enabled.
     */
    public var allowedMergeMethods:
        List<InlineRepositoryRulePullRequestParametersAllowedMergeMethodsItemX5d1c7941>? = null

    public var dismissalRestriction: RepositoryRuleParamsDismissalRestriction? = null

    /**
     * > [!NOTE]
     * > `required_reviewers` is in beta and subject to change.
     *
     * A collection of reviewers and associated file patterns. Each reviewer has a list of file patterns which determine
     * the files that reviewer is required to review.
     */
    public var requiredReviewers: List<RepositoryRuleParamsRequiredReviewerConfiguration>? = null

    public fun build(): InlineRepositoryRulePullRequestParametersX345d67b5 {
      check(dismissStaleReviewsOnPushValue != null) { "dismissStaleReviewsOnPush is required" }
      check(requireCodeOwnerReviewValue != null) { "requireCodeOwnerReview is required" }
      check(requireLastPushApprovalValue != null) { "requireLastPushApproval is required" }
      check(requiredApprovingReviewCountValue != null) { "requiredApprovingReviewCount is required" }
      check(requiredReviewThreadResolutionValue != null) { "requiredReviewThreadResolution is required" }
      return InlineRepositoryRulePullRequestParametersX345d67b5(
        dismissStaleReviewsOnPush = dismissStaleReviewsOnPush,
        requireCodeOwnerReview = requireCodeOwnerReview,
        requireLastPushApproval = requireLastPushApproval,
        requiredApprovingReviewCount = requiredApprovingReviewCount,
        requiredReviewThreadResolution = requiredReviewThreadResolution,
        allowedMergeMethods = allowedMergeMethods,
        dismissalRestriction = dismissalRestriction,
        requiredReviewers = requiredReviewers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRulePullRequestParametersX345d67b5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRepositoryRulePullRequestParametersX345d67b5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRulePullRequestParametersX345d67b5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRulePullRequestParametersX345d67b5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRulePullRequestParametersX345d67b5 must be a JSON object")
      val dismissStaleReviewsOnPush = json.decodeRequired<Boolean>(rawObject, "dismiss_stale_reviews_on_push")
      val requireCodeOwnerReview = json.decodeRequired<Boolean>(rawObject, "require_code_owner_review")
      val requireLastPushApproval = json.decodeRequired<Boolean>(rawObject, "require_last_push_approval")
      val requiredApprovingReviewCount = json.decodeRequired<Int>(rawObject, "required_approving_review_count")
      val requiredReviewThreadResolution = json.decodeRequired<Boolean>(rawObject, "required_review_thread_resolution")
      return InlineRepositoryRulePullRequestParametersX345d67b5(
        dismissStaleReviewsOnPush = dismissStaleReviewsOnPush,
        requireCodeOwnerReview = requireCodeOwnerReview,
        requireLastPushApproval = requireLastPushApproval,
        requiredApprovingReviewCount = requiredApprovingReviewCount,
        requiredReviewThreadResolution = requiredReviewThreadResolution,
        allowedMergeMethods = rawObject["allowed_merge_methods"]?.let { json.decodeFromJsonElement<List<InlineRepositoryRulePullRequestParametersAllowedMergeMethodsItemX5d1c7941>>(it) },
        dismissalRestriction = rawObject["dismissal_restriction"]?.let { json.decodeFromJsonElement<RepositoryRuleParamsDismissalRestriction>(it) },
        requiredReviewers = rawObject["required_reviewers"]?.let { json.decodeFromJsonElement<List<RepositoryRuleParamsRequiredReviewerConfiguration>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRulePullRequestParametersX345d67b5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRulePullRequestParametersX345d67b5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("dismiss_stale_reviews_on_push", json.encodeToJsonElement(value.dismissStaleReviewsOnPush))
        put("require_code_owner_review", json.encodeToJsonElement(value.requireCodeOwnerReview))
        put("require_last_push_approval", json.encodeToJsonElement(value.requireLastPushApproval))
        put("required_approving_review_count", json.encodeToJsonElement(value.requiredApprovingReviewCount))
        put("required_review_thread_resolution", json.encodeToJsonElement(value.requiredReviewThreadResolution))
        value.allowedMergeMethods?.let { put("allowed_merge_methods", json.encodeToJsonElement(it)) }
        value.dismissalRestriction?.let { put("dismissal_restriction", json.encodeToJsonElement(it)) }
        value.requiredReviewers?.let { put("required_reviewers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRulePullRequestParametersX345d67b5(block: InlineRepositoryRulePullRequestParametersX345d67b5.Builder.() -> Unit): InlineRepositoryRulePullRequestParametersX345d67b5 = InlineRepositoryRulePullRequestParametersX345d67b5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRulePullRequestParametersX345d67b5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
