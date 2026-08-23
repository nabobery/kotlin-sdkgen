package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class IssueEventForIssueBranch {
  LabeledIssueEvent,
  UnlabeledIssueEvent,
  AssignedIssueEvent,
  UnassignedIssueEvent,
  MilestonedIssueEvent,
  DemilestonedIssueEvent,
  RenamedIssueEvent,
  ReviewRequestedIssueEvent,
  ReviewRequestRemovedIssueEvent,
  ReviewDismissedIssueEvent,
  LockedIssueEvent,
  AddedToProjectIssueEvent,
  MovedColumnInProjectIssueEvent,
  RemovedFromProjectIssueEvent,
  ConvertedNoteToIssueIssueEvent,
  IssueTypeAddedIssueEvent,
  IssueTypeRemovedIssueEvent,
  IssueTypeChangedIssueEvent,
  SubIssueAddedIssueEvent,
  SubIssueRemovedIssueEvent,
  ParentIssueAddedIssueEvent,
  ParentIssueRemovedIssueEvent,
  BlockedByAddedIssueEvent,
  BlockedByRemovedIssueEvent,
  BlockingAddedIssueEvent,
  BlockingRemovedIssueEvent,
}

public sealed class IssueEventForIssueDecodingException(
  message: String,
) : SerializationException(message)

public class IssueEventForIssueNoMatchException(
  message: String,
) : IssueEventForIssueDecodingException(message)

internal data class IssueEventForIssueInspection(
  public val matchesLabeledIssueEvent: Boolean,
  public val matchesUnlabeledIssueEvent: Boolean,
  public val matchesAssignedIssueEvent: Boolean,
  public val matchesUnassignedIssueEvent: Boolean,
  public val matchesMilestonedIssueEvent: Boolean,
  public val matchesDemilestonedIssueEvent: Boolean,
  public val matchesRenamedIssueEvent: Boolean,
  public val matchesReviewRequestedIssueEvent: Boolean,
  public val matchesReviewRequestRemovedIssueEvent: Boolean,
  public val matchesReviewDismissedIssueEvent: Boolean,
  public val matchesLockedIssueEvent: Boolean,
  public val matchesAddedToProjectIssueEvent: Boolean,
  public val matchesMovedColumnInProjectIssueEvent: Boolean,
  public val matchesRemovedFromProjectIssueEvent: Boolean,
  public val matchesConvertedNoteToIssueIssueEvent: Boolean,
  public val matchesIssueTypeAddedIssueEvent: Boolean,
  public val matchesIssueTypeRemovedIssueEvent: Boolean,
  public val matchesIssueTypeChangedIssueEvent: Boolean,
  public val matchesSubIssueAddedIssueEvent: Boolean,
  public val matchesSubIssueRemovedIssueEvent: Boolean,
  public val matchesParentIssueAddedIssueEvent: Boolean,
  public val matchesParentIssueRemovedIssueEvent: Boolean,
  public val matchesBlockedByAddedIssueEvent: Boolean,
  public val matchesBlockedByRemovedIssueEvent: Boolean,
  public val matchesBlockingAddedIssueEvent: Boolean,
  public val matchesBlockingRemovedIssueEvent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesLabeledIssueEvent, matchesUnlabeledIssueEvent, matchesAssignedIssueEvent, matchesUnassignedIssueEvent, matchesMilestonedIssueEvent, matchesDemilestonedIssueEvent, matchesRenamedIssueEvent, matchesReviewRequestedIssueEvent, matchesReviewRequestRemovedIssueEvent, matchesReviewDismissedIssueEvent, matchesLockedIssueEvent, matchesAddedToProjectIssueEvent, matchesMovedColumnInProjectIssueEvent, matchesRemovedFromProjectIssueEvent, matchesConvertedNoteToIssueIssueEvent, matchesIssueTypeAddedIssueEvent, matchesIssueTypeRemovedIssueEvent, matchesIssueTypeChangedIssueEvent, matchesSubIssueAddedIssueEvent, matchesSubIssueRemovedIssueEvent, matchesParentIssueAddedIssueEvent, matchesParentIssueRemovedIssueEvent, matchesBlockedByAddedIssueEvent, matchesBlockedByRemovedIssueEvent, matchesBlockingAddedIssueEvent, matchesBlockingRemovedIssueEvent).count { it }
}

/**
 * Issue Event for Issue
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-event-for-issue
 */
