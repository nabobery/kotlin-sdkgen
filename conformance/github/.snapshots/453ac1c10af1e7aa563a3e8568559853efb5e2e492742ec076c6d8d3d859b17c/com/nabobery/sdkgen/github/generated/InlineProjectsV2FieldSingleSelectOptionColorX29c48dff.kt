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
 * The color associated with the option.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-field-single-select-option/properties/color
 */
@Serializable(with = InlineProjectsV2FieldSingleSelectOptionColorX29c48dff.Serializer::class)
public sealed class InlineProjectsV2FieldSingleSelectOptionColorX29c48dff {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `BLUE`.
   */
  public data object Blue : InlineProjectsV2FieldSingleSelectOptionColorX29c48dff() {
    public override val `value`: String = "BLUE"
  }

  /**
   * Documented value. Wire value: `GRAY`.
   */
  public data object Gray : InlineProjectsV2FieldSingleSelectOptionColorX29c48dff() {
    public override val `value`: String = "GRAY"
  }

  /**
   * Documented value. Wire value: `GREEN`.
   */
  public data object Green : InlineProjectsV2FieldSingleSelectOptionColorX29c48dff() {
    public override val `value`: String = "GREEN"
  }

  /**
   * Documented value. Wire value: `ORANGE`.
   */
  public data object Orange : InlineProjectsV2FieldSingleSelectOptionColorX29c48dff() {
    public override val `value`: String = "ORANGE"
  }

  /**
   * Documented value. Wire value: `PINK`.
   */
  public data object Pink : InlineProjectsV2FieldSingleSelectOptionColorX29c48dff() {
    public override val `value`: String = "PINK"
  }

  /**
   * Documented value. Wire value: `PURPLE`.
   */
  public data object Purple : InlineProjectsV2FieldSingleSelectOptionColorX29c48dff() {
    public override val `value`: String = "PURPLE"
  }

  /**
   * Documented value. Wire value: `RED`.
   */
  public data object Red : InlineProjectsV2FieldSingleSelectOptionColorX29c48dff() {
    public override val `value`: String = "RED"
  }

  /**
   * Documented value. Wire value: `YELLOW`.
   */
  public data object Yellow : InlineProjectsV2FieldSingleSelectOptionColorX29c48dff() {
    public override val `value`: String = "YELLOW"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineProjectsV2FieldSingleSelectOptionColorX29c48dff()

  public companion object {
    public fun fromValue(`value`: String): InlineProjectsV2FieldSingleSelectOptionColorX29c48dff = when (value) {
      Blue.value -> Blue
      Gray.value -> Gray
      Green.value -> Green
      Orange.value -> Orange
      Pink.value -> Pink
      Purple.value -> Purple
      Red.value -> Red
      Yellow.value -> Yellow
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineProjectsV2FieldSingleSelectOptionColorX29c48dff> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineProjectsV2FieldSingleSelectOptionColorX29c48dff", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineProjectsV2FieldSingleSelectOptionColorX29c48dff = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineProjectsV2FieldSingleSelectOptionColorX29c48dff) {
      encoder.encodeString(value.value)
    }
  }
}
