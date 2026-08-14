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
 * The account's display preference.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_config_resource_display_preference/properties/prefere
 * nce
 */
@Serializable(with = InlinePaymentMethodConfigResourceDisplayPreferencePreferenceX8d28a137.Serializer::class)
public sealed class InlinePaymentMethodConfigResourceDisplayPreferencePreferenceX8d28a137 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlinePaymentMethodConfigResourceDisplayPreferencePreferenceX8d28a137() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `off`.
   */
  public data object Off : InlinePaymentMethodConfigResourceDisplayPreferencePreferenceX8d28a137() {
    public override val `value`: String = "off"
  }

  /**
   * Documented value. Wire value: `on`.
   */
  public data object On : InlinePaymentMethodConfigResourceDisplayPreferencePreferenceX8d28a137() {
    public override val `value`: String = "on"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodConfigResourceDisplayPreferencePreferenceX8d28a137()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodConfigResourceDisplayPreferencePreferenceX8d28a137 = when (value) {
      None.value -> None
      Off.value -> Off
      On.value -> On
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodConfigResourceDisplayPreferencePreferenceX8d28a137> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentMethodConfigResourceDisplayPreferencePreferenceX8d28a137", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodConfigResourceDisplayPreferencePreferenceX8d28a137 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodConfigResourceDisplayPreferencePreferenceX8d28a137) {
      encoder.encodeString(value.value)
    }
  }
}
