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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1required_pull_request_r
 * eviews/patch/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1required_pull_request_r
 * eviews/patch/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposBranchesProtectionRequiredPullRequestReviewsPatchRequestJsonXc547f460.Serializer::class)
public class InlineReposBranchesProtectionRequiredPullRequestReviewsPatchRequestJsonXc547f460 internal constructor(
  private val bypassPullRequestAllowancesState:
      FieldState<InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e>,
  private val dismissStaleReviewsState: FieldState<Boolean>,
  private val dismissalRestrictionsState:
      FieldState<InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05>,
  private val requireCodeOwnerReviewsState: FieldState<Boolean>,
  private val requireLastPushApprovalState: FieldState<Boolean>,
  private val requiredApprovingReviewCountState: FieldState<Int>,
) {
  /**
   * Allow specific users, teams, or apps to bypass pull request requirements.
   */
  public val bypassPullRequestAllowances:
      InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e?
    get() = bypassPullRequestAllowancesState.valueOrNull()

  /**
   * Set to `true` if you want to automatically dismiss approving reviews when someone pushes a new commit.
   */
  public val dismissStaleReviews: Boolean?
    get() = dismissStaleReviewsState.valueOrNull()

  /**
   * Specify which users, teams, and apps can dismiss pull request reviews. Pass an empty `dismissal_restrictions`
   * object to disable. User and team `dismissal_restrictions` are only available for organization-owned repositories.
   * Omit this parameter for personal repositories.
   */
  public val dismissalRestrictions:
      InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05?
    get() = dismissalRestrictionsState.valueOrNull()

  /**
   * Blocks merging pull requests until [code owners](https://docs.github.com/articles/about-code-owners/) have
   * reviewed.
   */
  public val requireCodeOwnerReviews: Boolean?
    get() = requireCodeOwnerReviewsState.valueOrNull()

  /**
   * Whether the most recent push must be approved by someone other than the person who pushed it. Default: `false`
   */
  public val requireLastPushApproval: Boolean?
    get() = requireLastPushApprovalState.valueOrNull()

  /**
   * Specifies the number of reviewers required to approve pull requests. Use a number between 1 and 6 or 0 to not
   * require reviewers.
   */
  public val requiredApprovingReviewCount: Int?
    get() = requiredApprovingReviewCountState.valueOrNull()

  public constructor() : this(bypassPullRequestAllowancesState = FieldState.Absent,
  dismissStaleReviewsState = FieldState.Absent,
  dismissalRestrictionsState = FieldState.Absent,
  requireCodeOwnerReviewsState = FieldState.Absent,
  requireLastPushApprovalState = FieldState.Absent,
  requiredApprovingReviewCountState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `bypass_pull_request_allowances`.
   */
  public fun bypassPullRequestAllowancesPresence(): FieldPresence = bypassPullRequestAllowancesState.presence

  /**
   * Returns the wire presence of `dismiss_stale_reviews`.
   */
  public fun dismissStaleReviewsPresence(): FieldPresence = dismissStaleReviewsState.presence

  /**
   * Returns the wire presence of `dismissal_restrictions`.
   */
  public fun dismissalRestrictionsPresence(): FieldPresence = dismissalRestrictionsState.presence

  /**
   * Returns the wire presence of `require_code_owner_reviews`.
   */
  public fun requireCodeOwnerReviewsPresence(): FieldPresence = requireCodeOwnerReviewsState.presence

  /**
   * Returns the wire presence of `require_last_push_approval`.
   */
  public fun requireLastPushApprovalPresence(): FieldPresence = requireLastPushApprovalState.presence

  /**
   * Returns the wire presence of `required_approving_review_count`.
   */
  public fun requiredApprovingReviewCountPresence(): FieldPresence = requiredApprovingReviewCountState.presence

  public class Builder {
    private var bypassPullRequestAllowancesState:
        FieldState<InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e>
        = FieldState.Absent

    /**
     * Allow specific users, teams, or apps to bypass pull request requirements.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var bypassPullRequestAllowances:
        InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e?
      get() = bypassPullRequestAllowancesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "bypassPullRequestAllowances is not nullable; call unsetBypassPullRequestAllowances() to omit it" }
        bypassPullRequestAllowancesState = FieldState.Value(present)
      }

    private var dismissStaleReviewsState: FieldState<Boolean> = FieldState.Absent

    /**
     * Set to `true` if you want to automatically dismiss approving reviews when someone pushes a new commit.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dismissStaleReviews: Boolean?
      get() = dismissStaleReviewsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "dismissStaleReviews is not nullable; call unsetDismissStaleReviews() to omit it" }
        dismissStaleReviewsState = FieldState.Value(present)
      }

    private var dismissalRestrictionsState:
        FieldState<InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05> =
        FieldState.Absent

    /**
     * Specify which users, teams, and apps can dismiss pull request reviews. Pass an empty `dismissal_restrictions`
     * object to disable. User and team `dismissal_restrictions` are only available for organization-owned repositories.
     * Omit this parameter for personal repositories.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dismissalRestrictions:
        InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05?
      get() = dismissalRestrictionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "dismissalRestrictions is not nullable; call unsetDismissalRestrictions() to omit it" }
        dismissalRestrictionsState = FieldState.Value(present)
      }

    private var requireCodeOwnerReviewsState: FieldState<Boolean> = FieldState.Absent

    /**
     * Blocks merging pull requests until [code owners](https://docs.github.com/articles/about-code-owners/) have
     * reviewed.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var requireCodeOwnerReviews: Boolean?
      get() = requireCodeOwnerReviewsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "requireCodeOwnerReviews is not nullable; call unsetRequireCodeOwnerReviews() to omit it" }
        requireCodeOwnerReviewsState = FieldState.Value(present)
      }

    private var requireLastPushApprovalState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether the most recent push must be approved by someone other than the person who pushed it. Default: `false`
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var requireLastPushApproval: Boolean?
      get() = requireLastPushApprovalState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "requireLastPushApproval is not nullable; call unsetRequireLastPushApproval() to omit it" }
        requireLastPushApprovalState = FieldState.Value(present)
      }

    private var requiredApprovingReviewCountState: FieldState<Int> = FieldState.Absent

    /**
     * Specifies the number of reviewers required to approve pull requests. Use a number between 1 and 6 or 0 to not
     * require reviewers.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var requiredApprovingReviewCount: Int?
      get() = requiredApprovingReviewCountState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "requiredApprovingReviewCount is not nullable; call unsetRequiredApprovingReviewCount() to omit it" }
        requiredApprovingReviewCountState = FieldState.Value(present)
      }

    /**
     * Omits `bypass_pull_request_allowances` from serialized output.
     */
    public fun unsetBypassPullRequestAllowances() {
      bypassPullRequestAllowancesState = FieldState.Absent
    }

    /**
     * Omits `dismiss_stale_reviews` from serialized output.
     */
    public fun unsetDismissStaleReviews() {
      dismissStaleReviewsState = FieldState.Absent
    }

    /**
     * Omits `dismissal_restrictions` from serialized output.
     */
    public fun unsetDismissalRestrictions() {
      dismissalRestrictionsState = FieldState.Absent
    }

    /**
     * Omits `require_code_owner_reviews` from serialized output.
     */
    public fun unsetRequireCodeOwnerReviews() {
      requireCodeOwnerReviewsState = FieldState.Absent
    }

    /**
     * Omits `require_last_push_approval` from serialized output.
     */
    public fun unsetRequireLastPushApproval() {
      requireLastPushApprovalState = FieldState.Absent
    }

    /**
     * Omits `required_approving_review_count` from serialized output.
     */
    public fun unsetRequiredApprovingReviewCount() {
      requiredApprovingReviewCountState = FieldState.Absent
    }

    public fun build(): InlineReposBranchesProtectionRequiredPullRequestReviewsPatchRequestJsonXc547f460 = InlineReposBranchesProtectionRequiredPullRequestReviewsPatchRequestJsonXc547f460(
      bypassPullRequestAllowancesState = bypassPullRequestAllowancesState,
      dismissStaleReviewsState = dismissStaleReviewsState,
      dismissalRestrictionsState = dismissalRestrictionsState,
      requireCodeOwnerReviewsState = requireCodeOwnerReviewsState,
      requireLastPushApprovalState = requireLastPushApprovalState,
      requiredApprovingReviewCountState = requiredApprovingReviewCountState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtectionRequiredPullRequestReviewsPatchRequestJsonXc547f460 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposBranchesProtectionRequiredPullRequestReviewsPatchRequestJsonXc547f460> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtectionRequiredPullRequestReviewsPatchRequestJsonXc547f460 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtectionRequiredPullRequestReviewsPatchRequestJsonXc547f460")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtectionRequiredPullRequestReviewsPatchRequestJsonXc547f460 must be a JSON object")
      return InlineReposBranchesProtectionRequiredPullRequestReviewsPatchRequestJsonXc547f460(
        bypassPullRequestAllowancesState = json.decodeOptional(rawObject, "bypass_pull_request_allowances", nullable = false),
        dismissStaleReviewsState = json.decodeOptional(rawObject, "dismiss_stale_reviews", nullable = false),
        dismissalRestrictionsState = json.decodeOptional(rawObject, "dismissal_restrictions", nullable = false),
        requireCodeOwnerReviewsState = json.decodeOptional(rawObject, "require_code_owner_reviews", nullable = false),
        requireLastPushApprovalState = json.decodeOptional(rawObject, "require_last_push_approval", nullable = false),
        requiredApprovingReviewCountState = json.decodeOptional(rawObject, "required_approving_review_count", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtectionRequiredPullRequestReviewsPatchRequestJsonXc547f460) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtectionRequiredPullRequestReviewsPatchRequestJsonXc547f460")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("bypass_pull_request_allowances", value.bypassPullRequestAllowancesState, json::encodeToJsonElement)
        putState("dismiss_stale_reviews", value.dismissStaleReviewsState, json::encodeToJsonElement)
        putState("dismissal_restrictions", value.dismissalRestrictionsState, json::encodeToJsonElement)
        putState("require_code_owner_reviews", value.requireCodeOwnerReviewsState, json::encodeToJsonElement)
        putState("require_last_push_approval", value.requireLastPushApprovalState, json::encodeToJsonElement)
        putState("required_approving_review_count", value.requiredApprovingReviewCountState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtectionRequiredPullRequestReviewsPatchRequestJsonXc547f460(block: InlineReposBranchesProtectionRequiredPullRequestReviewsPatchRequestJsonXc547f460.Builder.() -> Unit): InlineReposBranchesProtectionRequiredPullRequestReviewsPatchRequestJsonXc547f460 = InlineReposBranchesProtectionRequiredPullRequestReviewsPatchRequestJsonXc547f460.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposBranchesProtectionRequiredPullRequestReviewsPatchRequestJsonXc547f460 property '" + name + "' is not nullable")
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
