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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/invoice_settings/properties/issuer/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/invoice_settings/properties/issuer/properties/type
 */
@Serializable(with = InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX61c3643b.Serializer::class)
public sealed class InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX61c3643b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX61c3643b() {
    public override val `value`: String = "account"
  }

  /**
   * Documented value. Wire value: `self`.
   */
  public data object Self : InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX61c3643b() {
    public override val `value`: String = "self"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX61c3643b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX61c3643b = when (value) {
      Account.value -> Account
      Self.value -> Self
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX61c3643b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX61c3643b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX61c3643b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX61c3643b) {
      encoder.encodeString(value.value)
    }
  }
}
