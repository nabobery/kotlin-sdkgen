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
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/lines/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/lines/items/properties/type
 */
@Serializable(with = InlineV1CreditNotesPostRequestFormLinesItemTypeX82a24436.Serializer::class)
public sealed class InlineV1CreditNotesPostRequestFormLinesItemTypeX82a24436 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom_line_item`.
   */
  public data object CustomLineItem : InlineV1CreditNotesPostRequestFormLinesItemTypeX82a24436() {
    public override val `value`: String = "custom_line_item"
  }

  /**
   * Documented value. Wire value: `invoice_line_item`.
   */
  public data object InvoiceLineItem : InlineV1CreditNotesPostRequestFormLinesItemTypeX82a24436() {
    public override val `value`: String = "invoice_line_item"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CreditNotesPostRequestFormLinesItemTypeX82a24436()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CreditNotesPostRequestFormLinesItemTypeX82a24436 = when (value) {
      CustomLineItem.value -> CustomLineItem
      InvoiceLineItem.value -> InvoiceLineItem
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CreditNotesPostRequestFormLinesItemTypeX82a24436> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesPostRequestFormLinesItemTypeX82a24436", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPostRequestFormLinesItemTypeX82a24436 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPostRequestFormLinesItemTypeX82a24436) {
      encoder.encodeString(value.value)
    }
  }
}
