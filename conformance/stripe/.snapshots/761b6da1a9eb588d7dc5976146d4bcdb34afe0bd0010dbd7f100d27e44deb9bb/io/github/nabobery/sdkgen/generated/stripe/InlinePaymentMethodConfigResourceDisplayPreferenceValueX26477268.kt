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
 * The effective display preference value.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_config_resource_display_preference/properties/value
 */
@Serializable(with = InlinePaymentMethodConfigResourceDisplayPreferenceValueX26477268.Serializer::class)
public sealed class InlinePaymentMethodConfigResourceDisplayPreferenceValueX26477268 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off`.
   */
  public data object Off : InlinePaymentMethodConfigResourceDisplayPreferenceValueX26477268() {
    public override val `value`: String = "off"
  }

  /**
   * Documented value. Wire value: `on`.
   */
  public data object On : InlinePaymentMethodConfigResourceDisplayPreferenceValueX26477268() {
    public override val `value`: String = "on"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodConfigResourceDisplayPreferenceValueX26477268()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodConfigResourceDisplayPreferenceValueX26477268 = when (value) {
      Off.value -> Off
      On.value -> On
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodConfigResourceDisplayPreferenceValueX26477268> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentMethodConfigResourceDisplayPreferenceValueX26477268", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodConfigResourceDisplayPreferenceValueX26477268 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodConfigResourceDisplayPreferenceValueX26477268) {
      encoder.encodeString(value.value)
    }
  }
}
