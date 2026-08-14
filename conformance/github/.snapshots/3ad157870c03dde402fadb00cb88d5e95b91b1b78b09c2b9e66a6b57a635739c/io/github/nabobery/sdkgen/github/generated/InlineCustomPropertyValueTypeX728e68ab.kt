package io.github.nabobery.sdkgen.github.generated

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The type of the value for the property
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/custom-property/properties/value_type
 */
@Serializable(with = InlineCustomPropertyValueTypeX728e68ab.Serializer::class)
public sealed class InlineCustomPropertyValueTypeX728e68ab {
  public abstract val `value`: kotlin.String

  /**
   * Documented value. Wire value: `string`.
   */
  public data object String : InlineCustomPropertyValueTypeX728e68ab() {
    public override val `value`: kotlin.String = "string"
  }

  /**
   * Documented value. Wire value: `single_select`.
   */
  public data object SingleSelect : InlineCustomPropertyValueTypeX728e68ab() {
    public override val `value`: kotlin.String = "single_select"
  }

  /**
   * Documented value. Wire value: `multi_select`.
   */
  public data object MultiSelect : InlineCustomPropertyValueTypeX728e68ab() {
    public override val `value`: kotlin.String = "multi_select"
  }

  /**
   * Documented value. Wire value: `true_false`.
   */
  public data object TrueFalse : InlineCustomPropertyValueTypeX728e68ab() {
    public override val `value`: kotlin.String = "true_false"
  }

  /**
   * Documented value. Wire value: `url`.
   */
  public data object Url : InlineCustomPropertyValueTypeX728e68ab() {
    public override val `value`: kotlin.String = "url"
  }

  public data class SdkUnknown(
    public override val `value`: kotlin.String,
  ) : InlineCustomPropertyValueTypeX728e68ab()

  public companion object {
    public fun fromValue(`value`: kotlin.String): InlineCustomPropertyValueTypeX728e68ab = when (value) {
      String.value -> String
      SingleSelect.value -> SingleSelect
      MultiSelect.value -> MultiSelect
      TrueFalse.value -> TrueFalse
      Url.value -> Url
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomPropertyValueTypeX728e68ab> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCustomPropertyValueTypeX728e68ab", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomPropertyValueTypeX728e68ab = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomPropertyValueTypeX728e68ab) {
      encoder.encodeString(value.value)
    }
  }
}
