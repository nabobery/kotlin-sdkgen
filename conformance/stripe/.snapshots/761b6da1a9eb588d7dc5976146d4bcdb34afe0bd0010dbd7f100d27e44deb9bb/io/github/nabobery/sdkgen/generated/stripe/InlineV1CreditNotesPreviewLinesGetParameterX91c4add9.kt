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
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/12/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/12/schema
 */
@Serializable(with = InlineV1CreditNotesPreviewLinesGetParameterX91c4add9.Serializer::class)
public sealed class InlineV1CreditNotesPreviewLinesGetParameterX91c4add9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `duplicate`.
   */
  public data object Duplicate : InlineV1CreditNotesPreviewLinesGetParameterX91c4add9() {
    public override val `value`: String = "duplicate"
  }

  /**
   * Documented value. Wire value: `fraudulent`.
   */
  public data object Fraudulent : InlineV1CreditNotesPreviewLinesGetParameterX91c4add9() {
    public override val `value`: String = "fraudulent"
  }

  /**
   * Documented value. Wire value: `order_change`.
   */
  public data object OrderChange : InlineV1CreditNotesPreviewLinesGetParameterX91c4add9() {
    public override val `value`: String = "order_change"
  }

  /**
   * Documented value. Wire value: `product_unsatisfactory`.
   */
  public data object ProductUnsatisfactory : InlineV1CreditNotesPreviewLinesGetParameterX91c4add9() {
    public override val `value`: String = "product_unsatisfactory"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CreditNotesPreviewLinesGetParameterX91c4add9()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CreditNotesPreviewLinesGetParameterX91c4add9 = when (value) {
      Duplicate.value -> Duplicate
      Fraudulent.value -> Fraudulent
      OrderChange.value -> OrderChange
      ProductUnsatisfactory.value -> ProductUnsatisfactory
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CreditNotesPreviewLinesGetParameterX91c4add9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesPreviewLinesGetParameterX91c4add9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewLinesGetParameterX91c4add9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPreviewLinesGetParameterX91c4add9) {
      encoder.encodeString(value.value)
    }
  }
}
