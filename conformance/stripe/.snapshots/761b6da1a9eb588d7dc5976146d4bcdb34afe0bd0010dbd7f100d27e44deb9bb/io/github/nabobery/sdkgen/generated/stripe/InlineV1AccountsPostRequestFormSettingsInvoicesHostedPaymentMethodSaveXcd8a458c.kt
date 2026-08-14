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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/invoices/properties/hosted_payment_method_save.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/invoices/properties/hosted_payment_method_save
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveXcd8a458c.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveXcd8a458c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveXcd8a458c() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveXcd8a458c() {
    public override val `value`: String = "never"
  }

  /**
   * Documented value. Wire value: `offer`.
   */
  public data object Offer : InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveXcd8a458c() {
    public override val `value`: String = "offer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveXcd8a458c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveXcd8a458c = when (value) {
      Always.value -> Always
      Never.value -> Never
      Offer.value -> Offer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveXcd8a458c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveXcd8a458c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveXcd8a458c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveXcd8a458c) {
      encoder.encodeString(value.value)
    }
  }
}
