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
 * The data type of the issue field
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-field-value/properties/data_type
 */
@Serializable(with = InlineIssueFieldValueDataTypeX687b3d7a.Serializer::class)
public sealed class InlineIssueFieldValueDataTypeX687b3d7a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineIssueFieldValueDataTypeX687b3d7a() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `single_select`.
   */
  public data object SingleSelect : InlineIssueFieldValueDataTypeX687b3d7a() {
    public override val `value`: String = "single_select"
  }

  /**
   * Documented value. Wire value: `multi_select`.
   */
  public data object MultiSelect : InlineIssueFieldValueDataTypeX687b3d7a() {
    public override val `value`: String = "multi_select"
  }

  /**
   * Documented value. Wire value: `number`.
   */
  public data object Number : InlineIssueFieldValueDataTypeX687b3d7a() {
    public override val `value`: String = "number"
  }

  /**
   * Documented value. Wire value: `date`.
   */
  public data object Date : InlineIssueFieldValueDataTypeX687b3d7a() {
    public override val `value`: String = "date"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssueFieldValueDataTypeX687b3d7a()

  public companion object {
    public fun fromValue(`value`: String): InlineIssueFieldValueDataTypeX687b3d7a = when (value) {
      Text.value -> Text
      SingleSelect.value -> SingleSelect
      MultiSelect.value -> MultiSelect
      Number.value -> Number
      Date.value -> Date
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssueFieldValueDataTypeX687b3d7a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineIssueFieldValueDataTypeX687b3d7a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssueFieldValueDataTypeX687b3d7a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssueFieldValueDataTypeX687b3d7a) {
      encoder.encodeString(value.value)
    }
  }
}
