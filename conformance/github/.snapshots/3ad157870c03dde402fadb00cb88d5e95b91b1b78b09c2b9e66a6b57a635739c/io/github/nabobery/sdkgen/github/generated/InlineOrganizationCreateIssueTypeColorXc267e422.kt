package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Color for the issue type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-create-issue-type/properties/color
 */
@Serializable(with = InlineOrganizationCreateIssueTypeColorXc267e422.Serializer::class)
public sealed class InlineOrganizationCreateIssueTypeColorXc267e422 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `gray`.
   */
  public data object Gray : InlineOrganizationCreateIssueTypeColorXc267e422() {
    public override val `value`: String = "gray"
  }

  /**
   * Documented value. Wire value: `blue`.
   */
  public data object Blue : InlineOrganizationCreateIssueTypeColorXc267e422() {
    public override val `value`: String = "blue"
  }

  /**
   * Documented value. Wire value: `green`.
   */
  public data object Green : InlineOrganizationCreateIssueTypeColorXc267e422() {
    public override val `value`: String = "green"
  }

  /**
   * Documented value. Wire value: `yellow`.
   */
  public data object Yellow : InlineOrganizationCreateIssueTypeColorXc267e422() {
    public override val `value`: String = "yellow"
  }

  /**
   * Documented value. Wire value: `orange`.
   */
  public data object Orange : InlineOrganizationCreateIssueTypeColorXc267e422() {
    public override val `value`: String = "orange"
  }

  /**
   * Documented value. Wire value: `red`.
   */
  public data object Red : InlineOrganizationCreateIssueTypeColorXc267e422() {
    public override val `value`: String = "red"
  }

  /**
   * Documented value. Wire value: `pink`.
   */
  public data object Pink : InlineOrganizationCreateIssueTypeColorXc267e422() {
    public override val `value`: String = "pink"
  }

  /**
   * Documented value. Wire value: `purple`.
   */
  public data object Purple : InlineOrganizationCreateIssueTypeColorXc267e422() {
    public override val `value`: String = "purple"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationCreateIssueTypeColorXc267e422()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationCreateIssueTypeColorXc267e422 = when (value) {
      Gray.value -> Gray
      Blue.value -> Blue
      Green.value -> Green
      Yellow.value -> Yellow
      Orange.value -> Orange
      Red.value -> Red
      Pink.value -> Pink
      Purple.value -> Purple
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrganizationCreateIssueTypeColorXc267e422> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrganizationCreateIssueTypeColorXc267e422", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationCreateIssueTypeColorXc267e422 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationCreateIssueTypeColorXc267e422) {
      encoder.encodeString(value.value)
    }
  }
}
