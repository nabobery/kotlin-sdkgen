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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/invoice_settings/properties/issuer/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/invoice_settings/properties/issuer/properties/type
 */
@Serializable(with = InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX9d61a5e5.Serializer::class)
public sealed class InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX9d61a5e5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX9d61a5e5() {
    public override val `value`: String = "account"
  }

  /**
   * Documented value. Wire value: `self`.
   */
  public data object Self : InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX9d61a5e5() {
    public override val `value`: String = "self"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX9d61a5e5()

  public companion object {
    public fun fromValue(`value`: String): InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX9d61a5e5 = when (value) {
      Account.value -> Account
      Self.value -> Self
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX9d61a5e5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX9d61a5e5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX9d61a5e5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX9d61a5e5) {
      encoder.encodeString(value.value)
    }
  }
}
