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
 * The data type of the issue field.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-field/properties/data_type
 */
@Serializable(with = InlineIssueFieldDataTypeXad344c5b.Serializer::class)
public sealed class InlineIssueFieldDataTypeXad344c5b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineIssueFieldDataTypeXad344c5b() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `date`.
   */
  public data object Date : InlineIssueFieldDataTypeXad344c5b() {
    public override val `value`: String = "date"
  }

  /**
   * Documented value. Wire value: `single_select`.
   */
  public data object SingleSelect : InlineIssueFieldDataTypeXad344c5b() {
    public override val `value`: String = "single_select"
  }

  /**
   * Documented value. Wire value: `multi_select`.
   */
  public data object MultiSelect : InlineIssueFieldDataTypeXad344c5b() {
    public override val `value`: String = "multi_select"
  }

  /**
   * Documented value. Wire value: `number`.
   */
  public data object Number : InlineIssueFieldDataTypeXad344c5b() {
    public override val `value`: String = "number"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssueFieldDataTypeXad344c5b()

  public companion object {
    public fun fromValue(`value`: String): InlineIssueFieldDataTypeXad344c5b = when (value) {
      Text.value -> Text
      Date.value -> Date
      SingleSelect.value -> SingleSelect
      MultiSelect.value -> MultiSelect
      Number.value -> Number
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssueFieldDataTypeXad344c5b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineIssueFieldDataTypeXad344c5b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssueFieldDataTypeXad344c5b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssueFieldDataTypeXad344c5b) {
      encoder.encodeString(value.value)
    }
  }
}
