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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-update-issue-type/properties/color
 */
@Serializable(with = InlineOrganizationUpdateIssueTypeColorX54e4eff9.Serializer::class)
public sealed class InlineOrganizationUpdateIssueTypeColorX54e4eff9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `gray`.
   */
  public data object Gray : InlineOrganizationUpdateIssueTypeColorX54e4eff9() {
    public override val `value`: String = "gray"
  }

  /**
   * Documented value. Wire value: `blue`.
   */
  public data object Blue : InlineOrganizationUpdateIssueTypeColorX54e4eff9() {
    public override val `value`: String = "blue"
  }

  /**
   * Documented value. Wire value: `green`.
   */
  public data object Green : InlineOrganizationUpdateIssueTypeColorX54e4eff9() {
    public override val `value`: String = "green"
  }

  /**
   * Documented value. Wire value: `yellow`.
   */
  public data object Yellow : InlineOrganizationUpdateIssueTypeColorX54e4eff9() {
    public override val `value`: String = "yellow"
  }

  /**
   * Documented value. Wire value: `orange`.
   */
  public data object Orange : InlineOrganizationUpdateIssueTypeColorX54e4eff9() {
    public override val `value`: String = "orange"
  }

  /**
   * Documented value. Wire value: `red`.
   */
  public data object Red : InlineOrganizationUpdateIssueTypeColorX54e4eff9() {
    public override val `value`: String = "red"
  }

  /**
   * Documented value. Wire value: `pink`.
   */
  public data object Pink : InlineOrganizationUpdateIssueTypeColorX54e4eff9() {
    public override val `value`: String = "pink"
  }

  /**
   * Documented value. Wire value: `purple`.
   */
  public data object Purple : InlineOrganizationUpdateIssueTypeColorX54e4eff9() {
    public override val `value`: String = "purple"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationUpdateIssueTypeColorX54e4eff9()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationUpdateIssueTypeColorX54e4eff9 = when (value) {
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

  internal object Serializer : KSerializer<InlineOrganizationUpdateIssueTypeColorX54e4eff9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrganizationUpdateIssueTypeColorX54e4eff9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationUpdateIssueTypeColorX54e4eff9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationUpdateIssueTypeColorX54e4eff9) {
      encoder.encodeString(value.value)
    }
  }
}
