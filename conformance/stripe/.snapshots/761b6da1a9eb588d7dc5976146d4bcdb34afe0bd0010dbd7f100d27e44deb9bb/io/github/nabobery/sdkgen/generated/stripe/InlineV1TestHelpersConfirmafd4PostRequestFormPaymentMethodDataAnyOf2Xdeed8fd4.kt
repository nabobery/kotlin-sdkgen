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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/name/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/name/anyOf/1
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4.Serializer::class)
public sealed class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2Xdeed8fd4) {
      encoder.encodeString(value.value)
    }
  }
}
