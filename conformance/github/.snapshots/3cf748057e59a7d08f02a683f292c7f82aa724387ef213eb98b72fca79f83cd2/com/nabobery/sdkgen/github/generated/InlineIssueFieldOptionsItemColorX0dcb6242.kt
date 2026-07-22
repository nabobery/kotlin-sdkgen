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
 * The color of the option.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-field/properties/options/items/properties/color
 */
@Serializable(with = InlineIssueFieldOptionsItemColorX0dcb6242.Serializer::class)
public sealed class InlineIssueFieldOptionsItemColorX0dcb6242 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `gray`.
   */
  public data object Gray : InlineIssueFieldOptionsItemColorX0dcb6242() {
    public override val `value`: String = "gray"
  }

  /**
   * Documented value. Wire value: `blue`.
   */
  public data object Blue : InlineIssueFieldOptionsItemColorX0dcb6242() {
    public override val `value`: String = "blue"
  }

  /**
   * Documented value. Wire value: `green`.
   */
  public data object Green : InlineIssueFieldOptionsItemColorX0dcb6242() {
    public override val `value`: String = "green"
  }

  /**
   * Documented value. Wire value: `yellow`.
   */
  public data object Yellow : InlineIssueFieldOptionsItemColorX0dcb6242() {
    public override val `value`: String = "yellow"
  }

  /**
   * Documented value. Wire value: `orange`.
   */
  public data object Orange : InlineIssueFieldOptionsItemColorX0dcb6242() {
    public override val `value`: String = "orange"
  }

  /**
   * Documented value. Wire value: `red`.
   */
  public data object Red : InlineIssueFieldOptionsItemColorX0dcb6242() {
    public override val `value`: String = "red"
  }

  /**
   * Documented value. Wire value: `pink`.
   */
  public data object Pink : InlineIssueFieldOptionsItemColorX0dcb6242() {
    public override val `value`: String = "pink"
  }

  /**
   * Documented value. Wire value: `purple`.
   */
  public data object Purple : InlineIssueFieldOptionsItemColorX0dcb6242() {
    public override val `value`: String = "purple"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssueFieldOptionsItemColorX0dcb6242()

  public companion object {
    public fun fromValue(`value`: String): InlineIssueFieldOptionsItemColorX0dcb6242 = when (value) {
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

  public object Serializer : KSerializer<InlineIssueFieldOptionsItemColorX0dcb6242> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineIssueFieldOptionsItemColorX0dcb6242", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssueFieldOptionsItemColorX0dcb6242 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssueFieldOptionsItemColorX0dcb6242) {
      encoder.encodeString(value.value)
    }
  }
}
