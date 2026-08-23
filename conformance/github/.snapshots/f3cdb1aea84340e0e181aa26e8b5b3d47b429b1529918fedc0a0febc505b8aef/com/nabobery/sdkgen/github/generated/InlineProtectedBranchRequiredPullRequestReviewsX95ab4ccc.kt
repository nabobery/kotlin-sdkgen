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
 * sdkgen://source/openapi.yaml#/components/schemas/protected-branch/properties/required_pull_request_reviews.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/protected-branch/properties/required_pull_request_reviews
 */
@Serializable(with = InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc.Serializer::class)
public class InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val bypassPullRequestAllowances:
      InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e? = null,
  public val dismissStaleReviews: Boolean? = null,
  public val dismissalRestrictions:
      InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2? = null,
  public val requireCodeOwnerReviews: Boolean? = null,
  /**
   * Whether the most recent push must be approved by someone other than the person who pushed it.
   */
  public val requireLastPushApproval: Boolean? = null,
  public val requiredApprovingReviewCount: Int? = null,
) {
  public class Builder {
    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public var bypassPullRequestAllowances:
        InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e? = null

    public var dismissStaleReviews: Boolean? = null

    public var dismissalRestrictions:
        InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2? = null

    public var requireCodeOwnerReviews: Boolean? = null

    /**
     * Whether the most recent push must be approved by someone other than the person who pushed it.
     */
    public var requireLastPushApproval: Boolean? = null

    public var requiredApprovingReviewCount: Int? = null

    public fun build(): InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc {
      check(urlValue != null) { "url is required" }
      return InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc(
        url = url,
        bypassPullRequestAllowances = bypassPullRequestAllowances,
        dismissStaleReviews = dismissStaleReviews,
        dismissalRestrictions = dismissalRestrictions,
        requireCodeOwnerReviews = requireCodeOwnerReviews,
        requireLastPushApproval = requireLastPushApproval,
        requiredApprovingReviewCount = requiredApprovingReviewCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc must be a JSON object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc(
        url = url,
        bypassPullRequestAllowances = rawObject["bypass_pull_request_allowances"]?.let { json.decodeFromJsonElement<InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e>(it) },
        dismissStaleReviews = rawObject["dismiss_stale_reviews"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        dismissalRestrictions = rawObject["dismissal_restrictions"]?.let { json.decodeFromJsonElement<InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2>(it) },
        requireCodeOwnerReviews = rawObject["require_code_owner_reviews"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        requireLastPushApproval = rawObject["require_last_push_approval"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        requiredApprovingReviewCount = rawObject["required_approving_review_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
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

public fun inlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc(block: InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc.Builder.() -> Unit): InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc = InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineProtectedBranchRequiredPullRequestReviewsX95ab4ccc is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
