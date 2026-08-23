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
 * Protected Branch Pull Request Review
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/protected-branch-pull-request-review
 */
@Serializable(with = ProtectedBranchPullRequestReview.Serializer::class)
public class ProtectedBranchPullRequestReview(
  public val dismissStaleReviews: Boolean,
  public val requireCodeOwnerReviews: Boolean,
  /**
   * Allow specific users, teams, or apps to bypass pull request requirements.
   */
  public val bypassPullRequestAllowances:
      InlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf? = null,
  public val dismissalRestrictions:
      InlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492? = null,
  /**
   * Whether the most recent push must be approved by someone other than the person who pushed it.
   */
  public val requireLastPushApproval: Boolean? = null,
  public val requiredApprovingReviewCount: Int? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String? = null,
) {
  public class Builder {
    private var dismissStaleReviewsValue: Boolean? = null

    public var dismissStaleReviews: Boolean
      get() = requireNotNull(dismissStaleReviewsValue) { "dismissStaleReviews is required" }
      set(`value`) {
        dismissStaleReviewsValue = value
      }

    private var requireCodeOwnerReviewsValue: Boolean? = null

    public var requireCodeOwnerReviews: Boolean
      get() = requireNotNull(requireCodeOwnerReviewsValue) { "requireCodeOwnerReviews is required" }
      set(`value`) {
        requireCodeOwnerReviewsValue = value
      }

    /**
     * Allow specific users, teams, or apps to bypass pull request requirements.
     */
    public var bypassPullRequestAllowances:
        InlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf? = null

    public var dismissalRestrictions:
        InlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492? = null

    /**
     * Whether the most recent push must be approved by someone other than the person who pushed it.
     */
    public var requireLastPushApproval: Boolean? = null

    public var requiredApprovingReviewCount: Int? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    public fun build(): ProtectedBranchPullRequestReview {
      check(dismissStaleReviewsValue != null) { "dismissStaleReviews is required" }
      check(requireCodeOwnerReviewsValue != null) { "requireCodeOwnerReviews is required" }
      return ProtectedBranchPullRequestReview(
        dismissStaleReviews = dismissStaleReviews,
        requireCodeOwnerReviews = requireCodeOwnerReviews,
        bypassPullRequestAllowances = bypassPullRequestAllowances,
        dismissalRestrictions = dismissalRestrictions,
        requireLastPushApproval = requireLastPushApproval,
        requiredApprovingReviewCount = requiredApprovingReviewCount,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProtectedBranchPullRequestReview = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ProtectedBranchPullRequestReview> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProtectedBranchPullRequestReview {
      val jsonDecoder = decoder.requireJsonDecoder("ProtectedBranchPullRequestReview")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProtectedBranchPullRequestReview must be a JSON object")
      val dismissStaleReviews = json.decodeRequired<Boolean>(rawObject, "dismiss_stale_reviews")
      val requireCodeOwnerReviews = json.decodeRequired<Boolean>(rawObject, "require_code_owner_reviews")
      return ProtectedBranchPullRequestReview(
        dismissStaleReviews = dismissStaleReviews,
        requireCodeOwnerReviews = requireCodeOwnerReviews,
        bypassPullRequestAllowances = rawObject["bypass_pull_request_allowances"]?.let { json.decodeFromJsonElement<InlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf>(it) },
        dismissalRestrictions = rawObject["dismissal_restrictions"]?.let { json.decodeFromJsonElement<InlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492>(it) },
        requireLastPushApproval = rawObject["require_last_push_approval"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        requiredApprovingReviewCount = rawObject["required_approving_review_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProtectedBranchPullRequestReview) {
      val jsonEncoder = encoder.requireJsonEncoder("ProtectedBranchPullRequestReview")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("dismiss_stale_reviews", json.encodeToJsonElement(value.dismissStaleReviews))
        put("require_code_owner_reviews", json.encodeToJsonElement(value.requireCodeOwnerReviews))
        value.bypassPullRequestAllowances?.let { put("bypass_pull_request_allowances", json.encodeToJsonElement(it)) }
        value.dismissalRestrictions?.let { put("dismissal_restrictions", json.encodeToJsonElement(it)) }
        value.requireLastPushApproval?.let { put("require_last_push_approval", json.encodeToJsonElement(it)) }
        value.requiredApprovingReviewCount?.let { put("required_approving_review_count", json.encodeToJsonElement(it)) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun protectedBranchPullRequestReview(block: ProtectedBranchPullRequestReview.Builder.() -> Unit): ProtectedBranchPullRequestReview = ProtectedBranchPullRequestReview.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ProtectedBranchPullRequestReview is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
