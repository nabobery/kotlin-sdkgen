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
 * The source balance to use for this transfer. One of `bank_account`, `card`, or `fpx`. For most users, this will
 * default to `card`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1transfers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/source_type
 */
@Serializable(with = InlineV1TransfersPostRequestFormSourceTypeX11473d86.Serializer::class)
public sealed class InlineV1TransfersPostRequestFormSourceTypeX11473d86 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bank_account`.
   */
  public data object BankAccount : InlineV1TransfersPostRequestFormSourceTypeX11473d86() {
    public override val `value`: String = "bank_account"
  }

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineV1TransfersPostRequestFormSourceTypeX11473d86() {
    public override val `value`: String = "card"
  }

  /**
   * Documented value. Wire value: `fpx`.
   */
  public data object Fpx : InlineV1TransfersPostRequestFormSourceTypeX11473d86() {
    public override val `value`: String = "fpx"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TransfersPostRequestFormSourceTypeX11473d86()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TransfersPostRequestFormSourceTypeX11473d86 = when (value) {
      BankAccount.value -> BankAccount
      Card.value -> Card
      Fpx.value -> Fpx
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TransfersPostRequestFormSourceTypeX11473d86> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TransfersPostRequestFormSourceTypeX11473d86", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TransfersPostRequestFormSourceTypeX11473d86 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TransfersPostRequestFormSourceTypeX11473d86) {
      encoder.encodeString(value.value)
    }
  }
}
