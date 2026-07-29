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
 * Type of email to send to the customer, one of `credit_note` or `none` and the default is `credit_note`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/email_type
 */
@Serializable(with = InlineV1CreditNotesPostRequestFormEmailTypeX85727b78.Serializer::class)
public sealed class InlineV1CreditNotesPostRequestFormEmailTypeX85727b78 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `credit_note`.
   */
  public data object CreditNote : InlineV1CreditNotesPostRequestFormEmailTypeX85727b78() {
    public override val `value`: String = "credit_note"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1CreditNotesPostRequestFormEmailTypeX85727b78() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CreditNotesPostRequestFormEmailTypeX85727b78()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CreditNotesPostRequestFormEmailTypeX85727b78 = when (value) {
      CreditNote.value -> CreditNote
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CreditNotesPostRequestFormEmailTypeX85727b78> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesPostRequestFormEmailTypeX85727b78", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPostRequestFormEmailTypeX85727b78 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPostRequestFormEmailTypeX85727b78) {
      encoder.encodeString(value.value)
    }
  }
}
