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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1debit_reversals/get/parameters/7/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1debit_reversals/get/parameters/7/schema
 */
@Serializable(with = InlineV1TreasuryDebitReversalsGetParameterX84bd6647.Serializer::class)
public sealed class InlineV1TreasuryDebitReversalsGetParameterX84bd6647 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineV1TreasuryDebitReversalsGetParameterX84bd6647() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineV1TreasuryDebitReversalsGetParameterX84bd6647() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `processing`.
   */
  public data object Processing : InlineV1TreasuryDebitReversalsGetParameterX84bd6647() {
    public override val `value`: String = "processing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryDebitReversalsGetParameterX84bd6647()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryDebitReversalsGetParameterX84bd6647 = when (value) {
      Canceled.value -> Canceled
      Completed.value -> Completed
      Processing.value -> Processing
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryDebitReversalsGetParameterX84bd6647> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryDebitReversalsGetParameterX84bd6647", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryDebitReversalsGetParameterX84bd6647 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryDebitReversalsGetParameterX84bd6647) {
      encoder.encodeString(value.value)
    }
  }
}