@Serializable(with = IssueEventForIssue.Serializer::class)
public class IssueEventForIssue internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: IssueEventForIssueInspection,
) {
  public val labeledIssueEvent: LabeledIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesLabeledIssueEvent) json.decodeFromJsonElement<LabeledIssueEventView>(raw) else null }

  public val unlabeledIssueEvent: UnlabeledIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesUnlabeledIssueEvent) json.decodeFromJsonElement<UnlabeledIssueEventView>(raw) else null }

  public val assignedIssueEvent: AssignedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAssignedIssueEvent) json.decodeFromJsonElement<AssignedIssueEventView>(raw) else null }

  public val unassignedIssueEvent: UnassignedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesUnassignedIssueEvent) json.decodeFromJsonElement<UnassignedIssueEventView>(raw) else null }

  public val milestonedIssueEvent: MilestonedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesMilestonedIssueEvent) json.decodeFromJsonElement<MilestonedIssueEventView>(raw) else null }

  public val demilestonedIssueEvent: DemilestonedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDemilestonedIssueEvent) json.decodeFromJsonElement<DemilestonedIssueEventView>(raw) else null }

  public val renamedIssueEvent: RenamedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesRenamedIssueEvent) json.decodeFromJsonElement<RenamedIssueEventView>(raw) else null }

  public val reviewRequestedIssueEvent: ReviewRequestedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesReviewRequestedIssueEvent) json.decodeFromJsonElement<ReviewRequestedIssueEventView>(raw) else null }

  public val reviewRequestRemovedIssueEvent: ReviewRequestRemovedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesReviewRequestRemovedIssueEvent) json.decodeFromJsonElement<ReviewRequestRemovedIssueEventView>(raw) else null }

  public val reviewDismissedIssueEvent: ReviewDismissedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesReviewDismissedIssueEvent) json.decodeFromJsonElement<ReviewDismissedIssueEventView>(raw) else null }

  public val lockedIssueEvent: LockedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesLockedIssueEvent) json.decodeFromJsonElement<LockedIssueEventView>(raw) else null }

  public val addedToProjectIssueEvent: AddedToProjectIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAddedToProjectIssueEvent) json.decodeFromJsonElement<AddedToProjectIssueEventView>(raw) else null }

  public val movedColumnInProjectIssueEvent: MovedColumnInProjectIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesMovedColumnInProjectIssueEvent) json.decodeFromJsonElement<MovedColumnInProjectIssueEventView>(raw) else null }

  public val removedFromProjectIssueEvent: RemovedFromProjectIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesRemovedFromProjectIssueEvent) json.decodeFromJsonElement<RemovedFromProjectIssueEventView>(raw) else null }

  public val convertedNoteToIssueIssueEvent: ConvertedNoteToIssueIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesConvertedNoteToIssueIssueEvent) json.decodeFromJsonElement<ConvertedNoteToIssueIssueEventView>(raw) else null }

  public val issueTypeAddedIssueEvent: IssueTypeAddedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssueTypeAddedIssueEvent) json.decodeFromJsonElement<IssueTypeAddedIssueEventView>(raw) else null }

  public val issueTypeRemovedIssueEvent: IssueTypeRemovedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssueTypeRemovedIssueEvent) json.decodeFromJsonElement<IssueTypeRemovedIssueEventView>(raw) else null }

  public val issueTypeChangedIssueEvent: IssueTypeChangedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssueTypeChangedIssueEvent) json.decodeFromJsonElement<IssueTypeChangedIssueEventView>(raw) else null }

  public val subIssueAddedIssueEvent: SubIssueAddedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubIssueAddedIssueEvent) json.decodeFromJsonElement<SubIssueAddedIssueEventView>(raw) else null }

  public val subIssueRemovedIssueEvent: SubIssueRemovedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubIssueRemovedIssueEvent) json.decodeFromJsonElement<SubIssueRemovedIssueEventView>(raw) else null }

  public val parentIssueAddedIssueEvent: ParentIssueAddedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesParentIssueAddedIssueEvent) json.decodeFromJsonElement<ParentIssueAddedIssueEventView>(raw) else null }

  public val parentIssueRemovedIssueEvent: ParentIssueRemovedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesParentIssueRemovedIssueEvent) json.decodeFromJsonElement<ParentIssueRemovedIssueEventView>(raw) else null }

  public val blockedByAddedIssueEvent: BlockedByAddedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBlockedByAddedIssueEvent) json.decodeFromJsonElement<BlockedByAddedIssueEventView>(raw) else null }

  public val blockedByRemovedIssueEvent: BlockedByRemovedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBlockedByRemovedIssueEvent) json.decodeFromJsonElement<BlockedByRemovedIssueEventView>(raw) else null }

  public val blockingAddedIssueEvent: BlockingAddedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBlockingAddedIssueEvent) json.decodeFromJsonElement<BlockingAddedIssueEventView>(raw) else null }

  public val blockingRemovedIssueEvent: BlockingRemovedIssueEventView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBlockingRemovedIssueEvent) json.decodeFromJsonElement<BlockingRemovedIssueEventView>(raw) else null }

  public val matchedBranches: Set<IssueEventForIssueBranch>
    get() = buildSet {
      if (inspection.matchesLabeledIssueEvent) add(IssueEventForIssueBranch.LabeledIssueEvent)
      if (inspection.matchesUnlabeledIssueEvent) add(IssueEventForIssueBranch.UnlabeledIssueEvent)
      if (inspection.matchesAssignedIssueEvent) add(IssueEventForIssueBranch.AssignedIssueEvent)
      if (inspection.matchesUnassignedIssueEvent) add(IssueEventForIssueBranch.UnassignedIssueEvent)
      if (inspection.matchesMilestonedIssueEvent) add(IssueEventForIssueBranch.MilestonedIssueEvent)
      if (inspection.matchesDemilestonedIssueEvent) add(IssueEventForIssueBranch.DemilestonedIssueEvent)
      if (inspection.matchesRenamedIssueEvent) add(IssueEventForIssueBranch.RenamedIssueEvent)
      if (inspection.matchesReviewRequestedIssueEvent) add(IssueEventForIssueBranch.ReviewRequestedIssueEvent)
      if (inspection.matchesReviewRequestRemovedIssueEvent) add(IssueEventForIssueBranch.ReviewRequestRemovedIssueEvent)
      if (inspection.matchesReviewDismissedIssueEvent) add(IssueEventForIssueBranch.ReviewDismissedIssueEvent)
      if (inspection.matchesLockedIssueEvent) add(IssueEventForIssueBranch.LockedIssueEvent)
      if (inspection.matchesAddedToProjectIssueEvent) add(IssueEventForIssueBranch.AddedToProjectIssueEvent)
      if (inspection.matchesMovedColumnInProjectIssueEvent) add(IssueEventForIssueBranch.MovedColumnInProjectIssueEvent)
      if (inspection.matchesRemovedFromProjectIssueEvent) add(IssueEventForIssueBranch.RemovedFromProjectIssueEvent)
      if (inspection.matchesConvertedNoteToIssueIssueEvent) add(IssueEventForIssueBranch.ConvertedNoteToIssueIssueEvent)
      if (inspection.matchesIssueTypeAddedIssueEvent) add(IssueEventForIssueBranch.IssueTypeAddedIssueEvent)
      if (inspection.matchesIssueTypeRemovedIssueEvent) add(IssueEventForIssueBranch.IssueTypeRemovedIssueEvent)
      if (inspection.matchesIssueTypeChangedIssueEvent) add(IssueEventForIssueBranch.IssueTypeChangedIssueEvent)
      if (inspection.matchesSubIssueAddedIssueEvent) add(IssueEventForIssueBranch.SubIssueAddedIssueEvent)
      if (inspection.matchesSubIssueRemovedIssueEvent) add(IssueEventForIssueBranch.SubIssueRemovedIssueEvent)
      if (inspection.matchesParentIssueAddedIssueEvent) add(IssueEventForIssueBranch.ParentIssueAddedIssueEvent)
      if (inspection.matchesParentIssueRemovedIssueEvent) add(IssueEventForIssueBranch.ParentIssueRemovedIssueEvent)
      if (inspection.matchesBlockedByAddedIssueEvent) add(IssueEventForIssueBranch.BlockedByAddedIssueEvent)
      if (inspection.matchesBlockedByRemovedIssueEvent) add(IssueEventForIssueBranch.BlockedByRemovedIssueEvent)
      if (inspection.matchesBlockingAddedIssueEvent) add(IssueEventForIssueBranch.BlockingAddedIssueEvent)
      if (inspection.matchesBlockingRemovedIssueEvent) add(IssueEventForIssueBranch.BlockingRemovedIssueEvent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): IssueEventForIssue {
      val inspection = inspectIssueEventForIssue(raw)
      if (inspection.matchCount == 0) {
        throw IssueEventForIssueNoMatchException("IssueEventForIssue matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return IssueEventForIssue(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<IssueEventForIssue> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssueEventForIssue {
      val jsonDecoder = decoder.requireJsonDecoder("IssueEventForIssue")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: IssueEventForIssue) {
      encoder.requireJsonEncoder("IssueEventForIssue").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectIssueEventForIssue(element: JsonElement): IssueEventForIssueInspection {
  val raw = element as? JsonObject ?: return IssueEventForIssueInspection(
    matchesLabeledIssueEvent = false,
    matchesUnlabeledIssueEvent = false,
    matchesAssignedIssueEvent = false,
    matchesUnassignedIssueEvent = false,
    matchesMilestonedIssueEvent = false,
    matchesDemilestonedIssueEvent = false,
    matchesRenamedIssueEvent = false,
    matchesReviewRequestedIssueEvent = false,
    matchesReviewRequestRemovedIssueEvent = false,
    matchesReviewDismissedIssueEvent = false,
    matchesLockedIssueEvent = false,
    matchesAddedToProjectIssueEvent = false,
    matchesMovedColumnInProjectIssueEvent = false,
    matchesRemovedFromProjectIssueEvent = false,
    matchesConvertedNoteToIssueIssueEvent = false,
    matchesIssueTypeAddedIssueEvent = false,
    matchesIssueTypeRemovedIssueEvent = false,
    matchesIssueTypeChangedIssueEvent = false,
    matchesSubIssueAddedIssueEvent = false,
    matchesSubIssueRemovedIssueEvent = false,
    matchesParentIssueAddedIssueEvent = false,
    matchesParentIssueRemovedIssueEvent = false,
    matchesBlockedByAddedIssueEvent = false,
    matchesBlockedByRemovedIssueEvent = false,
    matchesBlockingAddedIssueEvent = false,
    matchesBlockingRemovedIssueEvent = false,
    failures = listOf("LabeledIssueEvent: expected JSON object", "UnlabeledIssueEvent: expected JSON object", "AssignedIssueEvent: expected JSON object", "UnassignedIssueEvent: expected JSON object", "MilestonedIssueEvent: expected JSON object", "DemilestonedIssueEvent: expected JSON object", "RenamedIssueEvent: expected JSON object", "ReviewRequestedIssueEvent: expected JSON object", "ReviewRequestRemovedIssueEvent: expected JSON object", "ReviewDismissedIssueEvent: expected JSON object", "LockedIssueEvent: expected JSON object", "AddedToProjectIssueEvent: expected JSON object", "MovedColumnInProjectIssueEvent: expected JSON object", "RemovedFromProjectIssueEvent: expected JSON object", "ConvertedNoteToIssueIssueEvent: expected JSON object", "IssueTypeAddedIssueEvent: expected JSON object", "IssueTypeRemovedIssueEvent: expected JSON object", "IssueTypeChangedIssueEvent: expected JSON object", "SubIssueAddedIssueEvent: expected JSON object", "SubIssueRemovedIssueEvent: expected JSON object", "ParentIssueAddedIssueEvent: expected JSON object", "ParentIssueRemovedIssueEvent: expected JSON object", "BlockedByAddedIssueEvent: expected JSON object", "BlockedByRemovedIssueEvent: expected JSON object", "BlockingAddedIssueEvent: expected JSON object", "BlockingRemovedIssueEvent: expected JSON object"),
  )
  val matchesLabeledIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["label"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["url"].isString()
  val matchesUnlabeledIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["label"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["url"].isString()
  val matchesAssignedIssueEvent = raw["actor"] != null && raw["assignee"] != null && raw["assigner"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["url"].isString()
  val matchesUnassignedIssueEvent = raw["actor"] != null && raw["assignee"] != null && raw["assigner"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["url"].isString()
  val matchesMilestonedIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["milestone"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["url"].isString()
  val matchesDemilestonedIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["milestone"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["url"].isString()
  val matchesRenamedIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["rename"] != null && raw["url"].isString()
  val matchesReviewRequestedIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["review_requester"] != null && raw["url"].isString()
  val matchesReviewRequestRemovedIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["review_requester"] != null && raw["url"].isString()
  val matchesReviewDismissedIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["dismissed_review"] != null && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["url"].isString()
  val matchesLockedIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["lock_reason"].isString() && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["url"].isString()
  val matchesAddedToProjectIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["url"].isString()
  val matchesMovedColumnInProjectIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["url"].isString()
  val matchesRemovedFromProjectIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["url"].isString()
  val matchesConvertedNoteToIssueIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["url"].isString()
  val matchesIssueTypeAddedIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["issue_type"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["url"].isString()
  val matchesIssueTypeRemovedIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["prev_issue_type"] != null && raw["url"].isString()
  val matchesIssueTypeChangedIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["issue_type"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["prev_issue_type"] != null && raw["url"].isString()
  val matchesSubIssueAddedIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["sub_issue"] != null && raw["url"].isString()
  val matchesSubIssueRemovedIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["sub_issue"] != null && raw["url"].isString()
  val matchesParentIssueAddedIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["parent_issue"] != null && raw["performed_via_github_app"] != null && raw["url"].isString()
  val matchesParentIssueRemovedIssueEvent = raw["actor"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["parent_issue"] != null && raw["performed_via_github_app"] != null && raw["url"].isString()
  val matchesBlockedByAddedIssueEvent = raw["actor"] != null && raw["blocked_by"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["url"].isString()
  val matchesBlockedByRemovedIssueEvent = raw["actor"] != null && raw["blocked_by"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["url"].isString()
  val matchesBlockingAddedIssueEvent = raw["actor"] != null && raw["blocking"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["url"].isString()
  val matchesBlockingRemovedIssueEvent = raw["actor"] != null && raw["blocking"] != null && raw["commit_id"].isString() && raw["commit_url"].isString() && raw["created_at"].isString() && raw["event"].isString() && raw["id"] != null && raw["node_id"].isString() && raw["performed_via_github_app"] != null && raw["url"].isString()
  return IssueEventForIssueInspection(
    matchesLabeledIssueEvent = matchesLabeledIssueEvent,
    matchesUnlabeledIssueEvent = matchesUnlabeledIssueEvent,
    matchesAssignedIssueEvent = matchesAssignedIssueEvent,
    matchesUnassignedIssueEvent = matchesUnassignedIssueEvent,
    matchesMilestonedIssueEvent = matchesMilestonedIssueEvent,
    matchesDemilestonedIssueEvent = matchesDemilestonedIssueEvent,
    matchesRenamedIssueEvent = matchesRenamedIssueEvent,
    matchesReviewRequestedIssueEvent = matchesReviewRequestedIssueEvent,
    matchesReviewRequestRemovedIssueEvent = matchesReviewRequestRemovedIssueEvent,
    matchesReviewDismissedIssueEvent = matchesReviewDismissedIssueEvent,
    matchesLockedIssueEvent = matchesLockedIssueEvent,
    matchesAddedToProjectIssueEvent = matchesAddedToProjectIssueEvent,
    matchesMovedColumnInProjectIssueEvent = matchesMovedColumnInProjectIssueEvent,
    matchesRemovedFromProjectIssueEvent = matchesRemovedFromProjectIssueEvent,
    matchesConvertedNoteToIssueIssueEvent = matchesConvertedNoteToIssueIssueEvent,
    matchesIssueTypeAddedIssueEvent = matchesIssueTypeAddedIssueEvent,
    matchesIssueTypeRemovedIssueEvent = matchesIssueTypeRemovedIssueEvent,
    matchesIssueTypeChangedIssueEvent = matchesIssueTypeChangedIssueEvent,
    matchesSubIssueAddedIssueEvent = matchesSubIssueAddedIssueEvent,
    matchesSubIssueRemovedIssueEvent = matchesSubIssueRemovedIssueEvent,
    matchesParentIssueAddedIssueEvent = matchesParentIssueAddedIssueEvent,
    matchesParentIssueRemovedIssueEvent = matchesParentIssueRemovedIssueEvent,
    matchesBlockedByAddedIssueEvent = matchesBlockedByAddedIssueEvent,
    matchesBlockedByRemovedIssueEvent = matchesBlockedByRemovedIssueEvent,
    matchesBlockingAddedIssueEvent = matchesBlockingAddedIssueEvent,
    matchesBlockingRemovedIssueEvent = matchesBlockingRemovedIssueEvent,
    failures = buildList {
      if (!matchesLabeledIssueEvent) add("LabeledIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'label', 'node_id', 'performed_via_github_app', 'url' do not match their declared types")
      if (!matchesUnlabeledIssueEvent) add("UnlabeledIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'label', 'node_id', 'performed_via_github_app', 'url' do not match their declared types")
      if (!matchesAssignedIssueEvent) add("AssignedIssueEvent: required properties 'actor', 'assignee', 'assigner', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'node_id', 'performed_via_github_app', 'url' do not match their declared types")
      if (!matchesUnassignedIssueEvent) add("UnassignedIssueEvent: required properties 'actor', 'assignee', 'assigner', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'node_id', 'performed_via_github_app', 'url' do not match their declared types")
      if (!matchesMilestonedIssueEvent) add("MilestonedIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'milestone', 'node_id', 'performed_via_github_app', 'url' do not match their declared types")
      if (!matchesDemilestonedIssueEvent) add("DemilestonedIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'milestone', 'node_id', 'performed_via_github_app', 'url' do not match their declared types")
      if (!matchesRenamedIssueEvent) add("RenamedIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'node_id', 'performed_via_github_app', 'rename', 'url' do not match their declared types")
      if (!matchesReviewRequestedIssueEvent) add("ReviewRequestedIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'node_id', 'performed_via_github_app', 'review_requester', 'url' do not match their declared types")
      if (!matchesReviewRequestRemovedIssueEvent) add("ReviewRequestRemovedIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'node_id', 'performed_via_github_app', 'review_requester', 'url' do not match their declared types")
      if (!matchesReviewDismissedIssueEvent) add("ReviewDismissedIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'dismissed_review', 'event', 'id', 'node_id', 'performed_via_github_app', 'url' do not match their declared types")
      if (!matchesLockedIssueEvent) add("LockedIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'lock_reason', 'node_id', 'performed_via_github_app', 'url' do not match their declared types")
      if (!matchesAddedToProjectIssueEvent) add("AddedToProjectIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'node_id', 'performed_via_github_app', 'url' do not match their declared types")
      if (!matchesMovedColumnInProjectIssueEvent) add("MovedColumnInProjectIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'node_id', 'performed_via_github_app', 'url' do not match their declared types")
      if (!matchesRemovedFromProjectIssueEvent) add("RemovedFromProjectIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'node_id', 'performed_via_github_app', 'url' do not match their declared types")
      if (!matchesConvertedNoteToIssueIssueEvent) add("ConvertedNoteToIssueIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'node_id', 'performed_via_github_app', 'url' do not match their declared types")
      if (!matchesIssueTypeAddedIssueEvent) add("IssueTypeAddedIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'issue_type', 'node_id', 'performed_via_github_app', 'url' do not match their declared types")
      if (!matchesIssueTypeRemovedIssueEvent) add("IssueTypeRemovedIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'node_id', 'performed_via_github_app', 'prev_issue_type', 'url' do not match their declared types")
      if (!matchesIssueTypeChangedIssueEvent) add("IssueTypeChangedIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'issue_type', 'node_id', 'performed_via_github_app', 'prev_issue_type', 'url' do not match their declared types")
      if (!matchesSubIssueAddedIssueEvent) add("SubIssueAddedIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'node_id', 'performed_via_github_app', 'sub_issue', 'url' do not match their declared types")
      if (!matchesSubIssueRemovedIssueEvent) add("SubIssueRemovedIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'node_id', 'performed_via_github_app', 'sub_issue', 'url' do not match their declared types")
      if (!matchesParentIssueAddedIssueEvent) add("ParentIssueAddedIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'node_id', 'parent_issue', 'performed_via_github_app', 'url' do not match their declared types")
      if (!matchesParentIssueRemovedIssueEvent) add("ParentIssueRemovedIssueEvent: required properties 'actor', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'node_id', 'parent_issue', 'performed_via_github_app', 'url' do not match their declared types")
      if (!matchesBlockedByAddedIssueEvent) add("BlockedByAddedIssueEvent: required properties 'actor', 'blocked_by', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'node_id', 'performed_via_github_app', 'url' do not match their declared types")
      if (!matchesBlockedByRemovedIssueEvent) add("BlockedByRemovedIssueEvent: required properties 'actor', 'blocked_by', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'node_id', 'performed_via_github_app', 'url' do not match their declared types")
      if (!matchesBlockingAddedIssueEvent) add("BlockingAddedIssueEvent: required properties 'actor', 'blocking', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'node_id', 'performed_via_github_app', 'url' do not match their declared types")
      if (!matchesBlockingRemovedIssueEvent) add("BlockingRemovedIssueEvent: required properties 'actor', 'blocking', 'commit_id', 'commit_url', 'created_at', 'event', 'id', 'node_id', 'performed_via_github_app', 'url' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
