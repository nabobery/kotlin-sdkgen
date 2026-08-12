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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_note/properties/object
 */
@Serializable(with = InlineCreditNoteObjectValueX288d9931.Serializer::class)
public sealed class InlineCreditNoteObjectValueX288d9931 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `credit_note`.
   */
  public data object CreditNote : InlineCreditNoteObjectValueX288d9931() {
    public override val `value`: String = "credit_note"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCreditNoteObjectValueX288d9931()

  public companion object {
    public fun fromValue(`value`: String): InlineCreditNoteObjectValueX288d9931 = when (value) {
      CreditNote.value -> CreditNote
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCreditNoteObjectValueX288d9931> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCreditNoteObjectValueX288d9931", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCreditNoteObjectValueX288d9931 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCreditNoteObjectValueX288d9931) {
      encoder.encodeString(value.value)
    }
  }
}
