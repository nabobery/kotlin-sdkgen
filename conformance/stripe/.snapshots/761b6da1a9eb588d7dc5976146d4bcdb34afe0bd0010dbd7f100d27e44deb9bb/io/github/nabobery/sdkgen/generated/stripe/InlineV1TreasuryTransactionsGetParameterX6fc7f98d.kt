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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1treasury~1transactions/get/parameters/7/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1transactions/get/parameters/7/schema
 */
@Serializable(with = InlineV1TreasuryTransactionsGetParameterX6fc7f98d.Serializer::class)
public sealed class InlineV1TreasuryTransactionsGetParameterX6fc7f98d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineV1TreasuryTransactionsGetParameterX6fc7f98d() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `posted`.
   */
  public data object Posted : InlineV1TreasuryTransactionsGetParameterX6fc7f98d() {
    public override val `value`: String = "posted"
  }

  /**
   * Documented value. Wire value: `void`.
   */
  public data object Void : InlineV1TreasuryTransactionsGetParameterX6fc7f98d() {
    public override val `value`: String = "void"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryTransactionsGetParameterX6fc7f98d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryTransactionsGetParameterX6fc7f98d = when (value) {
      Open.value -> Open
      Posted.value -> Posted
      Void.value -> Void
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryTransactionsGetParameterX6fc7f98d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TreasuryTransactionsGetParameterX6fc7f98d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryTransactionsGetParameterX6fc7f98d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryTransactionsGetParameterX6fc7f98d) {
      encoder.encodeString(value.value)
    }
  }
}
