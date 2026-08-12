package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The field's data type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-field/properties/data_type
 */
@Serializable(with = InlineProjectsV2FieldDataTypeX5cea9560.Serializer::class)
public sealed class InlineProjectsV2FieldDataTypeX5cea9560 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assignees`.
   */
  public data object Assignees : InlineProjectsV2FieldDataTypeX5cea9560() {
    public override val `value`: String = "assignees"
  }

  /**
   * Documented value. Wire value: `linked_pull_requests`.
   */
  public data object LinkedPullRequests : InlineProjectsV2FieldDataTypeX5cea9560() {
    public override val `value`: String = "linked_pull_requests"
  }

  /**
   * Documented value. Wire value: `reviewers`.
   */
  public data object Reviewers : InlineProjectsV2FieldDataTypeX5cea9560() {
    public override val `value`: String = "reviewers"
  }

  /**
   * Documented value. Wire value: `labels`.
   */
  public data object Labels : InlineProjectsV2FieldDataTypeX5cea9560() {
    public override val `value`: String = "labels"
  }

  /**
   * Documented value. Wire value: `milestone`.
   */
  public data object Milestone : InlineProjectsV2FieldDataTypeX5cea9560() {
    public override val `value`: String = "milestone"
  }

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineProjectsV2FieldDataTypeX5cea9560() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `title`.
   */
  public data object Title : InlineProjectsV2FieldDataTypeX5cea9560() {
    public override val `value`: String = "title"
  }

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineProjectsV2FieldDataTypeX5cea9560() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `single_select`.
   */
  public data object SingleSelect : InlineProjectsV2FieldDataTypeX5cea9560() {
    public override val `value`: String = "single_select"
  }

  /**
   * Documented value. Wire value: `number`.
   */
  public data object Number : InlineProjectsV2FieldDataTypeX5cea9560() {
    public override val `value`: String = "number"
  }

  /**
   * Documented value. Wire value: `date`.
   */
  public data object Date : InlineProjectsV2FieldDataTypeX5cea9560() {
    public override val `value`: String = "date"
  }

  /**
   * Documented value. Wire value: `iteration`.
   */
  public data object Iteration : InlineProjectsV2FieldDataTypeX5cea9560() {
    public override val `value`: String = "iteration"
  }

  /**
   * Documented value. Wire value: `issue_type`.
   */
  public data object IssueType : InlineProjectsV2FieldDataTypeX5cea9560() {
    public override val `value`: String = "issue_type"
  }

  /**
   * Documented value. Wire value: `parent_issue`.
   */
  public data object ParentIssue : InlineProjectsV2FieldDataTypeX5cea9560() {
    public override val `value`: String = "parent_issue"
  }

  /**
   * Documented value. Wire value: `sub_issues_progress`.
   */
  public data object SubIssuesProgress : InlineProjectsV2FieldDataTypeX5cea9560() {
    public override val `value`: String = "sub_issues_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineProjectsV2FieldDataTypeX5cea9560()

  public companion object {
    public fun fromValue(`value`: String): InlineProjectsV2FieldDataTypeX5cea9560 = when (value) {
      Assignees.value -> Assignees
      LinkedPullRequests.value -> LinkedPullRequests
      Reviewers.value -> Reviewers
      Labels.value -> Labels
      Milestone.value -> Milestone
      Repository.value -> Repository
      Title.value -> Title
      Text.value -> Text
      SingleSelect.value -> SingleSelect
      Number.value -> Number
      Date.value -> Date
      Iteration.value -> Iteration
      IssueType.value -> IssueType
      ParentIssue.value -> ParentIssue
      SubIssuesProgress.value -> SubIssuesProgress
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineProjectsV2FieldDataTypeX5cea9560> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineProjectsV2FieldDataTypeX5cea9560", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineProjectsV2FieldDataTypeX5cea9560 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineProjectsV2FieldDataTypeX5cea9560) {
      encoder.encodeString(value.value)
    }
  }
}
