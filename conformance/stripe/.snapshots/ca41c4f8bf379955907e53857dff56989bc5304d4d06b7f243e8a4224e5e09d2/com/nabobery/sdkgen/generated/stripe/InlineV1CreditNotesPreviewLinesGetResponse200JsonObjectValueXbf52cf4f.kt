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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/responses/200/content/application~1json/sc
 * hema/properties/object
 */
@Serializable(with = InlineV1CreditNotesPreviewLinesGetResponse200JsonObjectValueXbf52cf4f.Serializer::class)
public sealed class InlineV1CreditNotesPreviewLinesGetResponse200JsonObjectValueXbf52cf4f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1CreditNotesPreviewLinesGetResponse200JsonObjectValueXbf52cf4f() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CreditNotesPreviewLinesGetResponse200JsonObjectValueXbf52cf4f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CreditNotesPreviewLinesGetResponse200JsonObjectValueXbf52cf4f = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CreditNotesPreviewLinesGetResponse200JsonObjectValueXbf52cf4f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesPreviewLinesGetResponse200JsonObjectValueXbf52cf4f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewLinesGetResponse200JsonObjectValueXbf52cf4f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPreviewLinesGetResponse200JsonObjectValueXbf52cf4f) {
      encoder.encodeString(value.value)
    }
  }
}
