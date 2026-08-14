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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/custom-property-set-payload/properties/value_type
 */
@Serializable(with = InlineCustomPropertySetPayloadValueTypeX84b79c61.Serializer::class)
public sealed class InlineCustomPropertySetPayloadValueTypeX84b79c61 {
  public abstract val `value`: kotlin.String

  /**
   * Documented value. Wire value: `string`.
   */
  public data object String : InlineCustomPropertySetPayloadValueTypeX84b79c61() {
    public override val `value`: kotlin.String = "string"
  }

  /**
   * Documented value. Wire value: `single_select`.
   */
  public data object SingleSelect : InlineCustomPropertySetPayloadValueTypeX84b79c61() {
    public override val `value`: kotlin.String = "single_select"
  }

  /**
   * Documented value. Wire value: `multi_select`.
   */
  public data object MultiSelect : InlineCustomPropertySetPayloadValueTypeX84b79c61() {
    public override val `value`: kotlin.String = "multi_select"
  }

  /**
   * Documented value. Wire value: `true_false`.
   */
  public data object TrueFalse : InlineCustomPropertySetPayloadValueTypeX84b79c61() {
    public override val `value`: kotlin.String = "true_false"
  }

  /**
   * Documented value. Wire value: `url`.
   */
  public data object Url : InlineCustomPropertySetPayloadValueTypeX84b79c61() {
    public override val `value`: kotlin.String = "url"
  }

  public data class SdkUnknown(
    public override val `value`: kotlin.String,
  ) : InlineCustomPropertySetPayloadValueTypeX84b79c61()

  public companion object {
    public fun fromValue(`value`: kotlin.String): InlineCustomPropertySetPayloadValueTypeX84b79c61 = when (value) {
      String.value -> String
      SingleSelect.value -> SingleSelect
      MultiSelect.value -> MultiSelect
      TrueFalse.value -> TrueFalse
      Url.value -> Url
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomPropertySetPayloadValueTypeX84b79c61> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCustomPropertySetPayloadValueTypeX84b79c61", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomPropertySetPayloadValueTypeX84b79c61 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomPropertySetPayloadValueTypeX84b79c61) {
      encoder.encodeString(value.value)
    }
  }
}
