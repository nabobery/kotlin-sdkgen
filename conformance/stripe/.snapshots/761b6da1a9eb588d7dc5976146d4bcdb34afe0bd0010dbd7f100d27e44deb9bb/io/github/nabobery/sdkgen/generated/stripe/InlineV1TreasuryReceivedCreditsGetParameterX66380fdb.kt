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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1received_credits/get/parameters/6/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1received_credits/get/parameters/6/schema
 */
@Serializable(with = InlineV1TreasuryReceivedCreditsGetParameterX66380fdb.Serializer::class)
public sealed class InlineV1TreasuryReceivedCreditsGetParameterX66380fdb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineV1TreasuryReceivedCreditsGetParameterX66380fdb() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `succeeded`.
   */
  public data object Succeeded : InlineV1TreasuryReceivedCreditsGetParameterX66380fdb() {
    public override val `value`: String = "succeeded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryReceivedCreditsGetParameterX66380fdb()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryReceivedCreditsGetParameterX66380fdb = when (value) {
      Failed.value -> Failed
      Succeeded.value -> Succeeded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryReceivedCreditsGetParameterX66380fdb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TreasuryReceivedCreditsGetParameterX66380fdb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryReceivedCreditsGetParameterX66380fdb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryReceivedCreditsGetParameterX66380fdb) {
      encoder.encodeString(value.value)
    }
  }
}
