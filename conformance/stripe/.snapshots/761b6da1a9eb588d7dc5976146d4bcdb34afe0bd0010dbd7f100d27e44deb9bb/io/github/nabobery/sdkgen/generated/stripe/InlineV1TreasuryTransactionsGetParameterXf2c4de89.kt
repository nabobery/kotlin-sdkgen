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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1treasury~1transactions/get/parameters/5/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1transactions/get/parameters/5/schema
 */
@Serializable(with = InlineV1TreasuryTransactionsGetParameterXf2c4de89.Serializer::class)
public sealed class InlineV1TreasuryTransactionsGetParameterXf2c4de89 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineV1TreasuryTransactionsGetParameterXf2c4de89() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `posted_at`.
   */
  public data object PostedAt : InlineV1TreasuryTransactionsGetParameterXf2c4de89() {
    public override val `value`: String = "posted_at"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryTransactionsGetParameterXf2c4de89()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryTransactionsGetParameterXf2c4de89 = when (value) {
      Created.value -> Created
      PostedAt.value -> PostedAt
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryTransactionsGetParameterXf2c4de89> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TreasuryTransactionsGetParameterXf2c4de89", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryTransactionsGetParameterXf2c4de89 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryTransactionsGetParameterXf2c4de89) {
      encoder.encodeString(value.value)
    }
  }
}
