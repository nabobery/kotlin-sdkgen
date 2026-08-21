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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1funding_instructions/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/bank_transfer/properties/requested_address_types/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1funding_instructions/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/bank_transfer/properties/requested_address_types/items
 */
@Serializable(with = InlineV1CustomersFundingIn90ecPostRequestFormBankTransferItemX9e42681a.Serializer::class)
public sealed class InlineV1CustomersFundingIn90ecPostRequestFormBankTransferItemX9e42681a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `iban`.
   */
  public data object Iban : InlineV1CustomersFundingIn90ecPostRequestFormBankTransferItemX9e42681a() {
    public override val `value`: String = "iban"
  }

  /**
   * Documented value. Wire value: `sort_code`.
   */
  public data object SortCode : InlineV1CustomersFundingIn90ecPostRequestFormBankTransferItemX9e42681a() {
    public override val `value`: String = "sort_code"
  }

  /**
   * Documented value. Wire value: `spei`.
   */
  public data object Spei : InlineV1CustomersFundingIn90ecPostRequestFormBankTransferItemX9e42681a() {
    public override val `value`: String = "spei"
  }

  /**
   * Documented value. Wire value: `zengin`.
   */
  public data object Zengin : InlineV1CustomersFundingIn90ecPostRequestFormBankTransferItemX9e42681a() {
    public override val `value`: String = "zengin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersFundingIn90ecPostRequestFormBankTransferItemX9e42681a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersFundingIn90ecPostRequestFormBankTransferItemX9e42681a = when (value) {
      Iban.value -> Iban
      SortCode.value -> SortCode
      Spei.value -> Spei
      Zengin.value -> Zengin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersFundingIn90ecPostRequestFormBankTransferItemX9e42681a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersFundingIn90ecPostRequestFormBankTransferItemX9e42681a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersFundingIn90ecPostRequestFormBankTransferItemX9e42681a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersFundingIn90ecPostRequestFormBankTransferItemX9e42681a) {
      encoder.encodeString(value.value)
    }
  }
}
