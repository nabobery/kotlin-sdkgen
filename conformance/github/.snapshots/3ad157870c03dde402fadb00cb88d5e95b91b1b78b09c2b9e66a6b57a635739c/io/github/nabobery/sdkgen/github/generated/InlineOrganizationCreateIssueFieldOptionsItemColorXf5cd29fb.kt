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
 * sdkgen://source/openapi.yaml#/components/schemas/organization-create-issue-field/properties/options/items/properties/
 * color
 */
@Serializable(with = InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb.Serializer::class)
public sealed class InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `gray`.
   */
  public data object Gray : InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb() {
    public override val `value`: String = "gray"
  }

  /**
   * Documented value. Wire value: `blue`.
   */
  public data object Blue : InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb() {
    public override val `value`: String = "blue"
  }

  /**
   * Documented value. Wire value: `green`.
   */
  public data object Green : InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb() {
    public override val `value`: String = "green"
  }

  /**
   * Documented value. Wire value: `yellow`.
   */
  public data object Yellow : InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb() {
    public override val `value`: String = "yellow"
  }

  /**
   * Documented value. Wire value: `orange`.
   */
  public data object Orange : InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb() {
    public override val `value`: String = "orange"
  }

  /**
   * Documented value. Wire value: `red`.
   */
  public data object Red : InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb() {
    public override val `value`: String = "red"
  }

  /**
   * Documented value. Wire value: `pink`.
   */
  public data object Pink : InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb() {
    public override val `value`: String = "pink"
  }

  /**
   * Documented value. Wire value: `purple`.
   */
  public data object Purple : InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb() {
    public override val `value`: String = "purple"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb = when (value) {
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

  internal object Serializer : KSerializer<InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationCreateIssueFieldOptionsItemColorXf5cd29fb) {
      encoder.encodeString(value.value)
    }
  }
}
