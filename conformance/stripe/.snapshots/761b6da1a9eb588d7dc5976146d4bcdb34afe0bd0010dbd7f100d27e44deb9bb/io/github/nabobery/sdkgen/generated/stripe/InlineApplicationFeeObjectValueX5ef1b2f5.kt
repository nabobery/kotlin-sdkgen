package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/application_fee/properties/object
 */
@Serializable(with = InlineApplicationFeeObjectValueX5ef1b2f5.Serializer::class)
public sealed class InlineApplicationFeeObjectValueX5ef1b2f5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `application_fee`.
   */
  public data object ApplicationFee : InlineApplicationFeeObjectValueX5ef1b2f5() {
    public override val `value`: String = "application_fee"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineApplicationFeeObjectValueX5ef1b2f5()

  public companion object {
    public fun fromValue(`value`: String): InlineApplicationFeeObjectValueX5ef1b2f5 = when (value) {
      ApplicationFee.value -> ApplicationFee
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineApplicationFeeObjectValueX5ef1b2f5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineApplicationFeeObjectValueX5ef1b2f5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineApplicationFeeObjectValueX5ef1b2f5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineApplicationFeeObjectValueX5ef1b2f5) {
      encoder.encodeString(value.value)
    }
  }
}
