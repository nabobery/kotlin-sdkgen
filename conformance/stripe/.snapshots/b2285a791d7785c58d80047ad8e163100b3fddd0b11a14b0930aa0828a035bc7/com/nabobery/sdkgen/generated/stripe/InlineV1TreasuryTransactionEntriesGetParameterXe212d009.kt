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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1transaction_entries/get/parameters/6/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1transaction_entries/get/parameters/6/schema
 */
@Serializable(with = InlineV1TreasuryTransactionEntriesGetParameterXe212d009.Serializer::class)
public sealed class InlineV1TreasuryTransactionEntriesGetParameterXe212d009 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineV1TreasuryTransactionEntriesGetParameterXe212d009() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `effective_at`.
   */
  public data object EffectiveAt : InlineV1TreasuryTransactionEntriesGetParameterXe212d009() {
    public override val `value`: String = "effective_at"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryTransactionEntriesGetParameterXe212d009()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryTransactionEntriesGetParameterXe212d009 = when (value) {
      Created.value -> Created
      EffectiveAt.value -> EffectiveAt
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TreasuryTransactionEntriesGetParameterXe212d009> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryTransactionEntriesGetParameterXe212d009", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryTransactionEntriesGetParameterXe212d009 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryTransactionEntriesGetParameterXe212d009) {
      encoder.encodeString(value.value)
    }
  }
}
