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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1debit_reversals/get/parameters/5/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1debit_reversals/get/parameters/5/schema
 */
@Serializable(with = InlineV1TreasuryDebitReversalsGetParameterX0e44ceda.Serializer::class)
public sealed class InlineV1TreasuryDebitReversalsGetParameterX0e44ceda {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `lost`.
   */
  public data object Lost : InlineV1TreasuryDebitReversalsGetParameterX0e44ceda() {
    public override val `value`: String = "lost"
  }

  /**
   * Documented value. Wire value: `won`.
   */
  public data object Won : InlineV1TreasuryDebitReversalsGetParameterX0e44ceda() {
    public override val `value`: String = "won"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryDebitReversalsGetParameterX0e44ceda()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryDebitReversalsGetParameterX0e44ceda = when (value) {
      Lost.value -> Lost
      Won.value -> Won
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryDebitReversalsGetParameterX0e44ceda> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryDebitReversalsGetParameterX0e44ceda", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryDebitReversalsGetParameterX0e44ceda = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryDebitReversalsGetParameterX0e44ceda) {
      encoder.encodeString(value.value)
    }
  }
}
