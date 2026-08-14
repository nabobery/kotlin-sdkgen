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
 * sdkgen://source/openapi.json#/paths/~1v1~1topups/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/payment_method_options/properties/us_bank_account/properties/network.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1topups/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/payment_method_options/properties/us_bank_account/properties/network
 */
@Serializable(with = InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountNetworkX7c23142f.Serializer::class)
public sealed class InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountNetworkX7c23142f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach`.
   */
  public data object Ach : InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountNetworkX7c23142f() {
    public override val `value`: String = "ach"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountNetworkX7c23142f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountNetworkX7c23142f = when (value) {
      Ach.value -> Ach
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountNetworkX7c23142f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountNetworkX7c23142f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountNetworkX7c23142f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountNetworkX7c23142f) {
      encoder.encodeString(value.value)
    }
  }
}
