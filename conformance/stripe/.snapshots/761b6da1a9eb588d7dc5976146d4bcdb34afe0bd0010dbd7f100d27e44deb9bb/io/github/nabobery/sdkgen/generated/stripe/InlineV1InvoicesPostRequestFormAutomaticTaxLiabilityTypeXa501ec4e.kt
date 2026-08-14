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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/automatic_tax/properties/liability/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/automatic_tax/properties/liability/properties/type
 */
@Serializable(with = InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityTypeXa501ec4e.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityTypeXa501ec4e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityTypeXa501ec4e() {
    public override val `value`: String = "account"
  }

  /**
   * Documented value. Wire value: `self`.
   */
  public data object Self : InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityTypeXa501ec4e() {
    public override val `value`: String = "self"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityTypeXa501ec4e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityTypeXa501ec4e = when (value) {
      Account.value -> Account
      Self.value -> Self
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityTypeXa501ec4e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityTypeXa501ec4e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityTypeXa501ec4e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityTypeXa501ec4e) {
      encoder.encodeString(value.value)
    }
  }
}
