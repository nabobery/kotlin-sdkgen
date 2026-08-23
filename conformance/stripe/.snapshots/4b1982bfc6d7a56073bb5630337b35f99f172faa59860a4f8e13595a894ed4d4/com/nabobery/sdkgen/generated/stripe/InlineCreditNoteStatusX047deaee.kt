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
 * Status of this credit note, one of `issued` or `void`. Learn more about [voiding credit
 * notes](https://docs.stripe.com/billing/invoices/credit-notes#voiding).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_note/properties/status
 */
@Serializable(with = InlineCreditNoteStatusX047deaee.Serializer::class)
public sealed class InlineCreditNoteStatusX047deaee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `issued`.
   */
  public data object Issued : InlineCreditNoteStatusX047deaee() {
    public override val `value`: String = "issued"
  }

  /**
   * Documented value. Wire value: `void`.
   */
  public data object Void : InlineCreditNoteStatusX047deaee() {
    public override val `value`: String = "void"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCreditNoteStatusX047deaee()

  public companion object {
    public fun fromValue(`value`: String): InlineCreditNoteStatusX047deaee = when (value) {
      Issued.value -> Issued
      Void.value -> Void
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCreditNoteStatusX047deaee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCreditNoteStatusX047deaee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCreditNoteStatusX047deaee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCreditNoteStatusX047deaee) {
      encoder.encodeString(value.value)
    }
  }
}
