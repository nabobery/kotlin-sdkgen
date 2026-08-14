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
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/3/schema
 */
@Serializable(with = InlineV1CreditNotesPreviewLinesGetParameterX222f7cc8.Serializer::class)
public sealed class InlineV1CreditNotesPreviewLinesGetParameterX222f7cc8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `credit_note`.
   */
  public data object CreditNote : InlineV1CreditNotesPreviewLinesGetParameterX222f7cc8() {
    public override val `value`: String = "credit_note"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1CreditNotesPreviewLinesGetParameterX222f7cc8() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CreditNotesPreviewLinesGetParameterX222f7cc8()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CreditNotesPreviewLinesGetParameterX222f7cc8 = when (value) {
      CreditNote.value -> CreditNote
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CreditNotesPreviewLinesGetParameterX222f7cc8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesPreviewLinesGetParameterX222f7cc8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewLinesGetParameterX222f7cc8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPreviewLinesGetParameterX222f7cc8) {
      encoder.encodeString(value.value)
    }
  }
}
