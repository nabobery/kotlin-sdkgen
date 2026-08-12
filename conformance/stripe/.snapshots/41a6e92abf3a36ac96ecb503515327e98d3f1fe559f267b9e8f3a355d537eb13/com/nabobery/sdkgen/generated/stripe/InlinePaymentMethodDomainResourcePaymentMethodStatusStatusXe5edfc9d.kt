package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The status of the payment method on the domain.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_domain_resource_payment_method_status/properties/stat
 * us
 */
@Serializable(with = InlinePaymentMethodDomainResourcePaymentMethodStatusStatusXe5edfc9d.Serializer::class)
public sealed class InlinePaymentMethodDomainResourcePaymentMethodStatusStatusXe5edfc9d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlinePaymentMethodDomainResourcePaymentMethodStatusStatusXe5edfc9d() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlinePaymentMethodDomainResourcePaymentMethodStatusStatusXe5edfc9d() {
    public override val `value`: String = "inactive"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDomainResourcePaymentMethodStatusStatusXe5edfc9d()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDomainResourcePaymentMethodStatusStatusXe5edfc9d = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDomainResourcePaymentMethodStatusStatusXe5edfc9d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDomainResourcePaymentMethodStatusStatusXe5edfc9d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDomainResourcePaymentMethodStatusStatusXe5edfc9d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDomainResourcePaymentMethodStatusStatusXe5edfc9d) {
      encoder.encodeString(value.value)
    }
  }
}
