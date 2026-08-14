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
 * Color for the option.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/organization-update-issue-field/properties/options/items/properties/
 * color
 */
@Serializable(with = InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4.Serializer::class)
public sealed class InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `gray`.
   */
  public data object Gray : InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4() {
    public override val `value`: String = "gray"
  }

  /**
   * Documented value. Wire value: `blue`.
   */
  public data object Blue : InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4() {
    public override val `value`: String = "blue"
  }

  /**
   * Documented value. Wire value: `green`.
   */
  public data object Green : InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4() {
    public override val `value`: String = "green"
  }

  /**
   * Documented value. Wire value: `yellow`.
   */
  public data object Yellow : InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4() {
    public override val `value`: String = "yellow"
  }

  /**
   * Documented value. Wire value: `orange`.
   */
  public data object Orange : InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4() {
    public override val `value`: String = "orange"
  }

  /**
   * Documented value. Wire value: `red`.
   */
  public data object Red : InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4() {
    public override val `value`: String = "red"
  }

  /**
   * Documented value. Wire value: `pink`.
   */
  public data object Pink : InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4() {
    public override val `value`: String = "pink"
  }

  /**
   * Documented value. Wire value: `purple`.
   */
  public data object Purple : InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4() {
    public override val `value`: String = "purple"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4 = when (value) {
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

  internal object Serializer : KSerializer<InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationUpdateIssueFieldOptionsItemColorXf1f748c4) {
      encoder.encodeString(value.value)
    }
  }
}
